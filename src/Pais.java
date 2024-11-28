public class Pais {
    //Atributos
    String nombre;
    String gentilicio;
    String continente;

    //Constructores
    public Pais(String nombre, String gentilicio, String continente) {
        this.nombre = nombre;
        this.gentilicio = gentilicio;
        this.continente = continente;
    }

    //Setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGentilicio() {
        return gentilicio;
    }

    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    //Metodo personalizado
    public void mostrarPais(){
        System.out.println("Información del país");
        System.out.println("Nombre: " + nombre);
        System.out.println("Gentilicio: " + gentilicio);
        System.out.println("Continente: " + continente);
        System.out.println();
    }
}
