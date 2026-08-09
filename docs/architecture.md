# AI Headset Platform Architecture

## Overview

A multi-platform demo architecture for AI wearable devices.

Platforms:

- iOS: SwiftUI + Swift Concurrency
- Android: Kotlin + Jetpack Compose
- HarmonyOS: ArkTS + ArkUI
- Backend: Node.js + TypeScript

## Layered Architecture

```
Presentation
    View
      |
    ViewModel

Domain
    UseCase

Data
    Repository

Infrastructure
    Service

Hardware / Cloud
    BLE / Network / AI
```

## Core Principles

1. UI does not directly access hardware.
2. Device state is managed through state flow.
3. Platform-specific implementations share the same business model.
4. Hardware communication is isolated from business logic.

## Core Modules

### Device Management

Responsibilities:

- BLE connection
- Device state management
- Battery synchronization
- Reconnection strategy

### AI Streaming

Responsibilities:

- Chat interaction
- Streaming response
- Context management

### Firmware OTA

Responsibilities:

- Version check
- Download
- Transfer
- Installation state machine

## Platform Mapping

| Concept | iOS | Android | HarmonyOS |
|---|---|---|---|
| UI | SwiftUI | Compose | ArkUI |
| Async | async/await | Coroutine | Promise |
| State | ObservableObject | StateFlow | State |
| Stream | AsyncStream | Flow | AsyncIterator |
