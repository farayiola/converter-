package com.example.converter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.converter.databinding.ActivityMainBinding
import java.math.RoundingMode
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnClear.setOnClickListener {
            binding.Result.text = ("")
        }
        binding.btnDot.setOnClickListener {
            binding.Result.text = (".")
        }
        binding.btnRest.setOnClickListener {
            binding.Result.text = "0"
            binding.outputResult.text = "0"
        }
        binding.btn0.setOnClickListener {
            binding.Result.text = input("0")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn00.setOnClickListener {
            binding.Result.text = input("00")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn1.setOnClickListener {
            binding.Result.text = input("1")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn2.setOnClickListener {
            binding.Result.text = input("2")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn3.setOnClickListener {
            binding.Result.text = input("3")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn4.setOnClickListener {
            binding.Result.text = input("4")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn5.setOnClickListener {
            binding.Result.text = input("5")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn6.setOnClickListener {
            binding.Result.text = input("6")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn7.setOnClickListener {
            binding.Result.text = input("7")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn8.setOnClickListener {
            binding.Result.text = input("8")
            binding.outputResult.text = getResult().toString()
        }
        binding.btn9.setOnClickListener {
            binding.Result.text = input("9")
            binding.outputResult.text = getResult().toString()
        }
        binding.btnEqual.setOnClickListener {
            val inputtext = binding.Result.text
            if (inputtext.isNotEmpty()){
                inputtext.toString().dropLast(inputtext.lastIndex)
             }
         }
    }

    private fun input(buttonValue: String): String{
        return "${binding.Result.text}$buttonValue"
    }

    private fun getResult(): Double {
        val inputText = binding.Result.text.toString().toDouble()
        return if ( inputText == 0.0) {

            decimalCal(0.0)
        }else {
            val final = inputText * 3.281
            decimalCal(final)
        }

}
    private fun decimalCal(number: Double): Double {
    val real = DecimalFormat("#.###")
        real.roundingMode = RoundingMode.CEILING
        return real.format(number).toDouble()
    }
}