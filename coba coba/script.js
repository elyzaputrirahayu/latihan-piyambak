function start() {
    function start(e) {
    document.querySelector(".cat").innerHTML = "😸";}
    console.log("klik");
    
}

setInterval(()=>{
    let p = document.createElement("div");
    p.style.position="absolute";
    p.style.width="3px";
    p.style.height="3px";
    p.style.background="white";
    p.style.left=Math.random()*100+"vw";
    p.style.top="100vh";
    p.style.opacity=0.5;
    p.style.animation="rise 5s linear";

    document.body.appendChild(p);
    setTimeout(()=>p.remove(),5000);
},500);
