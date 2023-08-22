package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/*
2- Navigation Component kullanarak bir "Liste"(RecyclerView) fragmentı ve bir "Detay" fragmentı oluşturun.
Liste fragmentından tıklanan öğeye bağlı olarak detay fragmentına geçişi sağlayın
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}