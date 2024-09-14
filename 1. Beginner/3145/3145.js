var inputs = require('fs').readFileSync('/dev/stdin', 'utf8').split(' ');

var n = Number(inputs.shift());
var x = Number(inputs.shift());
   
console.log((x /(n + 2)).toFixed(2));