package com.diplomado.firebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.diplomado.firebase.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var autenticacion: FirebaseAuth
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTitle("Home")
        autenticacion = FirebaseAuth.getInstance()

        binding.btnCerrarSesion.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        autenticacion.signOut()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}