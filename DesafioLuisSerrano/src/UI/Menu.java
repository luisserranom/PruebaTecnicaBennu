package UI;

public class Menu {

    public void mostrarMenu(){
        System.out.println("=======================");
        System.out.println("opciones");
        System.out.println("0: menu");
        System.out.println("1: genera nuevo archivo");
        System.out.println("2: lee archivo generado");
        System.out.println("3  ordena archivo");
        System.out.println("4: lee el archivo ordenado");
        System.out.println("5: buscar numero en archivo");
        System.out.println("6: salir");
        System.out.print("ingresa una opcion: ");

    }
    public void subMenu(){
        System.out.println("=======================");
        System.out.print("ingrese el numero que desea buscar: ");
    }
}
