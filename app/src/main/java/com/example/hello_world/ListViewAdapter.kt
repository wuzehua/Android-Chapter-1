package com.example.hello_world

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private var items = ArrayList<DataType>()
    private val TEXT_IMAGE_VIEW = 0

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TextViewHolder.create(viewGroup.context,viewGroup)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TextViewHolder).bind(items.get(position), position)
    }

    fun setData(data: ArrayList<DataType>)
    {
        items = data
    }

    fun insertData(index: Int, data: DataType?)
    {
        if(index < 0 || index > items.size || data == null)
            return

        items.add(index, data)
    }


}