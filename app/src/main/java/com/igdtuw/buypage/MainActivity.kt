package com.igdtuw.buypage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.igdtuw.buypage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MainActivity"


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)


        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.Gift.setOnClickListener {
            startActivity(Intent(this, GiftActivity::class.java))
        }

        binding.trending.setOnClickListener {
            startActivity(Intent(this, TrendingActivity::class.java))
        }

        binding.premade.setOnClickListener {
            startActivity(Intent(this, PremadeActivity::class.java))
        }

        binding.personalized.setOnClickListener {
            startActivity(Intent(this, PersonalizedActivity::class.java))
        }

    }
}