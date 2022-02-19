//object literals
var person={};
console.log(person);
var person={firstname:'Ruchika',lastname:'honawale'};
console.log(person);
var ruch={
    firstname:'ruchika',
    lastname:'doe',
address:{
    street:'xyz',
    city:'newyork',
},
};
function greet(person){
    console.log(person);
    console.log()
}
greet(john);

greet({
  firstname: 'mary',
  lastname: 'wilson',
});

greet('x');