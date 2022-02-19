// console.log(a);

var a = 'Hello world!';

function b() {
  a = 'new';
  function c() {
    console.log(a);
  }
  // console.log(a);
  c();
}

b();