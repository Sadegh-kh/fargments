package com.example.fargments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.fargments.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val myAdapter = MyViewPagerAdapter(this)

        binding.viewPagerMain.adapter=myAdapter
        binding.viewPagerMain.orientation=ViewPager2.ORIENTATION_HORIZONTAL
        binding.viewPagerMain.offscreenPageLimit=3

        val mediator = TabLayoutMediator(binding.tabLayoutMain,
            binding.viewPagerMain,
            object :TabLayoutMediator.TabConfigurationStrategy{
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    when(position){

                        0->{tab.text="frag1"}
                        1->{tab.text="frag2"}
                        2->{tab.text="frag3"}
                    }
                }


            })
            mediator.attach()

    }
}