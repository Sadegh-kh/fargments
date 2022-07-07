package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fargments.databinding.LayoutFragment1Binding
import com.example.fargments.databinding.LayoutFragment3Binding

class Fragment3 : Fragment() {
    lateinit var binding: LayoutFragment3Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= LayoutFragment3Binding.inflate(layoutInflater,container,false)
        return binding.root
    }
}