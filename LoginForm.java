/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.umstek.biometrics.keystrokedynamics;

import javax.swing.JOptionPane;
import lk.umstek.biometrics.keystrokedynamics.features.FeatureExtractor;
import lk.umstek.biometrics.keystrokedynamics.features.FeatureMatcher;
import lk.umstek.biometrics.keystrokedynamics.features.FeatureModel;
import lk.umstek.biometrics.keystrokedynamics.input.EventCollector;
import lk.umstek.biometrics.keystrokedynamics.persistence.FileIO;

/**
 *
 * @author wickramaranga
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        jLabelInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextRef = new javax.swing.JTextArea();
        jButtonNext = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAct = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelInfo.setText("Please type the following text to login. Type everything in lowercase. ");

        jTextRef.setEditable(false);
        jTextRef.setColumns(20);
        jTextRef.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextRef.setLineWrap(true);
        jTextRef.setRows(5);
        jTextRef.setText("the behavioral biometric of keystroke dynamics uses the manner and rhythm in which an individual types characters on a keyboard or keypad.");
        jTextRef.setWrapStyleWord(true);
        jTextRef.setEnabled(false);
        jScrollPane1.setViewportView(jTextRef);

        jButtonNext.setText("Login");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jTextAct.setColumns(20);
        jTextAct.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextAct.setLineWrap(true);
        jTextAct.setRows(5);
        jTextAct.setWrapStyleWord(true);
        jTextAct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextActKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextActKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jTextAct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelInfo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jButtonReset)
                                .addGap(112, 112, 112)
                                .addComponent(jButtonNext)))
                        .addGap(0, 217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonNext))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    EventCollector collector = new EventCollector();
    

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextAct.setText("");
        collector = new EventCollector();
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        if (jTextRef.getText().equals(jTextAct.getText())) {
            FeatureModel model = FeatureExtractor.extractFeatures(collector);
            FeatureModel ref = FileIO.loadModel();

            if (FeatureMatcher.match(model, ref)) {
                JOptionPane.showMessageDialog(this, "Login successful. ");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Login error. ", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please enter the correct text. ");
        }
    }//GEN-LAST:event_jButtonNextActionPerformed

    private void jTextActKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextActKeyPressed
        // TODO add your handling code here:
        collector.press(evt,false);
    }//GEN-LAST:event_jTextActKeyPressed

    private void jTextActKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextActKeyReleased
        // TODO add your handling code here:
        collector.release(evt, false);
    }//GEN-LAST:event_jTextActKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAct;
    private javax.swing.JTextArea jTextRef;
    // End of variables declaration//GEN-END:variables
}
