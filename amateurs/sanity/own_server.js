const http = require("http");

const server = http.createServer((req, res) => {
  // Set the Access-Control-Allow-Origin header to allow requests from any origin
  res.setHeader("Access-Control-Allow-Origin", "*");

  // Send the response
  res.end('{}');
});

const port = 7000;
server.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});