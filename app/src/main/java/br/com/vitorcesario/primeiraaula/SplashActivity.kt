package br.com.vitorcesario.primeiraaula

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    val tempo_splash = 3500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        carregar()
    }

    fun carregar(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },tempo_splash)
    }
}
