/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package welldevs.welldevs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author admin
 */
public class WellDevs {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
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
                
    }

    
   

