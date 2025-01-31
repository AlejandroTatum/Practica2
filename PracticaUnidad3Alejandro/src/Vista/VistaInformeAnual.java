/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.Util.InformeAnual;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Padilla
 */
public class VistaInformeAnual extends javax.swing.JFrame {

    InformeAnual informeanual = new InformeAnual();
    private int anio;
    private int mesActual = 0;
    public String[] meses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    public VistaInformeAnual() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtanio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtanios = new javax.swing.JTextField();
        txtgastos = new javax.swing.JTextField();
        txtventas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtventastotales = new javax.swing.JTextField();
        txtgastostot = new javax.swing.JTextField();
        txtaniofinal = new javax.swing.JTextField();
        txtmesalto = new javax.swing.JTextField();
        txtmesbajo = new javax.swing.JTextField();
        txtventaalta = new javax.swing.JTextField();
        txtventabaja = new javax.swing.JTextField();
        txtpromedio = new javax.swing.JTextField();
        btnanio = new javax.swing.JButton();
        txtmes = new javax.swing.JTextField();
        btnInforme = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("MES");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Informe de HorchatasDericksito");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("AÑO:");

        txtanios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaniosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("MES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("GASTOS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("VENTAS");

        jLabel7.setText("VENTAS TOTALES:");

        jLabel8.setText("GASTOS TOTALES:");

        jLabel9.setText("MES DE VENTA MÁS ALTO:");

        jLabel10.setText("MES DE VENTA MÁS BAJO:");

        btnguardar.setText("GUARDAR");
        btnguardar.setEnabled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jLabel11.setText("VENTA MÁS ALTA:");

        jLabel12.setText("VENTA MÁS BAJA:");

        jLabel13.setText("PROMEDIO DE VENTAS:");

        txtventastotales.setEditable(false);
        txtventastotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtventastotalesActionPerformed(evt);
            }
        });

        txtgastostot.setEditable(false);
        txtgastostot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgastostotActionPerformed(evt);
            }
        });

        txtaniofinal.setEditable(false);

        txtmesalto.setEditable(false);

        txtmesbajo.setEditable(false);

        txtventaalta.setEditable(false);

        txtventabaja.setEditable(false);
        txtventabaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtventabajaActionPerformed(evt);
            }
        });

        txtpromedio.setEditable(false);
        txtpromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpromedioActionPerformed(evt);
            }
        });

        btnanio.setText("CONTINUAR");
        btnanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanioActionPerformed(evt);
            }
        });

        txtmes.setEditable(false);
        txtmes.setText("Enero");
        txtmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesActionPerformed(evt);
            }
        });

        btnInforme.setText("INFORME");
        btnInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtanioLayout = new javax.swing.GroupLayout(txtanio);
        txtanio.setLayout(txtanioLayout);
        txtanioLayout.setHorizontalGroup(
            txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtanioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtanioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnguardar))
                    .addGroup(txtanioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInforme))
                    .addGroup(txtanioLayout.createSequentialGroup()
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtanioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(txtaniofinal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(txtanioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtanios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(301, 301, 301)
                                .addComponent(btnanio))
                            .addGroup(txtanioLayout.createSequentialGroup()
                                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgastos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtventas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(txtanioLayout.createSequentialGroup()
                                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtventaalta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtventastotales, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmesalto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtventabaja, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtgastostot, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(txtanioLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmesbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        txtanioLayout.setVerticalGroup(
            txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtanioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtaniofinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtanios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnanio))
                .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtanioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgastos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtventas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(txtventastotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgastostot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtmesalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmesbajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(txtventaalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtventabaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(txtanioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtpromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtanioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInforme)
                        .addContainerGap())))
        );

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Leer Data");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtanio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean metodoProcesarEntrada(String data) {
        if (data != null && !data.isEmpty()) {
            try {
                float numeroIngresado = Float.parseFloat(data);
                if (numeroIngresado > -1) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "El número debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El campo no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }


    private void metodoIngresoAnio() {
        if (metodoProcesarEntrada(txtanios.getText())) {
            anio = Integer.parseInt(txtanios.getText());
            txtaniofinal.setText(String.valueOf(anio));
            JOptionPane.showMessageDialog(this, "Año guardado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            btnguardar.setEnabled(true);
        }

    }

    private void metodoCambioMes() {
        mesActual = (mesActual + 1) % meses.length;
        txtmes.setText(meses[mesActual]);
        if (mesActual == 0) {
            btnguardar.setEnabled(false);
            txtmes.setText(null);

        }
    }

    private int metodoObtenerIndiceMes() {
        String mesTexto = txtmes.getText();
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(mesTexto)) {
                return i;
            }
        }
        return -1;
    }

    private void metodoLimpiarDatos() {
        JOptionPane.showMessageDialog(this, "datos ingresados correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        txtgastos.setText(null);
        txtventas.setText(null);
    }

    private void metodoGuardadoDatos() {
        if (metodoProcesarEntrada(txtgastos.getText()) && metodoProcesarEntrada(txtventas.getText())) {
            informeanual.metodoIngresoDatos(Float.parseFloat(txtgastos.getText()), Float.parseFloat(txtventas.getText()), metodoObtenerIndiceMes());
            metodoLimpiarDatos();
            metodoCambioMes();
        }
    }

    private void metodoInforme() {
        txtventastotales.setText(Float.toString(informeanual.metodoSumarVentas()));
        txtgastostot.setText(Float.toString(informeanual.metodoSumarGastos()));
        txtmesalto.setText((informeanual.metodoMesVentaMasAlta()));
        txtmesbajo.setText((informeanual.metodoMesVentaMasBaja()));
        txtventaalta.setText(Float.toString(informeanual.metodoVentaMasAlta()));
        txtventabaja.setText(Float.toString(informeanual.metodoVentaMasBaja()));
        txtpromedio.setText(Float.toString(informeanual.promedioVentas()));
    }
    public void habilitarBotonInforme() {
    btnInforme.setEnabled(true);
}
    private void txtaniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaniosActionPerformed

    }//GEN-LAST:event_txtaniosActionPerformed

    private void txtgastostotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgastostotActionPerformed

    }//GEN-LAST:event_txtgastostotActionPerformed

    private void btnanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanioActionPerformed
        metodoIngresoAnio();

    }//GEN-LAST:event_btnanioActionPerformed

    private void txtmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesActionPerformed

    }//GEN-LAST:event_txtmesActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        metodoGuardadoDatos();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtpromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpromedioActionPerformed

    }//GEN-LAST:event_txtpromedioActionPerformed

    private void txtventastotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtventastotalesActionPerformed

    }//GEN-LAST:event_txtventastotalesActionPerformed

    private void txtventabajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtventabajaActionPerformed

    }//GEN-LAST:event_txtventabajaActionPerformed

    private void btnInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeActionPerformed
        metodoInforme();
    }//GEN-LAST:event_btnInformeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        informeanual.choose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInformeAnual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInforme;
    private javax.swing.JButton btnanio;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel txtanio;
    private javax.swing.JTextField txtaniofinal;
    private javax.swing.JTextField txtanios;
    private javax.swing.JTextField txtgastos;
    private javax.swing.JTextField txtgastostot;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtmesalto;
    private javax.swing.JTextField txtmesbajo;
    private javax.swing.JTextField txtpromedio;
    private javax.swing.JTextField txtventaalta;
    private javax.swing.JTextField txtventabaja;
    private javax.swing.JTextField txtventas;
    private javax.swing.JTextField txtventastotales;
    // End of variables declaration//GEN-END:variables
}
