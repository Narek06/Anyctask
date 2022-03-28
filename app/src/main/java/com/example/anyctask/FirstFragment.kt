package com.example.anyctask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn = view.findViewById<Button>(R.id.button)
        val edit1 = view.findViewById<EditText>(R.id.editTextTextPassword)
        val edit2 = view.findViewById<EditText>(R.id.editTextTextPassword2)

        btn.setOnClickListener {
            findNavController()
                .navigate(
                    FirstFragmentDirections
                        .actionFirstFragmentToSecondFragment (
                            edit1.text.toString().toInt(),
                            edit2.text.toString().toInt(),
                        )
                )
        }
    }
}