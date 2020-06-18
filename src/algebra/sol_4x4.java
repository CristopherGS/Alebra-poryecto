/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import clases.Calculador_natrix;

/**
 *
 * @author crist
 */
public class sol_4x4 extends javax.swing.JFrame {

    public sol_4x4() {
        initComponents();
        setLocationRelativeTo(null);
    }

    float[][] result;
    float a, b, c, d, e, f, g, h, i, j, k, l, m, o, p, q, casb1, casb2, casb3, casb4;

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
        j = Float.parseFloat(casilla10.getText());
        k = Float.parseFloat(casilla11.getText());
        l = Float.parseFloat(casilla12.getText());
        m = Float.parseFloat(casilla13.getText());
        o = Float.parseFloat(casilla14.getText());
        p = Float.parseFloat(casilla15.getText());
        q = Float.parseFloat(casilla16.getText());
        casb1 = Float.parseFloat(casillab1.getText());
        casb2 = Float.parseFloat(casillab2.getText());
        casb3 = Float.parseFloat(casillab3.getText());
        casb4 = Float.parseFloat(casillab4.getText());
    }
    
    void clear() {
        jTextArea1.setText("");
        casillab1.setText("");
        casillab2.setText("");
        casillab3.setText("");
        casillab4.setText("");
        casilla1.setText("");
        casilla2.setText("");
        casilla3.setText("");
        casilla4.setText("");
        casilla5.setText("");
        casilla6.setText("");
        casilla7.setText("");
        casilla8.setText("");
        casilla9.setText("");
        casilla10.setText("");
        casilla11.setText("");
        casilla12.setText("");
        casilla13.setText("");
        casilla14.setText("");
        casilla15.setText("");
        casilla16.setText("");        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JTextField();
        casilla2 = new javax.swing.JTextField();
        casilla3 = new javax.swing.JTextField();
        casilla6 = new javax.swing.JTextField();
        casilla5 = new javax.swing.JTextField();
        casilla4 = new javax.swing.JTextField();
        casilla7 = new javax.swing.JTextField();
        casilla8 = new javax.swing.JTextField();
        casilla9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        casilla10 = new javax.swing.JTextField();
        casilla11 = new javax.swing.JTextField();
        casilla12 = new javax.swing.JTextField();
        casilla13 = new javax.swing.JTextField();
        casilla14 = new javax.swing.JTextField();
        casilla15 = new javax.swing.JTextField();
        casilla16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        casillab1 = new javax.swing.JTextField();
        casillab2 = new javax.swing.JTextField();
        casillab3 = new javax.swing.JTextField();
        casillab4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

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
        jPanel1.add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 34, -1));
        jPanel1.add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 34, -1));
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 34, -1));
        jPanel1.add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 34, -1));
        jPanel1.add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 34, -1));
        jPanel1.add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 34, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PASOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 60, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("[B]");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 20, 20));

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, -1));
        jPanel1.add(casilla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 34, -1));
        jPanel1.add(casilla11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 34, -1));
        jPanel1.add(casilla12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 34, -1));
        jPanel1.add(casilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 34, -1));
        jPanel1.add(casilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 34, -1));
        jPanel1.add(casilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 34, -1));
        jPanel1.add(casilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 34, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("[A]");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 20, 20));

        casillab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillab1ActionPerformed(evt);
            }
        });
        jPanel1.add(casillab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 34, -1));
        jPanel1.add(casillab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 34, -1));
        jPanel1.add(casillab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 34, -1));
        jPanel1.add(casillab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 34, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 300, 230));

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        convert();
        float[][] matrix
                = {
                    {a, b, c, d, casb1},
                    {e, f, g, h, casb2},
                    {i, j, k, l, casb3},
                    {m, o, p, q, casb4},};
        //[A]           [B]
        float[][] array1 = {
            {1, -2, 2, -3, 15},
            {3, 4, -1, 1, -6},
            {2, -3, 2, -1, 17},
            {1, 1, -3, -2, -7}
        };
        Calculador_natrix m = new Calculador_natrix(matrix, null);
        m.eliminate(jTextArea1);
        System.out.println(m.toString2());
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2ActionPerformed

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main_Menu m = new Main_Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void casillab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillab1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillab1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clear();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(sol_4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sol_4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sol_4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sol_4x4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sol_4x4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField casilla1;
    private javax.swing.JTextField casilla10;
    private javax.swing.JTextField casilla11;
    private javax.swing.JTextField casilla12;
    private javax.swing.JTextField casilla13;
    private javax.swing.JTextField casilla14;
    private javax.swing.JTextField casilla15;
    private javax.swing.JTextField casilla16;
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
    private javax.swing.JTextField casillab4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
