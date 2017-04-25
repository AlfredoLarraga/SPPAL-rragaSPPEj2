/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3ej2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AALS
 */
public class Proyecto3ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
          Arreglo();
    }
    public static int solicitacionEntero(String mensaje){
     
        int num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Integer.parseInt(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double solicitaDouble(String mensaje){
     
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    public static double[] Arreglo(){
        double suma=0;
        int var=solicitacionEntero ("¿Cuántas cantidades de gasto desea capturar?"); 
        double [] arreglo = new double [var];
        
        for (int i=0; i<arreglo.length; i++){
                arreglo[i]= solicitaDouble("Introduzca una cantidad:");
                suma = (suma + arreglo[i]);
            }
        
        JOptionPane.showMessageDialog (null, "El total de gastos es: " + suma);
    return arreglo;
    }
}
        
        
        
    
    

    
        
    
 
