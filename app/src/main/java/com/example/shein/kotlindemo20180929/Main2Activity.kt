package com.example.shein.kotlindemo20180929

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {
    var TAG = "MainActivity"
    /**
     * 内置类型：
     * Byte（8位）
     * Short（16位）
     * Int（32位）
     * Long（64位）
     * Float（32位）
     * Double（64位）
     *
     * 进制数：
     * 二进制
     * 十进制
     * 十六进制
     * 不支持八进制
     *
     * 数字类型字面常量的下划线作用：
     * 分割数字进行分组，使数字常量更易读
     *
     * 装箱与拆箱
     * 只存在装箱，不存在拆箱
     *
     * 两个数值的比较
     * 数值是否相等==
     * 数值在内存中的地址是否相等===
     *
     * 转换
     * 显示转换
     * 较小的类型不会被隐式转换为更大的类型，于是系统提供了显示转换
     * toByte() toShort() toInt() toLong() toFloat() toDouble() toChat() toString()
     * 隐式转换
     * 是从上下文推断出来的，即算术运算则被重载为适当的转换
     *
     * 位运算符
     * 没有特殊的字符，只能命名为可以以中缀形式调用的函数
     * 仅适用于Int和Long
     * shl(bits)   有符号向左移 (类似Java的<<)
     * shr(bits)   有符号向右移 (类似Java的>>)
     * ushr(bits)  无符号向右移 (类似Java的>>>)
     * and(bits)  位运算符 and (同Java中的按位与)
     * or(bits)   位运算符 or (同Java中的按位或)
     * xor(bits)  位运算符 xor (同Java中的按位异或)
     * inv()      位运算符 按位取反 (同Java中的按位取反)
     *
     * 布尔类型（Boolean）
     * 关键字 名称： Boolean = xxx
     *
     * 逻辑操作符（与java相同）
     * ' || ' => 逻辑或（或者）
     * ' && ' => 逻辑与（并且）
     * ' ! ' => 逻辑非（取反）
     *
     * 字符型（Char）
     * char变量用''
     * 不能直视为数字，可以显示转换为数字，也可以转换为其他类型
     * 当变量为英文字母时，还支持大小写转换
     * 字符转义
     * \t => 表示制表符
     * \n => 表示换行符
     * \b => 表示退格键（键盘上的Back建）
     * \r => 表示键盘上的Enter键
     * \\ => 表示反斜杠
     * \' => 表示单引号
     * \" => 表示双引号
     * \$ => 表示美元符号，如果不转义在kotlin中就表示变量的引用了
     * 其他的任何字符请使用Unicode转义序列语法。例：'\uFF00'
     *
     * 字符串类型（String）
     * 其元素可以通过索引来操作 str[index] for循环
     * 字符串字面量
     * 包含或不包含转义字符的字符串，转义包括\t、\n等
     * 包含任意字符的字符串 由三重引号（""" .... """）表示
     * 也可以使用trimMargin()函数山竹前导空格
     * 默认使用符号(|)作为距前缀，当然也可以使用其他字符。例：右尖括号（>）、左尖括号（<）等
     *
     * 字符串模板
     * 使用字符串模板的符号为$,在$后面加上变量名或{}中的表达式
     *
     * 数组型（Array）
     * 数组由Array<T>表示
     * 创建数组的3个函数
     * arrayOf() 创建一个数组，参数是一个可变参数的对象
     * arrayOfNulls() 创建一个指定数据类型且可为空元素的给定元素个数的数组
     * 工厂函数（Array()） 使用一个工厂函数Array(),它使用数组大小和返回给定其索引的每个数组元素的初始值的函数
     * Array() => 第一个参数表示数组元素的个数，第二个参数则为使用其元素下标组成的表达式
     * 原始数组类型
     * ByteArray => 表示字节型数组
     * ShortArray => 表示短整型数组
     * IntArray => 表示整型数组
     * LongArray => 表示长整型数组
     * BooleanArray => 表示布尔型数组
     * CharArray => 表示字符型数组
     * FloatArray => 表示浮点型数组
     * DoubleArray => 表示双精度浮点型数组
     * 不支持字符串类型的原始数组类型
     *
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        test()
        test1()
        test2()
        test3()
        test4()
        test5()
        test6()
    }

    private fun test() {
        var var1: Byte = 1
        var var2: Short = 1
        var var3: Int = 1
        var var4: Long = 1L
        var var5: Float = 1f
        var var6: Double = 1.0

        Log.d(TAG, "var1===$var1")
        Log.d(TAG, "var2===$var2")
        Log.d(TAG, "var3===$var3")
        Log.d(TAG, "var4===$var4")
        Log.d(TAG, "var5===$var5")
        Log.d(TAG, "var6===$var6")

        var var7 = 0x0f
        var var8 = 0b00001011
        var var9 = 123

        Log.d(TAG, "var7===$var7")
        Log.d(TAG, "var8===$var8")
        Log.d(TAG, "var9===$var9")


        val oneMillion = 1_000_000
        val creditCardNumber = 1234_5678_9012_3456L
        val socialSecurityNumber = 999_99_9999L
        val hexBytes = 0xFF_EC_DE_5E
        val bytes = 0b11010010_01101001_10010100_10010010

        Log.d(TAG, "oneMillion===$oneMillion")
        Log.d(TAG, "creditCardNumber===$creditCardNumber")
        Log.d(TAG, "socialSecurityNumber===$socialSecurityNumber")
        Log.d(TAG, "hexBytes===$hexBytes")
        Log.d(TAG, "bytes===$bytes")


        val numValue: Int = 123
        //装箱的过程，其实装箱之后其值是没有变化的
        val numValueBox: Int? = numValue

        Log.d(TAG, "numValueBox===$numValueBox")
    }

    private fun test1() {

        val numValue: Int = 128
        val numValueBox: Int? = numValue

        /**
         * 比较两个数值
         */
        var result: Boolean
        result = numValue == numValueBox

        /**
         * 比较两个数值的地址
         * 上面定义的变量是Int类型，大于127其内存地址不同，反之则相同。
         * 这是`kotlin`的缓存策略导致的，而缓存的范围是` -128 ~ 127 `。
         * 故，下面的打印为false
         */
        var result1: Boolean
        result1 = numValue === numValueBox

        Log.d(TAG, "numValue===$numValue")
        Log.d(TAG, "numValueBox===$numValueBox")
        Log.d(TAG, "result===$result")
        Log.d(TAG, "result1===$result1")
    }

    private fun test2() {

        var var1: Int = 97

        Log.d(TAG, "var1.toByte()===$var1.toByte()")
        Log.d(TAG, "var1.toShort()===$var1.toShort()")
        Log.d(TAG, "var1.toInt()===$var1.toInt()")
        Log.d(TAG, "var1.toLong()===$var1.toLong()")
        Log.d(TAG, "var1.toFloat()===$var1.toFloat()")
        Log.d(TAG, "var1.toDouble()===$var1.toDouble()")
        Log.d(TAG, "var1.toChar()===$var1.toChar()")
        Log.d(TAG, "var1.toString()===$var1.toString()")

        // 30L + 12 -> Long + Int + Double => Double
        val num = 30L + 12 + 20.1
        Log.d(TAG, "num===$num")
    }

    private fun test3() {

        /**
         * 位运算符
         * 支持序列如下：shl、shr、ushr、and、or、xor
         */
        var operaNum: Int = 4

        var shlOperaNum = operaNum shl (2)
        var shrOperaNum = operaNum shr (2)
        var ushrOperaNum = operaNum ushr (2)
        var andOperaNum = operaNum and (2)
        var orOperaNum = operaNum or (2)
        var xorOperaNum = operaNum xor (2)
        var invOperaNum = operaNum.inv()

        Log.d(TAG, "shlOperaNum => $shlOperaNum \n " +
                "shrOperaNum => $shrOperaNum \n " +
                "ushrOperaNum => $ushrOperaNum \n " +
                "andOperaNum => $andOperaNum \n " +
                "orOperaNum => $orOperaNum \n " +
                "xorOperaNum => $xorOperaNum \n " +
                "invOperaNum => $invOperaNum")

        var isNum: Boolean
        isNum = false
        Log.d(TAG, "isNum => $isNum")

        var a: Boolean = false
        var b: Boolean = true
        var result: Boolean

        if (a || b) {
            result = a || b
            Log.d(TAG, "a || b => $result")
        }

        if (a && b) {
            result = a && b
            Log.d(TAG, "a && b => $result")
        } else {
            result = a && b
            Log.d(TAG, "a && b => $result")
        }

        result = !a
        Log.d(TAG, "!a => $result")

        result = !b
        Log.d(TAG, "!b => $result")
    }

    private fun test4() {
        var var1: Char = 'a'
        Log.d(TAG, "var1=> $var1")
        Log.d(TAG, "var1.toByte()=> ${var1.toByte()}")
        Log.d(TAG, "var1.toShort()=> ${var1.toShort()}")
        Log.d(TAG, "var1.toInt()=> ${var1.toInt()}")
        Log.d(TAG, "var1.toFloat()=> ${var1.toFloat()}")
        Log.d(TAG, "var1.toDouble()=> ${var1.toDouble()}")
        Log.d(TAG, "var1.toString()=> ${var1.toString()}")

        var charA: Char = 'a'
        var charB: Char = 'B'
        var charNum: Char = '1'
        var result: Char

        result = charA.toUpperCase()
        Log.d(TAG, "result => $result")

        result = charB.toLowerCase()
        Log.d(TAG, "result => $result")

        result = charNum.toLowerCase()
        Log.d(TAG, "result => $result")

        Log.d(TAG, "\n  换行符")
        Log.d(TAG, "\t  制表符")
        Log.d(TAG, " \b  退格键")
        Log.d(TAG, "\r  Enter键同样换行")
        Log.d(TAG, '\\'.toString())
        Log.d(TAG, '\''.toString())
        Log.d(TAG, '\"'.toString())
        Log.d(TAG, '\$'.toString())
        Log.d(TAG, '\uFF01'.toString())
    }

    private fun test5() {

        val str: String = "kotlin"
        Log.d(TAG, "str => $str")

        for (s in str) {
            Log.d(TAG, "$s")
        }

        var str1: String = "hello\t\tkotlin"
        Log.d(TAG, str1)
        str1 = "hello kotlin"
        Log.d(TAG, str1)

        val str2 = """ fun main(args: Array<String>){
    Log.d(TAG,"我是三重引号引用的字符串，我可以包含任意字符")
    } """
        Log.d(TAG, str2)

        val str3: String = """
    | I`m like Kotlin .
    | I`m like Java .
    |    I`m like Android .
    |    I`m like React-Native.
""".trimMargin("|")
        Log.d(TAG, str3)

        val text1: String = "我来了！"
        var text2: String = "$text1 kotlin"
        var text3: String = "$text2 ${text1.length} 哈哈！！！！"
        Log.d(TAG, text1)
        Log.d(TAG, text2)
        Log.d(TAG, text3)
    }

    private fun test6() {
        var arr1 = arrayOf(1, 2, 3, 4, 5) //等价于[1,2,3,4,5]
        for (v in arr1) {
            Log.d(TAG, "$v")
        }

        var arr2 = arrayOf("0", "2", "3", 'a', 32.3f)
        for (v in arr2) {
            Log.d(TAG, "$v")
        }

        var arr3 = arrayOfNulls<Int>(3)

        //如若不予数组赋值则arr3[0]、arr3[1]、arr3[2]皆为null
        for (v in arr3) {
            Log.d(TAG, "$v")
        }

        //为数组arr3赋值
        arr3[0] = 10
        arr3[1] = 20
        arr3[2] = 30

        for (v in arr3) {
            Log.d(TAG, "$v")
        }

        var arr4 = Array(5, { index -> (index * 2).toString() })
        for (v in arr4) {
            Log.d(TAG, "$v")
        }

        var intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
        for (number in intArr) {
            Log.d(TAG, "$number")
        }

        var charArr: CharArray = charArrayOf('a', '1', 'b', 'c', '3', 'd')
        for (char in charArr) {
            Log.d(TAG, "$char")
        }

        var longArr: LongArray = longArrayOf(12L, 1254L, 123L, 111L)
        for (long in longArr) {
            Log.d(TAG, "$long")
        }
    }

}
