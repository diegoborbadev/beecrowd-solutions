const [j, d] = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
console.log((j.length >= d.length) ? "go" : "no");