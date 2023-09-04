from flask import Flask, request, render_template
import os
import datetime
from utils import *

import config
import worker
import sys

app = Flask(__name__)
PORT = int(os.getenv('PORT', '5000'))
BIND_ADDR = os.getenv('BIND_ADDR', '127.0.0.1')

@app.route('/', methods=['POST'])
def add_task():
    id = request.form.get('id')
    cookie = request.form.get('cookie')
    
    msg = 'Error! Please notice admin'
    
    # Check valid id
    if is_valid_uuid(id):
        print('[+] Add task')
        task = (id, cookie, )
        position = worker.add_task(task)
        msg = 'You are at position {} in the queue.'.format(position)
    else:
        msg = 'Invalid Report Id'
    return msg 

@app.route('/info', methods=['GET'])
def info():
    return {
        'queue_size': worker.queue_size(),
        'worker_count': config.config['worker_count'],
        'timestamp': datetime.datetime.now().isoformat()
    }

def main(config_file):
    config.init_config(config_file)

    app.run(host=BIND_ADDR, port=PORT) # debug=True
    
    # shutdown
    worker.kill_all_workers()
    config.stop_config_loader()

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print('Usage: {} <config.json>'.format(sys.argv[0]))
        exit(1)
    # worker.build_docker_app()
    main(sys.argv[1])

elif __name__ == 'app':
    # we are in gunicorn, so just load the config
    config.init_config('./config.json')
