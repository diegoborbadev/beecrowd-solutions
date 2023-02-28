var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var n = parseInt(lines.shift());
   
console.log(Math.floor(n*Math.log10(n/Math.E) + Math.log10(2*Math.PI*n)/2.0) + 1);