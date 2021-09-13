package com.example.apibottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonApi: Button = findViewById(R.id.buttonApi)
        buttonApi.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(
                this@MainActivity, R.style.BottomSheetDialogTheme
            )

            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.layout_api_bottom_sheet, findViewById<LinearLayout>(R.id.bottomSheet)
            )

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()

        }

    }
}