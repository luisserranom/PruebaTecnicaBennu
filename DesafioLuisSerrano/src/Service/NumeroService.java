package Service;

import Config.AppConstants;
import Repository.NumeroRepository;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import static Config.AppConstants.*;


public class NumeroService {
    AppConstants appConstants = new AppConstants();
    ArrayList<Integer> numerosAzar = new ArrayList<>();
    Random random = new Random();
    NumeroRepository numeroRepository = new NumeroRepository();
    int cantidadDeNumeros;

    public void recibirCantidadDeNumeros(int cantidad){
        cantidadDeNumeros = cantidad;
    }
    
    public void crearNumeroAzar(){
        limpiarLista();
        for (int i=1; i <=cantidadDeNumeros;i++){
            int numero = random.nextInt(10);
            numerosAzar.add(numero);
            System.out.println(numero);
        }
        numeroRepository.guardarNumerosAzar(numerosAzar);
        System.out.println(numerosAzar);

    }

    public void leerArchivoNumerosAzar(){
        try{
            BufferedReader lector = new BufferedReader(new FileReader(numeroRepository.buscarArchivoAzar()));
            String line;
            while((line = lector.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("no se encontro archivo, crealo con la opcion 1"+ e.getMessage());
        }
    }
    public void ordenarArchivo(){
        ArrayList<Integer> numeroOrdenados = new ArrayList();
        Collections.sort(numerosAzar);
        for(Integer numero: numerosAzar){
            numeroOrdenados.add(numero);
            System.out.println(numero);
        }
        numeroRepository.guardarNumerosOrdenados(numeroOrdenados);
    }

    public void leerArchivoNumerosOrdenados(){
        try{
            BufferedReader lector = new BufferedReader(new FileReader(numeroRepository.buscarArchivoOrdenados()));
            String line;
            while((line = lector.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("no se encontro archivo, crealo con la opcion 1"+ e.getMessage());
        }
    }

    public void BuscarNumeroArchivo(int numero){
        ArrayList<Integer> numeros = new ArrayList<>();
        try{
            BufferedReader lector = new BufferedReader(new FileReader(numeroRepository.buscarArchivoAzar()));
            String line;
            boolean encontrado = false;
            while((line = lector.readLine()) !=null){
                if(line.equals(String.valueOf(numero))){
                    System.out.println("numero encontrado: " +line);
                    encontrado = true;
                    break;
                }
            }
            lector.close();
            if(!encontrado){
                System.out.println("no se encontro el numero");
            }
        }catch (IOException e){
            System.out.println("error al leer archivo"+ e.getMessage());
        }
    }
    public void limpiarLista(){
        numerosAzar.clear();
    }


}
