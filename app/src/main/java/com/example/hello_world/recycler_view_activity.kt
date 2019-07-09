package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view_activity.*

class recycler_view_activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_activity)

        var tempList = ArrayList<DataType>()

        for(i in 0..100)
        {
            tempList.add(DataType("Cell ${i}",""))
        }

        rv_list.layoutManager = LinearLayoutManager(this)
        val adapter = ListViewAdapter()
        rv_list.adapter = adapter
        adapter.setData(tempList)
        adapter.notifyDataSetChanged()

    }
}
