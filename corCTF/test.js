const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));
const wait = (doc) => new Promise(async (resolve) => {
  while(true) {
    try{
      doc.document;
      console.log("a");
    } catch {
      resolve("b");
      break;
    }
    await sleep(20);
  }
})

k = open("https://webhook.site/c056f307-c887-4fe1-878d-aa2460319713")
wait(k).then(console.log).catch(console.error)