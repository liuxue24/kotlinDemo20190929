package com.example.shein.kotlindemo20180929

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.util.Log
import com.example.shein.kotlindemo20180929.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {

    var binding: ActivityRecyclerViewBinding? = null
    var datas = ArrayList<UserInfo>()
    var adapter = RecyclerViewAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityRecyclerViewBinding>(this, R.layout.activity_recycler_view)

        setSupportActionBar(binding?.toolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(true)

        binding?.refreshLayout?.setOnRefreshListener(this)

        initDatas()
        adapter.setData(datas)

        binding?.recyclerView?.setHasFixedSize(true)
        binding?.recyclerView?.layoutManager = LinearLayoutManager(this)
        binding?.recyclerView?.adapter = adapter

    }

    fun initDatas() {
        for (i in 20 until 30) {
            val userInfo = UserInfo()
            userInfo.name = "测试" + i
            userInfo.age = i.toString()
            this.datas.add(userInfo)
        }
    }

    override fun onRefresh() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
