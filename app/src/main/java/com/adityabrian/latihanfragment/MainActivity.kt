package com.adityabrian.latihanfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentSatu = FragmentSatu()
        val fragment = supportFragmentManager.findFragmentByTag(FragmentSatu::class.java.simpleName)

        if (fragment != fragmentSatu){
            supportFragmentManager.beginTransaction()
                .add(R.id.countainer,fragmentSatu,fragmentSatu::class.java.simpleName)
                .commit()
        }
    }
}