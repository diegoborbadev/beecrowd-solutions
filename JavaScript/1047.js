var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
const values = lines[0].split(' ');

var h1 = parseInt(values[0]);
var m1 = parseInt(values[1]);
var h2 = parseInt(values[2]);
var m2 = parseInt(values[3]);

if (h2 <= h1 && m2 <= m1) {
    h2 += 24;
} else if (m2 <= m1) {
    m2 += 60;
    h2 -= 1;
}

let t = ((h2 * 3600) + (m2 * 60)) - ((h1 * 3600) + (m1 * 60));
let h = Math.floor(t / 3600);
let m = Math.floor((t - (h * 3600)) / 60);

console.log(`O JOGO DUROU ${h} HORA(S) E ${m} MINUTO(S)`);