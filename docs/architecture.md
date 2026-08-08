# Architecture

## Overview

AI Headset Platform uses a multi-platform layered architecture.

```
Presentation
    View
      |
    ViewModel

Business
    Service

Hardware
    DeviceManager

System
    BLE / Network / Audio
```

## Core Principles

1. UI does not directly access hardware.
2. Device state is managed through state flow.
3. Platform-specific implementations share the same business model.

## Platform Mapping

| Concept | iOS | Android | HarmonyOS |
|---|---|---|---|
| UI | SwiftUI | Compose | ArkUI |
| Async | async/await | Coroutine | Promise |
| State | ObservableObject | StateFlow | State |
