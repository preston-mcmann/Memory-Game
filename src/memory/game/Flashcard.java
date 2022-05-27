
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memory.game;

import java.util.LinkedList;
import java.awt.*; 
import javax.swing.*; 
import javax.swing.JProgressBar;
import java.awt.event.*; 

/**
 *
 * @author mcman
 */
public class Flashcard extends javax.swing.JFrame {
 User currentUser;
    static int index = 0;
    static boolean showTerm = true;
    String[][] CardArray;
    String[][] StudyLaterArray;
    int x =0;
    
    public Flashcard(String[][] cardArray,User  currentUser) {
        //constructor
        initComponents();
        this.currentUser = currentUser;
        CardArray = cardArray;
        StudyLaterArray = new String[cardArray.length][2];
        //sets text on card to first card term
        CardButton.setText(CardArray[index][0]);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JPanel();
        AddTermToStudyLaterButton = new javax.swing.JButton();
        ViewStudyLaterButton = new javax.swing.JButton();
        CardButton = new javax.swing.JButton();
        GoRightButton = new javax.swing.JButton();
        GoLeftButton = new javax.swing.JButton();
        ProgressField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        ProgressNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        progressBar.setBackground(new java.awt.Color(0, 51, 102));

        AddTermToStudyLaterButton.setText("Add Term to Study Later");
        AddTermToStudyLaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTermToStudyLaterButtonActionPerformed(evt);
            }
        });

        ViewStudyLaterButton.setText("View Study Later");
        ViewStudyLaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewStudyLaterButtonActionPerformed(evt);
            }
        });

        CardButton.setText("Term");
        CardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardButtonActionPerformed(evt);
            }
        });

        GoRightButton.setText(">");
        GoRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoRightButtonActionPerformed(evt);
            }
        });
        GoRightButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GoRightButtonKeyPressed(evt);
            }
        });

        GoLeftButton.setText("<");
        GoLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoLeftButtonActionPerformed(evt);
            }
        });

        ProgressField.setText("Progress");
        ProgressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgressFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Flashcards");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);
        jProgressBar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jProgressBar1PropertyChange(evt);
            }
        });

        ProgressNumber.setBackground(new java.awt.Color(0, 51, 102));
        ProgressNumber.setForeground(new java.awt.Color(0, 51, 102));
        ProgressNumber.setBorder(null);

        javax.swing.GroupLayout progressBarLayout = new javax.swing.GroupLayout(progressBar);
        progressBar.setLayout(progressBarLayout);
        progressBarLayout.setHorizontalGroup(
            progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(progressBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(progressBarLayout.createSequentialGroup()
                        .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressBarLayout.createSequentialGroup()
                                .addComponent(AddTermToStudyLaterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ViewStudyLaterButton))
                            .addGroup(progressBarLayout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressBarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressBarLayout.createSequentialGroup()
                                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(progressBarLayout.createSequentialGroup()
                                        .addComponent(GoLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(GoRightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(CardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressBarLayout.createSequentialGroup()
                                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProgressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProgressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(156, 156, 156))))))
        );
        progressBarLayout.setVerticalGroup(
            progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, progressBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(CardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(progressBarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GoLeftButton)
                            .addComponent(GoRightButton))
                        .addGap(82, 82, 82))
                    .addGroup(progressBarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(progressBarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProgressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(progressBarLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ProgressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(progressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewStudyLaterButton)
                    .addComponent(AddTermToStudyLaterButton))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTermToStudyLaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTermToStudyLaterButtonActionPerformed
        StudyLaterArray[x][0]=CardArray[index][0];
        StudyLaterArray[x][1]=CardArray[index][1];
        x++;
    }//GEN-LAST:event_AddTermToStudyLaterButtonActionPerformed

    private void ViewStudyLaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewStudyLaterButtonActionPerformed
        StudyLater studyLaterPage = new StudyLater(StudyLaterArray, currentUser);
        studyLaterPage.setLocationRelativeTo(this);
        this.dispose();
        studyLaterPage.setVisible(true);
    }//GEN-LAST:event_ViewStudyLaterButtonActionPerformed

    private void CardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardButtonActionPerformed
        if (showTerm == true) {
            CardButton.setText(CardArray[index][1]);
            showTerm = false;
        } else {
            CardButton.setText(CardArray[index][0]);
            showTerm = true;
        }
        ProgressField.setText("Progress " + (index + 1) + "/" + CardArray.length);

        
        

    }//GEN-LAST:event_CardButtonActionPerformed

    private void GoRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoRightButtonActionPerformed
        if(index!=0){
             index--;
        }
        if(index!=CardArray.length){
            index++;
        }
        CardButton.setText(CardArray[index][0]);
        showTerm = true; 
                ProgressField.setText("Progress " + (index + 1) + "/" + myCards.size());
       
        //progress bar
        ProgressNumber.setText(Integer.toString(index));
        int value = Integer.parseInt(ProgressNumber.getText());
        int newValue = (index+1/myCards.size())*100;
        
        jProgressBar1.setValue(newValue);
    }//GEN-LAST:event_GoRightButtonActionPerformed

    private void GoRightButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GoRightButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_GoRightButtonKeyPressed

    private void GoLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoLeftButtonActionPerformed
        if(index!=0){
            index--;
        }
        CardButton.setText(CardArray[index][0]);
        
        showTerm = true;
                ProgressField.setText("Progress " + (index + 1) + "/" + myCards.size());
       
        //progress bar
        ProgressNumber.setText(Integer.toString(index));
        int value = Integer.parseInt(ProgressNumber.getText());
        jProgressBar1.setValue(value);
    }//GEN-LAST:event_GoLeftButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Home HomeScreen = new Home(currentUser);
        HomeScreen.setLocationRelativeTo(this);
        this.dispose();
        HomeScreen.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void jProgressBar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jProgressBar1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jProgressBar1PropertyChange

    private void ProgressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgressFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTermToStudyLaterButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CardButton;
    private javax.swing.JButton GoLeftButton;
    private javax.swing.JButton GoRightButton;
    private javax.swing.JTextField ProgressField;
    private javax.swing.JTextField ProgressNumber;
    private javax.swing.JButton ViewStudyLaterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel progressBar;
    // End of variables declaration//GEN-END:variables
}
