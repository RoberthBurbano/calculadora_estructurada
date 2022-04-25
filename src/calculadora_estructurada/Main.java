/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_estructurada;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero1;
        double numero2;
        double resultado;
        
        numero1=4.5;
        numero2=2.0;
        //sumar dos numero
        resultado=numero1+numero2;
        System.out.println(resultado);
        //restar dos numero
        resultado=numero1-numero2;
        System.out.println("Resultado de la resta: "+resultado);
        //multiplicar dos numero solicitandolos por teclad
        Scanner s=new Scanner(System.in);
        System.out.print("Ingrese el numero 1: ");
        numero1=s.nextDouble();
        System.out.print("Ingrese el numero 2: ");
        numero2=s.nextDouble();
        resultado=numero1*numero2;
        System.out.println("Resultado de la multiplicacion: "+resultado);
        //dividir dos numero solicitados por teclado
        System.out.print("Ingrese el numero 1: ");
        numero1=s.nextDouble();
        System.out.print("Ingrese el numero 2: ");
        numero2=s.nextDouble();
        if(numero2==0){
            System.out.println("error, division entre 0");
        }
        else{
            resultado=numero1/numero2;
            System.out.println("Resultado de la division: "+resultado);
        }
    }
    
}
