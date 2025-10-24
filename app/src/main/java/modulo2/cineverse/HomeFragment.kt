package modulo2.cineverse

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mobile.R

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val button = view.findViewById<Button>(R.id.btnOpenDetail)
        button.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMovieDetailFragment(
                movieTitle = "12 homens e uma sentença",
                movieYear = 1957
            )
            findNavController().navigate(action)
        }

        return view
    }
}