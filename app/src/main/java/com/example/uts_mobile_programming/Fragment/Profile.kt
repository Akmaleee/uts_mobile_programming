package com.example.uts_mobile_programming.Fragment
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.uts_mobile_programming.MainActivity
import com.example.uts_mobile_programming.R

class Profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val kepagehome : Button = view.findViewById(R.id.btn_home)
        val kepageberita : Button = view.findViewById(R.id.btn_berita)
        val kepagelogout : Button = view.requireViewById(R.id.btn_logout)

        kepagehome.setOnClickListener {
            val fragment = Home()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_profile, fragment).commit()
        }

        kepageberita.setOnClickListener {
            val fragment = Berita()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_profile, fragment).commit()
        }

        kepagelogout.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }

    return view

    }

}