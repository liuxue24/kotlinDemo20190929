package com.example.shein.kotlindemo20180929

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val var12: String = "顶层声明"

class MainActivity : AppCompatActivity() {

    val TAG: String = "MainActivity"

    /**
     * 声明不可空变量（必须初始化）：
     * 关键字 变量名: 数据类型 == xxx
     * 关键字：var（普通） val（final）
     *
     * 声明可空变量（必须初始化）：
     * 关键字 变量名: 数据类型?  = null/xxx
     * 关键字：var（普通） val（final）
     *
     * 声明后期初始化变量(可以不初始化)
     * lateinit 键字 变量名: 数据类型/组件等
     * 使用关键字lateinit注意事项：
     * 必须是var声明的变量
     * 不能声明可空变量
     * 不能声明基本数据类型 Int Float Double等,String可以
     * 声明后，使用前必须赋值，否则会报UninitializedPropertyAccessException
     *
     * 声明延迟初始化变量
     * 关键字 变量名: 数据类型 by lazy {}
     * 使用关键字lazy注意事项：
     * 必须是val都很忙的变量
     * 不能用于类型判断
     * 且在变量的数据类型后用by连接
     *
     * 声明常量
     * const 关键字 变量名: 数据类型 == xxx
     * 使用const关键字注意事项：
     * 只能修饰val
     * 顶层
     * 在object修饰的类中声明
     * 伴生对象中声明
     *
     * 注释和JAVA一样
     *
     */
    // 全局声明不可空变量和可空变量
    // 方式一：立即初始化，反之默认初始
    var var1: Int = 10
    var var2: Float = 0.0f
    // 方式二：推导出类型
    var var3 = 10

    var var4: String? = "ceshi"
    var var5: String? = null

    lateinit var var10: String

    val var11: String by lazy {
        "延迟初始化"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "var1===$var1")
        Log.d(TAG, "var2===$var2")
        Log.d(TAG, "var3===$var3")
        Log.d(TAG, "var4===$var4")
        Log.d(TAG, "var5===$var5")

        test()
        test1()
        test2()
        test3()
    }

    private fun test() {
        // 类声明
        var var6: Int = 10
        val var7: Int = 10

        var6 = 100

        Log.d(TAG, "var6===$var6")
        Log.d(TAG, "var7===$var7")
    }

    private fun test1() {
        // 类声明
        var var8: String? = "ceshi"
        var var9: String? = null

        var8 = "haha"

        Log.d(TAG, "var8===$var8")
        Log.d(TAG, "var9===$var9")
    }

    private fun test2() {

        var10 = "后期初始化"

        Log.d(TAG, "var10===$var10")
    }

    private fun test3() {

        val var11: String by lazy {
            "延迟初始化"
        }

        Log.d(TAG, "var11===$var11")
        Log.d(TAG, "var12===$var12")
    }

}
