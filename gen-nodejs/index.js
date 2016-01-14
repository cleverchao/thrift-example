var thrift = require('thrift');
var Calc = require('./Calc');
var types = require('./Calc_types');


var connection = thrift.createConnection("localhost", 9090);

connection.on('error', function(err) {
  console.log(err);
});

// Create a Calc client with the connection
var client = thrift.createClient(Calc, connection);

client.add(1,1, function(err, response) {
  console.log("1+1=" + response);
});

var mes = new types.Message();
mes.mes = 'world';
client.hello(mes, function(err, response) {
  console.log(response.mes);
  connection.end();
});