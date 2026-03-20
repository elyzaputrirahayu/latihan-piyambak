function start(e) {

    document.getElementById("card").classList.add("show");

    let music = document.getElementById("music");
    music.currentTime = 0;
    music.play();

    document.querySelector(".cat").innerHTML = "😸";

    fireworkEffect(window.innerWidth/2, window.innerHeight/2);

    for (let i = 0; i < 10; i++) {
        let sp = document.createElement("div");
        sp.style.position = "absolute";
        sp.style.width = "5px";
        sp.style.height = "5px";
        sp.style.background = "white";
        sp.style.left = e.clientX + "px";
        sp.style.top = e.clientY + "px";
        document.body.appendChild(sp);

        setTimeout(() => sp.remove(), 1000);
    }
}

function fireworkEffect(x, y){
    for(let i=0;i<30;i++){
        let f=document.createElement("div");
        f.className="firework";

        let angle=Math.random()*2*Math.PI;
        let radius=Math.random()*200;

        f.style.left=x+"px";
        f.style.top=y+"px";
        f.style.setProperty('--x', Math.cos(angle)*radius+"px");
        f.style.setProperty('--y', Math.sin(angle)*radius+"px");

        document.body.appendChild(f);
        setTimeout(()=>f.remove(),1000);
    }
}

function closeCard(){
    let card = document.getElementById("card");
    card.classList.remove("show");

    setTimeout(()=>{
        card.style.transform = "translate(-50%, -50%) scale(0)";
    },300);
}