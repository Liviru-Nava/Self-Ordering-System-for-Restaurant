/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package selfordering.apllication;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import order_classes.*;

/**
 *
 * @author Hirantha perera
 */
public class Kitchen extends javax.swing.JFrame implements Runnable{
    int hour,second,minute;
    private OrderCircularQueue order_queue;
    private DefaultTableModel tbl_orders;
    private DefaultTableModel tbl_order_items;
    
    public Kitchen(OrderCircularQueue order_queue) {
        initComponents();
        this.order_queue = order_queue; //the Kitchen.java form's order_queue will equal the Home.java order_queue
        tbl_orders = (DefaultTableModel)tbl_display_orders.getModel();
        tbl_orders.setRowCount(0);        
        tbl_order_items = (DefaultTableModel)tbl_display_order_items.getModel();
        tbl_order_items.setRowCount(0);
        
        tbl_display_orders.getSelectionModel().addListSelectionListener(new ListSelectionListener() {   //code to select a row and update tables
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Call a method to handle the selected order
                    showItemsForSelectedOrder();
                }
            }
        });
        updateOrdersTable();
        Thread t=new Thread(this);
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_refresh = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_display_order_items = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_display_orders = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_timeshow1 = new java.awt.Label();
        rSButtonHover7 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover9 = new rojeru_san.complementos.RSButtonHover();
        btn_process_order1 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kitchen UI");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_refresh.setBackground(new java.awt.Color(51, 51, 51));
        btn_refresh.setText("Refresh");
        btn_refresh.setColorHover(new java.awt.Color(204, 0, 51));
        btn_refresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        jPanel2.add(btn_refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 110, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Order Item");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 50, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/output-onlinepngtools.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -20, 320, 140));

        tbl_display_order_items.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_display_order_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name"
            }
        ));
        tbl_display_order_items.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_display_order_items.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_display_order_items.setRowHeight(40);
        tbl_display_order_items.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tbl_display_order_items.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_display_order_items.setShowGrid(true);
        tbl_display_order_items.setShowVerticalLines(false);
        jScrollPane3.setViewportView(tbl_display_order_items);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 650, 680));

        tbl_display_orders.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_display_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Price", "Time"
            }
        ));
        tbl_display_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_display_orders.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_display_orders.setRowHeight(40);
        tbl_display_orders.setSelectionBackground(new java.awt.Color(204, 0, 51));
        tbl_display_orders.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbl_display_orders.setShowGrid(true);
        tbl_display_orders.setShowVerticalLines(false);
        jScrollPane4.setViewportView(tbl_display_orders);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 660, 680));

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(156, 150, 150));
        jLabel22.setText("copyright ©PDSA | Develop By Hirantha And Liviru");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 790, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Orders");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 160, 40));

        lbl_timeshow1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_timeshow1.setForeground(new java.awt.Color(204, 0, 0));
        lbl_timeshow1.setText("11.07.00AM");
        jPanel2.add(lbl_timeshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, 40));

        rSButtonHover7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (2).png"))); // NOI18N
        rSButtonHover7.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        rSButtonHover7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/chef (3).png"))); // NOI18N
        jPanel2.add(rSButtonHover7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 60, -1));

        rSButtonHover9.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (2).png"))); // NOI18N
        rSButtonHover9.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonHover9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/selfordering/apllication/setting (3).png"))); // NOI18N
        jPanel2.add(rSButtonHover9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 10, 60, -1));

        btn_process_order1.setBackground(new java.awt.Color(0, 153, 51));
        btn_process_order1.setText("Process Orders");
        btn_process_order1.setColorHover(new java.awt.Color(204, 0, 51));
        btn_process_order1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_process_order1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_process_order1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_process_order1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        updateOrdersTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_process_order1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_process_order1ActionPerformed
        // TODO add your handling code here:
        processOrder();
    }//GEN-LAST:event_btn_process_order1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kitchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kitchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kitchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kitchen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OrderCircularQueue order_queue = new OrderCircularQueue();
                new Kitchen(order_queue).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover btn_process_order1;
    private rojeru_san.complementos.RSButtonHover btn_refresh;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label lbl_timeshow1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover7;
    private rojeru_san.complementos.RSButtonHover rSButtonHover9;
    private javax.swing.JTable tbl_display_order_items;
    private javax.swing.JTable tbl_display_orders;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() 
    {
        while (true)
        {
            Calendar cal=Calendar.getInstance();
            hour=cal.get(Calendar.HOUR_OF_DAY);
            minute=cal.get(Calendar.MINUTE);
            second=cal.get(Calendar.SECOND);           
            SimpleDateFormat sdf12 =new SimpleDateFormat("hh:mm:ss aa");            
            Date dat =cal.getTime();
            String time12=sdf12.format(dat);
            lbl_timeshow1.setText(time12); 
        }
    }
    private void showItemsForSelectedOrder()  //when the user clicks the order number, the items related to the order will be displayed
     {
        int selectedRow = tbl_display_orders.getSelectedRow();
        if (selectedRow != -1 && selectedRow < order_queue.orders.length) 
        {
            int selected_order_number = (int)tbl_display_orders.getValueAt(selectedRow,0);
            Order selected_order = findOrderByNumber(selected_order_number);
            if (selected_order != null && selected_order.isActive()) 
            {
                // Clear the existing items in the second JTable
                tbl_order_items.setRowCount(0);
                OrderItem[] items = selected_order.items;
                if (items != null) 
                {
                    DefaultTableModel itemsTableModel = new DefaultTableModel(new Object[]{"Item Name", "Item Price"}, 0);
                    for (OrderItem item : items) 
                    {
                        if (item != null) 
                        {
                            itemsTableModel.addRow(new Object[]{item.getItemName(), item.getPrice()});
                        }
                    }
                tbl_display_order_items.setModel(itemsTableModel);
                } 
                else 
                {
                    System.out.println("No items associated with the selected order.");
                }
            } 
            else 
            {
                System.out.println("Selected order is null.");
            }
        } 
        else 
        {
            System.out.println("Invalid selected row index or orderQueue length.");
        }
     }
    private void updateOrdersTable()   //this will update the tbl_display_orders from the queue
     {
        DefaultTableModel ordersTableModel = new DefaultTableModel(
                new Object[]{"Order Number", "Order Total", "Customer Telephone", "Order Time"}, 0);

        for (Order order : order_queue.orders) 
        {
            if (order != null && order.isActive()) 
            {
                ordersTableModel.addRow(new Object[]{
                        order.getOrderNumber(),
                        order.order_total,
                        order.customer_telephone,
                        order.order_time});
            }
        }
        tbl_display_orders.setModel(ordersTableModel);
        tbl_display_orders.repaint();
     }
    public void processOrder()
    {
        int order_number=0;
        try {
            order_number = (int)tbl_display_orders.getValueAt(0,0);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "No orders to process");
        }
        // Dequeue the order
        Order processed_order = order_queue.dequeueOrder();
        System.out.println("REAR: " + order_queue.rear);
        System.out.println("FRONT: " + order_queue.front);
        // Optionally, update the items table or perform any other necessary actions
        tbl_order_items.setRowCount(0);
        // Print a message or perform any additional processing
        if (processed_order != null) 
        {
            processed_order.setOrderStatus();
            removeOrderFromTableModel(processed_order.getOrderNumber());
            JOptionPane.showMessageDialog(rootPane, "Order number "+ order_number +" is processed!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "No orders to process");
        }
        updateOrdersTable();
    }
    public void removeOrderFromTableModel(int order_number) 
    {
        DefaultTableModel model = (DefaultTableModel) tbl_display_orders.getModel();
        for (int row = 0; row < model.getRowCount(); row++) 
        {
            int table_order_number = (int) model.getValueAt(row, 0);
            if (table_order_number == order_number) 
            {
                model.removeRow(row);
                break; // Assuming order numbers are unique, no need to continue searching
            }
        }
    }
    public Order findOrderByNumber(int selected_order_number)
    {
        for (Order order : order_queue.orders) 
        {
            if (order != null && order.getOrderNumber() == selected_order_number) 
            {
                return order;
            }
        }
        return null; // Order not found
    }
}
