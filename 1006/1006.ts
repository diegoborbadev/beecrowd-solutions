var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var a = Number(inputs.shift());
var b = Number(inputs.shift());
var c = Number(inputs.shift());
   
console.log(`MEDIA = ${(((a * 2 + b * 3 + c * 5) / 10).toFixed(1))}`);