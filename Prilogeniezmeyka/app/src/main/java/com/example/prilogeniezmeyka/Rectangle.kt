package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.R
import com.example.prilogeniezmeyka.databinding.ActivityRectangleBinding

class Rectangle : AppCompatActivity() {
    lateinit var bindingRec: ActivityRectangleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingRec = ActivityRectangleBinding.inflate(layoutInflater)
        setContentView(bindingRec.root)
    }

    fun onClickResult_rec(view: View){
        if(!isFieldEmpty_rec()) {
            val result_rec = getString(R.string.result_info_rectangle) + getResult_rec() + getString(
                R.string.result_info_rectangle_sm
            )
            bindingRec.tvResultRec.text = result_rec
        }
    }

    private fun isFieldEmpty_rec():Boolean{
        bindingRec.apply {
            if (edARec.text.isNullOrEmpty()) edARec.error = "Поле должно быть заполнено"
            if (edBRec.text.isNullOrEmpty()) edBRec.error = "Поле должно быть заполнено"
            return edARec.text.isNullOrEmpty() || edBRec.text.isNullOrEmpty()
        }
    }

    private fun getResult_rec(): String{
        val a: Double
        val b: Double
        bindingRec.apply {
            a = edARec.text.toString().toDouble()
            b = edBRec.text.toString().toDouble()
        }
        return (a * b).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}