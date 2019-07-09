package com.example.hello_world

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Color.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RankViewHolder(val view: View) : RecyclerView.ViewHolder(view)
{
    private var mNoTextView: TextView
    private var mTitleTextView: TextView
    private var mTypeTextView: TextView
    private var mHotNumTextView: TextView

    init {
        mNoTextView = view.findViewById(R.id.tv_positionText)
        mTitleTextView = view.findViewById(R.id.tv_titleText)
        mTypeTextView = view.findViewById(R.id.tv_typeText)
        mHotNumTextView = view.findViewById(R.id.tv_hotNumber)
    }

    companion object
    {
        fun create(context: Context, root: ViewGroup): RankViewHolder {
            val v = LayoutInflater.from(context).inflate(R.layout.activity_rank_view, root, false)
            return RankViewHolder(v)
        }
    }


    fun bind(data: RankData?, position: Int) {
        if (data == null)
            return

        if (position < 3)
            //mNoTextView.setTextColor(R.color.specialNoColor)
            mNoTextView.setTextColor(parseColor("#e6face15"))
        else
            mNoTextView.setTextColor(parseColor("#99ffffff"))

        mNoTextView.text = "${position + 1}."
        if(data.getType() == Type.None)
        {
            mTypeTextView.text = ""
            mTypeTextView.setBackgroundColor(TRANSPARENT)
        }
        else if(data.getType() == Type.Hot)
        {
            mTypeTextView.text = "热"
            mTypeTextView.setBackgroundColor(parseColor("#B10511"))
        }
        else
        {
            mTypeTextView.text = "新"
            mTypeTextView.setBackgroundColor(parseColor("#4C3283"))
        }

        mTitleTextView.text = data.getTitle()
        mHotNumTextView.text = data.getNumber().toString()
    }


}