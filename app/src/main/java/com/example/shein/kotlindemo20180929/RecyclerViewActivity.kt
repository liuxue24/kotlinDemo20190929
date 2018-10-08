package com.example.shein.kotlindemo20180929

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shein.kotlindemo20180929.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    var binding: ActivityRecyclerViewBinding? = null
    var datas = ArrayList<UserInfo>()
    var adapter = RecyclerViewAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityRecyclerViewBinding>(this, R.layout.activity_recycler_view)

        initDatas()
    }

    fun initDatas() {
        for (i in 20 until 30) {
            val userInfo = UserInfo()
            userInfo.name = "测试" + i
            userInfo.age = i.toString()
            Log.d("262626", "userInfo===$userInfo")

            this.datas.add(userInfo)
        }
        Log.d("262626", "datas===$datas")
        Log.d("262626", "datas===${datas.size}")
    }
}
