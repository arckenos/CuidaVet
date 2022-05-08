package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class agregar_mascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_mascota)

        val btnVolver : Button = findViewById(R.id.btnVolver)
        val btnEmpezar : Button = findViewById(R.id.btnEmpezar)

        btnEmpezar.setOnClickListener {
            var intent : Intent = Intent(this, MenuDesplegable::class.java)
            startActivity(intent)
        }

        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, mis_mascotas::class.java)
            startActivity(intent)
        }
    }
}