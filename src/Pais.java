public class Pais {
    //Atributos
    String nombrePais;
    String gentilicio;
    String continente;

    //Constructores
    public Pais(String nombrePais, String gentilicio, String continente) {
        this.nombrePais = nombrePais;
        this.gentilicio = gentilicio;
        this.continente = continente;
    }

    //Setters y getters

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
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
        System.out.println("Nombre: " + getNombrePais());
        System.out.println("Gentilicio: " + getGentilicio());
        System.out.println("Continente: " + getContinente());
        System.out.println();
    }

    public void Descripcion(){
        System.out.println("Descripción del país:");
        System.out.println( getNombrePais() +" es un país que se encuentra en " + getContinente());
        System.out.println();
    }
}
