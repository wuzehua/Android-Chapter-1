package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val resID = R.drawable.test
        imageView.setImageResource(resID)

        roundSeekBar.setProgress(50,true)

        seekBar.setProgress(100,true)
        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar, p1: Int, p2: Boolean) {
                seekBarText.setText("${p0.progress}")
                imageView.alpha = p0.progress.toFloat() / 100
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

        roundSeekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                roundTextView.setText("${p1}")
                imageView.setImageRadius(p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}

        })


        mySwitch.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if (p1)
                {
                    seekBar.setEnabled(false)
                    changeButton.setEnabled(false)
                    roundSeekBar.setEnabled(false)
                }
                else
                {
                    seekBar.setEnabled(true)
                    changeButton.setEnabled(true)
                    roundSeekBar.setEnabled(true)
                }
            }
        })

    }

    fun changeButtonClick(v: View?)
    {
        when(v?.id)
        {
            R.id.changeButton->
            {
                if (counter == 0)
                {
                    helloWorldTextView.setText("Changed")
                    counter += 1
                }
                else
                {
                    helloWorldTextView.setText("Hello World!")
                    counter = 0
                }
            }
        }

    }


}
