/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.avaliacao.util;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPasswordField;

/**
 *
 * @author User
 */
public class ConfiguraCampos {
    public void configCampoSenha(JPasswordField componente, 
            String texto){
        componente.setText(texto);
        componente.setForeground(Color.GRAY);
        componente.setEchoChar((char) 0);
        
        componente.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {       
                if(String.valueOf(componente.getPassword()).equals(texto)){
                    componente.setText("");
                    componente.setForeground(Color.BLACK);
                    componente.setEchoChar('*');
                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
               if(String.valueOf(componente.getPassword()).equals("")){
                   componente.setText(texto);
                   componente.setForeground(Color.GRAY);
                   componente.setEchoChar((char) 0);
               }  
            }
        });
    }
    
    
}
