/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Sujeet's PC
 */
public class DistanceSpeedTimeCalculater extends javax.swing.JFrame {

    /**
     * Creates new form DistanceSpeedTimeCalculater
     */
    public DistanceSpeedTimeCalculater() {
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        Formula = new javax.swing.JLabel();
        Result = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Distance Speed Time Calculater");

        jComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select an Option", "Distance", "Speed", "Time" }));

        t1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Formula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Formula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Result.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Result.setText("         Result");
        Result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(Formula, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(541, 541, 541)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(494, 494, 494)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(Formula, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jComboBox.getSelectedItem().equals("Select an option") || t1.getText().equals("") || t2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "You Must Select an Option and insert the value.", "Error Message", JOptionPane.INFORMATION_MESSAGE);
        } else if (jComboBox.getSelectedItem().equals("Distance")) {
            double speed = Double.parseDouble(t1.getText());
            double time = Double.parseDouble(t2.getText());

            double distance = speed*time;

             String value = String.format("%.2f", distance);
              Result.setText(value);

            Formula.setText("Distance = Speed*Time");
        } else if (jComboBox.getSelectedItem().equals("Speed")) {
            double distance = Double.parseDouble(t1.getText());
            double time = Double.parseDouble(t2.getText());

            double speed = distance / time;

            String value = String.format("%.2f", speed);
            Result.setText(value);

            Formula.setText("Speed = Distance/Time");
        } else if (jComboBox.getSelectedItem().equals("Time")) {
            double distance = Double.parseDouble(t1.getText());
            double speed = Double.parseDouble(t2.getText());

            double time = distance / speed;

            String value = String.format("%.2f", time);
            Result.setText(value);

            Formula.setText("Time = Distance / Speed");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        t1.setText("");
        t2.setText("");
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
            java.util.logging.Logger.getLogger(DistanceSpeedTimeCalculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeedTimeCalculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeedTimeCalculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeedTimeCalculater.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistanceSpeedTimeCalculater().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Formula;
    private javax.swing.JLabel Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}