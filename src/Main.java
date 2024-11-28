
public class Main {
    public static void main(String[] args) {

        //País
        Pais pais1 = new Pais("Ecuador","Ecuatorianos","America");
        pais1.mostrarPais();
        pais1.Descripcion();

        //Ciudad
        Ciudad ciudad1 = new Ciudad("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz");
        ciudad1.mostrarPais();
        ciudad1.Descripcion();

        //Cantón
        Canton canton1 = new Canton("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul");
        canton1.mostrarPais();
        canton1.Descripcion();

        //Parroquia
        Parroquia parroquia1 = new Parroquia("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul","Conocoto","Conocoto",6);
        parroquia1.mostrarPais();
        parroquia1.Descripcion();

        //Barrio
        Barrio barrio1 = new Barrio("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul","Conocoto","Conocoto",6,"La Hospitalaria",20);
        barrio1.mostrarPais();
        barrio1.Descripcion();

    }
}