# orion-buildplugin

**orion-buildplugin** is a Gradle plugin for automatic **bytecode instrumentation** of `OkHttpClient` usage in Android apps. It is part of the [Orion Android Performance Library](https://www.epsilondelta.co/orion/index), developed by **Epsilon Delta**.

## ✨ Features

- Instruments `OkHttpClient.Builder.build()` at the bytecode level
- Automatically injects Orion’s network interceptor without manual changes
- Supports AGP versions **8.3 to 8.7** and **OkHttp 4.10.0**
- Captures network metrics such as response time, payload size, content type, and errors
- Compatible with Jetpack Compose, View-based UIs, and all Android app types

## 📦 How to Use

### Step 1: Apply the Plugin

Add the plugin to your `build.gradle.kts`:

```kotlin
plugins {
    id("co.epsilondelta.orion.buildplugin") version "1.0.0"
}

ℹ️ Coming soon to the Gradle Plugin Portal.


🛡️ Safety Checks
	•	If your AGP or OkHttp version is not compatible, the plugin shows a non-blocking warning.
	•	No crashes, no runtime reflection – fully compile-time safe.

📞 Need Help?

Visit Epsilon Delta or Contact Us for integration assistance, enterprise licensing, or support.

📝 License

© 2025 Epsilon Delta. All rights reserved.
Use of this plugin is subject to Epsilon Delta Orion’s terms.

