var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

console.log((parseFloat(lines.shift()) * 6.28).toFixed(2));