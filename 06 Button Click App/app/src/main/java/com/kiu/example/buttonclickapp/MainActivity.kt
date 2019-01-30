package com.kiu.example.buttonclickapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    private var TEXT_CONTENTS: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        @link widgets with variable we declared above.

        val userInput : EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)
        textView?.text = ""
        userInput.setText("")
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
//                Set textView with number of times the button clicked
               /* numberOfTimes += 1
                textView?.append("The button got clicked $numberOfTimes time")
                if (numberOfTimes != 1)
                    textView?.append("s\n")
                else
                    textView?.append("\n")*/

//                now we add text written in edit text to text view
                textView?.append(userInput.text)
                textView?.append("\n")

            }
        })

    }

    // to restore data of text view after screen rotation
    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState?.getString(TEXT_CONTENTS, "")
    }

    // save the previous state of text view before screen rotation
    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putString(TEXT_CONTENTS, textView?.text.toString())
    }
}
