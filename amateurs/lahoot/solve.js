import io from "socket.io-client";

const TARGET = "http://amt.rs:31458";// "https://lahoot.amt.rs";
const INSTANCES = 4;
const BANG = 3;

let connected = 0;

for(let i = 0; i < INSTANCES; i ++){
    let socket = io(TARGET);
    socket.on("connect", () => {
        connected ++;
        console.log(i, " connected so now ", connected, " are connected");
    });

    socket.on("disconnect", () => {
        connected --;
        console.log(i, " disconnected we now have ",connected, " connected");
    });

    socket.on("personalUpdate", (data) => {
        console.log(i, " has streak ", data.streak);
    });

    let lastSeenQuestionText = "";

    socket.on("gameState", (state) => {
        if(state.phase == "question-answering"){
            let q = state.phaseState.question;
            if(q.text != lastSeenQuestionText){
                lastSeenQuestionText = q.text;
                console.log(i, " saw new question: ", q.text);
                for(let i = 0; i < BANG; i ++){
                    state.phaseState.answers.forEach((answer, index) => {
                        socket.emit("answerQuestion", answer);
                    });
                }
            }
        }
    });

    socket.on("systemMessage", (message, important) => {
        if(important){
            console.log(i, " got important message: ", message);
        }else if(message.includes("streak")){
            console.log(i, message);
        }
    });
}

//amateursCTF{w1nn3r_0f_rac3s}