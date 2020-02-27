package molina.arenasl.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.activity_registro.*

class Pantalla3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btn1.setOnClickListener {
            var intent = Intent(this, btn1_pantalla::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            var intent = Intent(this, btn2_pantalla::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            var intent = Intent(this, btn3_pantalla::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            var intent = Intent(this, btn4_pantalla::class.java)
            startActivity(intent)
        }
        btn5.setOnClickListener {
            var intent = Intent(this, btn5_pantalla::class.java)
            startActivity(intent)
        }
        btn6.setOnClickListener {
            var intent = Intent(this, btn6_pantalla::class.java)
            startActivity(intent)
        }


    }
}
