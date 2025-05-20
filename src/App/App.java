package App;

public class App {
    private String nombre;
    private String año;
    private String descripcion;
    private int puntuacion;

    public App(String nombre, String año, String descripcion, int puntuacion) {
        this.nombre = nombre;
        this.año = año;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAño() {
        return año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nAño: " + año + "\nDescripción: " + descripcion + "\nPuntuación: " + puntuacion;
    }
}
