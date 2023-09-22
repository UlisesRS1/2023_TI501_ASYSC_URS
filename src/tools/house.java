/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tools;

import java.awt.*;


/**
 *
 * @author Uli Rodriguez
 */
public class house extends javax.swing.JFrame {

    /**
     * Creates new form house
     */
    public house() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDraw = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDrawMouseClicked(evt);
            }
        });
        getContentPane().add(pnlDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 642, 481));
        pnlDraw.getAccessibleContext().setAccessibleName("");

        setBounds(0, 0, 688, 557);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDrawMouseClicked
        Graphics2D g = (Graphics2D) pnlDraw.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 640, 480);
        g.setColor(Color.black);
        g.drawRect(0, 0, 640, 480);
        
        g.drawLine(50, 400, 600, 400);
        g.drawRect(450, 280, 150, 120);
        
        //puerta garage
        g.drawRect(470, 300, 110, 100);
        //techo del garage
        g.drawRect(450, 270, 160, 10);
        //marco de puerta
        g.drawRect(360, 310, 90, 90);
        //puerta
        g.drawRect(380, 320, 40, 80);
        //Parte de arriba de la puerta 
        g.drawRect(340, 300, 110, 10);
        //Parte Izquierda de la puerta
        g.drawRect(350, 310, 10, 90);
        
        //Ventanas
        //Ventana superior
        g.drawRect(200, 210, 100, 60);
        g.drawLine(250, 210, 250, 270);
        
        //Ventana inferior izquierda
        g.drawRect(80, 300, 100, 60);
        g.drawLine(130, 300, 130, 360);
        
        //Ventana inferior derecha
        g.drawRect(200, 300, 100, 60);
        g.drawLine(250, 300, 250, 360);
        
        //pared derecha
        g.drawLine(50, 200, 50, 400);
        
        //pared izquierda
        g.drawLine(450, 200, 450, 370);
        
        //parte de techo inferior 1
        g.drawLine(40, 200, 50, 200);
        //parte superior del techo inclinado
        g.drawLine(40, 200, 250, 95);
        //parte inferior del techo inclinado
        g.drawLine(50, 200, 250, 100);
        
        //parte del techo inferior 2
        g.drawLine(450, 200, 460, 200);
        //parte superior del techo inclinado
        g.drawLine(460, 200, 250, 95);
        //parte inferior del techo inclinado
        g.drawLine(450, 200, 250, 100);
        
    }//GEN-LAST:event_pnlDrawMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(house.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(house.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(house.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(house.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new house().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlDraw;
    // End of variables declaration//GEN-END:variables
}
