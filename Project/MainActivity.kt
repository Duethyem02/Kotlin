package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    lateinit var b1:Button
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1=findViewById(R.id.btStart)
        val m=findViewById<Chronometer>(R.id.mtr)

        b1?.setOnClickListener(object :View.OnClickListener {
                    var i=false
            override fun onClick(p0: View?) {
                if(!i)
                {
                    m.start()
                    i=true
                }
                else{
                    m.stop()
                    i=false
                }
            }
        })


    }

}
