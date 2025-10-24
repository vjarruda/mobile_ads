package modulo2.cineverse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.mobile.R

class MovieDetailFragment : Fragment() {
    private val args: MovieDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_detail, container, false)

        val titleView = view.findViewById<TextView>(R.id.txtMovieTitle)
        val yearView = view.findViewById<TextView>(R.id.txtMovieYear)

        titleView.text = "Título: ${args.movieTitle}"
        yearView.text = "Ano: ${args.movieYear}"

        return view
    }
}