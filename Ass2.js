function create(){
    let num = document.getElementById("table").value;
    let arr = [];

    for(let i=1; i<=10; i++){
        arr.push(`${num} X ${i} = ${num * i}`);
        console.log(arr[i])
    }
    for(let i = 0; i < arr.length; i++){
        document.getElementById("result").innerHTML += `${arr[i]}<br>`;
    
    }
} 