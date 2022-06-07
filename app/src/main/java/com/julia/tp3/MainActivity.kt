package com.julia.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Button firstActivityBtn = findViewById(R.id.firstActivityBtn);
        firstActivityBtn.setOnClickListener{
           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        secondActivityBtn.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        thirdActivityBtn.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}