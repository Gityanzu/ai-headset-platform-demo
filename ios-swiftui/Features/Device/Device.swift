import Foundation

/// AI穿戴设备模型
struct Device: Identifiable {
    let id: String
    let name: String
    let battery: Int
    let firmware: String
    var state: DeviceState
}

/// 设备连接状态
enum DeviceState {
    case idle
    case scanning
    case connecting
    case connected
    case error(String)
}
