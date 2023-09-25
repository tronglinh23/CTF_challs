var bytes = [];
$.get("bytes", function(resp) {
  bytes = Array.from(resp.split(" "), x => Number(x));
});

function assemble_png(u_in){
  var LEN = 16;
  var key = "00000000000000000000000000000000";
  var shifter;
  if(u_in.length == key.length){
    key = u_in;
  }
  var result = [];
  for(var i = 0; i < LEN; i++){
    // key 32 chars
    // shifter = Number(key.slice((i*2),(i*2)+1));
    // result[i] = bytes[(shifter) * LEN) % bytes.length) + i]
    // 
    shifter = Number(key.slice((i*2),(i*2)+1));
    for(var j = 0; j < (bytes.length / LEN); j ++){
      result[(j * LEN) + i] = bytes[(((j + shifter) * LEN) % bytes.length) + i]
    }
  }

  while(result[result.length-1] == 0){
    result = result.slice(0,result.length-1);
  }
  document.getElementById("Area").src = "data:image/png;base64," + btoa(String.fromCharCode.apply(null, new Uint8Array(result)));
  return false;
}