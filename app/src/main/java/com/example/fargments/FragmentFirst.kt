package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fargments.databinding.FragmentFirstBinding
const val KEY_NAME="first and last name"
const val KEY_PARCELABLE="parcelable"
class FragmentFirst:Fragment() {
lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOpenSecond.setOnClickListener {
            // load second fragment in first fragment
            val firstName = binding.editFirstName.editText!!.text.toString()
            val lastName = binding.editLastName.editText!!.text.toString()
            val age =21
            val gender= true
            if (firstName.isNotEmpty() && lastName.isNotEmpty())
            {
                val data =Person(name = firstName,lastName,age,gender)
                val bundle= Bundle()
                bundle.putParcelable(KEY_PARCELABLE,data)
                bundle.putString(KEY_NAME," $firstName $lastName ")
                val fragment = FragmentSecond()
                fragment.arguments =bundle
                val transaction = childFragmentManager.beginTransaction()
                transaction.add(binding.frameFragmentFirstContainer.id,fragment)
                transaction.addToBackStack(null)
                transaction.commit()
            }else{
                Toast.makeText(context, "فیلد ها را پر کنید", Toast.LENGTH_SHORT).show()
            }


        }
    }



}