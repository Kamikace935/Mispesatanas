package com.example.mispestaas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextClock
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


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calcular, container, false)
    }


}