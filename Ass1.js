function triArea(){
    let height = document.getElementById('trih').value;
    let base = document.getElementById("trib").value;
    
    let  triResult = (1/2) * base * height;

    document.getElementById("result1").innerHTML = `The area of the triange is: ${triResult} sq. units`;
}
function recArea(){
    let length = document.getElementById("recl").value;
    let breadth = document.getElementById("recb").value;
    
    let  recResult = length * breadth;

    document.getElementById("result2").innerHTML = `The area of the rectangle is: ${recResult} sq. units`;
}
function cirArea(){
    let radius = document.getElementById("cerr").value;
    
    let  cirResult = (22/7)*radius*radius;
    console.log(cirResult)
    document.getElementById("result3").innerHTML = `The area of the circle is: ${cirResult} sq. units`;
}