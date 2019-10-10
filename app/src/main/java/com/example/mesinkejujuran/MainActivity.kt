package com.example.mesinkejujuran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.frame1, FragmentSatu())
        fragmentTransaction.add(R.id.frame2, FragmentDua())
        fragmentTransaction.commit()
    }
}
