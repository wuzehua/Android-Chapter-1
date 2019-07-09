package com.example.hello_world

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RankViewAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    private var items = ArrayList<RankData>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RankViewHolder.create(viewGroup.context,viewGroup)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as RankViewHolder).bind(items.get(position), position)
    }


    fun setData(data: ArrayList<RankData>)
    {
        items = data
    }

    fun insertData(index: Int,data: RankData?)
    {
        if(data == null || index < 0 || index > items.size)
            return

        items.add(index,data)
    }

}