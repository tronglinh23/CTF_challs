const express = require('express');
const app = express();

let check = false;
app.get('/one', (req, res) => {
  if(check) {
    check=false;
    res.redirect('http://localhost:1337/flag');
  } else {
    check=true;
    res.send('Hello World!');
  }
})

app.get('/two', (req, res) => {
  res.send("Two!");
});
app.listen(3000, () => {
  console.log('Server running on port 3000');
})