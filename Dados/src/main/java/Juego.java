
import static java.lang.Math.abs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
public class Juego {
    private int apuesta=0;
    private int tc=0;
    private String est="";
    private String tiroo="";
    
    
    private Dados D1=new Dados();
    private Dados D2=new Dados(); 
    
    private Jugador j=new Jugador();
    
    public void setJ(Jugador j){
       this.j=j;
    }
     
    public void setApuest(int apuesta){
        apuesta=abs(apuesta);
        
        if (j.Getbal()>=apuesta){
            j.Setbal(j.Getbal()-apuesta);
            this.apuesta=apuesta;
        }
        
        else{
            this.apuesta=j.Getbal();
            j.Setbal(0);
      
        }
    }
    public void lanzar(){
       int d1=D1.lanzar();
       int d2=D2.lanzar();
       
       int tiro=d1+d2;
       tiroo=d1+"+"+d2+"="+tiro;
        System.out.println(tc+" "+tiro);
       if(tc==0){
            if (tiro==2 || tiro==3 || tiro==12){
              this.apuesta=0;
              est="Perdiste";
          }else if(tiro==7||tiro==11){
              j.Setbal(2*apuesta+j.Getbal());
              this.apuesta=0;
              est="Ganaste";
          }else {
           tc=tiro;
           
       }
       }else{
           if (tiro==7){
              this.apuesta=0;
               est="Perdiste";
               tc=0;
          }else if(tiro==tc){
              j.Setbal(2*apuesta+j.Getbal());
              this.apuesta=0;
               est="Ganaste";
               tc=0;
               
          }
       }
       
       
    }
    
    public String Getest(){
        return est;
    }
    public String Gettiro(){
        return tiroo;
    }
    public void Setest(String est){
        this.est=est;
    }
}
