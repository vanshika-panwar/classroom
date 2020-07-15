// Author Siddhartha Tiwari

import java.awt.event.ActionEvent;
import javax.swing.*;

public class Browse extends javax.swing.JFrame {

    JLabel jt;

    public Browse(JLabel parent) {
        jt = parent;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        open = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(open, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openActionPerformed(ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        jt.setText(open.getSelectedFile().getAbsolutePath());
        setVisible(false);
    }//GEN-LAST:event_openActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser open;
    // End of variables declaration//GEN-END:variables
}
