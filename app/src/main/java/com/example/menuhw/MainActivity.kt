package com.example.menuhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menuhw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflate = menuInflater.inflate(R.menu.layout_menu, menu)
        return true


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.setting -> {
                val intent = Intent(this, SittingActivity::class.java)
                this.startActivity(intent)
            }

            R.id.contact_us -> {
                val intent = Intent(this, contactActivity::class.java)
                this.startActivity(intent)
            }

            R.id.login -> {
                val intent = Intent(this, loginActivity2::class.java)
                this.startActivity(intent)
            }

        }
return true

    }
}