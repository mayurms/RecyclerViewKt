package com.example.recyclerviewkt

import android.icu.text.CaseMap.Title
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity() : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var datalist: ArrayList<DataClass>

    lateinit var imagelist : Array<Int>
    lateinit var  titlelist : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imagelist = arrayOf(
            R.drawable.youtube,
            R.drawable.spotify,
            R.drawable.paypal,
            R.drawable.instagram
        )

        titlelist = arrayOf(
            "Youtube",
            "Spotify",
            "PayPal",
            "Instagram"
        )

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.setHasFixedSize(true)

        datalist = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imagelist.indices){
            val dataClass= DataClass(imagelist[i],titlelist[i])

            datalist.add(dataClass)
        }
        recyclerView.adapter=AdapterClass(datalist)
    }
}