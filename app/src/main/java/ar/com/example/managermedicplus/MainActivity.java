package ar.com.example.managermedicplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import ar.com.example.managermedicplus.utilidades.UtilidadesConexion;

public class MainActivity extends AppCompatActivity {

    EditText medicamentoNombreDroga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medicamentoNombreDroga = (EditText) findViewById(R.id.inputTextMedicamentoNombreDroga);

        RegistrarMedicamentos();
    }

    private void RegistrarMedicamentos() {
        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "bd_manager_medic_plus", null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues valores = new ContentValues();

        valores.put(UtilidadesConexion.CAMPO_MEDICAMENTO_ID, 1);
        valores.put(UtilidadesConexion.CAMPO_MEDICAMENTO_NOMBRE, "Rivotril");
        valores.put(UtilidadesConexion.CAMPO_MEDICAMENTO_DROGA, "Clonazepam");
        valores.put(UtilidadesConexion.CAMPO_MEDICAMENTO_DESCRIPCION, "Ansiolítico");

        Long idResultanteBaseDatos = db.insert(UtilidadesConexion.TABLA_MEDICAMENTO, UtilidadesConexion.CAMPO_MEDICAMENTO_ID, valores);

        Toast.makeText(getApplicationContext(),"ID Medicamento: "+idResultanteBaseDatos, Toast.LENGTH_SHORT).show();

        db.close();
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnBuscarMedicamento:
                buscarMedicamento();

                Intent medicamentoActivityIntent = new Intent(MainActivity.this,MedicamentoActivity.class);
                Bundle medicamentoActivityBundle = new Bundle();

                medicamentoActivityBundle.putString("droga", "Rivotril");

                medicamentoActivityIntent.putExtras(medicamentoActivityBundle);

                startActivity(medicamentoActivityIntent);
            break;
        }
    }

    private void buscarMedicamento() {
        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this, "bd_manager_medic_plus", null, 1);
        SQLiteDatabase db = conexion.getReadableDatabase();

        String[] parametros = {medicamentoNombreDroga.getText().toString()};
        String[] camposDevueltos = {UtilidadesConexion.CAMPO_MEDICAMENTO_DROGA};

        Cursor cursor = db.query(UtilidadesConexion.TABLA_MEDICAMENTO,camposDevueltos,UtilidadesConexion.CAMPO_MEDICAMENTO_NOMBRE+"=?", parametros,null,null,null);
        cursor.moveToFirst();
    }

}