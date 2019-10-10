package com.example.mesinkejujuran

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentDua : Fragment() {

    lateinit var tampilan: View
    lateinit var button1: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tampilan = inflater.inflate(R.layout.activity_fragment_dua, container, false)
        configureElements()
        return tampilan
    }

    private fun configureElements() {
        button1 = tampilan.findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("www.kata.ai"))
            startActivity(intent)
        }
    }
}
