/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetonumeros;

/**
 *
 * @author Gutho
 */
public class Tela2 extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Tela2() {
        super("Pesquisar valores");
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDigite = new javax.swing.JLabel();
        tfValorInteiro = new javax.swing.JTextField();
        btEntra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        lbDigite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDigite.setText("Digite um número:");
        getContentPane().add(lbDigite);
        lbDigite.setBounds(340, 110, 160, 40);

        tfValorInteiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(tfValorInteiro);
        tfValorInteiro.setBounds(370, 160, 100, 30);

        btEntra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEntra.setText("Entra");
        btEntra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntraMouseClicked(evt);
            }
        });
        getContentPane().add(btEntra);
        btEntra.setBounds(360, 380, 130, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntraMouseClicked
        Info.guardarValor(Integer.parseInt(tfValorInteiro.getText()));
        dispose();
        Tela3 tela = new Tela3();
        tela.setVisible(true);
    }//GEN-LAST:event_btEntraMouseClicked

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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntra;
    private javax.swing.JLabel lbDigite;
    private javax.swing.JTextField tfValorInteiro;
    // End of variables declaration//GEN-END:variables
}
