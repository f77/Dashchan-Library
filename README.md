# Dashchan Library

Dashchan public API. This API is referenced by extensions.

Add this library to your extensions project to allow compiler and IDE "know" about Dashchan public classes. This library must be referenced, not compiled within your extension APK.

Using Gradle you can add this library from jcenter:

```
dependencies {
    provided 'com.github.mishiranu:dashchan.library:+'
}
```

In Eclipse IDE you can add this library to your build path in Properties ⇒ Java Build Path ⇒ Libraries. Make sure the "Export" checkbox is not checked in "Order and Export" tab.

API reference is available [here](http://mishiranu.github.io/Dashchan/doc/). You can attach Javadoc from this location: `https://mishiranu.github.io/Dashchan/doc/reference`.