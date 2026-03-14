package cm_a15033.helloworldoptional

import android.os.Bundle
import android.os.Build
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText = findViewById<EditText>(R.id.editTextTextMultiLine)

        val informações =
                    "Manufacturer: " + Build.MANUFACTURER + "\n" +
                    "Model: " + Build.MODEL + "\n" +
                    "Brand: " + Build.BRAND + "\n" +
                    "Type: " + Build.TYPE + "\n" +
                    "User: " + Build.USER + "\n" +
                    "Base: " + Build.VERSION_CODES.BASE + "\n" +
                    "Incremental: " + Build.VERSION.INCREMENTAL + "\n" +
                    "SDK: " + Build.VERSION.SDK_INT + "\n" +
                    "Version: " + Build.VERSION.RELEASE + "\n" +
                    "Display: " + Build.DISPLAY + "\n"

        editText.setText(informações)
    }
}