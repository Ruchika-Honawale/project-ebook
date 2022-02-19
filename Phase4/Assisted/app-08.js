// JSON - Javascript object notation

var objectliteral = {
    firstname: 'john',
    isasalesPerson: false,
  };
  
  console.log(objectliteral);
  
  // convert javascript object literal to JSON
  console.log(JSON.stringify(objectliteral));
  
  var jsonstring = '{"firstname":"john","isasalesPerson":false,"age": 10}';
  // PARSE - will convert json to javascript object
  var javascriptobject = JSON.parse(jsonstring);
  console.log(javascriptobject);