package com.uniswap

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.concurrentReactEnabled
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate


class MainActivity : ReactActivity() {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  override fun getMainComponentName(): String {
    return "Uniswap"
  }

  // Required for react-navigation to work on Android
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(null);

      window.navigationBarColor = Color.TRANSPARENT

      if (Build.VERSION_CODES.Q <= Build.VERSION.SDK_INT) {
        window.isNavigationBarContrastEnforced = false
      }
      window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)

  }

  /**
   * Returns the instance of the [ReactActivityDelegate]. Here we use a util class [ ] which allows you to easily enable Fabric and Concurrent React
   * (aka React 18) with two boolean flags.
   */
  override fun createReactActivityDelegate(): ReactActivityDelegate? {
    return DefaultReactActivityDelegate(
      this,
      mainComponentName,  // If you opted-in for the New Architecture, we enable the Fabric Renderer.
      fabricEnabled,  // fabricEnabled
      // If you opted-in for the New Architecture, we enable Concurrent React (i.e. React 18).
      concurrentReactEnabled // concurrentRootEnabled
    )
  }
}
