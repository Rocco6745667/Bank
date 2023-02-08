

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.text.NumberFormat;


public class AccountApp extends javax.swing.JFrame {

    /**
     * Creates new form AccountApp
     */

    public static int selectedAccount;

    public AccountApp() throws FileNotFoundException, IOException {
        initComponents();
        accList.removeAllItems();
        AccountUtility.readAccountFile();
        for(Account account:AccountUtility.accountList){
            accList.addItem(Integer.toString(account.getAccountNum()));
        }
        addExitListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        openDate = new javax.swing.JTextField();
        depositBtn = new javax.swing.JButton();
        withdrawBtn = new javax.swing.JButton();
        transferBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        accList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Account Application");

        jLabel1.setText("Account Number:");

        jLabel2.setText("Open Date:");

        jLabel3.setText("Customer Name:");

        jLabel4.setText("Balance:");

        openDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openDateActionPerformed(evt);
            }
        });

        depositBtn.setText("Deposit");
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        withdrawBtn.setText("Withdraw");
        withdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawBtnActionPerformed(evt);
            }
        });

        transferBtn.setText("Transfer To");
        transferBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        exitBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitBtnKeyPressed(evt);
            }
        });

        accList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        accList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(accList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(depositBtn)
                                        .addComponent(withdrawBtn)
                                        .addComponent(transferBtn)
                                        .addComponent(exitBtn))
                                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(depositBtn)
                                        .addComponent(accList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(openDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(withdrawBtn))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(transferBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(exitBtn))
                                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openDateActionPerformed

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Enter a deposit amount for account " + accList.getSelectedItem().toString());
        double depositAmount = 0;
        try{
            depositAmount = Double.parseDouble(input);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid deposit amount:"+input, "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
        }
        if(depositAmount < 0) {
            JOptionPane.showMessageDialog(null, "Invalid deposit Amount: " + input, "Invalid Deposit", JOptionPane.ERROR_MESSAGE);
            return;
        }
        selectedAccount = Integer.parseInt(accList.getSelectedItem().toString());
        int selectedAccountIndex = accList.getSelectedIndex();
        Account selAcc = AccountUtility.accountList.get(selectedAccountIndex);
        new CheckingAccount(selAcc.getAccountNum(),selAcc.getDate(),selAcc.getName(),selAcc.getBalance()).deposit(depositAmount);
        balance.setText(getUsdFormat(AccountUtility.accountList.get(accList.getSelectedIndex()).getBalance()));
    }//GEN-LAST:event_depositBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void accListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accListActionPerformed
        // TODO add your handling code here:
        JComboBox cb = (JComboBox)evt.getSource();
        String temp = (String)cb.getSelectedItem();
        if(temp!=null){
            int num = Integer.parseInt(temp);
            for(int i=0;i<AccountUtility.accountList.size();i++){
                if(AccountUtility.accountList.get(i).getAccountNum() == num){
                    openDate.setText(AccountUtility.accountList.get(i).getDate());
                    cName.setText(AccountUtility.accountList.get(i).getName());
                    balance.setText(getUsdFormat(AccountUtility.accountList.get(i).getBalance()));
                    break;
                }
            }
        }
    }//GEN-LAST:event_accListActionPerformed

    private void withdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Enter a withdrawal amount for account " + accList.getSelectedItem().toString());
        double withdrawl = 0;
        try{
            withdrawl = Double.parseDouble(input);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Invalid withdrawal amount:"+input, "Invalid withdrawal", JOptionPane.ERROR_MESSAGE);
        }
        if(withdrawl < 0) JOptionPane.showMessageDialog(null, "Invalid withdrawl amount:"+input, "Invalid withdrawl.", JOptionPane.ERROR_MESSAGE);
        else{
            selectedAccount = Integer.parseInt(accList.getSelectedItem().toString());
            int selectedAccountIndex = accList.getSelectedIndex();
            Account selAcc = AccountUtility.accountList.get(selectedAccountIndex);
            new CheckingAccount(selAcc.getAccountNum(),selAcc.getDate(),selAcc.getName(),selAcc.getBalance()).withdraw(withdrawl);
            balance.setText(getUsdFormat(AccountUtility.accountList.get(accList.getSelectedIndex()).getBalance()));

        }
    }//GEN-LAST:event_withdrawBtnActionPerformed

    private void transferBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferBtnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog("Enter the beneficiary account number");
        boolean flag = false;
        int beneficiaryIndex=0;
        for(int i=0;i<AccountUtility.accountList.size();i++){
            if(Integer.parseInt(input) == AccountUtility.accountList.get(i).getAccountNum()){
                flag = true;
                beneficiaryIndex = i;
                break;
            }
        }
        // if acc num exists
        if(flag){
            String amt = JOptionPane.showInputDialog("Enter the transfer amount");
            double transferAmt = 0;
            try{
                transferAmt = Double.parseDouble(amt);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid transfer amount:"+amt, "Invalid transfer.", JOptionPane.ERROR_MESSAGE);
            }
            if(transferAmt < 0) JOptionPane.showMessageDialog(null, "Invalid transfer amount:"+amt, "Invalid transfer.", JOptionPane.ERROR_MESSAGE);
            else{
                selectedAccount = Integer.parseInt(accList.getSelectedItem().toString());
                int selectedAccountIndex = accList.getSelectedIndex();
                Account selAcc = AccountUtility.accountList.get(selectedAccountIndex);
                int result = new CheckingAccount(selAcc.getAccountNum(),selAcc.getDate(),selAcc.getName(),selAcc.getBalance()).transferTo(AccountUtility.accountList.get(beneficiaryIndex), transferAmt);

                if(result == -2) JOptionPane.showMessageDialog(null, "Transfer is unsuccessful because balance is less than transfer amount.", "Unsuccessful transfer", JOptionPane.ERROR_MESSAGE);
                else if(result == -1) JOptionPane.showMessageDialog(null, "Transfer is unsuccessful because balance is less than transfer amount and transfer fee.", "Unsuccessful transfer", JOptionPane.ERROR_MESSAGE);
                else if(result == 1) JOptionPane.showMessageDialog(null, getUsdFormat(transferAmt) +" was transferred to " + AccountUtility.accountList.get(beneficiaryIndex).getAccountNum()+"\n $2 transfer fee was appiled.", "Transfer successful", JOptionPane.INFORMATION_MESSAGE);                 else if(result == 2) JOptionPane.showMessageDialog(null, getUsdFormat(transferAmt) +" was transferred to " + AccountUtility.accountList.get(beneficiaryIndex).getAccountNum(), "Transfer successful", JOptionPane.INFORMATION_MESSAGE);

            }
            balance.setText(getUsdFormat(AccountUtility.accountList.get(accList.getSelectedIndex()).getBalance()));

        }
        else
            JOptionPane.showMessageDialog(null, "Invalid beneficiary account number: "+input, "Invalid transfer.", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_transferBtnActionPerformed

    private void exitBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitBtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnKeyPressed

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
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AccountApp().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AccountApp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AccountApp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> accList;
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cName;
    private javax.swing.JButton depositBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField openDate;
    private javax.swing.JButton transferBtn;
    private javax.swing.JButton withdrawBtn;
    // End of variables declaration//GEN-END:variables

    private void addExitListener() {
        KeyListener l = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                ;
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_X) && ((e.getModifiers() & KeyEvent.ALT_MASK) != 0)) {
                    System.exit(0);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ;
            }

        };

        jLabel1.addKeyListener(l);
        jLabel2.addKeyListener(l);
        jLabel3.addKeyListener(l);
        jLabel4.addKeyListener(l);
        cName.addKeyListener(l);
        balance.addKeyListener(l);
        openDate.addKeyListener(l);
        depositBtn.addKeyListener(l);
        withdrawBtn.addKeyListener(l);
        transferBtn.addKeyListener(l);
        exitBtn.addKeyListener(l);
        accList.addKeyListener(l);

    }
    private String getUsdFormat(double val) {
        return NumberFormat.getCurrencyInstance().format(val);
    }
}
