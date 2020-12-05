/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */

public class Cronometro {
    public Segundero s;  
    public MinuTero m;
    public Horario h;
    
    
    public Cronometro(){
    Segundero s = new Segundero();
    MinuTero m = new MinuTero();
    Horario h = new Horario(24); 
    }
    public void añadirTiempo(){
        s.sumar();
        if (s.getTiempo()==0){
            m.sumar();
            if (m.getTiempo()==0){
                h.sumar();
            }
        }
    }
    public void reiniciar(){
        s.reiniciar();
        m.reiniciar();
        h.reiniciar();
    }
    public String arreglarTiempo(int n){
        return (n>=10? n+"":"0"+n);
    }
    
    public String getTime(){
        return arreglarTiempo(h.getTiempo())+":"+arreglarTiempo(m.getTiempo())+":"+arreglarTiempo(s.getTiempo());
    }
    /*
    private Timer t;
    private int horas,minutos,segundos;
    private ActionListener acciones;
    
    public Cronometro(){
        this.acciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                segundos++;
                if (segundos==60){
                    segundos=0;
                    minutos++;
                }
                if (minutos==60){
                    minutos=0;
                    horas++;
                }
            }
        };
        t = new Timer(1000,acciones);
    }
          */
}
