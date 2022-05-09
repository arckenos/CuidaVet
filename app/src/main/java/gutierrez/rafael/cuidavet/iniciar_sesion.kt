package gutierrez.rafael.cuidavet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import gutierrez.rafael.cuidavet.databinding.ActivityIniciarSesionBinding

class iniciar_sesion : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityIniciarSesionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSesionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnUsuarioNuevo : Button = findViewById(R.id.btnUsuarioNuevo)

        auth = Firebase.auth

        binding.btnIniciar.setOnClickListener {
            val mEmail = binding.etUsuario.text.toString()
            val mPassw = binding.etContrasenia.text.toString()

            when{
                mEmail.isEmpty() || mPassw.isEmpty() ->{
                    Toast.makeText(baseContext, "Mail o contrasenia incorrecta. ",
                    Toast.LENGTH_SHORT).show()
                }else->{
                    signIn(mEmail, mPassw)
                }
            }
        }


        binding.btnUsuarioNuevo.setOnClickListener {
            var intent : Intent = Intent(this, registro::class.java)
            startActivity(intent)
        }



    }

    private fun signIn(email:String, password: String){
        auth.signInWithEmailAndPassword(email,password)
            .addOnCompleteListener(this){ task->
                if(task.isSuccessful){
                    Log.d("TAG", "Inicio de sesion con exito")
                    reload();
                }else{
                    Log.d("TAG", "Fallo al iniciar sesion")
                    Toast.makeText(baseContext, "Fallo al iniciar sesion",
                        Toast.LENGTH_SHORT).show();
                }
            }
    }

    private fun reload(){
        val intent = Intent(this,MenuDesplegable::class.java)
        this.startActivity(intent)
    }
}