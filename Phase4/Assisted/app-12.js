// console.log(this);

function x() {
    this.newvariable = 'hello';
    console.log(this);
  }
  
  // x();
  // console.log(newvariable);
  
  var c = {
    name: 'My C object',
    log: function () {
      console.log(this);
    },
  };
  c.log();