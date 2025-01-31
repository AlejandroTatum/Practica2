/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.Util.Ejercicio3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kathe
 */
public class Fmr_Ejercicio3 extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    /**
     * Creates new form Fmr_Ejercicio3
     */
    
    Ejercicio3 ejercicio3 = new Ejercicio3();
    //private Float casas [][]= new Float [10][3];
    private int filasCasa = 10;
    private int columnasCasa = 4;
    private float casas[][] = new float[filasCasa][columnasCasa];
    
    
    
    public Fmr_Ejercicio3() {
        initComponents();
        setLocationRelativeTo(null);
        String[] titulos= new String[]{"Casa","Largo","Ancho","Numero Pisos"};
        dtm.setColumnIdentifiers(titulos);
        tblTabls.setModel(dtm);
    }

    public void agregar() {
        if ((procesarEntrada(txtcasaNum.getText())&& procesarEntrada(txtlongitud.getText()) && procesarEntrada(txtancho.getText()) && procesarEntrada(txtpisos.getText()))) {
             dtm.addRow(new Object[]{
            txtcasaNum.getText(), txtlongitud.getText(), txtancho.getText(), txtpisos.getText()});
        }
    }
    
    private int filaActual = 0; 

    public void guardarData() {
    // Crear un arreglo con los campos de texto que necesitamos validar
    String[] campos = {
        txtcasaNum.getText(),
        txtlongitud.getText(),
        txtancho.getText(),
        txtpisos.getText()
    };

    // Iterar sobre cada campo de texto y verificar que no estén vacíos
    for (String campo : campos) {
        if (!procesarEntrada(campo)) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Si algún campo es inválido, detenemos el proceso
        }
    }

    // Si todos los campos son válidos, procesamos los valores
    try {
        float casaNum = Float.parseFloat(txtcasaNum.getText());
        float longitud = Float.parseFloat(txtlongitud.getText());
        float ancho = Float.parseFloat(txtancho.getText());
        float pisos = Float.parseFloat(txtpisos.getText());

        // Verificar si hay espacio en el arreglo para guardar la nueva casa
        if (filaActual < filasCasa) {
            // Guardar los datos en el arreglo bidimensional
            casas[filaActual][0] = casaNum;
            casas[filaActual][1] = longitud;
            casas[filaActual][2] = ancho;
            casas[filaActual][3] = pisos;

            // Comparar las filas para detectar coincidencias en las columnas 1 a 3
            String filasHomonimas = obtenerFilasHomonimas();
            if (filasHomonimas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Las siguientes filas son homónimas: " + filasHomonimas, "Resultado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron filas homónimas.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            }

            // Incrementar la fila actual para el siguiente registro
            filaActual++;
        } else {
            JOptionPane.showMessageDialog(null, "El arreglo está lleno, no se pueden agregar más casas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Los valores ingresados no son números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Método para comparar filas en las columnas 1, 2 y 3 y devolver las filas homónimas
private String obtenerFilasHomonimas() {
    StringBuilder filasHomonimas = new StringBuilder();

    for (int i = 0; i < filaActual; i++) {
        for (int j = i + 1; j < filaActual; j++) {
            // Comparar las columnas 1 (longitud), 2 (ancho) y 3 (pisos) de las filas i y j
            if (casas[i][1] == casas[j][1] && casas[i][2] == casas[j][2] && casas[i][3] == casas[j][3]) {
                // Agregar a la lista las filas homónimas encontradas
                filasHomonimas.append("Fila ").append(i + 1).append(" y Fila ").append(j + 1).append("\n");
            }
        }
    }

    return filasHomonimas.toString();
}

// Método para comparar filas en las columnas 1, 2 y 3
private boolean compararFilas() {
    for (int i = 0; i < filaActual; i++) {
        for (int j = i + 1; j < filaActual; j++) {
            // Comparar las columnas 1 (longitud), 2 (ancho) y 3 (pisos) de las filas i y j
            if (casas[i][1] == casas[j][1] && casas[i][2] == casas[j][2] && casas[i][3] == casas[j][3]) {
                return true;  // Si hay al menos dos filas con las mismas dimensiones, retorna true
            }
        }
    }
    return false;  // Si no se encuentran coincidencias, retorna false
}
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtlongitud = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtancho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpisos = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        txtcasaNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabls = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Casas Homónimas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los datos"));

        jLabel3.setText("Longitud:");

        txtlongitud.setText(" ");

        jLabel4.setText("Ancho:");

        jLabel5.setText("Número de Pisos:");

        btnguardar.setText("AGREGAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Casa Nº:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcasaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtlongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtancho, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtpisos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)))
                .addComponent(btnguardar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguardar)
                    .addComponent(txtcasaNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblTabls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabls);

        jButton1.setText("COMPROBAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        agregar();
       
        //limpiar();
        
        
        //ejercicio3.llenadoDatos(filasCasa, columnasCasa, casas);
   
    }//GEN-LAST:event_btnguardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarData();
  
    }//GEN-LAST:event_jButton1ActionPerformed
/*
    public void imprimirMatriz (Float [][] casas, JTextArea textArea ){
        for (int i = 0; i < casas[0].length; i++) {
            for (int j = 0; j < casas[0].length; j++) {
                textArea.append(casas[i][j] + "\t");
            }
            textArea.append("\n");
        }
    }*/
    
    private boolean procesarEntrada(String data) {
        if (data != null && !data.isEmpty()) {
            try {
                float numeroIngresado = Float.parseFloat(data);
                if (numeroIngresado > -1) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "El valor ingresado debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    /*private int casaActual = 0;
   
    }*/
    private void limpiar() {
        JOptionPane.showMessageDialog(this, "Datos ingresados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        txtlongitud.setText(null);
        txtancho.setText(null);
        txtpisos.setText(null);
        txtcasaNum.setText(null);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fmr_Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fmr_Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fmr_Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fmr_Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    UIManager.setLookAndFeel(new MetalLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Fmr_Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Fmr_Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabls;
    private javax.swing.JTextField txtancho;
    private javax.swing.JTextField txtcasaNum;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextField txtpisos;
    // End of variables declaration//GEN-END:variables
}
