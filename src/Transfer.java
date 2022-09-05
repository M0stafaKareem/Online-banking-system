
import java.awt.Color;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mostafa
 */
public class Transfer extends javax.swing.JFrame {

    /**
     * Creates new form Transfer
     */
    public Transfer(JFrame caller) {
        initComponents();
        calingParent = caller ;
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
        balanceLabel = new javax.swing.JLabel();
        senderCardNumber = new javax.swing.JLabel();
        senderExpiryDate = new javax.swing.JLabel();
        cardNumberTextfield = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        fav1Button = new javax.swing.JButton();
        fav2Button = new javax.swing.JButton();
        fav3Button = new javax.swing.JButton();
        fav4Button = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        trackerButton = new javax.swing.JButton();
        creditCardButton = new javax.swing.JButton();
        currencyConverterButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(375, 812));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(375, 812));
        jPanel1.setLayout(null);

        balanceLabel.setFont(new java.awt.Font("Nexa Regular", 0, 24)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 255, 255));
        balanceLabel.setText("$5,000");
        jPanel1.add(balanceLabel);
        balanceLabel.setBounds(55, 290, 130, 40);

        senderCardNumber.setFont(new java.awt.Font("Nexa Regular", 0, 15)); // NOI18N
        senderCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        senderCardNumber.setText("6645");
        jPanel1.add(senderCardNumber);
        senderCardNumber.setBounds(234, 342, 41, 21);

        senderExpiryDate.setFont(new java.awt.Font("Nexa Black", 0, 14)); // NOI18N
        senderExpiryDate.setForeground(new java.awt.Color(255, 255, 255));
        senderExpiryDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senderExpiryDate.setText("08/24");
        jPanel1.add(senderExpiryDate);
        senderExpiryDate.setBounds(258, 276, 60, 14);

        cardNumberTextfield.setFont(new java.awt.Font("Nexa Regular", 0, 17)); // NOI18N
        cardNumberTextfield.setForeground(new java.awt.Color(204, 204, 204));
        cardNumberTextfield.setText("Type here");
        cardNumberTextfield.setBorder(null);
        cardNumberTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cardNumberTextfieldFocusGained(evt);
            }
        });
        jPanel1.add(cardNumberTextfield);
        cardNumberTextfield.setBounds(64, 556, 200, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Transfer.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 375, 812);

        addButton.setText("jButton1");
        addButton.setOpaque(false);
        jPanel1.add(addButton);
        addButton.setBounds(32, 98, 40, 40);

        fav1Button.setBackground(new java.awt.Color(255, 255, 255));
        fav1Button.setForeground(new java.awt.Color(255, 255, 255));
        fav1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Ellipse 29.png"))); // NOI18N
        fav1Button.setBorder(null);
        fav1Button.setOpaque(false);
        jPanel1.add(fav1Button);
        fav1Button.setBounds(90, 98, 40, 40);

        fav2Button.setBackground(new java.awt.Color(255, 255, 255));
        fav2Button.setForeground(new java.awt.Color(255, 255, 255));
        fav2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Ellipse 29.png"))); // NOI18N
        fav2Button.setBorder(null);
        fav2Button.setOpaque(false);
        jPanel1.add(fav2Button);
        fav2Button.setBounds(148, 98, 40, 40);

        fav3Button.setBackground(new java.awt.Color(255, 255, 255));
        fav3Button.setForeground(new java.awt.Color(255, 255, 255));
        fav3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Ellipse 29.png"))); // NOI18N
        fav3Button.setBorder(null);
        fav3Button.setOpaque(false);
        jPanel1.add(fav3Button);
        fav3Button.setBounds(206, 98, 40, 40);

        fav4Button.setBackground(new java.awt.Color(255, 255, 255));
        fav4Button.setForeground(new java.awt.Color(255, 255, 255));
        fav4Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elements/Ellipse 29.png"))); // NOI18N
        fav4Button.setBorder(null);
        fav4Button.setOpaque(false);
        jPanel1.add(fav4Button);
        fav4Button.setBounds(264, 98, 40, 40);

        sendButton.setBorder(null);
        sendButton.setOpaque(false);
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(sendButton);
        sendButton.setBounds(32, 647, 312, 50);

        trackerButton.setOpaque(false);
        jPanel1.add(trackerButton);
        trackerButton.setBounds(170, 757, 28, 28);

        creditCardButton.setOpaque(false);
        creditCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditCardButtonActionPerformed(evt);
            }
        });
        jPanel1.add(creditCardButton);
        creditCardButton.setBounds(102, 757, 28, 28);

        currencyConverterButton.setText("jButton1");
        currencyConverterButton.setOpaque(false);
        currencyConverterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyConverterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(currencyConverterButton);
        currencyConverterButton.setBounds(313, 757, 28, 28);

        backButton.setText("jButton1");
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(7, 50, 26, 26);

        homeButton.setOpaque(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(34, 757, 28, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 310, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void creditCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditCardButtonActionPerformed
        Cards c1 = new Cards(this) ;
        c1.show();
        this.dispose();
    }//GEN-LAST:event_creditCardButtonActionPerformed

    private void currencyConverterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConverterButtonActionPerformed
        CurrencyConverter c1 = new CurrencyConverter(this);
        c1.show();
        this.dispose();
    }//GEN-LAST:event_currencyConverterButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        calingParent.show();
    }//GEN-LAST:event_backButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Dashboard d1 = new Dashboard();
        d1.show();
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void cardNumberTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cardNumberTextfieldFocusGained
        cardNumberTextfield.setText("");
        cardNumberTextfield.setForeground(Color.BLACK);
    }//GEN-LAST:event_cardNumberTextfieldFocusGained

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        TransferConfirmation t1 = new TransferConfirmation();
        this.dispose();
        t1.show();
    }//GEN-LAST:event_sendButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer(null).setVisible(true);
            }
        });
    }

    private final JFrame calingParent;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField cardNumberTextfield;
    private javax.swing.JButton creditCardButton;
    private javax.swing.JButton currencyConverterButton;
    private javax.swing.JButton fav1Button;
    private javax.swing.JButton fav2Button;
    private javax.swing.JButton fav3Button;
    private javax.swing.JButton fav4Button;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel senderCardNumber;
    private javax.swing.JLabel senderExpiryDate;
    private javax.swing.JButton trackerButton;
    // End of variables declaration//GEN-END:variables
}