package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mascota_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascota_info)
        val anterior = mascotas::class.java
        val btnVolver : Button = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, anterior)
            startActivity(intent)
        }

    }
}