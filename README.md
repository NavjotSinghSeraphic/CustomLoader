ScreenShot
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

Usage

	<?xml version="1.0" encoding="utf-8"?>
		<androidx.constraintlayout.widget.ConstraintLayout
	  	   xmlns:android="http://schemas.android.com/apk/res/android"
		    xmlns:app="http://schemas.android.com/apk/res-auto"
		    xmlns:tools="http://schemas.android.com/tools"
		    android:layout_width="match_parent"
		    android:layout_height="match_parent"
		    tools:context=".MainActivity">
	    <Button
	        android:id="@+id/start"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_margin="20dp"
	        android:text="start"
	        app:layout_constraintEnd_toEndOf="parent"
	        app:layout_constraintStart_toStartOf="parent"
	        app:layout_constraintTop_toBottomOf="@id/stop" />
	
	
	    <com.ioslikeloader.CustomLoaderSpinner
	        android:id="@+id/loader"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        app:spinnerColor="@color/ios_gray_text"
	        app:duration="60"
	        app:clockwise="true"
	        app:layout_constraintBottom_toBottomOf="parent"
	        app:layout_constraintEnd_toEndOf="parent"
	        app:layout_constraintStart_toStartOf="parent"
	        app:layout_constraintTop_toTopOf="parent" />
	
	    <Button
	        android:id="@+id/stop"
	        android:layout_width="wrap_content"
	        android:layout_height="wrap_content"
	        android:layout_margin="20dp"
	        android:text="stop"
	        app:layout_constraintTop_toBottomOf="@id/loader"
	        app:layout_constraintEnd_toEndOf="parent"
	        app:layout_constraintStart_toStartOf="parent"
	        />
	
	
	</androidx.constraintlayout.widget.ConstraintLayout>
