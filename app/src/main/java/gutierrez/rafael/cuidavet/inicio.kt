package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class inicio : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
        val btnIniciar : Button = findViewById(R.id.btnIniciar)
        btnIniciar.setOnClickListener {
            var intent : Intent = Intent(this, iniciar_sesion::class.java)
            startActivity(intent)
        }

    }
}