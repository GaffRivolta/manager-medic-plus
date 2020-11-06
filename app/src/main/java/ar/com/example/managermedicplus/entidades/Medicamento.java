package ar.com.example.managermedicplus.entidades;

public class Medicamento {

    private Integer id;
    private String nombre;
    private String droga;
    private String descripcion;

    public Medicamento(Integer id, String nombre, String droga, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.droga = droga;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDroga() {
        return droga;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
