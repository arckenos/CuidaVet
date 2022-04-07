package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class registro : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val anterior = iniciar_sesion::class.java
        val btnVolver : Button = findViewById(R.id.btnVolver)
        val btnSiguiente : Button = findViewById(R.id.btnSiguiente)

        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, anterior)
            startActivity(intent)
        }

        btnSiguiente.setOnClickListener {
            var intent : Intent = Intent(this, registro_mascota::class.java)
            startActivity(intent)
        }



    }
}