import Foundation
import CoreBluetooth

/// BLE hardware abstraction layer
///
/// UI should not directly depend on CoreBluetooth.
/// Flow:
/// View -> ViewModel -> Repository -> BLEManager
final class BLEManager: NSObject {

    private var centralManager: CBCentralManager!

    override init() {
        super.init()
        centralManager = CBCentralManager(delegate: self, queue: nil)
    }
}

extension BLEManager: CBCentralManagerDelegate {
    func centralManagerDidUpdateState(_ central: CBCentralManager) {
        switch central.state {
        case .poweredOn:
            print("BLE ready")
        default:
            break
        }
    }
}
