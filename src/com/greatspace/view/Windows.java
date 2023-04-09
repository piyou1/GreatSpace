package com.greatspace.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 * @author: Derick Felix
 * @Data: 02/13/2016
 * @Release: 2.1
 * @Class: Window
 * @Objective: Create the Main Window
 */

 public class Windows {

    JFrame frame = new JFrame("Great Space");
    public Windows() {

       
        Game f = new Game();
        f.checkPlayer();
        frame.add(f);
        frame.setJMenuBar(f.criarMenu());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 420);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        try {
            URL url = getClass().getResource("../sprites/gsicon.png");
            BufferedImage image = ImageIO.read(url);
            frame.setIconImage(image);
        } catch (IOException e) {
            System.out.println("ImageError: " + e);
        }
        frame.setVisible(true);
       
       

    }
   
       

    



    public static void main(String[] args) {
         /* Set the System look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       /*  try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Windows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(() -> {
            Windows window = new Windows();
         }); 
           */
          System.out.println("Hello"); 
      
    }
 }
  

