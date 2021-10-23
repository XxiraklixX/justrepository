git initgipackage com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        sguper.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}