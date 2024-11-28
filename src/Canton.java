public class Canton extends Ciudad{

    //Atributos
    String nombreCanton;
    String colorBandera;

    //Constructor
    public Canton(String nombre, String gentilicio, String continente, String nombreCiudad, String alcalde,String nombreCanton, String colorBandera) {
        super(nombre, gentilicio, continente, nombreCiudad, alcalde);
        this.nombreCanton = nombreCanton;
        this.colorBandera = colorBandera;
    }

    //Setters y getters


    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public String getColorBandera() {
        return colorBandera;
    }

    public void setColorBandera(String colorBandera) {
        this.colorBandera = colorBandera;
    }

    //Metodo personalizado


    @Override
    public void mostrarPais() {
        super.mostrarPais();
        System.out.println("Información del cantón");
        System.out.println("Nombre: "+ getNombreCanton());
        System.out.println("Color bandera: "+ getColorBandera());
        System.out.println();
    }

    @Override
    public void Descripcion() {
        super.Descripcion();
        System.out.println("Descripción del cantón");
        System.out.println(getNombreCanton() + " es un cantón que esta en la ciudad "+ getNombreCiudad());
        System.out.println();
    }
}
