package com.hafidz.hafidzrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sepatuList = listOf<Sepatu>(
            Sepatu(
                R.drawable.nike,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Sepatu(
                R.drawable.addidas,
                "Captain America",
                "Captain America adalah pahlawan super dari Marvel."
            ),
            Sepatu(
                R.drawable.futsal,
                "Doctor Strange",
                "Doctor Strange adalah pesulap terkuat di kosmos."
            ),
            Sepatu(
                R.drawable.puma,
                "Captain Marvel",
                "Captain Marvel adalah Dia dijuluki pahlawan wanita Marvel terbesar, dan sangat mungkin adalah Avenger Marvel yang terkuat."
            ),
            Sepatu(
                R.drawable.vans,
                "Hulk",
                "Hulk adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics."
            ),
            Sepatu(
                R.drawable.fanshionse,
                "Black Widow",
                "Black Widow memiliki kecerdasan yang berbakat"
            ),
            Sepatu(
                R.drawable.mix,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Sepatu(
                R.drawable.shoes,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Sepatu(
                R.drawable.suprame,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            ),
            Sepatu(
                R.drawable.paa,
                "Spiderman",
                "Spiderman adalah Avengers dan Superhero terkeren"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_sepatu)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SepatuAdapter(this, sepatuList){

            val intent = Intent (this, DetailSepatu::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}