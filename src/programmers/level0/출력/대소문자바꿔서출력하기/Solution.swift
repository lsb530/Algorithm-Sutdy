import Foundation

let s1 = readLine()!
for c in s1 {
    if c.isLowercase {
        print(c.uppercased(), terminator: "")
    } else {
        print(c.lowercased(), terminator: "")
    }
}