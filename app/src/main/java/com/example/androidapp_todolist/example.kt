package com.example.androidapp_todolist

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import android.os.Bundle
import com.example.androidapp_todolist.ui.fragments.AppointmentsFragment
import com.example.androidapp_todolist.ui.fragments.HomeFragment
import com.example.androidapp_todolist.ui.fragments.ListsFragment
import com.example.androidapp_todolist.ui.fragments.MedicationsFragment


class example : AppCompatActivity() {
/**
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val homeFragment = HomeFragment()
            val listsFragment = ListsFragment()
            val medicationsFragment = MedicationsFragment()
            val appointmentsFragment = AppointmentsFragment()

            makeCurrentFragment(homeFragment)

            bottom_navigation.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.ic_home -> makeCurrentFragment(homeFragment)
                    R.id.ic_list -> makeCurrentFragment (listsFragment)
                    R.id.ic_appointments -> makeCurrentFragment (homeFragment)
                    R.id.ic_medications -> makeCurrentFragment (homeFragment)
                }
                true
            }
        }

            private fun makeCurrentFragment(fragment: Fragment) =
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fl_wrapper, fragment)
                        commit()
                    }
    **/
        }