import Foundation

func solution(_ a:Int, _ b:Int) -> Int {
    let x = Int(String(a) + String(b))
    let y = Int(String(b) + String(a))
    guard let unwrappedX = x, let unwrappedY = y else {
        fatalError("Number conversion failed")
    }

    if (unwrappedX >= unwrappedY) {
        return unwrappedX
    }
    return unwrappedY
}