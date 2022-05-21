
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package memory.game;


import java.util.LinkedList;

public class Flashcards extends javax.swing.JFrame {

    LoginUsers loginUsers;
    User currentUser;
    static int index = 0;
    static boolean showTerm = true;
    static LinkedList<Cards> myCards;
    boolean study = false;

    //Constructor
    public Flashcards(LinkedList<Cards> cards,User  currentUser) {
        initComponents();
        this.currentUser = currentUser;
        myCards = cards;
        CardButton.setText(myCards.get(index).getTerm());
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CardButton = new javax.swing.JButton();
        GoRightButton = new javax.swing.JButton();
        GoLeftButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ProgressField = new javax.swing.JTextField();
        AddTermToStudyLaterButton = new javax.swing.JButton();
        ViewStudyLaterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Flashcards");

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

        GoLeftButton.setText("<");
        GoLeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoLeftButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ProgressField.setText("Progress");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GoLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProgressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(GoRightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddTermToStudyLaterButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                .addComponent(ViewStudyLaterButton)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BackButton))
                .addGap(18, 18, 18)
                .addComponent(CardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GoRightButton)
                            .addComponent(GoLeftButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProgressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddTermToStudyLaterButton)
                    .addComponent(ViewStudyLaterButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                         

    private void GoLeftButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
         if(index!=0){
            index--;
        }
        CardButton.setText(myCards.get(index).getTerm());
        showTerm = true;   
    }                                            

    private void CardButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (showTerm == true) {
            CardButton.setText(myCards.get(index).getDefinition());
            showTerm = false;
        } else {
            CardButton.setText(myCards.get(index).getTerm());
            showTerm = true;
        }
        ProgressField.setText("Progress " + (index + 1) + "/" + myCards.size());
    }                                          

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Home HomeScreen = new Home(currentUser);
        HomeScreen.setLocationRelativeTo(this);
        this.dispose();
        HomeScreen.setVisible(true);
    }                                          

    private void GoRightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
       if(index!=0){
             index--;
        }
        if(index!=myCards.size()){
            index++;
        }
        CardButton.setText(myCards.get(index).getTerm());
        showTerm = true;
        
    }                                             

    private void ViewStudyLaterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        StudyLater studyLaterPage = new StudyLater(myCards, currentUser);
        studyLaterPage.setLocationRelativeTo(this);
        this.dispose();
        studyLaterPage.setVisible(true);
        
    }                                                    

    private void AddTermToStudyLaterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTermToStudyLaterButtonActionPerformed
        myCards.get(index).study = true;
    }//GEN-LAST:event_AddTermToStudyLaterButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddTermToStudyLaterButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CardButton;
    private javax.swing.JButton GoLeftButton;
    private javax.swing.JButton GoRightButton;
    private javax.swing.JTextField ProgressField;
    private javax.swing.JButton ViewStudyLaterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

