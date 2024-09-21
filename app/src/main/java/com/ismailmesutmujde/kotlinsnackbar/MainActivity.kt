package com.ismailmesutmujde.kotlinsnackbar

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.ismailmesutmujde.kotlinsnackbar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonNormal.setOnClickListener { view ->
            Snackbar.make(view, "Hello", Snackbar.LENGTH_SHORT).show()
        }

        bindingMain.buttonReturn.setOnClickListener { x ->
            Snackbar.make(x, "Delete the message?", Snackbar.LENGTH_SHORT)
                .setAction("YES") { y ->
                    Snackbar.make(y, "Message deleted.", Snackbar.LENGTH_SHORT).show()
                }
                .show()

        }

        bindingMain.buttonPrivate.setOnClickListener { z ->
            val snackBar = Snackbar.make(z, "No internet connection!", Snackbar.LENGTH_LONG)
            snackBar.setAction("Try Again") {

            }

            snackBar.setActionTextColor(Color.RED)
            snackBar.setTextColor(Color.BLUE)
            snackBar.setBackgroundTint(Color.LTGRAY)
            snackBar.show()

        }

    }
}