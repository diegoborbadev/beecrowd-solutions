var lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

let d = parseFloat(lines.shift());
let n = parseInt(d);
let m = parseInt((d - n) * 100);

console.log("NOTAS:");
console.log(parseInt(n / 100) + " nota(s) de R$ 100.00");
n -= parseInt((n / 100)) * 100;

console.log(parseInt(n / 50) + " nota(s) de R$ 50.00");
n -= parseInt((n / 50)) * 50;

console.log(parseInt(n / 20) + " nota(s) de R$ 20.00");
n -= parseInt((n / 20)) * 20;

console.log(parseInt(n / 10) + " nota(s) de R$ 10.00");
n -= parseInt((n / 10)) * 10;

console.log(parseInt(n / 5) + " nota(s) de R$ 5.00");
n -= parseInt((n / 5)) * 5;

console.log(parseInt(n / 2) + " nota(s) de R$ 2.00");
n -= parseInt((n / 2)) * 2;

console.log("MOEDAS:");
console.log(parseInt(n / 1) + " moeda(s) de R$ 1.00");
n -= parseInt(n / 1) * 1;

console.log(parseInt(m / 50) + " moeda(s) de R$ 0.50");
m -= parseInt((m / 50)) * 50;

console.log(parseInt(m / 25) + " moeda(s) de R$ 0.25");
m -= parseInt((m / 25)) * 25;

console.log(parseInt(m / 10) + " moeda(s) de R$ 0.10");
m -= parseInt((m / 10)) * 10;

console.log(parseInt(m / 5) + " moeda(s) de R$ 0.05");
m -= parseInt((m / 5)) * 5;

console.log(m + " moeda(s) de R$ 0.01");