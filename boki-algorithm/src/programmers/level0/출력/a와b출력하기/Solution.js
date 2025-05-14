// const readline = require('readline');
// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });
//
// let input = [];
// rl.on('line', function (line) {
//     input = line.split(' ');
//     rl.close();
// }).on('close',function(){
//     a = Number(input[0]);
//     b = Number(input[1]);
//     console.log('a =', a)
//     console.log('b =', b)
//     process.exit();
// });

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