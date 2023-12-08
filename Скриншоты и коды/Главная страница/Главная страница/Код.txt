package com.example.prilogeniezmeyka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.prilogeniezmeyka.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickSled(view: View){
        val intent (this,  Square::class.java )
        startActivity(intent)
    }

    fun onClickRectangle(view: View){
        val intent = Intent(this, Rectangle::class.java)
        startActivity(intent)
    }

    fun onClickCircle(view: View){
        val intent = Intent(this, Circle::class.java)
        startActivity(intent)
    }

    fun onClickTriangle(view: View){
        val intent = Intent(this, Triangle::class.java)
        startActivity(intent)
    }

    fun onClickRhombus(view: View){
        val intent = Intent(this, Rhombus::class.java)
        startActivity(intent)
    }

    fun onClickParallelogram(view: View){
        val intent = Intent(this, Parallelogram::class.java)
        startActivity(intent)
    }

    fun onClickTrapezoid(view: View){
        val intent = Intent(this, Trapezoid::class.java)
        startActivity(intent)
    }
}