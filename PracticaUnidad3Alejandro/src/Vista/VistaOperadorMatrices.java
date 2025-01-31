/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.Util.OperadorMatrices;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro Padilla
 */
public class VistaOperadorMatrices extends javax.swing.JFrame {

    public int valorColumnas;
    public int valorFilas;
    OperadorMatrices ejercicio2 = new OperadorMatrices();

    public VistaOperadorMatrices() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxFilas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxColumnas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenerada = new javax.swing.JTable();
        btnprimos = new javax.swing.JButton();
        btnMultiplos = new javax.swing.JButton();
        txtMultiplo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("OPERADOR DE MATRICES");

        cbxFilas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", " " }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("FILAS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("COLUMNAS");

        cbxColumnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        tblGenerada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Columna1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Columna 6", "Columna 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGenerada);

        btnprimos.setText("Eliminar número primos");
        btnprimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimosActionPerformed(evt);
            }
        });

        btnMultiplos.setText("Eliminar múltiplos de:");
        btnMultiplos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplosActionPerformed(evt);
            }
        });

        txtMultiplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMultiploActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5", "Columna 6", "Columna 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblResultado);

        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(cbxFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(cbxColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnGenerar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnprimos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplos)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbxColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnprimos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplos)
                    .addComponent(txtMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void metodoGenerarTabla() {
        this.valorColumnas = cbxColumnas.getSelectedIndex() + 1;
        System.out.println(valorColumnas);
        this.valorFilas = cbxFilas.getSelectedIndex() + 1;
        System.out.println(valorFilas);
        ejercicio2.setValorColumnas(valorColumnas);
        ejercicio2.setValorFilas(valorFilas);
        ejercicio2.metodoLlenadoMatrices();
        int[][] matriz = ejercicio2.getMatriz_uno();
        DefaultTableModel model = (DefaultTableModel) tblGenerada.getModel();
        model.setRowCount(0);
        model.setColumnCount(valorColumnas);
        for (int i = 0; i < matriz.length; i++) {
            Object[] fila = new Object[matriz[i].length];
            for (int j = 0; j < matriz[i].length; j++) {
                fila[j] = matriz[i][j];
            }
            model.addRow(fila);
        }

        JOptionPane.showMessageDialog(this, "Tabla generada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }

    private void metodoProcesarEntrada(String data) {
        if (data != null && !data.isEmpty()) {
            try {
                int numeroIngresado = Integer.parseInt(data);
                if (numeroIngresado > 0) {
                    metodoEliminarMultiplos(numeroIngresado);
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void metodoEliminarMultiplos(int numeroIngresado) {
        int[][] matriz = ejercicio2.getMatriz_uno();
        DefaultTableModel model = (DefaultTableModel) tblResultado.getModel();
        model.setRowCount(0);
        model.setColumnCount(valorColumnas);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % numeroIngresado == 0) {
                    matriz[i][j] = 0;
                }
            }
        }
        model.setRowCount(0);
        for (int i = 0; i < matriz.length; i++) {
            Object[] fila = new Object[matriz[i].length];
            for (int j = 0; j < matriz[i].length; j++) {
                fila[j] = matriz[i][j];
            }
            model.addRow(fila);
        }

        JOptionPane.showMessageDialog(this, "Multiplos eliminados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }

    private boolean metodoPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void metodoEliminarNumerosPrimos() {
        int[][] matriz = ejercicio2.getMatriz_uno();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (metodoPrimo(matriz[i][j])) {
                    matriz[i][j] = 0;
                }
            }
        }
        actualizarTabla(matriz);
        JOptionPane.showMessageDialog(this, "Números primos eliminados.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }

    private void actualizarTabla(int[][] matriz) {
        DefaultTableModel model = (DefaultTableModel) tblResultado.getModel();
        model.setRowCount(0);
        model.setColumnCount(valorColumnas);
        for (int i = 0; i < matriz.length; i++) {
            Object[] fila = new Object[matriz[i].length];
            for (int j = 0; j < matriz[i].length; j++) {
                fila[j] = matriz[i][j];
            }
            model.addRow(fila);
        }
    }
    private void btnMultiplosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplosActionPerformed
        String data = txtMultiplo.getText();
        metodoProcesarEntrada(data);
    }//GEN-LAST:event_btnMultiplosActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        metodoGenerarTabla();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void txtMultiploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMultiploActionPerformed

    }//GEN-LAST:event_txtMultiploActionPerformed

    private void btnprimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimosActionPerformed
        metodoEliminarNumerosPrimos();
    }//GEN-LAST:event_btnprimosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOperadorMatrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnMultiplos;
    private javax.swing.JButton btnprimos;
    private javax.swing.JComboBox<String> cbxColumnas;
    private javax.swing.JComboBox<String> cbxFilas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGenerada;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTextField txtMultiplo;
    // End of variables declaration//GEN-END:variables

}
