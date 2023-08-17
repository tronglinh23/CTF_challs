// Create WebSocket connection.
var WebSocket = require('ws');
const socket = new WebSocket("ws://challenges.bsidestlv.com:8030/login");

// Connection opened
socket.addEventListener("open", (event) => {
  socket.send("Hello Server!");
});

// Listen for messages
socket.addEventListener("message", (event) => {
  console.log("Message from server ", event.data);
});
