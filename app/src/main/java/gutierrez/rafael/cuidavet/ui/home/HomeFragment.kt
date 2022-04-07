package gutierrez.rafael.cuidavet.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import gutierrez.rafael.cuidavet.R
import gutierrez.rafael.cuidavet.calendario
import gutierrez.rafael.cuidavet.databinding.FragmentMascotasBinding
import gutierrez.rafael.cuidavet.databinding.FragmentMenuHomeBinding
import gutierrez.rafael.cuidavet.mis_mascotas
import gutierrez.rafael.cuidavet.ui.mismascotas.MismascotasFragment

class HomeFragment : Fragment() {

    private var _binding: FragmentMenuHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val bin = FragmentMenuHomeBinding.inflate(layoutInflater)

        bin.btnCalendario.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), calendario::class.java)
            startActivity(intent)
        }
        bin.btnMascotas.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), mis_mascotas::class.java)
            startActivity(intent)
        }

        return bin.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}