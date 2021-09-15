package com.example.apibottomsheetdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

//    private lateinit var rvListSptr: RecyclerView
//    private var listTeamHero: ArrayList<MainModel.Result> = arrayListOf()
//    lateinit var mainAdapter: MainAdapter
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

//            val bottomSheetDialog = BottomSheetDialog(this)
//        val bottomSheetView: View = LayoutInflater.from(this)
//            .inflate(R.layout.layout_api_bottom_sheet, findViewById(R.id.bottomSheet))
            // Set Adapter for RecyclerView in BottomSheet
//            rvListSptr = bottomSheetView.findViewById(R.id.recyclerView)
//            rvListSptr.apply {
//                layoutManager = LinearLayoutManager(context)
//                adapter = mainAdapter
//            }

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()
//            buttonApi.setOnClickListener {
//                showBottomSheet(bottomSheetDialog, bottomSheetView)
        }

    }

    //    private fun showBottomSheet(bottomSheetDialog: BottomSheetDialog, bottomSheetView: View) {
//        bottomSheetDialog.apply {
//            setContentView(bottomSheetView)
//            show()
//        }
//    }
}


