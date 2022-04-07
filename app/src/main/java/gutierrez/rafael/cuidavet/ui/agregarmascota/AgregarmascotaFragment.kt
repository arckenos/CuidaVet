package gutierrez.rafael.cuidavet.ui.agregarmascota

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import gutierrez.rafael.cuidavet.R
import gutierrez.rafael.cuidavet.databinding.FragmentAgregarmascotaBinding

class AgregarmascotaFragment : Fragment() {

    private var _binding: FragmentAgregarmascotaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_agregarmascota, container, false)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}