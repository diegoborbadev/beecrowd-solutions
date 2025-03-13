const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const n = parseInt(lines.shift());
for (i = 0; i < n; i++) {
    const str = lines.shift();
    if(str === "P=NP") console.log('skipped');
    else {
        const [x, y] = str.split("+").map(Number);
        const result = x + y;
        console.log(result);
    }
}