package ar.com.example.managermedicplus;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import ar.com.example.managermedicplus.utilidades.UtilidadesConexion;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UtilidadesConexion.CREAR_TABLA_CATEGORIA);
        db.execSQL(UtilidadesConexion.CREAR_TABLA_MEDICAMENTO);
        db.execSQL(UtilidadesConexion.CREAR_TABLA_FARMACIA);
        db.execSQL(UtilidadesConexion.CREAR_TABLA_DETALLE_MEDICAMENTO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + UtilidadesConexion.TABLA_DETALLE_MEDICAMENTO);
        db.execSQL("DROP TABLE IF EXISTS " + UtilidadesConexion.TABLA_FARMACIA);
        db.execSQL("DROP TABLE IF EXISTS " + UtilidadesConexion.TABLA_MEDICAMENTO);
        db.execSQL("DROP TABLE IF EXISTS " + UtilidadesConexion.TABLA_CATEGORIA);
        onCreate(db);
    }
}
