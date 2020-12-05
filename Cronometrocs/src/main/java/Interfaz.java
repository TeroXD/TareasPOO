/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author monte
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;


import static javax.swing.SwingConstants.CENTER;
public class Interfaz extends JFrame implements ActionListener{
    public JPanel panel;
    public JLabel datos;
    public JButton inicio;
    public JButton pausa;
    public JButton reestablecer;
    public Cronometro cronometro;
    
       public Interfaz(){
        Cronometro cronometro = new Cronometro();
        panel = new JPanel();
        datos = new JLabel("00:00:00");
        inicio = new JButton("Inicio");
        pausa = new JButton("Pausa");
        reestablecer = new JButton("Reestablecer");
        
        panel.setBackground(Color.darkGray);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        datos.setHorizontalAlignment(CENTER);
        datos.setBounds(150, 200, 200, 50);
        datos.setOpaque(true);
        datos.setBackground(Color.darkGray);
        datos.setFont(new Font("arial",Font.BOLD,30));
        datos.setForeground(Color.gray);
        panel.add(datos);
        
        inicio.setBounds(150, 300, 90, 40);
        inicio.setEnabled(true);
        inicio.setMnemonic('a');
        inicio.setForeground(Color.darkGray);
        inicio.setFont(new Font("arial",Font.PLAIN,20));
        inicio.setBackground(Color.gray);
        panel.add(inicio);
        
        
        pausa.setBounds(250, 300, 90, 40);
        pausa.setEnabled(false);
        pausa.setMnemonic('b');
        pausa.setForeground(Color.darkGray);
        pausa.setFont(new Font("arial",Font.PLAIN,20));
        pausa.setBackground(Color.gray);
        panel.add(pausa);
        
      
        reestablecer.setBounds(165, 350, 160, 40);
        reestablecer.setEnabled(false);
        reestablecer.setMnemonic('c');
        reestablecer.setForeground(Color.darkGray);
        reestablecer.setFont(new Font("arial",Font.PLAIN,20));
        reestablecer.setBackground(Color.gray);
        panel.add(reestablecer);
        
       inicio.setActionCommand("1");
       pausa.setActionCommand("2");  
       reestablecer.setActionCommand("3");
       
       inicio.addActionListener(this);
       pausa.addActionListener(this);
       reestablecer.addActionListener(this);
       
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        setSize(500,500);
        setTitle(" ");
        //setLocation(50,50);
        //setBounds(500,500,500,500);
        //iniciarComponentes();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
     //Timer t = new Timer(string, rootPaneCheckingEnabled)
       
    Timer timer = new Timer(1000,new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e) {
      cronometro.añadirTiempo();
      Actualizar();
    }
    
    });
    
public void actionPerformed(ActionEvent e){

    switch(e.getActionCommand()){
      case "2":
        timer.stop();
        reestablecer.setEnabled(true);
        inicio.setEnabled(true);
        pausa.setEnabled(false);
      break;
      case "1":
        
        timer.start();
        reestablecer.setEnabled(false);
        inicio.setEnabled(false);
        pausa.setEnabled(true);
      break;
      case "3":
       
        timer.stop();
        cronometro.reiniciar();
        
      break;
        
    }
    Actualizar();
  }

    private void Actualizar(){
        datos.setText(cronometro.getTime());
    }
    
    /*private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        //colocarCajasdetexto();
    }
    private void colocarPaneles(){
        panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
        datos = new JLabel();
        
        datos.setText("00:00:00");
        datos.setHorizontalAlignment(CENTER);
        datos.setBounds(150, 200, 200, 50);
        datos.setOpaque(true);
        datos.setBackground(Color.darkGray);
        datos.setFont(new Font("arial",Font.BOLD,30));
        datos.setForeground(Color.gray);
        panel.add(datos);
    }
    private void colocarBotones(){
        inicio = new JButton();
        inicio.setText("Inicio");
        inicio.setBounds(150, 300, 90, 40);
        inicio.setEnabled(true);
        inicio.setMnemonic('a');
        inicio.setForeground(Color.darkGray);
        inicio.setFont(new Font("arial",Font.PLAIN,20));
        inicio.setBackground(Color.gray);
        panel.add(inicio);
        
        pausa = new JButton();
        pausa.setText("Pausa");
        pausa.setBounds(250, 300, 90, 40);
        pausa.setEnabled(true);
        pausa.setMnemonic('b');
        pausa.setForeground(Color.darkGray);
        pausa.setFont(new Font("arial",Font.PLAIN,20));
        pausa.setBackground(Color.gray);
        panel.add(pausa);
        
        reestablecer = new JButton();
        reestablecer.setText("Reestablecer");
        reestablecer.setBounds(165, 350, 160, 40);
        reestablecer.setEnabled(true);
        reestablecer.setMnemonic('c');
        reestablecer.setForeground(Color.darkGray);
        reestablecer.setFont(new Font("arial",Font.PLAIN,20));
        reestablecer.setBackground(Color.gray);
        panel.add(reestablecer);
        
     

        oyenteDeAccion();
    }
    
    /*private void colocarCajasdetexto(){
        JTextField texto = new JTextField();
        texto.setBounds(400,400,100,20);
        texto.setText("Hola");
        System.out.println("El texto es: "+texto.getText());
        panel.add(texto);
    }
    
    private void oyenteDeAccion(){
           ActionListener oyentedeaccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }; 
       // inicio.addActionListener(oyentedeaccion);  
    }*/
}