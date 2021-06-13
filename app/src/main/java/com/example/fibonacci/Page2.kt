package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var intent=intent
        var number=intent.getIntExtra("choice",0)

        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter=FibonacciNumbers(findFibonacci(nums= number))
        rvNumbers.adapter=numberAdapter

    }
}
fun findFibonacci(nums:Int):List<BigInteger>{
    var namba= mutableListOf<BigInteger>()
    var number1=0.toBigInteger()
    var number2=1.toBigInteger()
    var count=0
    var sum= 0.toBigInteger()

    while (count<=nums){
        namba.add(number1)
        sum=number1+number2
        number1=number2
        number2=sum

        count++
    }
    return namba
}