package com.example.fargments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fargments.databinding.DialogMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainBottomSheet(private val mainDialogEvent: MyDialogEvent):BottomSheetDialogFragment() {
    lateinit var binding:DialogMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = LayoutInflater.from(context).inflate(R.layout.dialog_main,null,false)

        binding= DialogMainBinding.inflate(layoutInflater,null,false)


        binding.btnCancel.setOnClickListener {
            dismiss()
        }
        binding.btnAccept.setOnClickListener {
            val name = binding.editFirstName.text.toString()
            val lastName=binding.editLastName.text.toString()
            if (name.isNotEmpty()&&lastName.isNotEmpty())
            {
                mainDialogEvent.sendTextData("$name $lastName")
                dismiss()
            }else{
                Toast.makeText(context, "لطفا فیلد ها را پر کنید", Toast.LENGTH_SHORT).show()
            }
        }
        return binding.root
    }

    interface MyDialogEvent{
        fun sendTextData(data:String)
    }

}