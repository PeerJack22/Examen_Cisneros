import java.sql.SQLOutput;

public class Parroquia extends Canton{

    //Atributos
    String nombreParroquia;
    String barrioPrincipal;
    int n_iglesias;

    //Constructor
    public Parroquia(String nombre, String gentilicio, String continente, String nombre1, String alcalde, String nombreCanton, String colorBandera,String nombreParroquia, String barrioPrincipal, int n_iglesias) {
        super(nombre, gentilicio, continente, nombre1, alcalde, nombreCanton, colorBandera);
        this.nombreParroquia = nombreParroquia;
        this.barrioPrincipal = barrioPrincipal;
        this.n_iglesias = n_iglesias;
    }

    //Setters y getters

    public String getNombreParroquia() {
        return nombreParroquia;
    }

    public void setNombreParroquia(String nombreParroquia) {
        this.nombreParroquia = nombreParroquia;
    }

    public String getBarrioPrincipal() {
        return barrioPrincipal;
    }

    public void setBarrioPrincipal(String barrioPrincipal) {
        this.barrioPrincipal = barrioPrincipal;
    }

    public int getN_iglesias() {
        return n_iglesias;
    }

    public void setN_iglesias(int n_iglesias) {
        this.n_iglesias = n_iglesias;
    }

    //Metodo personalizado

    @Override
    public void mostrarPais() {
        super.mostrarPais();
        System.out.println("Información de la parroquia");
        System.out.println("Nombre: " + getNombreParroquia());
        System.out.println("Barrio principal: " + getBarrioPrincipal());
        System.out.println("Número de iglesias: " + getN_iglesias());
        System.out.println();
    }

    @Override
    public void Descripcion() {
        super.Descripcion();
        System.out.println("Descripcion de la parroquia");
        System.out.println(getNombreParroquia()+ " es una parroquia que esta en el cantón "+ getNombreCanton());
        System.out.println();
    }
}
