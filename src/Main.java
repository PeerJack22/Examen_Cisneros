
public class Main {
    public static void main(String[] args) {

        //País
        Pais pais1 = new Pais("Ecuador","Ecuatorianos","America");
        pais1.mostrarPais();

        //Ciudad
        Ciudad ciudad1 = new Ciudad("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz");
        ciudad1.mostrarPais();

        //Cantón
        Canton canton1 = new Canton("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul");
        canton1.mostrarPais();

        //Parroquia
        Parroquia parroquia1 = new Parroquia("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul","Conocoto","Conocoto",6);
        parroquia1.mostrarPais();

        //Barrio
        Barrio barrio1 = new Barrio("Ecuador","Ecuatorianos","America","Quito","Pabel Muñoz","Quito","Rojo-Azul","Conocoto","Conocoto",6,"Hospitalaria",20);
        barrio1.mostrarPais();

    }
}