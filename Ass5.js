function startTimer(){

    let x = setInterval(function(){
        let countDownDate = document.getElementById("timer").value;
        let timer = new Date(countDownDate);
        let now = new Date().getTime();

        let distance = timer - now;

        let days = Math.floor(distance / (1000*60*60*24));
        let hours = Math.floor((distance % (1000*60*60*24))/(1000*60*60));

        let minutes = Math.floor((distance % (1000*60*60)) / (1000*60));
        let seconds = Math.floor((distance % (1000*60)) / 1000);

        document.getElementById('result').innerHTML = `Timer will end in ${days} d : ${hours} h : ${minutes} m : ${seconds} s`;

        if (distance<0){
            clearInterval(x);
            document.getElementById('result').innerHTML = "EXPIRED";
        }

    }, 1000);
}