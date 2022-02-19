function b(){
    var myvar;
    console.log(myvar);

}
function a(){
    myvar =2;
    console.log(myvar);
    b();

}
var myvar=1;
console.log(myvar);
a();

console.log(myvar);