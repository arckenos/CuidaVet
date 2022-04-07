package gutierrez.rafael.cuidavet.ui.mismascotas

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import gutierrez.rafael.cuidavet.R
import gutierrez.rafael.cuidavet.calendario
import gutierrez.rafael.cuidavet.databinding.FragmentMascotasBinding
import gutierrez.rafael.cuidavet.databinding.FragmentMenuHomeBinding
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
            val fragment = InfomascotaFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_view, fragment)?.commit()
        }
        bin.imgMascota2.setOnClickListener {
            val fragment = InfomascotaFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_view, fragment)?.commit()
        }
        bin.imgMascota3.setOnClickListener {
            val fragment = InfomascotaFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_view, fragment)?.commit()
        }
        bin.imgMascota4.setOnClickListener {
            val fragment = InfomascotaFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_view, fragment)?.commit()
        }
        bin.btAgregar.setOnClickListener {
            val fragment = AgregarmascotaFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_view, fragment)?.commit()
        }

        return bin.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}