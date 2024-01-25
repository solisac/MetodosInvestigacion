/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class Aplicacion {

    public static void main(String[] args) throws InterruptedException {
        int op = 0;
        Scanner leer = new Scanner(System.in);

        String menu = "\t\t\t**** Metodología de la Investigación *****\n"
                + "Ingresa una opción: \n"
                + "\t1.- Método Inductivo\n"
                + "\t2.- Método Deductivo\n"
                + "\t3.- Método Analítico\n"
                + "\t4.- Método Sintético\n"
                + "\t5.- Método Histórico Lógico\n"
                + "\t6.- Evaluación \n"
                + "\t7.- Salir";

        do {
         
            try {
                System.out.println(menu);
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("El método inductivo es un proceso de "
                                + "razonamiento que se basa en la observación y "
                                + "la experimentación para llegar a "
                                + "una conclusión general a partir de "
                                + "casos específicos.");
                        Thread.sleep(5 * 1000);
                        break;
                    case 2:
                        System.out.println("Se selecciono el caso 2");
                        Thread.sleep(5 * 1000);
                        break;
                    case 3:
                        System.out.println("Se selecciono el caso 3");
                        Thread.sleep(5 * 1000);
                        break;
                    case 4:
                        System.out.println("Se selecciono el caso 4");
                        Thread.sleep(5 * 1000);
                        break;
                    case 5:
                        System.out.println("Se selecciono el caso 5");
                        Thread.sleep(5 * 1000);
                        break;
                    case 6:
                        System.out.println("Se selecciono el caso 6");
                        Thread.sleep(5 * 1000);
                        break;
                    case 7:
                        System.out.println("Gracias por participar");

                        break;
                        
                }
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Aplicacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        } while (op != 7);

    }

}
