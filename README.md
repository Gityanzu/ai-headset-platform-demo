# AI Headset Platform Demo

面向智能穿戴设备的多端架构学习项目。

## 技术栈

- iOS: SwiftUI + Swift Concurrency
- Android: Kotlin + Jetpack Compose
- HarmonyOS: ArkTS + ArkUI
- Architecture: MVVM + Service + Device State Machine

## 项目目标

模拟 AI 眼镜/头戴设备 App 架构：

```
UI
 ↓
ViewModel
 ↓
Service
 ↓
Device Manager
 ↓
BLE / AI / Hardware
```

## Modules

- device-management
- ai-stream-chat
- firmware-upgrade
- multi-platform architecture

## Roadmap

- [x] 三端架构设计
- [x] Device状态模型
- [ ] BLE真实通信
- [ ] AI SSE流式输出
- [ ] 固件升级流程
