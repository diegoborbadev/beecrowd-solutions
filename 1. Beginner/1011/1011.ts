var r = Number(require('fs').readFileSync('/dev/stdin', 'utf8').split('\n').shift());
console.log(`VOLUME = ${(((4 / 3.0) * 3.14159 * r * r * r).toFixed(3))}`);