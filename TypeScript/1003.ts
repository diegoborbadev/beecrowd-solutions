var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var a = parseInt(inputs.shift());
var b = parseInt(inputs.shift());

console.log(`SOMA = ${a + b}`);