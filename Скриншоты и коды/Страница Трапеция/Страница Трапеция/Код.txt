package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivityTrapezoidBinding

class Trapezoid : AppCompatActivity() {
    lateinit var bindingTra: ActivityTrapezoidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTra = ActivityTrapezoidBinding.inflate(layoutInflater)
        setContentView(bindingTra.root)
    }

    fun onClickResult_trapezoid(view: View){
        if(!isFieldEmpty_trapezoid()) {
            val result_trapezoid = getString(R.string.result_info_trapezoid) + getResult_trapezoid() + getString(
                R.string.result_info_trapezoid_sm
            )
            bindingTra.tvResultTrapezoid.text = result_trapezoid
        }
    }

    private fun isFieldEmpty_trapezoid():Boolean{
        bindingTra.apply {
            if (edATrapezoid.text.isNullOrEmpty()) edATrapezoid.error = "Поле должно быть заполнено"
            if (edBTrapezoid.text.isNullOrEmpty()) edBTrapezoid.error = "Поле должно быть заполнено"
            if (edCtrapezoid.text.isNullOrEmpty()) edCtrapezoid.error = "Поле должно быть заполнено"
            return edATrapezoid.text.isNullOrEmpty() || edBTrapezoid.text.isNullOrEmpty() || edCtrapezoid.text.isNullOrEmpty()
        }
    }

    private fun getResult_trapezoid(): String{
        val a: Double
        val b: Double
        val c: Double
        bindingTra.apply {
            a = edATrapezoid.text.toString().toDouble()
            b = edBTrapezoid.text.toString().toDouble()
            c = edCtrapezoid.text.toString().toDouble()
        }
        return (((a+c)/2)*b).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}