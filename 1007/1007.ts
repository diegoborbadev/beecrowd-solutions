var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var a = parseInt(inputs.shift());
var b = parseInt(inputs.shift());
var c = parseInt(inputs.shift());
var d = parseInt(inputs.shift());
   
console.log(`DIFERENCA = ${a * b - c * d}`);