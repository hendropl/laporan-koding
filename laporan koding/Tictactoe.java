
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TUF
 */
public class Tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form Tictactoe
     */
    int giliran = 2;
    int btnused [] = {0,0,0,0,0,0,0,0,0};
    int x [] = {0,0,0,0,0,0,0,0,0};
    int o [] = {0,0,0,0,0,0,0,0,0};
    
    int xwon (){
        if(x[0]==1 && x[1] ==1 && x[2] ==1){
            return 1;
        }
         if(x[3]==1 && x[4] ==1 && x[5] ==1){
            return 1;
        }
          if(x[6]==1 && x[7] ==1 && x[8] ==1){
            return 1;
        }
           if(x[0]==1 && x[3] ==1 && x[6] ==1){
            return 1;
        }
            if(x[1]==1 && x[4] ==1 && x[7] ==1){
            return 1;
        }
             if(x[2]==1 && x[5] ==1 && x[8] ==1){
            return 1;
        }
              if(x[2]==1 && x[4] ==1 && x[6] ==1){
            return 1;
        }
               if(x[0]==1 && x[4] ==1 && x[8] ==1){
            return 1;
        }
                return 0;
                
    }
    
        int owon (){
        if(o[0]==1 && o[1] ==1 && o[2] ==1){
            return 1;
        }
         if(o[3]==1 && o[4] ==1 && o[5] ==1){
            return 1;
        }
          if(o[6]==1 && o[7] ==1 && o[8] ==1){
            return 1;
        }
           if(o[0]==1 && o[3] ==1 && o[6] ==1){
            return 1;
        }
            if(o[1]==1 && o[4] ==1 && o[7] ==1){
            return 1;
        }
             if(o[2]==1 && o[5] ==1 && o[8] ==1){
            return 1;
        }
              if(o[2]==1 && o[4] ==1 && o[6] ==1){
            return 1;
        }
               if(o[0]==1 && o[4] ==1 && o[8] ==1){
            return 1;
        }
                return 0;
                
    }

    public Tictactoe(){
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

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)
                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        if(btnused[8]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn9.setText("X");
            btnused[8]=1;
              x [8] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn9.setText("O");
            btnused[8]=1;
             o [8] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Hanya dapat sekali");
        }
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        if(btnused[0]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn1.setText("X");
            btnused[0]=1;
            x [0] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn1.setText("O");
            btnused[0]=1;
            o [0] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
            
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(btnused[2]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn3.setText("X");
            btnused[2]=1;
              x [2] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn3.setText("O");
            btnused[2]=1;
             o[2] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        if(btnused[5]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn6.setText("X");
            btnused[5]=1;
              x [5] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn6.setText("O");
            btnused[5]=1;
             o[5] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        if(btnused[6]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn7.setText("X");
            btnused[6]=1;
              x [6] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn7.setText("O");
            btnused[6]=1;
             o[6] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        if(btnused[1]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn2.setText("X");
            btnused[1]=1;
             x [1] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn2.setText("O");
            btnused[1]=1;
             o [1] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        if(btnused[4]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn5.setText("X");
            btnused[4]=1;
             x [4] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn5.setText("O");
            btnused[4]=1;
             o [4] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        if(btnused[3]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn4.setText("X");
            btnused[3]=1;
            x [3] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
            
        }
        else{
            giliran++;
            btn4.setText("O");
            btnused[3]=1;
             o [3] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        if(btnused[7]==0){
            
        if(giliran % 2 == 0){
            giliran++;
            btn8.setText("X");
            btnused[7]=1;
              x [7] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }
        }
        else{
            giliran++;
            btn8.setText("O");
            btnused[7]=1;
             o [7] = 1;
            
            int hasil1= xwon();
            int hasil2= owon();
            if(hasil1 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden X");
            }
            if(hasil2 == 1){
                JOptionPane.showMessageDialog(rootPane,"JP nden O");
        }

        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Jadilah dak");
        }
    }//GEN-LAST:event_btn8ActionPerformed

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
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    // End of variables declaration//GEN-END:variables
}
