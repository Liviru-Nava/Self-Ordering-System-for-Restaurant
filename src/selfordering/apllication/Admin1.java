/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package selfordering.apllication;
import javax.swing.JOptionPane;
import menu_item_classes.*;

/**
 *
 * @author Hirantha perera
 */
public class Admin1 extends javax.swing.JFrame {
    MenuItemLinkedList menu_list;
    MenuItemLinkedList original_list;
    /**
     * Creates new form Admin1
     */
    public Admin1(MenuItemLinkedList menu_list, MenuItemLinkedList original_list) 
    {
        this.menu_list = menu_list;
        this.original_list = original_list;
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
        jPanel2 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        txt_item_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_preparation_time = new javax.swing.JTextField();
        btn_save = new rojeru_san.complementos.RSButtonHover();
        btn_update = new rojeru_san.complementos.RSButtonHover();
        btn_delete = new rojeru_san.complementos.RSButtonHover();
        jLabel4 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmb_category = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txt_item_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover9 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 450, 40));
        jPanel2.add(txt_item_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 450, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Preparation time");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, -1));

        jLabel3.setText("Search");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));
        jPanel2.add(txt_preparation_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 450, 40));

        btn_save.setBackground(new java.awt.Color(0, 204, 0));
        btn_save.setBorder(null);
        btn_save.setText("Save");
        btn_save.setColorHover(new java.awt.Color(0, 0, 0));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 150, -1));

        btn_update.setBackground(new java.awt.Color(204, 102, 0));
        btn_update.setBorder(null);
        btn_update.setText("Update");
        btn_update.setColorHover(new java.awt.Color(0, 0, 0));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel2.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 150, -1));

        btn_delete.setBackground(new java.awt.Color(204, 0, 51));
        btn_delete.setBorder(null);
        btn_delete.setText("Delete");
        btn_delete.setColorHover(new java.awt.Color(0, 0, 0));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Item Category");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/search (2).png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 40, 40));

        cmb_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza", "Appetizer", "Beverage", "Dessert" }));
        cmb_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_categoryActionPerformed(evt);
            }
        });
        jPanel2.add(cmb_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 450, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Item Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jPanel2.add(txt_item_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 450, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Item Price");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 1320, 640));

        rSButtonHover2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (2).png"))); // NOI18N
        rSButtonHover2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        rSButtonHover2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 60, -1));

        rSButtonHover9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (2).png"))); // NOI18N
        rSButtonHover9.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (3).png"))); // NOI18N
        jPanel1.add(rSButtonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 10, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/output-onlinepngtools.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -20, 320, 130));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(156, 150, 150));
        jLabel22.setText("copyright ©PDSA | Develop By Hirantha And Liviru");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 790, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_categoryActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        String item_category = cmb_category.getSelectedItem().toString();
        String item_name = txt_item_name.getText();
        double item_price = Double.parseDouble(txt_item_price.getText());
        int preparation_time = Integer.parseInt(txt_preparation_time.getText());
        menu_list.insertProducts(item_name, item_category, item_price, 0, preparation_time);
        original_list.insertProducts(item_name, item_category, item_price, 0, preparation_time);
        JOptionPane.showMessageDialog(rootPane, "Item added successfully!");
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String item_category = cmb_category.getSelectedItem().toString();
        String item_name = txt_item_name.getText();
        double item_price = Double.parseDouble(txt_item_price.getText());
        int preparation_time = Integer.parseInt(txt_preparation_time.getText());
        menu_list.updateinfo(item_name, item_category, item_price,  0, preparation_time);
        original_list.updateinfo(item_name, item_category, item_price,  0, preparation_time);
        JOptionPane.showMessageDialog(rootPane, "Item Update successfully!");
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuItemLinkedList menu_list = new MenuItemLinkedList();
                MenuItemLinkedList original_list = new MenuItemLinkedList();
                new Admin1(menu_list, original_list).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btn_delete;
    private rojeru_san.complementos.RSButtonHover btn_save;
    private rojeru_san.complementos.RSButtonHover btn_update;
    private javax.swing.JComboBox<String> cmb_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover9;
    private javax.swing.JTextField txt_item_name;
    private javax.swing.JTextField txt_item_price;
    private javax.swing.JTextField txt_preparation_time;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
