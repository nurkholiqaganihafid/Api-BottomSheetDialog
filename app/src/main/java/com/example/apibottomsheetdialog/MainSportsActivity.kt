package com.example.apibottomsheetdialog

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.apibottomsheetdialog.databinding.LayoutApiBottomSheetBinding
import com.example.apibottomsheetdialog.retrofit.ApiService
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainSportsActivity : AppCompatActivity() {

    private val TAG: String = "MainSports"
//    private lateinit var rvListSptr: RecyclerView
//    private var listTeamHero: ArrayList<MainModel.Result> = arrayListOf()
    lateinit var mainAdapter: MainAdapter
    private lateinit var binding: LayoutApiBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val bottomSheetDialog = BottomSheetDialog(
//                this@MainSports, R.style.BottomSheetDialogTheme
//            )
//
//            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
//                R.layout.layout_api_bottom_sheet, findViewById<LinearLayout>(R.id.bottomSheet)
//            )
//
//
//        // Set Adapter for RecyclerView in BottomSheet
//        rvListSptr = bottomSheetView.findViewById(R.id.recyclerView)
//        rvListSptr.apply {
//            layoutManager = LinearLayoutManager(context)
//            adapter = mainAdapter
//        }

//            bottomSheetDialog.setContentView(bottomSheetView)
//            bottomSheetDialog.show()

//        val bottomSheetDialog = BottomSheetDialog(this)
//        val bottomSheetView: View = LayoutInflater.from(this)
//            .inflate(R.layout.layout_api_bottom_sheet, findViewById(R.id.bottomSheet))
//        // Set Adapter for RecyclerView in BottomSheet
//        rvListSptr = bottomSheetView.findViewById(R.id.recyclerView)
//        rvListSptr.apply {
//            layoutManager = LinearLayoutManager(context)
//            adapter = mainAdapter
//        }

    }

    override fun onStart() {
        super.onStart()
        setupRecyclerView()
        getDataFromApi()
    }

    private fun setupRecyclerView() {
        mainAdapter = MainAdapter(arrayListOf(), object : MainAdapter.OnAdapterListener {
            override fun onClick(result: MainModel.Result) {
//                Toast.makeText(applicationContext, result.title,
//                    Toast.LENGTH_SHORT).show()
//                  Create an intense page/next page
//                startActivity(
//                    Intent(applicationContext, DetailActivity::class.java)
//                        .putExtra("intent_title", result.title)
//                        .putExtra("intent_image", result.image)
//                )

            }

        })

//        binding.recyclerView.apply {
//            layoutManager = LinearLayoutManager(applicationContext)
//            adapter = mainAdapter
//        }
    }

    private fun getDataFromApi() {

        //Add progress bar while removing progressbar
        binding.progressBar.visibility = View.VISIBLE

        ApiService.endpoint.getData()
            .enqueue(object : Callback<MainModel> {
                override fun onResponse(
                    call: Call<MainModel>,
                    response: Response<MainModel>
                ) {
                    binding.progressBar.visibility = View.GONE
                    if (response.isSuccessful) {
                        showData(response.body()!!)
                    }
                }

                override fun onFailure(call: Call<MainModel>, t: Throwable) {
                    binding.progressBar.visibility = View.GONE
                    //printLog(t.toString())
                    printLog("onFailure: $t")
                }

            })
    }

    private fun printLog(message: String) {
        Log.d(TAG, message)
    }

    private fun showData(data: MainModel) {
        val results = data.result
        mainAdapter.setData(results)
        /* for (result in results) {
            printLog("title: ${result.title}")
        } */
    }

}