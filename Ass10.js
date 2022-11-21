let fname, mob, mail;

const checkName = (n) =>{
    if(n ==""||n==null){
        return false;
    }
    for(let i=0;i<n.length;i++){
        if(n[i]==" ")return true;
    }
    return false;
};

const checkMob = (num) =>{
    if(num.length != 10){
        return false;
    }
    return true;
};

const checkMail = (m) =>{
    if(m == null || m == ""){
        return false;
    }
    return m.length > 5 && m.indexOf("@")>0;
};

const submit = ()=> {
    fname = document.getElementById("name").value;
    mob = document.getElementById("no").value;
    m = document.getElementById("mail").value;

    var validateName = checkName(fname)
    var validateMob = checkMob(mob)
    var validatemail = checkcheckMailName(m)
    
    if(validateName && validateMob && validatemail){
        alert("Information submitted Successfully");
    }
    else{
        alert("Entered Information is not valid");
    }
};