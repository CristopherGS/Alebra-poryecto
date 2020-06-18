/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import clases.Calculador_natrix;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Sol_3x3 extends javax.swing.JFrame {

    public float[][] inversaMatrix;
    public float[] result;

    public Sol_3x3() {
        initComponents();
        setLocationRelativeTo(null);

    }

    float a, b, c, d, e, f, g, h, i, j, k, l;

    void convert() {
        a = Float.parseFloat(casilla1.getText());
        b = Float.parseFloat(casilla2.getText());
        c = Float.parseFloat(casilla3.getText());
        d = Float.parseFloat(casilla4.getText());
        e = Float.parseFloat(casilla5.getText());
        f = Float.parseFloat(casilla6.getText());
        g = Float.parseFloat(casilla7.getText());
        h = Float.parseFloat(casilla8.getText());
        i = Float.parseFloat(casilla9.getText());
        j = Float.parseFloat(casillab1.getText());
        k = Float.parseFloat(casillab2.getText());
        l = Float.parseFloat(casillab3.getText());
    }

    void convert2() {
        inv1.setText(String.valueOf(inversaMatrix[0][3]));
        inv2.setText(String.valueOf(inversaMatrix[0][4]));
        inv3.setText(String.valueOf(inversaMatrix[0][5]));
        inv4.setText(String.valueOf(inversaMatrix[1][3]));
        inv5.setText(String.valueOf(inversaMatrix[1][4]));
        inv6.setText(String.valueOf(inversaMatrix[1][5]));
        inv7.setText(String.valueOf(inversaMatrix[2][3]));
        inv8.setText(String.valueOf(inversaMatrix[2][4]));
        inv9.setText(String.valueOf(inversaMatrix[2][5]));
        x1.setText(String.valueOf(result[0]));
        x2.setText(String.valueOf(result[1]));
        x3.setText(String.valueOf(result[2]));

    }

    void clear() {
        inv1.setText("");
        inv2.setText("");
        inv3.setText("");
        inv4.setText("");
        inv5.setText("");
        inv6.setText("");
        inv7.setText("");
        inv8.setText("");
        inv9.setText("");
        x1.setText("");
        x2.setText("");
        x3.setText("");
        casillab1.setText("");
        casillab2.setText("");
        casillab3.setText("");
        casilla1.setText("");
        casilla2.setText("");
        casilla3.setText("");
        casilla4.setText("");
        casilla5.setText("");
        casilla6.setText("");
        casilla7.setText("");
        casilla8.setText("");
        casilla9.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JTextField();
        casilla2 = new javax.swing.JTextField();
        casilla3 = new javax.swing.JTextField();
        casilla6 = new javax.swing.JTextField();
        casilla4 = new javax.swing.JTextField();
        casilla7 = new javax.swing.JTextField();
        casilla8 = new javax.swing.JTextField();
        casilla9 = new javax.swing.JTextField();
        casillab3 = new javax.swing.JTextField();
        casilla5 = new javax.swing.JTextField();
        casillab1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Cacular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        casillab2 = new javax.swing.JTextField();
        inv9 = new javax.swing.JTextField();
        inv8 = new javax.swing.JTextField();
        inv7 = new javax.swing.JTextField();
        inv4 = new javax.swing.JTextField();
        inv5 = new javax.swing.JTextField();
        inv6 = new javax.swing.JTextField();
        inv3 = new javax.swing.JTextField();
        inv2 = new javax.swing.JTextField();
        inv1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 34, -1));

        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 34, -1));
        jPanel1.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 34, -1));
        jPanel1.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 34, -1));
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 34, -1));
        jPanel1.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 34, -1));
        jPanel1.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 34, -1));
        jPanel1.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 34, -1));
        jPanel1.add(casillab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 34, -1));
        jPanel1.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 34, -1));

        casillab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillab1ActionPerformed(evt);
            }
        });
        jPanel1.add(casillab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 34, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X3");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 34, 20));

        Cacular.setText("CALCULAR");
        Cacular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CacularActionPerformed(evt);
            }
        });
        jPanel1.add(Cacular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 100, -1));

        jLabel3.setText("---------->");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MATRIZ INVERSA DE [A]");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 25));
        jPanel1.add(casillab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 34, -1));

        inv9.setEditable(false);
        inv9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 80, -1));

        inv8.setEditable(false);
        inv8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, -1));

        inv7.setEditable(false);
        inv7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 80, -1));

        inv4.setEditable(false);
        inv4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, -1));

        inv5.setEditable(false);
        inv5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, -1));

        inv6.setEditable(false);
        inv6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jPanel1.add(inv6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 80, -1));

        inv3.setEditable(false);
        inv3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        inv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv3ActionPerformed(evt);
            }
        });
        jPanel1.add(inv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 80, -1));

        inv2.setEditable(false);
        inv2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        inv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv2ActionPerformed(evt);
            }
        });
        jPanel1.add(inv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 80, -1));

        inv1.setEditable(false);
        inv1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        inv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inv1ActionPerformed(evt);
            }
        });
        jPanel1.add(inv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 10, 25));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MATRIX [A]");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 25));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RESULTADO FINAL ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 25));

        x3.setEditable(false);
        jPanel1.add(x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 90, -1));

        x2.setEditable(false);
        jPanel1.add(x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, -1));

        x1.setEditable(false);
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        jPanel1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 90, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("[B]");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 34, 24));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 34, 20));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X2");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 34, 20));

        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1ActionPerformed

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2ActionPerformed

    private void casillab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillab1ActionPerformed

    private void CacularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CacularActionPerformed
        convert();
        //System.out.println(a+b+c+d+e+f+g+h+i+j+k);
        float[][] array1 = {
            {a, b, c, 1, 0, 0},
            {d, e, f, 0, 1, 0},
            {g, h, i, 0, 0, 1}
        };
        float[] B
                = {j, k, l};

        Calculador_natrix m = new Calculador_natrix(array1, B);
        m.eliminate2();
        m.inversaporB();
        inversaMatrix = m.getMatrix();
        result = m.getResult();

        convert2();//FUNCION QUE CONVIERTE Y SETEA LOS CALORES DE LA MATRIX INVERSA AL FROM

    }//GEN-LAST:event_CacularActionPerformed

    private void inv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv2ActionPerformed

    private void inv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv1ActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void inv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inv3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inv3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main_Menu m = new Main_Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sol_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sol_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sol_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sol_3x3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sol_3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cacular;
    private javax.swing.JTextField casilla1;
    private javax.swing.JTextField casilla2;
    private javax.swing.JTextField casilla3;
    private javax.swing.JTextField casilla4;
    private javax.swing.JTextField casilla5;
    private javax.swing.JTextField casilla6;
    private javax.swing.JTextField casilla7;
    private javax.swing.JTextField casilla8;
    private javax.swing.JTextField casilla9;
    private javax.swing.JTextField casillab1;
    private javax.swing.JTextField casillab2;
    private javax.swing.JTextField casillab3;
    private javax.swing.JTextField inv1;
    private javax.swing.JTextField inv2;
    private javax.swing.JTextField inv3;
    private javax.swing.JTextField inv4;
    private javax.swing.JTextField inv5;
    private javax.swing.JTextField inv6;
    private javax.swing.JTextField inv7;
    private javax.swing.JTextField inv8;
    private javax.swing.JTextField inv9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables

}
