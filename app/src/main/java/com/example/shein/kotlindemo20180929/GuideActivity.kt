package com.example.shein.kotlindemo20180929

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Toast
import com.example.shein.kotlindemo20180929.databinding.ActivityGuideBinding
import kotlinx.android.synthetic.main.activity_guide.*

class GuideActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
//        binding = DataBindingUtil.setContentView<ActivityGuideBinding>(this, R.layout.activity_guide)
        setSupportActionBar(toolbar)
        btn1.setOnClickListener {
            val intent = Intent(this, HighClass1Activity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener { view ->
            Snackbar.make(view, "测试测试222", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "测试测试333", Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this, "测试测试444", Toast.LENGTH_SHORT).show()
        }
        recycler_view_btn.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}
