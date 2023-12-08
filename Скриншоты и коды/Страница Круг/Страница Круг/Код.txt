package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivityCircleBinding
import kotlin.math.pow

class Circle : AppCompatActivity() {
    lateinit var bindingCir: ActivityCircleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCir = ActivityCircleBinding.inflate(layoutInflater)
        setContentView(bindingCir.root)
    }

    fun onClickResult_circle(view: View){
        if(!isFieldEmpty_circle()) {
            val result_circle = getString(R.string.result_info_circle) + getResult_circle() + getString(R.string.result_info_circle_sm)
            bindingCir.tvResultCircle.text = result_circle
        }
    }

    private fun isFieldEmpty_circle():Boolean{
        bindingCir.apply {
            if (edACir.text.isNullOrEmpty()) edACir.error = "Поле должно быть заполнено"
            return edACir.text.isNullOrEmpty()
        }
    }

    private fun getResult_circle(): String{
        val a: Double
        bindingCir.apply {
            a = edACir.text.toString().toDouble()
        }
        return (3.14 * (a.pow(2))).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}