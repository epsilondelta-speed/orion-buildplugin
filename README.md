# orion-buildplugin

**orion-buildplugin** is a Gradle plugin for automatic **bytecode instrumentation** of `OkHttpClient` usage in Android apps. It is part of the [Orion Android Performance Library](https://github.com/epsilondelta-speed/orion-aar/), developed by **Epsilon Delta**.
You can use if you want to use for your lib

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
```

ℹ️ Coming soon to the Gradle Plugin Portal.


🛡️ Safety Checks
	•	If your AGP or OkHttp version is not compatible, the plugin shows a non-blocking warning.
	•	No crashes, no runtime reflection – fully compile-time safe.

📞 Need Help?

Visit Epsilon Delta or Contact Us(https://www.epsilondelta.co/contact) for integration assistance,  or support.

📝 License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

