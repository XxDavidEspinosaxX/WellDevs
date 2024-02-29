/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package welldevs.welldevs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class WellDevs {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numero = 10;
        
        while (numero >= 0) {
            System.out.println("Opciones menu: ");
            System.out.println("1. Añadir cliente");
            System.out.println("2. Eliminar cliente ");
            System.out.println("3. Agregar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Crear pedido");
            System.out.println("6. Eliminar pedido");
            System.out.println("7. Listar clientes");
            System.out.println("8. Listar productos");
            System.out.println("9. Historial de pedidos");
            System.out.println("10. Salir");
            System.out.println("Ingrese una opcion correcta");
            
            int opciones = Integer.parseInt(input.readLine());
            
            switch (opciones) {
                case 1:
                    System.out.println("---- Añadiendo cliente ----");
                    break;
                case 2:
                    System.out.println("---- Eliminando cliente ----");
                    break;
                case 3:
                    System.out.println("---- Añadiendo producto ----");
                    break;
                case 4:
                    System.out.println("---- Eliminando producto ----");
                    break;
                case 5:
                    System.out.println("---- Añadiendo pedido ----");
                    break;
                case 6:
                    System.out.println("---- Eliminando pedido ---- ");
                    break;
                case 7:
                    System.out.println("---- Listando clientes ----");
                    break;
                case 8:
                    System.out.println("---- Listando productos ----");
                    break;
                case 9:
                    System.out.println("---- Historial de pedidos ----");
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    return;
                
                     
            }
        }

     }
    
    //Funcion de añadir cliente:
    
    //Funcion de eliminar cliente:
    
    //Funcion de añadir producto:
    
       public static void AñadirProducto(String[] args) throws IOException{
           
        ArrayList<String> pedidos = new ArrayList<>();
        BufferedReader nombrepedido = new BufferedReader(new InputStreamReader(System.in));
        String pedido = nombrepedido.readLine();
        System.out.println("Nombre de pedido: ");
       // if nombrepedido
                
    }
    
    //Funcion de eliminar producto:
    
    //Funcion de añadir pedido:
    
    //Funcion de eliminar pedido:
    
    //Funcion de listar clientes:
    
    //Funcion de listar productos:
    
    //Funcion de historial de pedidos
 
                
    }

    
   

