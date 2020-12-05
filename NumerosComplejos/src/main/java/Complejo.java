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

public class Complejo{
  float real=0;
  float imag=0;

  Complejo suma(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real+c1.real;
    res.imag=this.imag+c1.imag;
    return res;
  }

  Complejo resta(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real-c1.real;
    res.imag=this.imag-c1.imag;
    return res;
  }

  Complejo multiplicacion(Complejo c1){
    Complejo res=new Complejo();
    res.real=this.real*c1.real-(this.imag * c1.imag);
    res.imag=(this.real*c1.imag) + (this.imag*c1.real);
    return res;
  }

  Complejo conjugado(){
    Complejo res=new Complejo();
    res.real=this.real;
    res.imag=-this.imag;
    return res;
  }

  Complejo dividir(Complejo c2){
    Complejo res=new Complejo();
    Complejo numer=this.multiplicacion(c2.conjugado());
    res.real=numer.real/c2.multiplicacion(c2.conjugado()).real;
    res.imag=numer.imag/c2.multiplicacion(c2.conjugado()).real;
    return res;
  }


  Complejo dividir_2(Complejo c1,Complejo c2){
    Complejo res=new Complejo();
    Complejo num=new Complejo();
    Complejo den=new Complejo();
    num =this.multiplicacion(c2.conjugado());
    den = c2.multiplicacion(c2.conjugado());
    res.real = num.real / den.real ;
    res.imag = num.imag / den.imag;

    return res;
  }

double norma(){
  return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));

}

void leer(){
  Scanner s=new Scanner(System.in);
  System.out.println("digite la parte real del numero complejo");
  this.real=s.nextFloat();
  System.out.println("digite la parte imaginaria del "+this+" numero complejo");
  this.imag=s.nextFloat();
}

  void imprimir(){
    if(this.imag>=0){
      System.out.println(this.real+"+"+this.imag+"i");
    }
    else{
      System.out.println(this.real+this.imag+"i");
    }
  }  
}