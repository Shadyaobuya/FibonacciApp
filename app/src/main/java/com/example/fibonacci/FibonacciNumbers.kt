package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class FibonacciNumbers(var numberList: List<BigInteger>):RecyclerView.Adapter<NumbersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_view,parent,false)
        return NumbersViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        holder.number.text=numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }
}
class NumbersViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView){
    var number=itemView.findViewById<TextView>(R.id.tvNumbs)
}