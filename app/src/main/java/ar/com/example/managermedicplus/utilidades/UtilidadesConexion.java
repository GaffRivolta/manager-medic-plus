package ar.com.example.managermedicplus.utilidades;

public class UtilidadesConexion {

    //Constantes campos de tabla medicamentos

    public static final String TABLA_MEDICAMENTO = "medicamentos";
    public static final String CAMPO_MEDICAMENTO_ID = "medicamento_id";
    public static final String CAMPO_MEDICAMENTO_NOMBRE = "medicamento_nombre";
    public static final String CAMPO_MEDICAMENTO_DROGA = "medicamento_droga";
    public static final String CAMPO_MEDICAMENTO_DESCRIPCION = "medicamento_descripcion";

    public static final String CREAR_TABLA_MEDICAMENTO = "CREATE TABLE " +TABLA_MEDICAMENTO+ " (" +
        CAMPO_MEDICAMENTO_ID+ " INTEGER, " +CAMPO_MEDICAMENTO_NOMBRE+ " TEXT, " +
        CAMPO_MEDICAMENTO_DROGA+" TEXT," +CAMPO_MEDICAMENTO_DESCRIPCION+ " TEXT)";
}
