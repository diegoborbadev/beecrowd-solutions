const line = require('fs').readFileSync('/dev/stdin', 'utf8');

const [n, x] = line.split(' ').map(Number);
console.log((x / (n + 2)).toFixed(2));