package dohieu.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
    }
}
