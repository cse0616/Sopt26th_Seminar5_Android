package com.example.sopt26seminar5

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sopt26seminar5.fragment.HomeFragment

class MainPagerAdapter(fm: FragmentManager):
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){


    override fun getItem(position: Int): Fragment {

        return HomeFragment()
    }

    override fun getCount(): Int {
        return 3
    }


}