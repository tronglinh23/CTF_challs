sum = 0
// password = 'adminj'
// const arr = Array.from(password).map(ok);
//   function ok(e){
//       if (e.charCodeAt(0)<= 122 && e.charCodeAt(0) >=97 ){
//       return e.charCodeAt(0);
//   }}

// var add = arr[i] & arr[i + 2]; 
// var or = arr[i + 1] | arr[i + 4]; 
// var xor = arr[i + 3] ^ arr[i + 5];
chrs = "abcdefghijklmnopqrstuvwxyz"
count = 0;
// console.log(chrs.charCodeAt(0))
for (let i = 0; i < chrs.length; i+=1){
  for (let j = 0; j < chrs.length; j+=1) {
    k = chrs.charCodeAt(i) ^ chrs.charCodeAt(j)
    if (k === 0x6) {
      console.log("['"+chrs[i]+"','"+ chrs[j]+"'],")
      count++;
    }
  }
}
console.log(count)
// add = 0x60
// // or = 0x61
// // xor = 0x6
// console.log(add)
// sum += add + or - xor
// console.log(sum === 0xbb)