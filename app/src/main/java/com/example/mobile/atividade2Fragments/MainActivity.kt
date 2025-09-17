package com.example.mobile.atividade2Fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mobile.R
import com.example.mobile.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragmentbtn.setOnClickListener {
            replaceFragment(Fragment1())
        }

        binding.fragmentbtn2.setOnClickListener {
            replaceFragment(Fragment2())
        }

        binding.fragmentbtn3.setOnClickListener {
            replaceFragment(Fragment3())
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
