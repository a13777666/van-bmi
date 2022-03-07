package com.yencheng.bmi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.yencheng.bmi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //They are same
        /*binding.bHelp.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })*/
        binding.bHelp.setOnClickListener {
            Log.d("MainActivity","Help Click")
        }
    }

    fun bmi(view: View){
        var weight = binding.edWeight.text.toString().toFloat()
        var height = binding.edHeight.text.toString().toFloat()
        var bmi = weight/(height*height)
        Log.d("MainActivity", bmi.toString())
        //Toast.makeText(this,"Your BMI", Toast.LENGTH_LONG).show()
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Hello")
        builder.setMessage("Your BMI is $bmi")
        builder.setPositiveButton("OK",null)
        val dialog = builder.create()
        dialog.show()


        /*AlertDialog.Builder(this)
            .setTitle("Hello")
            .setMessage("Your BMI is $bmi")
            .setPositiveButton("OK", null)
            .show()
        */
        //binding.tvBmi.text = "Your BMI is $bmi"

    }

}