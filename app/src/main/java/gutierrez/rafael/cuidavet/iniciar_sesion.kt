package gutierrez.rafael.cuidavet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class iniciar_sesion : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)
        val btnIniciar : Button = findViewById(R.id.btnIniciar)
        val btnUsuarioNuevo : Button = findViewById(R.id.btnUsuarioNuevo)

        btnIniciar.setOnClickListener {
            var intent : Intent = Intent(this, MenuDesplegable::class.java)
            startActivity(intent)
        }


        btnUsuarioNuevo.setOnClickListener{
            var intent : Intent = Intent(this, registro::class.java)
            startActivity(intent)
        }





    }
}