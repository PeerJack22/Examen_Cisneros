public class Barrio extends Parroquia{

    //Atributos
    String nombreBarrio;
    int n_panaderias;

    //Constructor
    public Barrio(String nombre, String gentilicio, String continente, String nombre1, String alcalde, String nombreCanton, String colorBandera, String nombreParroquia, String barrioPrincipal, int n_iglesias,String nombreBarrio,int n_panaderias) {
        super(nombre, gentilicio, continente, nombre1, alcalde, nombreCanton, colorBandera, nombreParroquia, barrioPrincipal, n_iglesias);
        this.nombreBarrio = nombreBarrio;
        this.n_panaderias = n_panaderias;
    }

    //Setters y getters

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public int getN_panaderias() {
        return n_panaderias;
    }

    public void setN_panaderias(int n_panaderias) {
        this.n_panaderias = n_panaderias;
    }

    //Metodo personalizado

    @Override
    public void mostrarPais() {
        super.mostrarPais();
        System.out.println("Información del barrio");
        System.out.println("Barrio: "+nombreBarrio);
        System.out.println("Número de panaderias: "+n_panaderias);
        System.out.println();
    }
}
