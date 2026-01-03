package com.vencedoremcristo.app

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        val nav = findViewById<BottomNavigationView>(R.id.bottomNav)

        webView.webViewClient = WebViewClient()
        webView.settings.javaScriptEnabled = true
        webView.loadUrl("https://www.youtube.com/@oficialvencedoremcristo")

        nav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_videos ->
                    webView.loadUrl("https://www.youtube.com/@oficialvencedoremcristo/videos")
                R.id.menu_shorts ->
                    webView.loadUrl("https://www.youtube.com/@oficialvencedoremcristo/shorts")
                R.id.menu_posts ->
                    webView.loadUrl("https://www.youtube.com/@oficialvencedoremcristo/community")
            }
            true
        }
    }
}
