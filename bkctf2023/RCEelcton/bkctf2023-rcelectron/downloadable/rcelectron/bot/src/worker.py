import subprocess
from queue import Queue
from threading import Thread, current_thread
import config

# DOCKER_CLIENT = docker.DockerClient(base_url='unix://var/run/docker.sock')

bot_queue = Queue()
POISON_PILL = 'POISON_PILL'
workers = []


def start_worker(i):
    t = Thread(name='worker-{}'.format(i), target=worker_main, args=[i])
    t.start()
    workers.append(t)


def kill_one_worker():
    bot_queue.put(POISON_PILL)


def kill_all_workers():
    for _ in range(len(workers)):
        kill_one_worker()


def add_task(task):
    # print('[flask]', 'Adding {}'.format(task))
    position = bot_queue.qsize() + 1
    bot_queue.put(task)
    return position


def queue_size():
    return bot_queue.qsize()


def worker_main(i):
    global config, workers
    tag = '[worker-{}]'.format(i)

    print(tag, 'started')
    while i < config.config['worker_count']:
        try:
            task = bot_queue.get(block=True, timeout=5)
        except:
            continue

        # abort condition, stop working
        if task == POISON_PILL:
            return
        
        # work on the task
        visit_report(tag, *task)
    
    # remove myself from the worker list
    workers.remove(current_thread())
    print(tag, '[+] Stopped')

def visit_report(tag, id, cookie, loginInfo={}):
    global config

    print(tag, '[+] Visiting {} {}'.format(id, loginInfo))

    docker_args = [
        'docker', 'run',
        
        # run interactive
        '-i',
        
        # remove container after execution
        '--rm',
        
        # use a specific network
        '--network', config.config['docker_network'],

        # limit run time
        '-e', f'COOKIE={cookie}',
        '-e', f'TICKET_ID={id}',
        '-e', 'BASE_URL=http://server:5000',

        # the image to run
        config.config['docker_image'],
    ]

    print(tag, '[+] Executing: {}'.format(docker_args))
    subprocess.run(docker_args)
