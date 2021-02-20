/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
import java.util.Random;
public class Dados {
    
    
    public int lanzar(){
       
        Random lanzada=new Random();
        return lanzada.nextInt(6)+1;
        
    }
        
}
