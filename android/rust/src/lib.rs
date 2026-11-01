use jni::objects::JClass;
use jni::sys::jstring;
use jni::JNIEnv;

#[unsafe(no_mangle)]
pub extern "system" fn Java_org_lemonstudio_android_MainActivity_nativeStatus(
    mut env: JNIEnv,
    _class: JClass,
) -> jstring {
    let message = "Lemon Studio Android shell is running. Rust audio engine integration is the next milestone.";
    env.new_string(message)
        .expect("could not allocate Java status string")
        .into_raw()
}
