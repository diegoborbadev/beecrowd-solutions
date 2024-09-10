const input = require('fs').readFileSync("/dev/stdin", "utf8").trimEnd().split(/\s+/g).map(value => Number.parseInt(value, 10));

const MyMath = Object.create(Math, {
    gcd: {
        value: function gcd(x, y) {
            if (isNaN(x) || isNaN(y)) return Number.NaN
            x = Math.abs(x)
            y = Math.abs(y)
            while (y) [x, y] = [y, x % y]
            return x
        },
        configurable: false,
        enumerable: false,
        writable: false
    }
});

const output = [];

while (input.length > 0) {
    const [N, Q] = input.splice(0, 2);
    const elements = input.splice(0, N);

    for (let q = 1; q <= Q; q += 1) {
        const [C, A, B] = input.splice(0, 3);

        if (C == 1) {
            const V = input.shift();
            for (let index = A - 1; index < B; index += 1)
                elements[index] += V;
        } else if (C == 2) {
            let gcd = elements[A - 1];
            for (let index = A; index < B; index += 1)
                gcd = MyMath.gcd(gcd, elements[index]);
            output.push(gcd);
        } else { output.push(q); }
    }
}

console.log(output.join("\n"));