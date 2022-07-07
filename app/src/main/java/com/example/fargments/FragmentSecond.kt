package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fargments.databinding.FragmentSecondBinding

class FragmentSecond:Fragment() {
lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString(KEY_NAME)

        val person=arguments?.getParcelable<Person>(KEY_PARCELABLE)

        binding.txtShowName.text =" ${person?.name} ${person?.lastName} ${person?.age} ${person?.gender}"


    }



}