package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivityTriangleBinding

class Triangle : AppCompatActivity() {
    lateinit var bindingTri: ActivityTriangleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingTri = ActivityTriangleBinding.inflate(layoutInflater)
        setContentView(bindingTri.root)
    }
    fun onClickResult_triangle(view: View){
        if(!isFieldEmpty_triangle()) {
            val result_triangle = getString(R.string.result_info_triangle) + getResult_triangle() + getString(
                R.string.result_info_triangle_sm
            )
            bindingTri.tvResultTriangle.text = result_triangle
        }
    }

    private fun isFieldEmpty_triangle():Boolean{
        bindingTri.apply {
            if (edATriangle.text.isNullOrEmpty()) edATriangle.error = "Поле должно быть заполнено"
            if (edBTriangle.text.isNullOrEmpty()) edBTriangle.error = "Поле должно быть заполнено"
            return edATriangle.text.isNullOrEmpty() || edBTriangle.text.isNullOrEmpty()
        }
    }

    private fun getResult_triangle(): String{
        val a: Double
        val b: Double
        bindingTri.apply {
            a = edATriangle.text.toString().toDouble()
            b = edBTriangle.text.toString().toDouble()
        }
        return ((a * b)/2).toString()
    }

    fun onClickMain(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}