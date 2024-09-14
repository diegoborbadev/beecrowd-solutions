var r = Number(require('fs').readFileSync('/dev/stdin', 'utf8').split('\n').shift());
console.log(`A=${((r * r * 3.14159).toFixed(4))}`);