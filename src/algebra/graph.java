/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import clases.Calculador_natrix;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author crist
 */
public class graph extends javax.swing.JFrame {

    public graph() {
        initComponents();
        setLocationRelativeTo(null);

    }
    double a, b, c, d;

    void convert() {
        a = Float.parseFloat(casilla1.getText());
        b = Float.parseFloat(casilla2.getText());
        c = Float.parseFloat(casilla3.getText());
        d = Float.parseFloat(casilla4.getText());
    }

    void graficarA() {
        double x1 = 1, y1 = 1;
        double x2 = 2, y2 = 4;
        double x3 = 3, y3 = 4;
        double x4 = 4, y4 = 1;
        double x5 = 1, y5 = 1;
        double x6 = 2, y6 = 1;
        double x7 = 2.5, y7 = 2.4;
        double x8 = 3, y8 = 1;
        double x9 = 4, y9 = 1;

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1
        Asup.add(x1, y1);
        //2
        Asup.add(x2, y2);
        //3
        Asup.add(x3, y3);
        //4
        Asup.add(x4, y4);

        XYSeries Ainf = new XYSeries("");
        //X,  Y
        //5
        Ainf.add(x5, y5);
        //6
        Ainf.add(x6, y6);
        //7
        Ainf.add(x7, y7);
        //8
        Ainf.add(x8, y8);
        //9
        Ainf.add(x9, y9);

        XYSeriesCollection datosset = new XYSeriesCollection();
        datosset.addSeries(Asup);
        datosset.addSeries(Ainf);

        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();
        render.setSeriesPaint(0, Color.BLUE);
        render.setSeriesPaint(1, Color.BLUE);
        render.setSeriesStroke(0, new BasicStroke(2.0f));
        render.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("Grafica 1");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    void graficarTrasformadaA() {
        /*OBTENGO LA MATRIZ TRASFORMACION */
        double x1 = 1, y1 = 1;
        double x2 = 2, y2 = 4;
        double x3 = 3, y3 = 4;
        double x4 = 4, y4 = 1;
        double x5 = 1, y5 = 1;
        double x6 = 2, y6 = 1;
        double x7 = 2.5, y7 = 2.4;
        double x8 = 3, y8 = 1;
        double x9 = 4, y9 = 1;

        double[][] trans = {
            {a, b},
            {c, d},};
        System.out.println("TRANSFORMACION 1");
        /*ENVIO DE PUNTOS PARA MULTIPLICAR CON LA MATRIZ*/

        Calculador_natrix c = new Calculador_natrix(null, null);
        double[] punto1 = c.transformacionPuntosA(trans, x1, y1);
        double[] punto2 = c.transformacionPuntosA(trans, x2, y2);
        double[] punto3 = c.transformacionPuntosA(trans, x3, y3);
        double[] punto4 = c.transformacionPuntosA(trans, x4, y4);
        double[] punto5 = c.transformacionPuntosA(trans, x5, y5);
        double[] punto6 = c.transformacionPuntosA(trans, x6, y6);
        double[] punto7 = c.transformacionPuntosA(trans, x7, y7);
        double[] punto8 = c.transformacionPuntosA(trans, x8, y8);;
        double[] punto9 = c.transformacionPuntosA(trans, x9, y9);;

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1

        Asup.add(punto1[0], punto1[1]);
        //2

        Asup.add(punto2[0], punto2[1]);
        //3

        Asup.add(punto3[0], punto3[1]);
        //4

        Asup.add(punto4[0], punto4[1]);

        XYSeries Ainf = new XYSeries("");
        //X,  Y
        //5

        Asup.add(punto5[0], punto5[1]);
        //6

        Asup.add(punto6[0], punto6[1]);
        //7

        Asup.add(punto7[0], punto7[1]);
        //8

        Asup.add(punto8[0], punto8[1]);
        //9

        Asup.add(punto9[0], punto9[1]);

        XYSeriesCollection datosset = new XYSeriesCollection();

        datosset.addSeries(Asup);

        datosset.addSeries(Ainf);

        //JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, true, true, false);
        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, false, false, false);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();

        render.setSeriesPaint(
                0, Color.BLUE);
        render.setSeriesPaint(
                1, Color.BLUE);
        render.setSeriesStroke(
                0, new BasicStroke(2.0f));
        render.setSeriesStroke(
                1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("Grafica 1");

        ventana.setVisible(
                true);
        ventana.setSize(
                800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    void graficarFigura2() {

        double x1 = 1, y1 = 2;
        double x2 = 2, y2 = 1;
        double x3 = 3, y3 = 1;
        double x4 = 4, y4 = 2;
        double x5 = 1, y5 = 2;
        double x6 = 2.5, y6 = 3;
        double x7 = 4, y7 = 2;

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1
        Asup.add(x1, y1);
        //2
        Asup.add(x2, y2);
        //3
        Asup.add(x3, y3);
        //4
        Asup.add(x4, y4);

        XYSeries Ainf = new XYSeries("");

        Ainf.add(x5, y5);
        Ainf.add(x6, y6);
        Ainf.add(x7, y7);

        XYSeriesCollection datosset = new XYSeriesCollection();
        datosset.addSeries(Asup);
        datosset.addSeries(Ainf);

        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();
        render.setSeriesPaint(0, Color.BLUE);
        render.setSeriesPaint(1, Color.blue);
        render.setSeriesStroke(0, new BasicStroke(2.0f));
        render.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("Grafica 1");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    void graficartrans2() {
        /*OBTENGO LA MATRIZ TRASFORMACION */
        double x1 = 1, y1 = 2;
        double x2 = 2, y2 = 1;
        double x3 = 3, y3 = 1;
        double x4 = 4, y4 = 2;
        double x5 = 1, y5 = 2;
        double x6 = 2.5, y6 = 3;
        double x7 = 4, y7 = 2;

        double[][] trans = {
            {a, b},
            {c, d},};

        System.out.println("\n TRANSFORMACION 2");
        /*ENVIO DE PUNTOS PARA MULTIPLICAR CON LA MATRIZ*/

        Calculador_natrix c = new Calculador_natrix(null, null);
        double[] punto1 = c.transformacionPuntosA(trans, x1, y1);
        double[] punto2 = c.transformacionPuntosA(trans, x2, y2);
        double[] punto3 = c.transformacionPuntosA(trans, x3, y3);
        double[] punto4 = c.transformacionPuntosA(trans, x4, y4);
        double[] punto5 = c.transformacionPuntosA(trans, x5, y5);
        double[] punto6 = c.transformacionPuntosA(trans, x6, y6);
        double[] punto7 = c.transformacionPuntosA(trans, x7, y7);

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1

        Asup.add(punto1[0], punto1[1]);
        //2

        Asup.add(punto2[0], punto2[1]);
        //3

        Asup.add(punto3[0], punto3[1]);
        //4

        Asup.add(punto4[0], punto4[1]);

        XYSeries Ainf = new XYSeries("");
        //X,  Y
        //5

        Asup.add(punto5[0], punto5[1]);
        //6

        Asup.add(punto6[0], punto6[1]);
        //7

        Asup.add(punto7[0], punto7[1]);

        XYSeriesCollection datosset = new XYSeriesCollection();

        datosset.addSeries(Asup);

        datosset.addSeries(Ainf);

        //JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, true, true, false);
        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, false, false, false);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();

        render.setSeriesPaint(
                0, Color.BLUE);
        render.setSeriesPaint(
                1, Color.BLUE);
        render.setSeriesStroke(
                0, new BasicStroke(2.0f));
        render.setSeriesStroke(
                1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("Grafica 1");

        ventana.setVisible(
                true);
        ventana.setSize(
                800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    void graficarFigura3() {

        double x1 = 1, y1 = 2;
        double x2 = 2, y2 = 1;
        double x3 = 3, y3 = 1;
        double x4 = 4, y4 = 2;
        double x5 = 1, y5 = 2;
        double x6 = 2, y6 = 3;
        double x7 = 3, y7 = 3;
        double x8 = 4, y8 = 2;

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1
        Asup.add(x1, y1);
        //2
        Asup.add(x2, y2);
        //3
        Asup.add(x3, y3);
        //4
        Asup.add(x4, y4);

        XYSeries Ainf = new XYSeries("");

        Ainf.add(x5, y5);
        Ainf.add(x6, y6);
        Ainf.add(x7, y7);
        Ainf.add(x8, y8);

        XYSeriesCollection datosset = new XYSeriesCollection();
        datosset.addSeries(Asup);
        datosset.addSeries(Ainf);

        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFICA FIGURA 3", "X", "Y", datosset);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();
        render.setSeriesPaint(0, Color.BLUE);
        render.setSeriesPaint(1, Color.blue);
        render.setSeriesStroke(0, new BasicStroke(2.0f));
        render.setSeriesStroke(1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("GRAFICA 3");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    void graficartrans3() {
        /*OBTENGO LA MATRIZ TRASFORMACION */
        double x1 = 1, y1 = 2;
        double x2 = 2, y2 = 1;
        double x3 = 3, y3 = 1;
        double x4 = 4, y4 = 2;
        double x5 = 1, y5 = 2;
        double x6 = 2, y6 = 3;
        double x7 = 3, y7 = 3;
        double x8 = 4, y8 = 2;

        double[][] trans = {
            {a, b},
            {c, d},};

        System.out.println("\n TRANSFORMACION 3");
        /*ENVIO DE PUNTOS PARA MULTIPLICAR CON LA MATRIZ*/

        Calculador_natrix c = new Calculador_natrix(null, null);
        double[] punto1 = c.transformacionPuntosA(trans, x1, y1);
        double[] punto2 = c.transformacionPuntosA(trans, x2, y2);
        double[] punto3 = c.transformacionPuntosA(trans, x3, y3);
        double[] punto4 = c.transformacionPuntosA(trans, x4, y4);
        double[] punto5 = c.transformacionPuntosA(trans, x5, y5);
        double[] punto6 = c.transformacionPuntosA(trans, x6, y6);
        double[] punto7 = c.transformacionPuntosA(trans, x7, y7);
        double[] punto8 = c.transformacionPuntosA(trans, x8, y8);

        XYSeries Asup = new XYSeries("Letra A");
        //X,  Y
        //1

        Asup.add(punto1[0], punto1[1]);
        //2

        Asup.add(punto2[0], punto2[1]);
        //3

        Asup.add(punto3[0], punto3[1]);
        //4

        Asup.add(punto4[0], punto4[1]);

        XYSeries Ainf = new XYSeries("");
        //X,  Y
        //5

        Asup.add(punto5[0], punto5[1]);
        //6

        Asup.add(punto6[0], punto6[1]);
        //7

        Asup.add(punto7[0], punto7[1]);
        Asup.add(punto8[0], punto8[1]);

        XYSeriesCollection datosset = new XYSeriesCollection();

        datosset.addSeries(Asup);

        datosset.addSeries(Ainf);

        //JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, true, true, false);
        JFreeChart xylineChart = ChartFactory.createXYLineChart("GRAFIA LETRA A", "X", "Y", datosset, PlotOrientation.VERTICAL, false, false, false);

        XYPlot plot = xylineChart.getXYPlot();

        XYLineAndShapeRenderer render = new XYLineAndShapeRenderer();

        render.setSeriesPaint(
                0, Color.BLUE);
        render.setSeriesPaint(
                1, Color.BLUE);
        render.setSeriesStroke(
                0, new BasicStroke(2.0f));
        render.setSeriesStroke(
                1, new BasicStroke(2.0f));

        plot.setRenderer(render);

        ChartPanel panel = new ChartPanel(xylineChart);

        //NUEVA VENTANA PARA EL GRAFICO
        JFrame ventana = new JFrame("Grafica 1");

        ventana.setVisible(
                true);
        ventana.setSize(
                800, 600);
        //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(panel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        casilla1 = new javax.swing.JTextField();
        casilla2 = new javax.swing.JTextField();
        casilla4 = new javax.swing.JTextField();
        casilla3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla1ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, -1));

        casilla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casilla2ActionPerformed(evt);
            }
        });
        jPanel1.add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 60, -1));
        jPanel1.add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 60, -1));
        jPanel1.add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));

        jLabel1.setText("MATRIZ TRANSFORMACION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 20));

        jButton3.setText("FIGURA 2 ORIGINAL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, -1));

        jButton4.setText("TRASFORMAR FIGURA 2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 160, -1));

        jButton5.setText("LETRA A ORIGINAL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));

        jButton6.setText("TRASFORMAR A");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));

        jButton7.setText("FIGURA 3 ORIGINAL");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 160, -1));

        jButton8.setText("TRASFORMAR FIGURA 3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 160, -1));

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casilla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla1ActionPerformed

    private void casilla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casilla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casilla2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        convert();
        graficarFigura2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        convert();
        graficartrans2();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        graficarA();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        convert();
        graficarTrasformadaA();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        graficarFigura3();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        convert();
        graficartrans3();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(graph.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graph.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graph.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graph.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField casilla1;
    private javax.swing.JTextField casilla2;
    private javax.swing.JTextField casilla3;
    private javax.swing.JTextField casilla4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
