
package gui_form;

import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;



public class PA5_FORM extends javax.swing.JFrame {

Connection conn= null;

    public PA5_FORM() {
        initComponents();
     
    }

    
  
  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Pwrdl = new javax.swing.JPasswordField();
        Uname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sihn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        show_validation = new javax.swing.JLabel();
        toggle = new javax.swing.JToggleButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 220, 196));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/Stulton_Coffee__1_-removebg-preview-Recovered.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(249, 220, 196));

        Pwrdl.setBackground(new java.awt.Color(249, 220, 196));
        Pwrdl.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        Pwrdl.setText("********");
        Pwrdl.setBorder(null);
        Pwrdl.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PwrdlFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PwrdlFocusLost(evt);
            }
        });
        Pwrdl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PwrdlActionPerformed(evt);
            }
        });
        Pwrdl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PwrdlKeyTyped(evt);
            }
        });

        Uname.setBackground(new java.awt.Color(249, 220, 196));
        Uname.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Uname.setText("Username/Email");
        Uname.setBorder(null);
        Uname.setCaretColor(new java.awt.Color(0, 0, 0));
        Uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UnameFocusLost(evt);
            }
        });
        Uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnameActionPerformed(evt);
            }
        });
        Uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UnameKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Krabby Patty", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(116, 15, 43));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/icons8-user-38.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Krabby Patty", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(116, 15, 43));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/icons8-password-32.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Krabby Patty", 0, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(116, 15, 43));
        jLabel4.setText("Welcome");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("forgot password?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Sihn.setBackground(new java.awt.Color(116, 15, 43));
        Sihn.setFont(new java.awt.Font("Krabby Patty", 0, 18)); // NOI18N
        Sihn.setForeground(new java.awt.Color(255, 248, 239));
        Sihn.setText("Sign in");
        Sihn.setToolTipText("");
        Sihn.setBorder(null);
        Sihn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sihn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SihnMouseClicked(evt);
            }
        });
        Sihn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SihnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(156, 102, 68));
        jLabel6.setText("Don't have an account yet?");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        Register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Register.setForeground(new java.awt.Color(156, 102, 68));
        Register.setText("Register");
        Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegisterMouseMoved(evt);
            }
        });
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        show_validation.setForeground(new java.awt.Color(255, 0, 51));

        toggle.setBackground(new java.awt.Color(249, 220, 196));
        toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/icons8-hide-32 (1).png"))); // NOI18N
        toggle.setBorder(null);
        toggle.setBorderPainted(false);
        toggle.setContentAreaFilled(false);
        toggle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toggleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Sihn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Uname)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(show_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Pwrdl, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(toggle)
                                    .addGap(3, 3, 3))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Register))))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(Pwrdl, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(toggle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(show_validation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sihn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Register))
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
    
    
    
    
    private void UnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnameActionPerformed

    private void PwrdlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PwrdlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PwrdlActionPerformed

    private void SihnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SihnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SihnMouseClicked

    private void RegisterMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterMouseMoved

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked

          new Register_().setVisible(true);
         WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
        
        
    }//GEN-LAST:event_RegisterMouseClicked

    private void SihnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SihnActionPerformed
      
        
        
        
        
        
        if(Uname.getText().equals("Username/Email") && Pwrdl.getText().equals("********")){
            show_validation.setText("Field(s) are empty");
            Uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            Pwrdl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            
            
        }
        else if(Uname.getText().equals("Username/Email")){
             show_validation.setText("Username/Email is required ");
             Uname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        else if(Pwrdl.getText().equals("********")){
          show_validation.setText("Password is required ");
          Pwrdl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
      else if(Uname.getText().equals("Shelton") || (Uname.getText().equals("macbookf1566@gmail.com")) && Pwrdl.getPassword().equals("chowgules") ){
    JOptionPane.showMessageDialog(null,"Welcome back");
    Uname.setText("");
    Pwrdl.setText("");
    }
        else {
         show_validation.setText("");
        }
    }//GEN-LAST:event_SihnActionPerformed

 
    
           
    
    private void UnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UnameFocusGained
        // TODO add your handling code hasdere:
         Uname.setBorder(null);
         
         if(Uname.getText().equals("Username/Email")){
         Uname.setText("");
        
         }
                
    }//GEN-LAST:event_UnameFocusGained

    private void UnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UnameFocusLost
        // TODO add your handling code here:
        Uname.setBorder(null);
        
        if(Uname.getText().trim().isEmpty()){
        Uname.setText("Username/Email");
        
        Uname.setForeground(new Color(187,187,187));
        }
        
    }//GEN-LAST:event_UnameFocusLost

    private void PwrdlFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PwrdlFocusGained
       Pwrdl.setBorder(null);
       if(Pwrdl.getText().equals("********"))
       Pwrdl.setText("");
    }//GEN-LAST:event_PwrdlFocusGained

    
    private void PwrdlFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PwrdlFocusLost
       
          Pwrdl.setBorder(null);
       if(Pwrdl.getText().trim().isEmpty()){
        Pwrdl.setText("********");
        Pwrdl.setForeground(new Color(187,187,187));
       }
       
        
    }//GEN-LAST:event_PwrdlFocusLost

    private void UnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnameKeyTyped
 
        Uname.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_UnameKeyTyped

    private void PwrdlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PwrdlKeyTyped
  
         Pwrdl.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_PwrdlKeyTyped

    private void toggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toggleMouseClicked
    
        if(toggle.isSelected()){
        toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/icons8-eye-32.png"))); // NOI18N    
       
        Pwrdl.setEchoChar((char)0);
        }
        else{
        toggle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/icons8-hide-32 (1).png"))); // NOI18N
        Pwrdl.setEchoChar('*');
        }
        
         
    }//GEN-LAST:event_toggleMouseClicked

   
    public static void main(String args[]) {
    
        
        MyConnection can = new MyConnection();
        
        can.getConnection();
        
        java.awt.EventQueue.invokeLater(() -> {
            new PA5_FORM().setVisible(true);
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pwrdl;
    private javax.swing.JLabel Register;
    private javax.swing.JButton Sihn;
    public javax.swing.JTextField Uname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel show_validation;
    private javax.swing.JToggleButton toggle;
    // End of variables declaration//GEN-END:variables

  
}

