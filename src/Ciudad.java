public class Ciudad extends Pais{
    //Atributos
    String nombreCiudad;
    String alcalde;

    //Constructores


    public Ciudad(String nombre, String gentilicio, String continente, String nombreCiudad, String alcalde) {
        super(nombre, gentilicio, continente);
        this.nombreCiudad = nombreCiudad;
        this.alcalde = alcalde;
    }

    //Setters y getters

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public void setAlcalde(String alcalde) {
        this.alcalde = alcalde;
    }


    //Metodo personalizado

    @Override
    public void mostrarPais() {
        super.mostrarPais();
        System.out.println("Información de ciudad");
        System.out.println("Nombre: "+this.getNombreCiudad());
        System.out.println("Alcalde: "+this.getAlcalde());
        System.out.println();
    }

    @Override
    public void Descripcion() {
        super.Descripcion();
        System.out.println("Descripcion de la ciudad");
        System.out.println( getNombreCiudad() + " es una ciudad que esta en el país "+ getNombrePais());
        System.out.println();
    }
}
