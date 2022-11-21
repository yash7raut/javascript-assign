let arr = []

let obj1 = {
    name : "Yash Raut",
    age : 21,
    college : "SCOE",
    RollNo : 58,
};

arr.push(obj1);
console.log(obj1);

let obj2 = {
    name : "Salman Khan",
    age : 55,
    college : "SCOE",
    RollNo : 59,
};

arr.unshift(obj2);
console.log(arr);

let obj3 = {
    name : "Aamir Khan",
    age : 54,
    college : "SCOE",
    RollNo : 60,
};

arr.push(obj3);
console.log(obj3);

console.log(Array.isArray(arr));