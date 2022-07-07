package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fargments.databinding.LayoutFragment1Binding

class Fragment1 : Fragment() {
    lateinit var binding: LayoutFragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=LayoutFragment1Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
}