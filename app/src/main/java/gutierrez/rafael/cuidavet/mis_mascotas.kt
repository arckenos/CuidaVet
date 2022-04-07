package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class mis_mascotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mis_mascotas)

        val imgMascota1: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota2: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota3: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota4: ImageView = findViewById(R.id.imgMascota1)
        val btnAgregar : Button = findViewById(R.id.btAgregar)
        val btnVolver : Button = findViewById(R.id.btnVolver)



        btnVolver.setOnClickListener {
            var intent : Intent = Intent(this, MenuDesplegable::class.java)
            startActivity(intent)
        }


        imgMascota1.setOnClickListener {
            var intent : Intent = Intent(this, info_mascota::class.java)
            startActivity(intent)
        }
        imgMascota2.setOnClickListener {
            var intent : Intent = Intent(this, info_mascota::class.java)
            startActivity(intent)
        }
        imgMascota3.setOnClickListener {
            var intent : Intent = Intent(this, info_mascota::class.java)
            startActivity(intent)
        }
        imgMascota4.setOnClickListener {
            var intent : Intent = Intent(this, info_mascota::class.java)
            startActivity(intent)
        }
        btnAgregar.setOnClickListener {
            var intent : Intent = Intent(this, agregar_mascota::class.java)
            startActivity(intent)
        }

    }
}