package com.example.mispestaas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calcular : Fragment() {

    private lateinit var edt1 : EditText
    private lateinit var edt2 : EditText
    private lateinit var sumar : Button
    private lateinit var tv : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_calcular, container, false)
        edt1 = vista.findViewById(R.id.edt1)
        edt2 = vista.findViewById(R.id.edt2)
        sumar = vista.findViewById(R.id.sumar)
        tv = vista.findViewById(R.id.tv)

        sumar.setOnClickListener {
            if(edt1.text.isNotEmpty() && edt2.text.isNotEmpty())
                tv.text = suma(edt1.text.toString().toInt(), edt2.text.toString().toInt())

        }

        return vista
    }

    private fun suma(x: Int, y: Int): String {
        return (x + y).toString()
    }

}