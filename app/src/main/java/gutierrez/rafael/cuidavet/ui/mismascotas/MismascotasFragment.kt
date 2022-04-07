package gutierrez.rafael.cuidavet.ui.mismascotas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import gutierrez.rafael.cuidavet.R
import gutierrez.rafael.cuidavet.agregar_mascota
import gutierrez.rafael.cuidavet.calendario
import gutierrez.rafael.cuidavet.databinding.FragmentMascotasBinding
import gutierrez.rafael.cuidavet.databinding.FragmentMenuHomeBinding
import gutierrez.rafael.cuidavet.info_mascota
import gutierrez.rafael.cuidavet.ui.agregarmascota.AgregarmascotaFragment
import gutierrez.rafael.cuidavet.ui.infomascota.InfomascotaFragment

class MismascotasFragment : Fragment() {

    private var _binding: FragmentMascotasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val bin = FragmentMascotasBinding.inflate(layoutInflater)

        bin.imgMascota1.setOnClickListener {
            val intent = Intent(this@MismascotasFragment.requireContext(), info_mascota::class.java)
            startActivity(intent)
        }
        bin.imgMascota2.setOnClickListener {
            val intent = Intent(this@MismascotasFragment.requireContext(), info_mascota::class.java)
            startActivity(intent)
        }
        bin.imgMascota3.setOnClickListener {
            val intent = Intent(this@MismascotasFragment.requireContext(), info_mascota::class.java)
            startActivity(intent)
        }
        bin.imgMascota4.setOnClickListener {
            val intent = Intent(this@MismascotasFragment.requireContext(), info_mascota::class.java)
            startActivity(intent)
        }
        bin.btAgregar.setOnClickListener {
            val intent = Intent(this@MismascotasFragment.requireContext(), agregar_mascota::class.java)
            startActivity(intent)
        }

        return bin.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}