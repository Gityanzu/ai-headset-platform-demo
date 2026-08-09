import Foundation

@MainActor
final class DeviceViewModel: ObservableObject {

    @Published var device: Device?
    @Published var loading = false

    private let service: DeviceService

    init(service: DeviceService = DeviceService()) {
        self.service = service
    }

    func connect() async {
        loading = true
        defer { loading = false }

        do {
            device = try await service.connect()
        } catch {
            print("device connect failed: \(error)")
        }
    }
}
