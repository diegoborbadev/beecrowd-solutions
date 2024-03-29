var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

var a = Number(inputs.shift());
var b = Number(inputs.shift());
   
console.log(`MEDIA = ${(((a * 3.5 + b * 7.5) / 11).toFixed(5))}`);