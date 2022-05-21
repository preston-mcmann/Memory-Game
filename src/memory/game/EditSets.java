/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package memory.game;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mcman
 */
public class EditSets extends javax.swing.JDialog {

    /**
     * Creates new form EditSets
     */
    int index;
    User currentUser;
    Sets set;
    ArrayList<Cards> cardList = new ArrayList<>();
    DefaultTableModel model;

    public EditSets(java.awt.Frame parent, boolean modal, int index, User CurrentUser) {
        super(parent, modal);
        initComponents();
        this.index = index;
        this.currentUser = CurrentUser;
        this.set = currentUser.getSets().get(index);
        TitleField.setText(set.getName());

        model = (DefaultTableModel) CardTable.getModel();
        for (Cards card : set.getCards()) {
            cardList.add(card);
        }
        for (Cards card : cardList) {
            model.addRow(new Object[]{card.getTerm(), card.getDefinition()});
        }
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
        CreateSetButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TitleField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CardTable = new javax.swing.JTable();
        TermField = new javax.swing.JTextField();
        DefinitionField = new javax.swing.JTextField();
        AddCardButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RemoveCardButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        CreateSetButton.setText("Create Set");
        CreateSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSetButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Set");

        TitleField.setEditable(false);

        CardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Term", "Definition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CardTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        CardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CardTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CardTable);

        TermField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TermField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TermFieldActionPerformed(evt);
            }
        });

        DefinitionField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DefinitionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefinitionFieldActionPerformed(evt);
            }
        });

        AddCardButton.setText("Add Card");
        AddCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCardButtonActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Set Term: ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Set Title: ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Set Definition:");

        RemoveCardButton.setText("Remove Card");
        RemoveCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveCardButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CreateSetButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackButton)
                                .addGap(102, 102, 102))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TermField)
                                        .addComponent(DefinitionField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RemoveCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddCardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DefinitionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(AddCardButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveCardButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateSetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSetButtonActionPerformed
        currentUser.removeSets(set);
        cardList.clear();
        for (int i = 0; i < CardTable.getRowCount(); i++) {
            Cards card = new Cards(model.getValueAt(i, 0).toString(), model.getValueAt(i, 1).toString());
            cardList.add(card);
        }
        currentUser.addSets(TitleField.getText(), cardList);
        Home HomeScreen = new Home(currentUser);
        HomeScreen.setLocationRelativeTo(this);
        this.dispose();
        HomeScreen.setVisible(true);
        for (Sets sets : currentUser.getSets()) {
            System.out.println(sets.getName());
            for (Cards card : sets.getCards()) {
                System.out.println(card.getTerm() + " " + card.getDefinition());
            }
            System.out.println("------------------------");
        }
    }//GEN-LAST:event_CreateSetButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Home HomeScreen = new Home(currentUser);
        HomeScreen.setLocationRelativeTo(this);
        this.dispose();
        HomeScreen.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void TermFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TermFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TermFieldActionPerformed

    private void DefinitionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefinitionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DefinitionFieldActionPerformed

    private void AddCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCardButtonActionPerformed

        model.addRow(new Object[]{TermField.getText(), DefinitionField.getText()});
        Cards card = new Cards(TermField.getText(), DefinitionField.getText());

        TermField.setText("");
        DefinitionField.setText("");
    }//GEN-LAST:event_AddCardButtonActionPerformed

    private void CardTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardTableMouseClicked

    }//GEN-LAST:event_CardTableMouseClicked

    private void RemoveCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveCardButtonActionPerformed
        int i = CardTable.getSelectedRow();
        model.removeRow(i);
    }//GEN-LAST:event_RemoveCardButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCardButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JTable CardTable;
    private javax.swing.JButton CreateSetButton;
    private javax.swing.JTextField DefinitionField;
    private javax.swing.JButton RemoveCardButton;
    private javax.swing.JTextField TermField;
    private javax.swing.JTextField TitleField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
