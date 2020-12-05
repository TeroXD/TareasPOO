/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
import java.util.*;
class Main {
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);


    Punto a=new Punto();
    




    Punto b=new Punto();
    a.leer();
    b.leer();
    int op=-1;
    while(op!=0){
    System.out.println("\n\n1) Volver a escribir\n2) Hallar distancia desde un punto\n3) Distancia hasta el origen\n4) Imprimir\n5)Mover un punto\n0) salir\n\n");
    op=sc.nextInt();
    switch(op){
      case 1:
      a.leer();
      b.leer();
      break;
      case 2:
      System.out.println("La distancia desde a hasta b es "+a.distancia(b));
      break;
      case 3:
      System.out.println("La distancia hasta el origen de a es "+a.distancia());
      System.out.println("La distancia hasta el origen de b es "+b.distancia());
      break;
      case 4:
      a.imprimir();
      b.imprimir();
      break;
      case 5:
      System.out.println("Digite la traslacion del primer punto\n x");
      a.moverX(sc.nextInt());
      System.out.println("y:");
      a.moverX(sc.nextInt());

      break;
    }
    }
    /*vector c=new vector();
    c.leer();
    c.obtmagn();
    System.out.println("Distancia hasta el origen de c "+c.origen());
    c.imprmagn();*/
  }
}
