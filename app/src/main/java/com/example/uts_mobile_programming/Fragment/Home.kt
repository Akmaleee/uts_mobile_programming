package com.example.uts_mobile_programming.Fragment

import android.content.ClipData.Item
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toolbar
import com.example.uts_mobile_programming.R

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val kepageberita: Button = view.findViewById(R.id.btn_berita)
        val kepageprofile : Button = view.findViewById(R.id.btn_profile)

        kepageberita.setOnClickListener {
            val fragment = Berita()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_home, fragment).commit()
        }

        kepageprofile.setOnClickListener {
            val fragment = Profile()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frag_home,fragment).commit()
        }


        return view

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.option_menu_item, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.item1 -> {

//                // Pindah ke halaman Berita
//                val fragment = Profile()
//                val transaction = parentFragmentManager.beginTransaction()
//                transaction.replace(R.id.frag_home,fragment).commit()
                true
            }

            R.id.item2 -> {
                // Pindah ke halaman Profile
//                val fragment = Profile()
//                val transaction = parentFragmentManager.beginTransaction()
//                transaction.replace(R.id.frag_home,fragment).commit()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


    }





