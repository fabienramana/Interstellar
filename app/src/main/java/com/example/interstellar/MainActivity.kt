package com.example.interstellar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.interstellar.business.model.Movie
import com.example.interstellar.ui.actor.ActorAdapter
import com.example.interstellar.ui.actor.actors

class MainActivity : AppCompatActivity() {
    private lateinit var title: TextView
    private lateinit var releaseDate: TextView
    private lateinit var pegi: TextView
    private lateinit var duration: TextView
    private lateinit var categories: TextView
    private lateinit var description: TextView
    private lateinit var note: TextView
    private lateinit var numberOfViews: TextView
    private lateinit var metascore: TextView
    private lateinit var numberOfCritics: TextView

    private lateinit var actorRecyclerView: RecyclerView
    private val actorAdapter by lazy { ActorAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createAndSetValue()
        setRecyclerView()
    }

    private fun createAndSetValue(){
        val m: Movie =
            Movie(
                "Interstellar",
                "2014",
                "pegi-12",
                "2h40",
                "Aventure,Drama,Science-Fiction",
                "A team of explorer travel through a wormhole in space in an attempt to ensure humanity's survival",
                "8.3/10",
                "1.1M",
                "85",
                "40 critics reviews"
            )
        title = findViewById(R.id._title)
        title.text = m.title

        releaseDate = findViewById(R.id._releaseDate)
        releaseDate.text = m.releaseDate

        pegi = findViewById(R.id._pegi)
        pegi.text = m.pegi

        duration = findViewById(R.id._duration)
        duration.text = m.duration

        categories = findViewById(R.id._categories)
        categories.text = m.categories

        description = findViewById(R.id._description)
        description.text = m.description

        note = findViewById(R.id._note)
        note.text = m.note

        numberOfViews = findViewById(R.id._nb_views)
        numberOfViews.text = m.numberOfViews

        metascore = findViewById(R.id.score_reviews)
        metascore.text = m.metascore

        numberOfCritics = findViewById(R.id.nb_reviews)
        numberOfCritics.text = m.numberOfCritics
    }

    private fun setRecyclerView(){
        actorRecyclerView = findViewById(R.id.list_actors)
        actorRecyclerView.apply {
            adapter = actorAdapter
        }
        actorAdapter.actors = actors
    }


}