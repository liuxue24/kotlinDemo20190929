package com.example.shein.kotlindemo20180929

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main3Activity : AppCompatActivity() {
    var TAG = "MainActivity"
    /**
     * if语句
     * 比在java中更灵活，除了能实现java写法外，还可以实现表达式（实现三元运算符），及作为一个块的运用
     * 传统写法（与java写法一样）
     * 三元运算符
     * 其实不存在，那是因为if语句的特性（if表达式会返回一个值）故而不需要三元运算符
     * Kotlin中的if可以作为一个表达式并返回一个值
     * 作为一个块结构，并且左后一句表达式为块的值
     *
     * for语句
     * 废除了java中的for（初始值;条件;增减步长）这个规则，新增了规则
     *
     * 新增规则：
     * 去满足for（初始值;条件;增减步长）
     * 递增
     * 关键字until
     * 范围 until[n,m},即大于等于n，小于m
     *
     * 递减
     * 关键字downTo
     * 范围 downTo[n,m],即小于等于n，大于等于m
     *
     * 符号.. 表示递增的循环的另一种操作
     * 使用符号..
     * 范围 ..[n,m],即大于等于n，小于等于m，和until的区别是，简便性，范围不同
     *
     * 设置步长
     * 关键字 step
     *
     * 迭代
     * for循环提供迭代器用来遍历任何东西
     * for循环数组呗编译为一个基于索引的循环，不会创建一个迭代器对象
     *
     * 遍历字符串
     * 遍历数组
     * 使用数组的indices遍历
     * 使用数组的withIndex()方法遍历
     * 使用列表或数组的扩展函数遍历
     * 数组或列表有一个成员或扩展函数iterator实现了Iterator<T>接口，且该接口提供了next()和hasNext()两个成员或扩展函数
     * 和一般的while循环一起用
     *
     * when语句
     * 废除了java中的switch语句，新增了when(exp){}语句
     * when语句不仅可以替代switch语句，而且比switch语句更强大
     *
     * when语句实现switch语句功能
     * 和逗号结合使用，相当于switch语句中的不使用break跳转语句
     * 条件可以使用任意表达式，不仅局限于常量，相当于if表达式的用法
     *
     * 检查值是否存在于集合或数组中
     * 操作符 in 在
     * 操作符 !in 不在
     * 只适用于数值类型
     *
     * 检查值是否为指定类型的值
     * 操作符 is 是
     * 操作符 !is 不是
     * kotlin的智能转换可以访问类型的方法和属性
     *
     * 不使用表达式的when语句
     * 表示为最简单的布尔表达式
     *
     * while语句（与java相同）
     * while(exp){ 其中exp为表达式
     * ...
     * }
     * do...while语句（与java相同）
     * do(exp){ // 其中exp为表达式
     * ...
     * }(while)
     * 跳转语句（return、break、continue）（与java相同）
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
//        test()
//        test1()
//        test2()
        test3()
    }

    private fun test() {
        var num = 2
        if (num == 2) {
            Log.d(TAG, "numA == $num => true")
        } else {
            Log.d(TAG, "numA == $num => false")
        }

        // 在Java中可以这么写，但是Kotlin中直接会报错。
        // var numB: Int = (numA > 2) ? 3 : 5
        // kotlin中直接用if..else替代。例：
        var numB: Int = if (num > 2) 3 else 5
        Log.d(TAG, "numB = > $numB")

        var numA: Int = 2
        var numC: Int = if (numA > 2) {
            numA++
            numA = 10
            Log.d(TAG, "numA > 2 => true")
            numA
        } else if (numA == 2) {
            numA++
            numA = 20
            Log.d(TAG, "numA == 2 => true")
            numA
        } else {
            numA++
            numA = 30
            Log.d(TAG, "numA < 2 => true")
            numA
        }
        Log.d(TAG, "numC = > $numC")
    }

    private fun test1() {
        // 循环5次，且步长为1的递增
        for (i in 0 until 5) {
            Log.d(TAG, "i => $i \t")
        }

        // 循环5次，且步长为1的递减
        for (i in 15 downTo 11) {
            Log.d(TAG, "i => $i \t")
        }

        for (i in 20..25) {
            Log.d(TAG, "使用符号`..`的打印结果i => $i \t")
        }

        for (i in 20 until 25) {
            Log.d(TAG, "使用until的打印结果i => $i \t")
        }

        for (i in 10 until 16 step 2) {
            Log.d(TAG, "i => $i \t")
        }
    }

    private fun test2() {
        for (i in "13579") {
            Log.d(TAG, "i => $i \t")
        }

        var arrayListOne = arrayOf(1, 3, 5, 7, 9)
        for (i in arrayListOne) {
            Log.d(TAG, "i => $i \t")
        }

        var arrayListTwo = arrayOf(1, 3, 5, 7, 9)
        for (i in arrayListTwo.indices) {
            Log.d(TAG, "arrayListTwo[$i] => " + arrayListTwo[i])
        }

        var arrayListThree = arrayOf(1, 3, 5, 7, 9)
        for ((index, value) in arrayListThree.withIndex()) {
            Log.d(TAG, "index => $index \t value => $value")
        }

        var arrayListFour = arrayOf(1, 3, 5, 7, 9)
        var iterator: Iterator<Any> = arrayListFour.iterator()
        while (iterator.hasNext()) {
            Log.d(TAG, iterator.next().toString())
        }

    }

    private fun test3() {
        when (5) {
            1 -> {
                Log.d(TAG, "1")
            }
            2 -> Log.d(TAG, "2")
            3 -> Log.d(TAG, "3")
            5 -> {
                Log.d(TAG, "5")
            }
            else -> {
                Log.d(TAG, "0")
            }
        }

        when (1) {
        // 即x = 1,2,3时都输出1。
            1, 2, 3 -> {
                Log.d(TAG, "1")
            }
            5 -> {
                Log.d(TAG, "5")
            }
            else -> {
                Log.d(TAG, "0")
            }
        }

        var num: Int = 5
        when (num > 5) {
            true -> {
                Log.d(TAG, "num > 5")
            }
            false -> {
                Log.d(TAG, "num < 5")
            }
            else -> {
                Log.d(TAG, "num = 5")
            }
        }

        var arrayList = arrayOf(1, 2, 3, 4, 5)
        when (1) {
            in arrayList.toIntArray() -> {
                Log.d(TAG, "1 存在于 arrayList数组中")
            }
            in 0..10 -> Log.d(TAG, "1 属于于 0~10 中")
            !in 5..10 -> Log.d(TAG, "1 不属于 5~10 中")
            else -> {
                Log.d(TAG, "都错了 哈哈！")
            }
        // 符号( .. )表示至的意思。如例子中的0 .. 10就表示0至10或者0到10。
        }

        when ("abc") {
            is String -> Log.d(TAG, "abc是一个字符串")
            else -> {
                Log.d(TAG, "abc不是一个字符串")
            }
        }

        // 智能转换
        var a: Int = 2
        when (a) {
            !is Int -> {
                Log.d(TAG, "$a 不是一个Int类型的值")
            }
            else -> {
                a = a.shl(2)
                Log.d(TAG, "a => $a")
            }
        }

        var array = arrayOfNulls<String>(3)
        when {
            true -> {
                for (i in array) {
                    Log.d(TAG, " $i \t")
                }
            }
            else -> {
            }
        }
    }
}
