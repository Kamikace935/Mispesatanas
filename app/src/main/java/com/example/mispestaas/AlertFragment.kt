package com.example.mispestaas

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class AlertFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_alert, container, false)
        val builder = AlertDialog.Builder(activity)

        //val sumar = vista.findViewById<Button>(R.id.sumar)

        /*sumar.setOnClickListener {
            builder.setTitle("CLASE DA2D1E")
                .setMessage("Aprendiendo a poner AlertDialog en fragmentos")
                .setPositiveButton("Perfecto", null)
                .create()
                .show()
        }*/

        return vista
    }

}