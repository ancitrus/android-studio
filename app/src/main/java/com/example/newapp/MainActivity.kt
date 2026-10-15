package com.example.newapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenLinear = findViewById<Button>(R.id.btnOpenLinear)
        val btnOpenConstraint = findViewById<Button>(R.id.btnOpenConstraint)

        btnOpenLinear.setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }

        btnOpenConstraint.setOnClickListener {
            startActivity(Intent(this, ConstraintLayoutActivity::class.java))
        }
    }
}
