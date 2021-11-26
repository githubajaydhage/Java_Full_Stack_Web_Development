// normal javascript function 
function display() {
    document.write("<br/> This is normal function<br/>")
}
display();

// Expression style function 
let display2 = function() {
    document.write("<br> This is expression style function")
}
display2();
// arrow function 
let display3 = ()=>document.write("<br/>This is simple arrow function");

display3();

let add = (a,b)=>a+b;
document.write("<br/> add is "+add(10,20));

let findLargest = (a,b)=> {
    if(a>b){
        return "a is largest"
    }else {
        return "b is largest"
    }
}

document.write("<br> "+findLargest(20,10));

//callback function : passing the function or funtion name or function body 
//to another function as  parameter is known as callback function. 
function greeting(fname,callback){
    return "Welcome "+callback(fname);
}
function maleInfo(fname){
    return "Mr "+fname;
}
let femaleInfo= function(fname){
    return "Miss "+fname;
}
document.write("<br/>")
document.write(greeting("Raj",maleInfo));
document.write("<br/>")
document.write(greeting("Reeta",femaleInfo));
document.write("<br/>")
document.write(greeting("Reeta",function(fname){
    return "Miss "+fname;
}));
document.write("<br/>")
document.write(greeting("Reeta",fname=>"Miss "+fname));


let num = [10,20,40,50,60];

num.forEach(display)
//1st way 
function display(n){
    document.write("<br> "+n);
}
//2nd way 
num.forEach(function display(n){
    document.write("<br> "+n);
})

//3rd way 
num.forEach(n=>document.write("<br> "+n));

