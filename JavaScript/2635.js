const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

let index = 0;

while (true) {
    const n = parseInt(lines[index++]);
    if (isNaN(n)) break;

    const data = [];
    for (let i = 0; i < n; i++) {
        data.push(lines[index++]);
    }

    const q = parseInt(lines[index++]);
    for (let j = 0; j < q; j++) {
        const text = lines[index++];
        let ans = 0;
        let maxLen = 0;
        for (const word of data) {
            if (word.startsWith(text)) {
                ans++;
                maxLen = Math.max(maxLen, word.length);
            }
        }
        if (ans === 0) {
            console.log(-1);
        } else {
            console.log(ans, maxLen);
        }
    }
}