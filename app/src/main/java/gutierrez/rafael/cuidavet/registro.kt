package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import gutierrez.rafael.cuidavet.databinding.ActivityRegistroBinding


class registro : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.btnSiguiente.setOnClickListener {
            val email = binding.etCorreo.text.toString()
            val user = binding.etUsuario.text.toString()
            val nombre = binding.etNombre.text.toString()
            val password = binding.etContrasenia.text.toString()
            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(baseContext,"Ingrese todos los datos", Toast.LENGTH_SHORT).show()
            }else if(password.length < 6){
                Toast.makeText(baseContext,"Contrasenia muy corta", Toast.LENGTH_SHORT).show()
            }else{
                createAccount(email,password)
            }

        }

    }

    private fun createAccount(email: String, password: String){
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){ task ->
                if(task.isSuccessful){
                    Toast.makeText(baseContext,"Usuario registado con exito", Toast.LENGTH_SHORT).show()
                    reload()
                }else{
                    Toast.makeText(baseContext,"Autentication failed", Toast.LENGTH_SHORT).show()
                }

            }
    }

    private fun reload(){
        val intent : Intent = Intent(this, iniciar_sesion::class.java)
        startActivity(intent)
    }
}