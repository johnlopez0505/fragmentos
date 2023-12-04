package com.john.fracmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.john.fracmentos.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var bindingSecund : FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingSecund = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return bindingSecund.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindingSecund.txtNombre.text = "Tambien desde otro fragmento"

    }


}