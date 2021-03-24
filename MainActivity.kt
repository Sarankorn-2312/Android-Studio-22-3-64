package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str = ""

        // 1.Add Number 1-9
        Button1.setOnClickListener{
            str = TextV1.text.toString().plus(1)
            TextV1.setText(str)
        }

        Button2.setOnClickListener{
            str = TextV1.text.toString().plus(2)
            TextV1.setText(str)
        }

        Button3.setOnClickListener{
            str = TextV1.text.toString().plus(3)
            TextV1.setText(str)
        }

        Button4.setOnClickListener{
            str = TextV1.text.toString().plus(4)
            TextV1.setText(str)
        }

        Button5.setOnClickListener{
            //var str = TextV.text.toString()!!.toInt()
            str = TextV1.text.toString().plus(5)
            TextV1.setText(str)
        }

        Button6.setOnClickListener{
            str = TextV1.text.toString().plus(6)
            TextV1.setText(str)
        }

        Button7.setOnClickListener{
            str = TextV1.text.toString().plus(7)
            TextV1.setText(str)
        }

        Button8.setOnClickListener{
            str = TextV1.text.toString().plus(8)
            TextV1.setText(str)
        }

        Button9.setOnClickListener{
            str = TextV1.text.toString().plus(9)
            TextV1.setText(str)
        }

        // 2.Add number 0
        Button0.setOnClickListener {
            if(TextV1.text.toString() == "0") {
                str = TextV1.text.toString()
            }
            else{
                str = TextV1.text.toString().plus(0)
                TextV1.setText(str)
            }

        // 3.Clear Value to 0
        ButtonC.setOnClickListener{
            str = "0"
            TextV1.setText("0")
        }

        // 4.Delete 1 Number
        ButtonDel.setOnClickListener {
            if (str.length < 2) {
                str = "0"
                TextV1.setText(str)
            } else if (str.isNotEmpty()) {
                str = str.dropLast(1)
                TextV1.text = str
            }
        }


    }
}