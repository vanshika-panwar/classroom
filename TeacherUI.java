
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TeacherUI extends javax.swing.JFrame {

    Teacher t;
    JPanel jp;
    String cons = "C:\\Users\\compu\\Documents\\NetBeansProjects\\Classroom\\src\\";

    public TeacherUI(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(cons + name + ".bin");
        ObjectInputStream obj = new ObjectInputStream(fin);
        t = (Teacher) obj.readObject();
        System.out.println(t.toString());
        initComponents();
        displayName(name);
        initSome();
    }

    public void displayName(String name) {
        greet.setText("Welcome to classRoom " + name + "!");
    }

    public void initSome() {
        jp = assignDue;
        System.out.println(t.name);
        assignDue.setLayout(new BoxLayout(assignDue, BoxLayout.Y_AXIS));
        int n = (t.students.get(0).assign.size() + t.students.get(0).done.size());
        System.out.println(n);
        JButton[] but1 = new JButton[n];
        for (int i = 0; i < n; i++) {
            but1[i] = new JButton("Assignment " + Integer.toString(i + 1));
            but1[i].addActionListener(new ClickAssignment());
            but1[i].setVisible(true);
            but1[i].setBackground(Color.GREEN);
            assignDue.add(but1[i]);
        }
    }

    public static void main(String[] arg) throws IOException, FileNotFoundException, ClassNotFoundException {
        TeacherUI obj = new TeacherUI("Siddhartha");
        obj.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        greet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        assignDue = new javax.swing.JPanel();
        newAssign = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        greet.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel1.setText("Assignments");

        javax.swing.GroupLayout assignDueLayout = new javax.swing.GroupLayout(assignDue);
        assignDue.setLayout(assignDueLayout);
        assignDueLayout.setHorizontalGroup(
            assignDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        assignDueLayout.setVerticalGroup(
            assignDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        newAssign.setText("New Assignment");
        newAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAssignActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(refresh)
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(assignDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(newAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(newAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refresh)
                            .addComponent(assignDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAssignActionPerformed
        newAssignment obj = new newAssignment();
        obj.setVisible(true);
        obj.setDefaultCloseOperation(HIDE_ON_CLOSE);
        assignDue = jp;
    }//GEN-LAST:event_newAssignActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        System.out.println(t.students.get(0).name + " " + t.toString());
        newAssignment.ass.marksAssigned = 0.0;
        if(t.assignHomework(newAssignment.ass))
            initSome();
    }//GEN-LAST:event_refreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel assignDue;
    private javax.swing.JLabel greet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newAssign;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}

class ClickAssignmentTeacher implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        JButton bb = (JButton) e.getSource();
        // Add here.
    }
}
