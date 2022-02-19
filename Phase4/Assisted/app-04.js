function runAfterThreeSconds(){
    var ms =300+new Date().getTime();
    while(new Date()<ms){}
    console.log('finished function');

}
function clickhandler(){
    console.log('click event!!');

}document.addEventListener('click',clickhandler);
runAfterThreeSconds();
console.log('program completed');
