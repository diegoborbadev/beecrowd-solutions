const l = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n').shift().split(" ").map(Number);

let g = 0;
let e = 0;

l.forEach((item, i) => {
    if (i > 2 && i < 5) {
        e += item;
    } else {
        g += item;
    }
});

console.log(g > e ? "Middle-earth is safe." : "Sauron has returned.");