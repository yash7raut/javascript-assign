let num1,num2;

const readInput = () =>{
    num1 = parseInt(document.getElementById("n1").value);
    num2 = parseInt(document.getElementById("n2").value);
}

const add = ()=> {
    readInput();
    let sum = num1+num2;
    document.getElementById("ans").value = sum;
}

const sub = ()=> {
    readInput();
    let diff = num1>num2?(num1-num2):(num2 - num1);
    document.getElementById("ans").value = diff;
}

const div = ()=> {
    readInput();
    let div = num1/num2;
    document.getElementById("ans").value = div;
}

const mul = ()=> {
    readInput();
    let mul = num1*num2;
    document.getElementById("ans").value = mul;
}