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
class Punto{
  private double x;
  private double y;
  
  public Punto(){
    x=0;
    y=0;
  }
  public Punto(double a,double b){
    x=a;
    y=b;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public void setX(double x){
    this.x=x;
  }
  public void setY(double y){
    this.y=y;
  }

  public void moverX(double x){
    this.x+=x;
  }
  public void moverY(double y){
    this.y+=y;
  }
  public void moverdiag(double i){
    moverX(i);
    moverY(i);
  }
  public void moverdiag(double i,double j){
    moverX(i);
    moverY(j);
  }

  public void leer(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Digite la coordenada x del punto");
    x=sc.nextFloat();
    System.out.println("Digite la coordenada y del punto");
    y=sc.nextFloat();
  }
  public void imprimir(){
    System.out.println("("+x+" , "+y+")");
  }
  public double distancia(Punto a){
    return Math.pow(Math.pow(x-a.getX(),2)+Math.pow(y-a.getY(),2),0.5);
  }
  public double distancia(){
    return Math.pow(Math.pow(x,2)+Math.pow(y,2),0.5);
  }
}




class Punto3d extends Punto{
  private double z;
  public Punto3d(){
    z=0;
    setX(0);
    setY(0);
  }
  public Punto3d(double x,double y, double z){
    this.z=z;
    setX(x);
    setY(y);
  }
  public double getZ(){
    return z;
  }
  public void setZ(double z){
    this.z=z;
  }

  public void moverZ(double z){
    this.z+=z;
  }
  public void moverdiag(double i){
    moverX(i);
    moverY(i);
    moverZ(i);
  }
  public void moverdiag(double i,double j,double k){
    moverX(i);
    moverY(j);
    moverZ(k);
  }
}