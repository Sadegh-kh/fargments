package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fargments.databinding.LayoutFragment1Binding
import com.example.fargments.databinding.LayoutFragment2Binding

class Fragment2 : Fragment() {
    lateinit var binding: LayoutFragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= LayoutFragment2Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
}