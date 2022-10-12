/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package front;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author andrestellesrivera
 */
public class Editor extends javax.swing.JPanel {

    public File archivo;
    public BufferedWriter bw;
    public FileWriter fw;
    public BufferedReader br;
    public JFileChooser chooser;
    public FileOutputStream fos = null;
    public String str;
    
    /**
     * Creates new form Editor
     *
     * @param archivo
     */
    // Configurar file chooser
    public Editor(File archivo) {
        this.archivo = archivo;

        if (archivo.exists()) {
            try {
                if (!archivo.createNewFile()) {
                    initComponents();
                } else {
                    JOptionPane.showMessageDialog(this, "No fue posible la creacion del archivo");
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                if (!archivo.createNewFile()) {
                    JOptionPane.showMessageDialog(this, "No fue posible la creacion del archivo");
                } else {
                    initComponents();
                }
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtContenido = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        txtContenido.setColumns(20);
        txtContenido.setRows(5);
        jScrollPane1.setViewportView(txtContenido);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void guardar() {

        try {       
            str = txtContenido.getText();
            fos = new FileOutputStream(this.archivo);
            
            byte[] bytesArray = str.getBytes();

            try {
                fos.write(bytesArray);
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                fos.flush();
            } catch (IOException ex) {
                Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (fos != null) 
	     {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
                }
	     }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txtContenido;
    // End of variables declaration//GEN-END:variables
}
