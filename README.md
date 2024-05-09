Demo
![image](https://github.com/NavjotSinghSeraphic/CustomLoader/assets/139829903/2aef2da1-7ebf-4056-b49b-bb152d5d20d0)

Add this to your project build.gradle (for older versions only)
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io }
    }
}

Add this to your settings.gradle(for newer versions only)

dependencyResolutionManagement {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

Add this to your module build.gradle

    implementation 'com.github.NavjotSinghSeraphic:CustomLoader:1.0'
