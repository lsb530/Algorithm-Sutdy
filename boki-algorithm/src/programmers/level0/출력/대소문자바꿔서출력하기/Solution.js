const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
    rl.close();
}).on('close',function(){
    str = input[0];
    let result = ''
    for (let c of str) {
        if (c === c.toUpperCase()) {
            result += c.toLowerCase()
        } else {
            result += c.toUpperCase()
        }
    }
    console.log(result)
});