# Lemon Studio Android port

This branch is an experimental Android port. It is **not yet an installable APK**.

## Design

- Preserve the existing Rust `os-model`, `os-engine`, `os-dsp`, and project-format crates.
- Build native Android shared libraries for ARM64 using the Android NDK.
- Implement an Android lifecycle and window surface for the existing custom canvas.
- Connect the existing audio mixer to Android's low-latency output.
- Adapt file access to Android app-private storage and the Storage Access Framework.
- Add multitouch gestures, mobile layouts, and lifecycle-safe autosave.
- Investigate built-in plugins separately; desktop VST/CLAP binaries cannot be loaded on Android.

## Milestones

1. Android Rust cross-compilation checks (current).
2. Android activity and rendering backend.
3. Audio device backend and playback.
4. Touch controls, file import/export, and lifecycle.
5. Plugin compatibility and performance testing.
6. Signed debug/release APK builds.

## CI

The Android Rust check workflow is intentionally **not** an APK build. It checks whether the reusable engine crates compile for Android. Failing cross-compilation tests indicate work to do, not an installable app.

See `.github/workflows/android-rust-check.yml`.
