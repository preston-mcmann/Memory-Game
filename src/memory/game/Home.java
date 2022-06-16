package memory.game;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Home extends javax.swing.JFrame {

    User currentUser;
    LoginUsers loginUsers;
    //Constructor
    public Home(User CurrentUser, LoginUsers loginUsers) {
        initComponents();
        this.currentUser=CurrentUser;
        this.loginUsers= loginUsers;
        //adds the Sets of a user to selection combo box 
        for (Sets Set : currentUser.getSets()){
            SetSelectionBox.addItem(Set.getName());
        }
        //enableds selection box and create sets button
        //disabled edit sets and game mode button 
        SetSelectionBox.setEnabled(true);
        CreateSetsButton.setEnabled(true);
        EditSetsButton.setEnabled(false);
        FlashCardsButton.setEnabled(false);
        MatchingGameButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        SetSelectionBox = new javax.swing.JComboBox<>();
        CreateSetsButton = new javax.swing.JButton();
        EditSetsButton = new javax.swing.JButton();
        FlashCardsButton = new javax.swing.JButton();
        MatchingGameButton = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        SetSelectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        SetSelectionBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SetSelectionBoxItemStateChanged(evt);
            }
        });

        CreateSetsButton.setText("Create Sets");
        CreateSetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSetsButtonActionPerformed(evt);
            }
        });

        EditSetsButton.setText("Edit Sets");
        EditSetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSetsButtonActionPerformed(evt);
            }
        });

        FlashCardsButton.setText("Flash Cards");
        FlashCardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlashCardsButtonActionPerformed(evt);
            }
        });

        MatchingGameButton.setText("Matching Game");
        MatchingGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchingGameButtonActionPerformed(evt);
            }
        });

        SignOutButton.setText("Sign Out");
        SignOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(SetSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditSetsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CreateSetsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MatchingGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FlashCardsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignOutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SignOutButton)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(FlashCardsButton)
                        .addGap(17, 17, 17)
                        .addComponent(CreateSetsButton))
                    .addComponent(SetSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditSetsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MatchingGameButton)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetSelectionBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SetSelectionBoxItemStateChanged
        //if a set is selected from the combo box, it will enable the other button features
        if(!SetSelectionBox.getSelectedItem().equals("Select")){
            EditSetsButton.setEnabled(true);
            FlashCardsButton.setEnabled(true);
            MatchingGameButton.setEnabled(true);       
        }else{
            EditSetsButton.setEnabled(false);
            FlashCardsButton.setEnabled(false);
            MatchingGameButton.setEnabled(false);
        }
    }//GEN-LAST:event_SetSelectionBoxItemStateChanged

    private void EditSetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSetsButtonActionPerformed
        //Searches through the users sets until it finds the one with the same name as in combo box
        int indexOfSet = currentUser.FindIndexofSet(SetSelectionBox.getSelectedItem().toString());   
        //sets currentSet as set in idex
        Sets currentSet = currentUser.getSets().get(indexOfSet);
        //opes EditSets page 
        EditSets editSetsPage = new EditSets(this, true,currentSet,currentUser,loginUsers);
        editSetsPage.setLocationRelativeTo(this);
        this.dispose();
        editSetsPage.setVisible(true);

    }//GEN-LAST:event_EditSetsButtonActionPerformed

    private void CreateSetsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSetsButtonActionPerformed
        //creates new set
        Sets currentSet = currentUser.addSets("");
        //opens edit sets with new set
        EditSets editSetsPage = new EditSets(this, true,currentSet,currentUser,loginUsers);
        editSetsPage.setLocationRelativeTo(this);
        this.dispose();
        editSetsPage.setVisible(true);

    }//GEN-LAST:event_CreateSetsButtonActionPerformed


    private void FlashCardsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlashCardsButtonActionPerformed
        // TODO add your handling code here:
         int indexOfSet = currentUser.FindIndexofSet(SetSelectionBox.getSelectedItem().toString());   
        //sets currentSet as set in idex
        Sets currentSet = currentUser.getSets().get(indexOfSet);
       //opens flashcard
        Flashcard flashcards = new Flashcard(currentSet, currentUser,loginUsers);
        flashcards.setLocationRelativeTo(this);
        this.dispose();
        flashcards.setVisible(true);

            
        
    }//GEN-LAST:event_FlashCardsButtonActionPerformed

    private void MatchingGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchingGameButtonActionPerformed
                // TODO add your handling code here:
         int indexOfSet = currentUser.FindIndexofSet(SetSelectionBox.getSelectedItem().toString());   
        //sets currentSet as set in idex
        Sets currentSet = currentUser.getSets().get(indexOfSet);
       //opens matching game
        MatchingGame matchingGame = new MatchingGame(currentSet, currentUser,loginUsers);
        matchingGame.setLocationRelativeTo(this);
        this.dispose();
        matchingGame.setVisible(true);
    }//GEN-LAST:event_MatchingGameButtonActionPerformed

    private void SignOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutButtonActionPerformed
        //opens login form
        Login loginScreen = new Login(loginUsers);
        loginScreen.setLocationRelativeTo(this);
        this.dispose();
        loginScreen.setVisible(true);
    }//GEN-LAST:event_SignOutButtonActionPerformed


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateSetsButton;
    private javax.swing.JButton EditSetsButton;
    private javax.swing.JButton FlashCardsButton;
    private javax.swing.JButton MatchingGameButton;
    private javax.swing.JComboBox<String> SetSelectionBox;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
