frequencies = ["/static/8J-kljE5Njbwn6SWCg==.wav","/static/8J-kljE3MzXwn6SWCg==.wav","/static/8J-kljc2MvCfpJYK.wav","/static/8J-kljE1NjXwn6SWCg==.wav","/static/8J-kljU5NvCfpJYK.wav","/static/8J-kljE1Mjbwn6SWCg==.wav","/static/8J-kljEzOTPwn6SWCg==.wav","/static/8J-kljE3Nzfwn6SWCg==.wav","/static/8J-kljE1MDHwn6SWCg==.wav","/static/8J-kljQ2MvCfpJYK.wav","/static/8J-kljEyNzLwn6SWCg==.wav","/static/8J-kljE4NTjwn6SWCg==.wav","/static/8J-kljE0ODbwn6SWCg==.wav","/static/8J-kljE2Mjnwn6SWCg==.wav","/static/8J-kljEwODbwn6SWCg==.wav","/static/8J-kljE0MDTwn6SWCg==.wav","/static/8J-kljczMvCfpJYK.wav","/static/8J-kljEzMTfwn6SWCg==.wav","/static/8J-kljk5OPCfpJYK.wav","/static/8J-kljE3ODXwn6SWCg==.wav","/static/8J-kljE4NjHwn6SWCg==.wav","/static/8J-kljc2N_CfpJYK.wav","/static/8J-kljUzOPCfpJYK.wav","/static/8J-kljE4ODjwn6SWCg==.wav","/static/8J-kljEwMjLwn6SWCg==.wav","/static/8J-kljEyODfwn6SWCg==.wav","/static/8J-kljE2Nzbwn6SWCg==.wav","/static/8J-kljQ3N_CfpJYK.wav","/static/8J-kljg4NvCfpJYK.wav","/static/8J-kljU3NPCfpJYK.wav","/static/8J-kljQ1OPCfpJYK.wav","/static/8J-kljkwMPCfpJYK.wav","/static/8J-kljM0M_CfpJYK.wav","/static/8J-kljIwMDDwn6SWCg==.wav","/static/8J-kljkxN_CfpJYK.wav","/static/8J-kljE1OTfwn6SWCg==.wav","/static/8J-kljEyNjbwn6SWCg==.wav","/static/8J-kljE2MDDwn6SWCg==.wav","/static/8J-kljE2MzXwn6SWCg==.wav","/static/8J-kljk2OPCfpJYK.wav"]

for(let i = 0; i < frequencies.length; i++) {
    frequencies[i] = frequencies[i].replace(/.*\/([-A-Za-z0-9_=]+).wav/, "$1")
}

console.log(frequencies);

// async function attack() {
//     let response = await fetch('https://simon2.web.2023.sunshinectf.games/flag', {
//         method: 'POST',
//         headers: {
//             'Accept': 'application/json',
//             'Content-Type': 'application/json'
//         },
//         body: JSON.stringify(frequencies)
//     });
//     console.log(response.json());
// }

// attack();
