const lines = require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');

const tipo = {
    'fire': { 'dmg': 200, 'n1': 20, 'n2': 30, 'n3': 50 },
    'water': { 'dmg': 300, 'n1': 10, 'n2': 25, 'n3': 40 },
    'earth': { 'dmg': 400, 'n1': 25, 'n2': 55, 'n3': 70 },
    'air': { 'dmg': 100, 'n1': 18, 'n2': 38, 'n3': 60 }
};

const rounds = parseInt(lines.shift());
for (let g = 0; g < rounds; g++) {
    const [w, h, x0, y0] = lines.shift().split(' ').map(Number);
    const e = lines.shift().split(' ');
    const [n, cx, cy] = e.slice(1).map(Number);
    const enumVal = tipo[e[0]];
    const dmg = enumVal['dmg'];
    const ns = 'n' + n;
    const r = enumVal[ns];
    let proc = x0 > cx || cx > x0 + w || y0 > cy || cy > y0 + h;

    if (proc) {
        const c1 = Math.pow(y0 - cy, 2);
        const c2 = Math.pow(y0 + h - cy, 2);
        const r2 = Math.pow(r, 2);
        for (let px = x0; px <= x0 + w; px++) {
            const d1 = Math.pow(px - cx, 2) + c1;
            const d2 = Math.pow(px - cx, 2) + c2;
            if (r2 >= d1 || r2 >= d2) {
                proc = false;
                break;
            }
        }
        if (proc) {
            const c1 = Math.pow(x0 - cx, 2);
            const c2 = Math.pow(x0 + w - cx, 2);
            for (let py = y0; py <= y0 + h; py++) {
                const d1 = c1 + Math.pow(py - cy, 2);
                const d2 = c2 + Math.pow(py - cy, 2);
                if (r2 >= d1 || r2 >= d2) {
                    proc = false;
                    break;
                }
            }
        }
    }

    if (proc) {
        console.log(0);
    } else {
        console.log(dmg);
    }
}