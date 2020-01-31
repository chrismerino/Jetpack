package com.projekt401.jetpack.ui.quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.projekt401.jetpack.databinding.ActivityQuotesBinding

class QuotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = com.projekt401.jetpack.databinding.ActivityQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "First toast!", Toast.LENGTH_SHORT).show()
        }
    }
}
