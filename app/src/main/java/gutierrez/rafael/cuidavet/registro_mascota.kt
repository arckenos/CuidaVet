package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class registro_mascota : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_mascota)

        val anterior = registro::class.java
        val btnVolver : Button = findViewById(R.id.btnVolver)
        val btnEmpezar: Button = findViewById(R.id.btnEmpezar)


        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, anterior)
            startActivity(intent)
        }

        btnEmpezar.setOnClickListener {
            var intent : Intent = Intent(this, anterior)
            startActivity(intent)
        }

    }
}