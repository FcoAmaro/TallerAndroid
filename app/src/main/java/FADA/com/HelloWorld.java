package FADA.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Button suma = (Button)findViewById(R.id.btnCalcularSuma);
    }
}
