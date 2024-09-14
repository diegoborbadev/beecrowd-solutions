var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var n = parseInt(inputs.shift());
var m = parseInt(inputs.shift());
var s = parseFloat(inputs.shift());
   
console.log(`NUMBER = ${n}\nSALARY = U$ ${(m * s).toFixed(2)}`);