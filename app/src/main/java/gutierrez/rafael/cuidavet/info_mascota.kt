package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class info_mascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_mascota)

        val btnVolver : Button = findViewById(R.id.btnVolver)

        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, mis_mascotas::class.java)
            startActivity(intent)
        }
    }
}