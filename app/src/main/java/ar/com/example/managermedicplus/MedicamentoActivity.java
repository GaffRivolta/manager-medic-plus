package ar.com.example.managermedicplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MedicamentoActivity extends AppCompatActivity {

    TextView pruebaDroga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento);

        pruebaDroga = (TextView) findViewById(R.id.textViewPruebaDroga);

        Bundle medicamentoActivityBundle = this.getIntent().getExtras();

        if (medicamentoActivityBundle != null){
            String nombreDroga = medicamentoActivityBundle.getString("droga");
            pruebaDroga.setText("La droga es: "+nombreDroga);
        }
    }
}