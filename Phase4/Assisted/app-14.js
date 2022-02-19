//arguments and spread
function greet(firstname,lastname,language='en',...otherargument){
    console.log(arguments);
    if (arguments.length==0);{
        console.log('missing parameter');
    return;
}
console.log('------------');
}
greet();
greet('john');
greet('john','doe');
greet('john','doe','hindi','1');
