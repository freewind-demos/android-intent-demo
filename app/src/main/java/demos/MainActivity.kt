package demos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.btnExplicit).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", "测试")
            startActivity(intent)
        }
        
        findViewById<Button>(R.id.btnImplicit).setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = android.net.Uri.parse("https://www.google.com")
            startActivity(intent)
        }
    }
}
