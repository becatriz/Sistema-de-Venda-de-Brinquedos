/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        menuBrinquedos = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 620, 500);

        menuCadastros.setText("1 Cadastros");

        menuBrinquedos.setText("1.1 Brinquedos");
        menuBrinquedos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrinquedosActionPerformed(evt);
            }
        });
        menuCadastros.add(menuBrinquedos);

        menuClientes.setText("1.2 Clientes");
        menuCadastros.add(menuClientes);

        barraMenu.add(menuCadastros);

        menuAjuda.setText("2 Ajuda");
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        menuSobre.setText("2.1 Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        setBounds(0, 0, 614, 512);
    }// </editor-fold>//GEN-END:initComponents

    private void menuBrinquedosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrinquedosActionPerformed
            
        FormBrinquedo form = new FormBrinquedo(this,true);
        form.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }//GEN-LAST:event_menuBrinquedosActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
               
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        
       
        JOptionPane.showMessageDialog(null, "Sistema BrinqueFeliz");

    }//GEN-LAST:event_menuSobreActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormPrincipal().setVisible(true);
                FormPrincipal form = new FormPrincipal();
                //Form no meio da tela
                form.setLocationRelativeTo(null);
                form.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuBrinquedos;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
