//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Controller.MenuController;
import Service.NumeroService;
import UI.Menu;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner inputTexto = new Scanner(System.in);
        NumeroService numeroService = new NumeroService();
        MenuController menuController = new MenuController();
        Menu menu = new Menu();
        int opcion;
        int subOpcion;
        do{
            menu.mostrarMenu();
            opcion = inputTexto.nextInt();

            if(opcion == 5){
                menu.subMenu();
                subOpcion = inputTexto.nextInt();
                menuController.recibirSubOpcion(subOpcion);
            }else{
                menuController.recibirOpcion(opcion);
            }
        }while (opcion != 6);


    }
}