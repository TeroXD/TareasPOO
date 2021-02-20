/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
public class Jugador {
    private String nombre="";
    private int contraseña=0;
    private String email="";
    private int balance=0;
    
    public Jugador(){
        
    }
    
    public Jugador(String nombre, int contraseña, String email, int balance){
        this.nombre=nombre;
        this.contraseña=contraseña;
        this.email=email;
        this.balance=balance;
        
    }
    
    public int Getbal(){
        return this.balance;
    }
    
    public void Setbal(int balance){
        this.balance=balance;
    }
}
