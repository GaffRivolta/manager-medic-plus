package ar.com.example.managermedicplus.entidades;

public class Medicamento {

    private Integer medicamento_id;
    private String nombre;
    private String droga;
    private String descripcion;
    private String presentacion;
    private Integer categoria_id;

    public Medicamento() {
    }

    public Medicamento(Integer medicamento_id, String nombre, String droga, String descripcion, String presentacion, Integer categoria_id) {
        this.medicamento_id = medicamento_id;
        this.nombre = nombre;
        this.droga = droga;
        this.descripcion = descripcion;
        this.presentacion = presentacion;
        this.categoria_id = categoria_id;
    }

    public Integer getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(Integer medicamento_id) {
        this.medicamento_id = medicamento_id;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
    }
}
