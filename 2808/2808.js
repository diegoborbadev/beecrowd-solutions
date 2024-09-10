var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const [x, y] = lines.shift().split(' ');

const [col_x, line_x] = x;
const [col_y, line_y] = y;

const col_diff = Math.abs(col_x.charCodeAt(0) - col_y.charCodeAt(0));
const line_diff = Math.abs(parseInt(line_x) - parseInt(line_y));

if ((col_diff === 1 && line_diff === 2) || (col_diff === 2 && line_diff === 1)) {
    console.log('VALIDO');
} else {
    console.log('INVALIDO');
}