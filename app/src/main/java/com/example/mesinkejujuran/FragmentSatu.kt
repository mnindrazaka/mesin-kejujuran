package com.example.mesinkejujuran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentSatu : Fragment() {

    lateinit var tampilan: View
    lateinit var editText1: EditText
    lateinit var textView1: TextView
    lateinit var buttonSubmit: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tampilan = inflater.inflate(R.layout.activity_fragment_satu, container, false)
        configureElements()
        return tampilan
    }

    private fun configureElements() {
        editText1 = tampilan.findViewById(R.id.editText1)
        textView1 = tampilan.findViewById(R.id.textView1)
        buttonSubmit = tampilan.findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            textView1.text = findAnswer()
        }
    }

    private fun findAnswer(): String {
        val text = editText1.text.toString()
        val inputs = text.split(" ")
        val reversedInputs = inputs.reversed().toMutableList()

        reversedInputs.forEachIndexed { index, input ->
            if (isHasNext(index, reversedInputs.size) && input == "bohong") {
                reversedInputs[index + 1] = switchWord(getNextWord(index, reversedInputs))
            }
        }

        return reversedInputs.reversed()[0]
    }

    private fun isHasNext(index: Int, size: Int): Boolean {
        return index + 1 < size
    }

    private fun getNextWord(index: Int, inputs: MutableList<String>): String {
        return inputs[index + 1]
    }

    private fun switchWord(word: String): String {
        return if (word == "bohong")
            "jujur"
        else
            "bohong"
    }
}
