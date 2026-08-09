import SwiftUI

struct DeviceView: View {

    @StateObject private var viewModel = DeviceViewModel()

    var body: some View {
        VStack(spacing: 16) {
            Text(viewModel.device?.name ?? "未连接设备")

            if let device = viewModel.device {
                Text("电量: \(device.battery)%")
            }

            Button("连接设备") {
                Task {
                    await viewModel.connect()
                }
            }
        }
        .padding()
    }
}
