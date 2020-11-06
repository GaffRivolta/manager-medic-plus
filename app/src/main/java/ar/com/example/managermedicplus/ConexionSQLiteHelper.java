package ar.com.example.managermedicplus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    final String CREAR_TABLA_MEDICAMENTO = "CREATE TABLE medicamentos (" +
            "medicamento_id INTEGER, medicamento_nombre TEXT, " +
            "medicamento_droga TEXT, medicamento_descripcion TEXT)";

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_MEDICAMENTO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS medicamentos");
        onCreate(db);
    }
}
