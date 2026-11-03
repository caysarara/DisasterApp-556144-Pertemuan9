package com.example.disasterapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy()) { disaster ->
            Toast.makeText(
                this@MainActivity,
                "You clicked on ${disaster.nameDisaster}",
                Toast.LENGTH_SHORT
            ).show()
        }

        with(binding) {
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }

            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = GridLayoutManager(this@MainActivity, 2)
            }

        }
    }

    fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(nameDisaster = "Tsunami", disasterType = "Natural", imageDisaster = R.drawable.tsunami),
            Disaster(nameDisaster = "Volcanic Eruption", disasterType = "Natural", imageDisaster = R.drawable.meletus),
            Disaster(nameDisaster = "Earthquake", disasterType = "Natural", imageDisaster = R.drawable.gempa_bumi),
            Disaster(nameDisaster = "Flood", disasterType = "Natural", imageDisaster = R.drawable.banjir),
            Disaster(nameDisaster = "Fire", disasterType = "Natural", imageDisaster = R.drawable.kebakaran),
            Disaster(nameDisaster = "Nuclear Accident", disasterType = "Man-made", imageDisaster = R.drawable.nuklir),
            Disaster(nameDisaster = "Terrorist Attack", disasterType = "Man-made", imageDisaster = R.drawable.teroris),
            Disaster(nameDisaster = "War", disasterType = "Man-made", imageDisaster = R.drawable.war)
        )
    }
}