package com.example.shein.kotlindemo20180929

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.shein.kotlindemo20180929.databinding.ActivityRecyclerViewItemBinding

class RecyclerViewAdapter(private var context: RecyclerViewActivity) : RecyclerView.Adapter<DataBindingRecyclerHolder<*>>() {


    var datas: ArrayList<UserInfo>? = null

    fun setData(datas: ArrayList<UserInfo>) {
        this.datas = datas
        Log.d("262626", "datas===${datas.size}")
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBindingRecyclerHolder<*> {
        val itemBinding = ActivityRecyclerViewItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return DataBindingRecyclerHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return datas?.size ?: 0
    }

    override fun onBindViewHolder(holder: DataBindingRecyclerHolder<*>, position: Int) {
        val dataBinding = holder.dataBinding as ActivityRecyclerViewItemBinding
        dataBinding.nameTv.text = datas?.get(position)?.name
        dataBinding.ageTv.text = datas?.get(position)?.age

        dataBinding.nameTv.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(context, "这是name${position}", Toast.LENGTH_SHORT).show()
            }
        })

        dataBinding.ageTv.setOnClickListener {
            Toast.makeText(context, "这是age${position}", Toast.LENGTH_SHORT).show()
        }
    }

}
