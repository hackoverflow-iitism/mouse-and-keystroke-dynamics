/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.umstek.biometrics.keystrokedynamics;

import javax.swing.JOptionPane;

/**
 *
 * @author SUTIRTHA PAL
 */
public class LoginForm1 extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm1
     */
    int a;
    public LoginForm1(int average) {
        initComponents();
        a=average;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pass1 = new javax.swing.JTextField();
        pass2 = new javax.swing.JTextField();
        pass3 = new javax.swing.JTextField();
        keyLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGIN FORM");

        jLabel2.setText("User_name :");

        jLabel3.setText("Password 1 :");

        jLabel4.setText("Confirm Password :");

        jLabel5.setText("Reconfirm Password :");

        pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass1MouseClicked(evt);
            }
        });

        pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass2MouseClicked(evt);
            }
        });

        pass3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass3MouseClicked(evt);
            }
        });

        keyLogin.setText("Keystroke authentication");
        keyLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyLoginActionPerformed(evt);
            }
        });

        jButton1.setText("Another chance");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(keyLogin)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(pass2)
                    .addComponent(pass3)
                    .addComponent(user))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLogin)
                    .addComponent(jButton1))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
MouseRegForm ob=new MouseRegForm();
    private void keyLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyLoginActionPerformed
        // TODO add your handling code here:
        String use = user.getText();
        String pas1 = pass1.getText();
        String pas2 = pass2.getText();
        String pas3 = pass3.getText();
        String passwor,usern;
        passwor = ob.password();
        usern=ob.username();
        //int xco=ob.xcor();
        //int yco=ob.ycor();
        int ax=(x1+x2+x)/3;
        System.out.println(ax+" ");
 //int ay=(y+y1+y2)/3;
        int xdiff=Math.abs(a-ax);
        System.out.println(xdiff);
        if(pas1.equals(pas2)&&pas2.equals(pas3))
        {
            if(xdiff<50)
            {
                new LoginForm().setVisible(true);

            this.dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Mouse Authentication failed. ");
                
        }
        else
        {
             if(xdiff<50)
            {
                JOptionPane.showMessageDialog(this, "Password does not match. ");
            }
            else
                JOptionPane.showMessageDialog(this, " Authentication failed. ");

        }
        
       /* boolean passo=false;
        passo=(pas2.equals(pas3)&&pas1.equals(pas2) );
        boolean mouso=false;
               // mouso=
        if(xdiff<50) mouso=true;
        System.out.println(passo+" "+mouso);
        if(passo&&mouso)
        {
            new LoginForm().setVisible(true);

            this.dispose();
        }
        else
            if(!passo&&mouso)
            JOptionPane.showMessageDialog(this, "Password does not match. ");
            else if(passo&&!mouso)
            JOptionPane.showMessageDialog(this, "Mouse Authentication failed. ");
        else if(!passo&&!mouso)
            JOptionPane.showMessageDialog(this, " Authentication failed completely. ");*/
    }//GEN-LAST:event_keyLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       pass1.setText("");
       pass2.setText("");
       pass3.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
int x,x1,x2;
int y2;
    private void pass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass1MouseClicked
        // TODO add your handling code here:
        x=evt.getX();
      //  y=evt.getY();
        
    }//GEN-LAST:event_pass1MouseClicked

    private void pass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass2MouseClicked
        // TODO add your handling code here:
        x1=evt.getX();
        //y1=evt.getY();
    }//GEN-LAST:event_pass2MouseClicked

    private void pass3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass3MouseClicked
        // TODO add your handling code here:
        x2=evt.getX();
        //y2=evt.getY();
    }//GEN-LAST:event_pass3MouseClicked
 
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
            java.util.logging.Logger.getLogger(LoginForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int f=271;
                new LoginForm1(f).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton keyLogin;
    private javax.swing.JTextField pass1;
    private javax.swing.JTextField pass2;
    private javax.swing.JTextField pass3;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
