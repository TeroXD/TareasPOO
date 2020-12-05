/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */

public class Aguja{
    //El avanze, que se puede mover hasta x punto
    private int numero;
    private int limite;
  


  public void sumar(){
    numero++;
    numero=numero%limite;
  }
  
  public void valorLimite(int limite){
      this.limite=limite;
  }
  
  public void reiniciar(){
    numero=0;
  }
  public int getTiempo(){
      return numero;
  }
}//TIMERS

   /* public Aguja(int numero, int limite){
        this.numero=numero;
        this.limite=limite;
    }
    
    public void avance(){
        numero++;
    }
    public void setlimite(){
        this.limite=limite;
    }
    //😥😥*/
