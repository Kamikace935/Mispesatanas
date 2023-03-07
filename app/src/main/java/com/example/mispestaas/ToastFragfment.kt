package com.example.mispestaas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class ToastFragfment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_toast_fragfment, container, false)


        //val sumar = vista.findViewById<Button>(R.id.sumar)

        /*sumar.setOnClickListener {
            val text = "Bien sumado"
            val duration = Toast.LENGTH_LONG
            Toast.makeText(activity?.applicationContext, text, duration).show()
        }*/

        return vista
    }

}