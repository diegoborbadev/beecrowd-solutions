var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var r = Number(lines.shift());
   
console.log(`A=${((r * r * 3.14159).toFixed(4))}`);