package com.example.hello_world

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yinglan.shadowimageview.ShadowImageView

class TextViewHolder(val view: View) : RecyclerView.ViewHolder(view)
{
    private var mtextView: TextView
    private var mimageView: ShadowImageView

    init {
        mtextView = view.findViewById(R.id.tv_contentText)
        mimageView = view.findViewById(R.id.cell_shadow)
    }

    companion object
    {
        fun create(context: Context, root: ViewGroup): TextViewHolder
        {
            val v = LayoutInflater.from(context).inflate(R.layout.single_cell_view, root, false)
            return TextViewHolder(v)
        }
    }

    fun bind(data: DataType?, position: Int)
    {
        if (data == null)
            return

        mtextView.text = data.getText()
        mimageView.setImageResource(R.drawable.test);
        mimageView.setImageRadius(20)
    }


}