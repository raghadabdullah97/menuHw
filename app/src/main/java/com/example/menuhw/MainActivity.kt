package com.example.menuhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menuhw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var islogin = true
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

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {

        val login = menu?.findItem(R.id.login)
        val logout = menu?.findItem(R.id.logout)

        if (islogin){
            islogin = !islogin
            login?.setVisible(true)
            logout?.setVisible(false)
        } else {

            islogin = !islogin
            login?.setVisible(false)
            logout?.setVisible(true)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        Toast.makeText(applicationContext, "${item.title}", Toast.LENGTH_SHORT).show()
        when (item.title) {


            R.string.sitting.toString() -> {
                Toast.makeText(applicationContext, "here", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SittingActivity::class.java)
                this.startActivity(intent)
            }

            R.string.contact_us.toString()  -> {
                val intent = Intent(this, contactActivity::class.java)
                this.startActivity(intent)
            }

            R.string.login.toString() -> {
                item.title=R.string.logout.toString()
               val intent = Intent(this, loginActivity2::class.java)
                this.startActivity(intent)
            }

        }
return true

    }
}