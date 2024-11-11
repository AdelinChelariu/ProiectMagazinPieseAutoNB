import java.awt.*;
import javax.swing.*;


public class GUIForm extends javax.swing.JFrame {

    public GUIForm() {
        initComponents();
        initLoginPanel();
    }
    
    public void initLoginPanel(){
        titleLabel.setFont(new Font("Arial", Font.BOLD, 35));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setVerticalAlignment(SwingConstants.CENTER);
        loginPanel.add(titleLabel);
        
        
    }

    private void clearField(JTextField text) {
        text.setText(""); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        loginUsernameTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        titleLabel.setText("Master of Pieces");

        loginUsernameTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginUsernameTextField.setText("username");
        loginUsernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginUsernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsernameTextFieldFocusLost(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(titleLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(262, 262, 262))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGap(122, 122, 122)
                .addComponent(loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUsernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameTextFieldFocusGained
        if(loginUsernameTextField.getText().equals("username")){
            clearField(loginUsernameTextField);
            loginUsernameTextField.setForeground(Color.BLACK);
         }
    }//GEN-LAST:event_loginUsernameTextFieldFocusGained

    private void loginUsernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameTextFieldFocusLost
        if(loginUsernameTextField.getText().equals("")){
             loginUsernameTextField.setForeground(Color.LIGHT_GRAY);
            loginUsernameTextField.setText("username");
        }
    }//GEN-LAST:event_loginUsernameTextFieldFocusLost

    
    public static void main(String args[]) {
        JDBC.getConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIForm frame = new GUIForm();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField loginUsernameTextField;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
