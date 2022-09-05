
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mostafa
 */
public class DropdownMenu extends javax.swing.JFrame {

    

    /**
     * Creates new form sideMenu
     * @param calingParent
     */
    public DropdownMenu(JFrame calingParent) {
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

        jPanel1 = new javax.swing.JPanel();
        customerName = new javax.swing.JLabel();
        customerID = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        securityButton = new javax.swing.JButton();
        contactUsButton = new javax.swing.JButton();
        SupportButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(375, 812));

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 831));
        jPanel1.setLayout(null);

        customerName.setFont(new java.awt.Font("Nexa Black", 0, 14)); // NOI18N
        customerName.setForeground(new java.awt.Color(255, 255, 255));
        customerName.setText("Abdelaziz Karam");
        jPanel1.add(customerName);
        customerName.setBounds(135, 139, 160, 17);

        customerID.setFont(new java.awt.Font("Nexa Regular", 0, 12)); // NOI18N
        customerID.setForeground(new java.awt.Color(255, 255, 255));
        customerID.setText("Customer ID: 123456789");
        jPanel1.add(customerID);
        customerID.setBounds(135, 160, 180, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Dropdown menu.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 375, 812);

        backButton.setText("jButton1");
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(7, 50, 26, 26);

        securityButton.setText("jButton1");
        securityButton.setOpaque(false);
        jPanel1.add(securityButton);
        securityButton.setBounds(25, 273, 110, 25);

        contactUsButton.setText("jButton1");
        contactUsButton.setOpaque(false);
        jPanel1.add(contactUsButton);
        contactUsButton.setBounds(25, 339, 130, 25);

        SupportButton.setText("jButton1");
        SupportButton.setOpaque(false);
        jPanel1.add(SupportButton);
        SupportButton.setBounds(25, 405, 110, 25);

        logoutButton.setText("jButton1");
        logoutButton.setOpaque(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(25, 470, 110, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Dashboard d1 = new Dashboard() ;
        d1.show();
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MainPage m1 = new MainPage();
        m1.show();
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DropdownMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DropdownMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DropdownMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DropdownMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DropdownMenu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SupportButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton contactUsButton;
    private javax.swing.JLabel customerID;
    private javax.swing.JLabel customerName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton securityButton;
    // End of variables declaration//GEN-END:variables
}