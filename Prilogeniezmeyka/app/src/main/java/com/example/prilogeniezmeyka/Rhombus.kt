package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.R
import com.example.prilogeniezmeyka.databinding.ActivityRhombusBinding

class Rhombus : AppCompatActivity() {
    lateinit var bindingRhom: ActivityRhombusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingRhom = ActivityRhombusBinding.inflate(layoutInflater)
        setContentView(bindingRhom.root)
    }

    fun onClickResult_rhombus(view: View){
        if(!isFieldEmpty_rhombus()) {
            val result_rhombus = getString(R.string.result_info_rhombus) + getResult_rhombus() + getString(
                R.string.result_info_rhombus_sm
            )
            bindingRhom.tvResultRhombus.text = result_rhombus
        }
    }

    private fun isFieldEmpty_rhombus():Boolean{
        bindingRhom.apply {
            if (edARhombus.text.isNullOrEmpty()) edARhombus.error = "Поле должно быть заполнено"
            if (edBRhombus.text.isNullOrEmpty()) edBRhombus.error = "Поле должно быть заполнено"
            return edARhombus.text.isNullOrEmpty() || edBRhombus.text.isNullOrEmpty()
        }
    }

    private fun getResult_rhombus(): String{
        val a: Double
        val b: Double
        bindingRhom.apply {
            a = edARhombus.text.toString().toDouble()
            b = edBRhombus.text.toString().toDouble()
        }
        return (a * b).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}