package me.chenyian.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

//        webView.settings.textZoom = 200

        var message = webView.settings.textZoom.toString()
        android.util.Log.d("tag", message)

        WebView.setWebContentsDebuggingEnabled(true)

//        webView.loadUrl("http://192.168.0.104:8080/pages/XXX/xxxxxxxxx_010.html")
        webView.loadUrl("http://192.168.0.104:5500/html/xxx/xxxxxxxxx.home.html")
//        webView.loadUrl("https://ionicframework.com/docs/usage/v7/layout/dynamic-font-scaling/demo.html?ionic:mode=md")
    }
}