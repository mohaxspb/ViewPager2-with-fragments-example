package ru.kuchanov.viewpager2fragmentexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.kuchanov.viewpager2fragmentexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, ViewPagerFragment())
                .commit()
        }
    }
}