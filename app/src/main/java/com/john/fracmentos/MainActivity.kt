package com.john.fracmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private val firstFragment = FirstFragment()
    private val secondFragment= SecondFragment()
    private lateinit var fragmentManager : FragmentManager //gestor de Fragmentos d.
    private lateinit var btnFirstFragment: Button
    private lateinit var btnSecondFragment: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponent()
        initEvent()
    }
    private fun initComponent() {
        fragmentManager = supportFragmentManager //gestor de transacciones
        btnFirstFragment = findViewById(R.id. btn_frag1)
        btnSecondFragment = findViewById(R.id. btn_frag2)
    }
    private fun initEvent() {
        btnFirstFragment.setOnClickListener {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container_view_dinamic, firstFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        btnSecondFragment.setOnClickListener {
            val transaction = fragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container_view_dinamic, secondFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}