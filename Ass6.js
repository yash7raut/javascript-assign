const removeArray = (num,array) => {
    let index = array.indexOf(num)
    if(index !== -1){
        array.splice(index,1)
        console.log(array)
        return `element is removed successfully from the index ${index}`
    }
    else{
        return "Element not found....."
    }
}


const searchArray = (num,array) => {
    let index = array.indexOf(num)
    if(index !== -1){
        return `element is present at the index ${index}!`
    }
    else{
        return `element not found......`
    }
} 


const emptyarray = (array) => {
    array.splice(0,array.length)
    console.log(array)
}

let array = [2,5,6,9,20,17]
console.log(array)

let numTORemove, numToSearch;
let htmlText = document.getElementById("array").innerHTML = `Array : [${array}]`

const remove = ()=>{
    numTORemove = document.getElementById("no_remove").value;
    if(numTORemove.length === 0){
        alert("Please enter some number....")
    }
    else{
        let result = removeArray(Number(numTORemove),array)
        document.getElementById("result").innerHTML = `${result}`
    }
}

const search = ()=>{
    numToSearch= document.getElementById("no_search").value;
    if(numToSearch.length === undefined){
        alert("Please enter some number....")
    }
    else{
        let result = searchArray(Number(numToSearch),array)
        document.getElementById("result").innerHTML = `${result}`
    }
}

const empty = ()=>{
    emptyarray(array);
    document.getElementById("result").innerHTML = "Array is empty."
}