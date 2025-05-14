const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
    rl.close();
}).on('close', function () {
    const [str, repeats] = input
    console.log(str.repeat(Number(repeats)))
    process.exit();
});