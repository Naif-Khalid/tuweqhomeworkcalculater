package com.ngrb.tuweqhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ngrb.tuweqhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)

        binding.calculatePlus.setOnClickListener{
            calculatemathplus()
        }
        binding.calculateSubtract.setOnClickListener{
            calculatemathsubtract()
        }
        binding.calculateMultiply.setOnClickListener{
            calculatemathmultibly()
        }
    }

    private fun calculatemathmultibly() {
        var number1=binding.number1.text.toString().toDouble()
        var number2=binding.number2.text.toString().toDouble()
        val res=number1*number2
        binding.calculateResult.text= res.toString()
    }

    private fun calculatemathsubtract() {
        var number1=binding.number1.text.toString().toDouble()
        var number2=binding.number2.text.toString().toDouble()
        val res=number1-number2
        binding.calculateResult.text= res.toString()
    }

    private fun calculatemathplus(){
        var number1=binding.number1.text.toString().toDouble()
        var number2=binding.number2.text.toString().toDouble()
        val res=number1+number2
        binding.calculateResult.text= res.toString()

    }
}