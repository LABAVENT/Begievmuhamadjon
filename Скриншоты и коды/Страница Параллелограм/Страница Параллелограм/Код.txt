package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivityParallelogramBinding

class Parallelogram : AppCompatActivity() {
    lateinit var bindingPar: ActivityParallelogramBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingPar = ActivityParallelogramBinding.inflate(layoutInflater)
        setContentView(bindingPar.root)
    }

    fun onClickResult_parallelogram(view: View){
        if(!isFieldEmpty_parallelogram()) {
            val result_parallelogram = getString(R.string.result_info_parallelogram) + getResult_parallelogram() + getString(
                R.string.result_info_parallelogram_sm
            )
            bindingPar.tvResultParallelogram.text = result_parallelogram
        }
    }

    private fun isFieldEmpty_parallelogram():Boolean{
        bindingPar.apply {
            if (edAParallelogram.text.isNullOrEmpty()) edAParallelogram.error = "Поле должно быть заполнено"
            if (edBParallelogram.text.isNullOrEmpty()) edBParallelogram.error = "Поле должно быть заполнено"
            return edAParallelogram.text.isNullOrEmpty() || edBParallelogram.text.isNullOrEmpty()
        }
    }

    private fun getResult_parallelogram(): String{
        val a: Double
        val b: Double
        bindingPar.apply {
            a = edAParallelogram.text.toString().toDouble()
            b = edBParallelogram.text.toString().toDouble()
        }
        return (a * b).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}