package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rank_list_view.*

class RankViewActivity : AppCompatActivity() {

    var titles = arrayOf("敬礼我的超级英雄","我们不一Young","珍\"eye\"每一天",
        "请平安出行","现在是怀旧时间","纸短情长","田?????","我们一起学猫叫","轻轻牵着你的耳朵")

    var hotnums = arrayOf(548583,504189,486636,301982,301928,299192,291049,289759,279973)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank_list_view)

        var tempList = ArrayList<RankData>()

        for(i in 0 until titles.size)
        {
            if(i == 0 || i == 6)
            {
                tempList.add(RankData(Type.Hot,titles[i],hotnums[i]))
            }
            else if(i == 5)
            {
                tempList.add(RankData(Type.New,titles[i],hotnums[i]))
            }
            else
            {
                tempList.add(RankData(titles[i],hotnums[i]))
            }
        }


        rv_rankList.layoutManager = LinearLayoutManager(this)
        rv_rankList.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        val adapter = RankViewAdapter()
        rv_rankList.adapter = adapter
        adapter.setData(tempList)
        adapter.notifyDataSetChanged()

    }
}
