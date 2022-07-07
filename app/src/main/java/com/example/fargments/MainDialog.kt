package com.example.fargments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.fargments.databinding.DialogMainBinding

class MainDialog(private val mainDialogEvent: MyDialogEvent):DialogFragment() {
    lateinit var binding:DialogMainBinding
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog =AlertDialog.Builder(context)

        val view = LayoutInflater.from(context).inflate(R.layout.dialog_main,null,false)

        binding= DialogMainBinding.inflate(layoutInflater,null,false)

        dialog.setView(binding.root)

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
        return dialog.create()

    }
    interface MyDialogEvent{
        fun sendTextData(data:String)
    }

}