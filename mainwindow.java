package traffic;


import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class mainwindow extends javax.swing.JFrame {

    /**
     * Creates new form mainwindow
     */
    public mainwindow() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        gui = new javax.swing.JMenu();
        snapshot = new javax.swing.JMenuItem();
        inputmenu = new javax.swing.JMenu();
        inputwindow = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        greport1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traffic/hs.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 210, 320));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(204, 0, 204));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jMenuBar1.setMaximumSize(new java.awt.Dimension(808, 32769));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(2, 2));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(808, 26));

        gui.setForeground(new java.awt.Color(51, 51, 255));
        gui.setText("Camera View");
        gui.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        gui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gui.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gui.setMaximumSize(new java.awt.Dimension(171, 32767));

        snapshot.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        snapshot.setText("Snapshot of car");
        snapshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapshotActionPerformed(evt);
            }
        });
        gui.add(snapshot);

        jMenuBar1.add(gui);

        inputmenu.setForeground(new java.awt.Color(255, 0, 0));
        inputmenu.setText("Input");
        inputmenu.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        inputmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputmenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inputmenu.setMaximumSize(new java.awt.Dimension(100, 32767));
        inputmenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                inputmenuAncestorMoved(evt);
            }
        });
        inputmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputmenuActionPerformed(evt);
            }
        });

        inputwindow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        inputwindow.setText("Input Window");
        inputwindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputwindowActionPerformed(evt);
            }
        });
        inputmenu.add(inputwindow);

        jMenuBar1.add(inputmenu);

        jMenu2.setText("Challan Report");
        jMenu2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setMaximumSize(new java.awt.Dimension(190, 32767));

        greport1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        greport1.setText("Generate Report");
        greport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greport1ActionPerformed(evt);
            }
        });
        jMenu2.add(greport1);

        jMenuBar1.add(jMenu2);

        jMenu4.setForeground(new java.awt.Color(255, 102, 0));
        jMenu4.setText("Pack Up");
        jMenu4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setMaximumSize(new java.awt.Dimension(150, 32767));

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem1.setText("Terminate App");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem2.setText("Shutdown");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputmenuAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_inputmenuAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_inputmenuAncestorMoved

    private void inputmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputmenuActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_inputmenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int status=JOptionPane.showConfirmDialog(null, "Do you really want to exit the app");
        if (status==0)  
        System.exit(0) ;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Runtime runtime=Runtime.getRuntime() ;
try
{
    //wait(10) ;
    Process proc=runtime.exec("shutdown -s") ;
}
catch(Exception er)
{}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void inputwindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputwindowActionPerformed
        // TODO add your handling code here:
        inputclass iref=new inputclass();
        iref.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputwindowActionPerformed

    private void greport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greport1ActionPerformed
        // TODO add your handling code here:
        try
        {
            String REPORT="C:\\Users\\hp\\Documents\\NetBeansProjects\\hackathon\\src\\traffic\\report1.jrxml";
            JasperReport JASP_REP=JasperCompileManager.compileReport(REPORT);
            Connection conn=connectionclass.Makeconnection();
            JasperPrint JASP_PRINT=JasperFillManager.fillReport(JASP_REP,null,conn);
            JasperViewer.viewReport(JASP_PRINT);
        }
        catch(Exception er)
        {
            JOptionPane.showMessageDialog(null,er);
        }
    }//GEN-LAST:event_greport1ActionPerformed

    private void snapshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapshotActionPerformed
        // TODO add your handling code here:
        snapshot sref=new snapshot();
        sref.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_snapshotActionPerformed

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
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem greport1;
    private javax.swing.JMenu gui;
    private javax.swing.JMenu inputmenu;
    private javax.swing.JMenuItem inputwindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem snapshot;
    // End of variables declaration//GEN-END:variables
}