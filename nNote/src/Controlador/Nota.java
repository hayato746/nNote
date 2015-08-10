package Controlador;

/**
 *
 * @author Alex
 */
public class Nota {
    
    private String titulo;
    private String contenido;
    private int id;
    
    public Nota(String titulo, String contenido, int id){
        this.titulo = titulo;
        this.contenido = contenido;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
