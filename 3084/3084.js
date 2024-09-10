var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

while (lines.length > 0) {
    let linha = lines.shift()
    const [hours, minutes] = linha.split(' ').map(Number);
    console.log(`${Math.floor(hours / 30).toString().padStart(2, '0')}:${Math.floor(minutes / 6).toString().padStart(2, '0')}`);
}