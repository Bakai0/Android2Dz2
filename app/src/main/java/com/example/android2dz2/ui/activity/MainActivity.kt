package com.example.android2dz2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.android2dz2.R
import com.example.android2dz2.utils.PrefernceHelper

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpNavigation()
    }

    private fun setUpNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

    }

    override fun onStart() {
        super.onStart()

        if (PrefernceHelper.saveFragment){
            navController.navigate(R.id.noteappFragment)
        }else{
            navController.navigate(R.id.onBoardFragment)
        }

    }
}