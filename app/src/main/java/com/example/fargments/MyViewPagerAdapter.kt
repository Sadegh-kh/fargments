package com.example.fargments

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {

        return 3//tedad fragment haye ke mikhahd namayesh bedahad(3 ta fragment darim (fragment 1 , fragment 2 ,fragment 3))
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->{
                return Fragment1()
            }
            1->{
                return Fragment2()

            }
            2->{

                return Fragment3()
            }//3 ta fragment bishtar ndarim
            else->{

                return Fragment()//darsorti ke getItemCount Eshtebah dade bashim
            }
        }

    }
}