package com.example.newapp

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class ConstraintLayoutActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        // 1. TextView — заголовок
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        tvTitle.text = getString(R.string.constraint_layout_title)

        // 2. ImageView уже содержит иконку из drawable

        // 3. TextView — приветствие
        val tvHello = findViewById<TextView>(R.id.tvHello)
        tvHello.text = getString(R.string.tv_hello)

        // 4. EditText
        val etInput = findViewById<EditText>(R.id.etInput)
        etInput.hint = getString(R.string.et_input)

        // 5. Button — Отправить
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.text = getString(R.string.btn_submit)
        btnSubmit.setOnClickListener {
            val text = etInput.text.toString()
            val tvResult = findViewById<TextView>(R.id.tvResult)
            if (text.isNotBlank()) {
                tvResult.text = "Результат: $text"
                Toast.makeText(this, "Отправлено: $text", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Введите текст", Toast.LENGTH_SHORT).show()
            }
        }

        // 6. TextView — результат
        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = getString(R.string.tv_result)

        // 7. RadioButton
        val rbOption1 = findViewById<RadioButton>(R.id.rbOption1)
        rbOption1.text = getString(R.string.tv_radio_label)

        // 8. CheckBox
        val cbAccept = findViewById<CheckBox>(R.id.cbAccept)
        cbAccept.text = getString(R.string.tv_checkbox_label)

        // 9. ProgressBar
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.progress = 40

        // 10. Switch
        val switchNotif = findViewById<Switch>(R.id.switchNotif)
        switchNotif.text = getString(R.string.tv_switch_label)
    }
}
