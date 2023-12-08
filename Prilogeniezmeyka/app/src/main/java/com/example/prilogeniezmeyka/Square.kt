package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivitySquareBinding
import kotlin.math.pow

class Square : AppCompatActivity() {
    lateinit var bindingClass: ActivitySquareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySquareBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onClickResult_sq(view: View){
        if(!isFieldEmpty_sq()) {
            val result_sq = getString(R.string.result_info_square) + getResult_sq() + getString(R.string.result_info_square_sm)
            bindingClass.tvResultSq.text = result_sq
        }
    }

    private fun isFieldEmpty_sq():Boolean{
        bindingClass.apply {
            if (edASq.text.isNullOrEmpty()) edASq.error = "Поле должно быть заполнено"
            return edASq.text.isNullOrEmpty()
        }
    }

    private fun getResult_sq(): String{
        val a: Double
        bindingClass.apply {
            a = edASq.text.toString().toDouble()
        }
        return a.pow(2).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}