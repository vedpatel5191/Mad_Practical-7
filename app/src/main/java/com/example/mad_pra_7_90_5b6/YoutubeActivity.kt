package com.example.mad_pra_7_90_5b6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.mad_pra_7_90_5b6.databinding.ActivityMainBinding
import com.example.mad_pra_7_90_5b6.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(it)}

        }
    }
    private val youtubeId = "fJn9B64Znrk"
    private  fun initYoutubePlayer()
    {
        val webSeettings: WebSettings = binding.youtubeWebView.settings
        webSeettings.javaScriptEnabled = true
        webSeettings.loadWithOverviewMode = true
        webSeettings.useWideViewPort = true
        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}