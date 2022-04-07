package gutierrez.rafael.cuidavet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class mascotas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mascotas)

        val imgMascota1: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota2: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota3: ImageView = findViewById(R.id.imgMascota1)
        val imgMascota4: ImageView = findViewById(R.id.imgMascota1)
  //      val anterior = "aqui va el menu"::class.java
        val btnVolver : Button = findViewById(R.id.btnVolver)



        btnVolver.setOnClickListener {
            //var intent : Intent = Intent(this, anterior)
            //startActivity(intent)
        }


        imgMascota1.setOnClickListener {
            iniciarMascota()
        }
        imgMascota2.setOnClickListener {
            iniciarMascota()
        }
        imgMascota3.setOnClickListener {
            iniciarMascota()
        }
        imgMascota4.setOnClickListener {
            iniciarMascota()
        }

    }


    fun  iniciarMascota(){
        var intent : Intent = Intent(this, mascota_info::class.java)
        startActivity(intent)
    }
}