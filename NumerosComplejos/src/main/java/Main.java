/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in);
    int op=0;
    Complejo c1=new Complejo();
    Complejo c2=new Complejo();
    
    
    while(op!=7){
    System.out.println("Que operacion va a hacer?");
    System.out.println("1)Suma\n2)Resta");
    System.out.println("3)multiplicacion\n4)Division");
    System.out.println("5)conjugado\n6)norma\n7)Salir");
      op=s.nextInt();
    if(op!=7){
      c1.leer();
      c2.leer();
    }
    
  switch(op){
    case 1:
    c1.suma(c2).imprimir();
    break;
    case 2:
    c1.resta(c2).imprimir();
    break;
    case 3:
    c1.multiplicacion(c2).imprimir();
    break;
    case 4:
    c1.dividir(c2).imprimir();
    break;
    case 5:
    c1.conjugado().imprimir();
    break;
    case 6:
    System.out.println(c1.norma());
    break;
  }
    }
    }
}


