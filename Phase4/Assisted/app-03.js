function runAfterThreeSeconds() {
    var ms = 3000 + new Date().getTime();
    while (new Date() < ms) {}
    console.log('finished function');
  }
  
  function clickHandler() {
    console.log('click event!!');
  }
  
  document.addEventListener('click', clickHandler);
  
  runAfterThreeSeconds();
  console.log('program completed');