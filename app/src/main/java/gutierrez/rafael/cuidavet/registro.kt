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
        val btnSiguiente : Button = findViewById(R.id.btnSiguiente)

        btnSiguiente.setOnClickListener {
            var intent : Intent = Intent(this, MenuDesplegable::class.java)
            startActivity(intent)
        }



    }
}