// read = {};
// file = {};
// read['filename'] = "fake";
// console.log(read.filename);
// file["__proto__"]["filename"] = "abcd";
// console.log(Object.prototype);
// console.log(read["filename"]);

const a = {};
const b = new Object();
// b.x = 1;
// console.log(typeof(a.__proto__.__proto__));
// a.__proto__.x = 1337;
// console.log(Object.prototype);
// console.log(b.x);
function isObject(obj) {
	return obj !== null && typeof obj === 'object';
}

function setValue(obj, key, value) {
	const keylist = key.split('.');
	const e = keylist.shift();
	if (keylist.length > 0) {
		if (!isObject(obj[e])) obj[e] = {};
		setValue(obj[e], keylist.join('.'), value);
	} else {
		obj[key] = value;
		console.log(key, value);
		console.log(obj);

		return obj;
	}
}

setValue(b, "__proto__.filename", "abcd");
console.log(b["__proto__"]["filename"])
console.log(Object.prototype);
