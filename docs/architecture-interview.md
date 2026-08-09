# AI智能穿戴平台架构设计

## 1. 整体架构

AI设备平台由客户端、设备层、服务端和AI服务组成。

```
AI Cloud
   |
Backend Service
   |
--------------------------------
iOS SwiftUI | Android Compose | Harmony ArkUI
--------------------------------
Device Layer
   |
BLE
   |
AI Wearable Device
```

## 2. 三端架构原则

采用 Feature + Domain + Core 分层。

- Feature：业务功能
- Domain：领域模型
- Core：网络、BLE、AI基础能力

## 3. AI流式架构

用户输入后，通过Backend连接LLM服务，采用流式返回。

客户端对应：

- iOS: AsyncStream
- Android: Flow
- Harmony: AsyncIterator

## 4. OTA状态机

```
Idle
 |
Checking
 |
Downloading
 |
Transferring
 |
Installing
 |
Completed
```

## 5. BLE设计

业务层不直接依赖蓝牙SDK：

View -> ViewModel -> Service -> BLE Manager -> Hardware

这样方便替换硬件通信方案。
