package ar.com.example.managermedicplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import ar.com.example.managermedicplus.adaptadores.AdaptadorMedicamento;
import ar.com.example.managermedicplus.entidades.Medicamento;

public class MedicamentoActivity extends AppCompatActivity {

    //TextView pruebaDroga;
    RecyclerView recyclerViewMedicamentos;
    ArrayList<Medicamento> medicamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_medicamento);
        //pruebaDroga = (TextView) findViewById(R.id.textViewPruebaDroga);

        Bundle medicamentoActivityBundle = this.getIntent().getExtras();

        if (medicamentoActivityBundle != null){
            //String nombreDroga = medicamentoActivityBundle.getString("droga");
            //pruebaDroga.setText("La droga es: "+nombreDroga);

            medicamentos = (ArrayList<Medicamento>) medicamentoActivityBundle.getSerializable("listaMedicamentos");
            recyclerViewMedicamentos = (RecyclerView) findViewById(R.id.recyclerViewItemsMedicamento);
            recyclerViewMedicamentos.setLayoutManager( new LinearLayoutManager(this));

            AdaptadorMedicamento adaptadorMedicamento = new AdaptadorMedicamento(this, medicamentos);
            recyclerViewMedicamentos.setAdapter(adaptadorMedicamento);
        }
    }
}