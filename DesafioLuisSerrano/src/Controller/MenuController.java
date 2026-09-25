package Controller;

import Service.NumeroService;


public class MenuController {
    NumeroService numeroService = new NumeroService();
    public void recibirOpcion(int numero){

        switch (numero){
            case  0:
                System.out.println("0a");

                break;
            case  1:
                System.out.println("usted eligio la opcion 1");
                numeroService.crearNumeroAzar();
                break;
            case  2:
                System.out.println("lee archivo ordenado");
                numeroService.leerArchivoNumerosAzar();
                break;
            case  3:
                System.out.println("Ordenar archivo");
                numeroService.ordenarArchivo();
                break;
            case  4:
                System.out.println("Lee archivo ordenado");
                numeroService.leerArchivoNumerosOrdenados();
                break;
            case  5:
                System.out.println("Buscar numero en archivo");
                break;
            case  6:
                System.out.println("6a");
                System.out.println("muchas gracias, vuelve pronto :)");
                numeroService.limpiarLista();
                break;
            default:
                System.out.println("ingrese una opcion disponible");
        }
    }

    public void recibirSubOpcion(int numero){
        numeroService.BuscarNumeroArchivo(numero);
    }
}
