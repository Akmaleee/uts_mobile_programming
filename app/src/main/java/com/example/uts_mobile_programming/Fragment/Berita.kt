package com.example.uts_mobile_programming.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.uts_mobile_programming.R

class Berita : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_berita, container, false)

        val kepagehome: Button = view.findViewById(R.id.btn_home)
        val kepageprofile: Button = view.findViewById(R.id.btn_profile)

        kepagehome.setOnClickListener {
            val fragment = Home()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_berita, fragment).commit()
        }

        kepageprofile.setOnClickListener {
            val fragment = Profile()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_berita, fragment).commit()
        }

        return view
    }
}
