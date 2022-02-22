
package gui_form;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Register_ extends javax.swing.JFrame {

    
    public Register_() {
        initComponents();
        addchoiceitem();
        addDay();
        addyear();
    }

    
    private void addDay(){
    Day.add("Date");    
    Day.add("01");
    Day.add("02");
    Day.add("03");
    Day.add("04");
    Day.add("05");
    Day.add("06");
    Day.add("07");
    Day.add("08");
    Day.add("09");
    Day.add("10");
    Day.add("11");
    Day.add("12");
    Day.add("13");
    Day.add("14");
    Day.add("15");
    Day.add("16");
    Day.add("17");
    Day.add("18");
    Day.add("19");
    Day.add("20");
    Day.add("21");
    Day.add("22");
    Day.add("23");
    Day.add("24");
    Day.add("25");
    Day.add("26");
    Day.add("27");
    Day.add("28");
    Day.add("29");
    Day.add("30");
    Day.add("31");
    }
    
   private void addchoiceitem(){
    Month.add("Month");
    Month.add("January");
    Month.add("February");
    Month.add("March");
    Month.add("April");
    Month.add("May");
    Month.add("June");
    Month.add("July");
    Month.add("August");
    Month.add("September");
    Month.add("October");
    Month.add("November");
    Month.add("December");
    }
    
    
    private void addyear(){
    Year.add("Year");
    Year.add("2021");
    Year.add("2020");
    Year.add("2019");
    Year.add("2018");
    Year.add("2017");
    Year.add("2016");
    Year.add("2015");
    Year.add("2014");
    Year.add("2013");
    Year.add("2012");
    Year.add("2011");
    Year.add("2010");
    Year.add("2009");
    Year.add("2008");
    Year.add("2007");
    Year.add("2006");
    Year.add("2005");
    Year.add("2004");
    Year.add("2003");
    Year.add("2002");
    Year.add("2001");
    Year.add("2000");
    Year.add("1999"); 
        Year.add("1998");        
    Year.add("1997");        
    Year.add("1996");        
    Year.add("1995");        
    Year.add("1994");        
    Year.add("1993");        
    Year.add("1992");        
    Year.add("1991");        
    Year.add("1990");        
    Year.add("1989");        
    Year.add("1988");        
    Year.add("1987");        
    Year.add("1986");        
    Year.add("1985");        
    Year.add("1984");        

    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    public void check(){
    
       if("Date".equals(Day.getSelectedItem()) && "Month".equals(Month.getSelectedItem()) && "Year".equals(Year.getSelectedItem())){
         show_validation_.setText("Date of birth not selected");
        }
        
        else if("Date".equals(Day.getSelectedItem())){
        show_validation_.setText("Date not selected");
        }
        
        else if("Month".equals(Month.getSelectedItem())){
        show_validation_.setText("Month not selected");
        }
        
        else if("Year".equals(Year.getSelectedItem())){
         show_validation_.setText("Year not selected");
        }
       
        else{
        
        }
    }
    
    public void minimize(){
    final JFrame frame = new JFrame();
      frame.setState(Frame.ICONIFIED);
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show_validation = new javax.swing.JLabel();
        show_validation1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Agreebox = new javax.swing.JCheckBox();
        show_validation_ = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        password1 = new javax.swing.JPasswordField();
        Signin = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        Month = new java.awt.Choice();
        Day = new java.awt.Choice();
        Year = new java.awt.Choice();
        Email2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Terms = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Condition = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        show_validation.setForeground(new java.awt.Color(255, 0, 51));

        show_validation1.setForeground(new java.awt.Color(255, 0, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 220, 196));
        jPanel1.setPreferredSize(new java.awt.Dimension(962, 484));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_form/Untitled-2.png"))); // NOI18N

        Email.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(144, 64, 0));
        Email.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(144, 64, 0));
        jLabel7.setText("New Password:");

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(144, 64, 0));
        jLabel8.setText("Confirm Passwod:");

        Agreebox.setBorder(null);
        Agreebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeboxActionPerformed(evt);
            }
        });

        show_validation_.setForeground(new java.awt.Color(204, 51, 0));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(156, 102, 68));
        jLabel10.setText("Already have an account?");

        fname.setBackground(new java.awt.Color(249, 220, 196));
        fname.setText("Username");
        fname.setBorder(null);
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });

        password.setBackground(new java.awt.Color(249, 220, 196));
        password.setText("********");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });

        password1.setBackground(new java.awt.Color(249, 220, 196));
        password1.setText("********");
        password1.setBorder(null);
        password1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password1FocusLost(evt);
            }
        });
        password1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password1KeyTyped(evt);
            }
        });

        Signin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Signin.setForeground(new java.awt.Color(156, 102, 68));
        Signin.setText("Sign in");
        Signin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigninMouseClicked(evt);
            }
        });

        Signup.setBackground(new java.awt.Color(116, 15, 43));
        Signup.setFont(new java.awt.Font("Krabby Patty", 0, 18)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 248, 239));
        Signup.setText("Sign up");
        Signup.setToolTipText("");
        Signup.setBorder(null);
        Signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });

        Month.setBackground(new java.awt.Color(249, 220, 196));

        Day.setBackground(new java.awt.Color(249, 220, 196));

        Year.setBackground(new java.awt.Color(249, 220, 196));

        Email2.setBackground(new java.awt.Color(249, 220, 196));
        Email2.setText("Email");
        Email2.setBorder(null);
        Email2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Email2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Email2FocusLost(evt);
            }
        });
        Email2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email2ActionPerformed(evt);
            }
        });
        Email2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Email2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(144, 64, 0));
        jLabel4.setText("  Date of birth:");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(144, 64, 0));
        jLabel5.setText("Username:");

        jLabel6.setFont(new java.awt.Font("Krabby Patty", 0, 31)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(147, 73, 2));
        jLabel6.setText("Details");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("I agree to the ");

        Terms.setForeground(new java.awt.Color(0, 153, 255));
        Terms.setText("Terms");
        Terms.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Terms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TermsMouseClicked(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("&");

        Condition.setForeground(new java.awt.Color(0, 153, 255));
        Condition.setText("Conditions");
        Condition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Condition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConditionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Email)
                                            .addComponent(jLabel5))
                                        .addGap(73, 73, 73)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator2)
                                            .addComponent(Email2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                            .addComponent(fname)
                                            .addComponent(jSeparator1)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(show_validation_, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agreebox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Terms)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Condition)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Signin))
                                    .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Agreebox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(Terms)
                        .addComponent(jLabel12)
                        .addComponent(Condition)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(show_validation_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Signin))
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        char[] pass = password1.getPassword();
        char[] pass2 = password.getPassword();
        
        boolean pas = Arrays.equals(pass, pass2);
        
        if((fname.getText().equals("Username") && Email2.getText().equals("Email") && password.getText().equals("********") && password1.getText().equals("********") )){
            show_validation_.setText("Field(s) are empty");
            fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            Email2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            password1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));

        }
        else if(fname.getText().equals("Username")){
            show_validation_.setText("Username is required");
            fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        
        else if(Email2.getText().equals("Email")){
        show_validation_.setText("Email is required");
        Email2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        
        else if(password.getText().equals("********")&& password1.getText().equals("********")){
            show_validation_.setText("Password is required ");
            password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            password1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        
      
        
        else if(password.getText().equals("********")){
            show_validation_.setText("Password is required ");
            password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        else if(password1.getText().equals("********")){
            show_validation_.setText("Confirm Password");
            password1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        }
        else if(pas==false){
        show_validation_.setText("Password does not match");
        }
      
        else if(Agreebox.isSelected()){
//          show_validation_.setText("");
          show_validation_.setText("");
          check();
         
         
        }
//        else if("Date".equals(Day.getSelectedItem()) && "Month".equals(Month.getSelectedItem()) && "Year".equals(Year.getSelectedItem())){
//         show_validation_.setText("Date of birth not selected");
//        }
//        
//        else if("Date".equals(Day.getSelectedItem())){
//        show_validation_.setText("Date not selected");
//        }
//        
//        else if("Month".equals(Month.getSelectedItem())){
//        show_validation_.setText("Month not selected");
//        }
//        
//        else if("Year".equals(Year.getSelectedItem())){
//         show_validation_.setText("Year not selected");
//        }
        
        
        else {
           
            Agreebox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
            show_validation_.setText("Checkbox not selected");
            check();
        }
    }//GEN-LAST:event_SignupActionPerformed

    private void SignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupMouseClicked
        // TODO add your handling code here:
        if(show_validation_.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Welcome user");
        }
     
        
    }//GEN-LAST:event_SignupMouseClicked

    private void SigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninMouseClicked
        // TODO add your handling code here:
        new PA5_FORM().setVisible(true);
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }//GEN-LAST:event_SigninMouseClicked

    private void AgreeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgreeboxActionPerformed

    private void Email2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email2ActionPerformed

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        // TODO add your handling code here:
        fname.setBorder(null);
        fname.setForeground(new Color(187,187,187));
         if(fname.getText().equals("Username")){
         fname.setText("");
        
         }
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
        // TODO add your handling code here:
        
          fname.setBorder(null);
        
        if(fname.getText().trim().isEmpty()){
        fname.setText("Username");
        
        fname.setForeground(new Color(187,187,187));
        }
    }//GEN-LAST:event_fnameFocusLost

    private void Email2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email2FocusGained
        // TODO add your handling code here:
     Email2.setBorder(null);
     Email2.setForeground(new Color(187,187,187));
         if(Email2.getText().equals("Email")){
         Email2.setText("");
        
         }   
    }//GEN-LAST:event_Email2FocusGained

    private void Email2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email2FocusLost
        // TODO add your handling code here:
            Email2.setBorder(null);
       
        if(Email2.getText().trim().isEmpty()){
        Email2.setText("Email");
        
        Email2.setForeground(new Color(187,187,187));
        }
    }//GEN-LAST:event_Email2FocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
          password.setBorder(null);
       if(password.getText().equals("********"))
       password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
            password.setBorder(null);
       if(password.getText().trim().isEmpty()){
        password.setText("********");
        password.setForeground(new Color(187,187,187));
       }
    }//GEN-LAST:event_passwordFocusLost

    private void password1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusGained
        // TODO add your handling code here:
          password1.setBorder(null);
       if(password1.getText().equals("********"))
       password1.setText("");
    }//GEN-LAST:event_password1FocusGained

    private void password1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password1FocusLost
        // TODO add your handling code here:
                password1.setBorder(null);
       if(password1.getText().trim().isEmpty()){
        password1.setText("********");
        password1.setForeground(new Color(187,187,187));
       }
    }//GEN-LAST:event_password1FocusLost

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
    
         fname.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_fnameKeyTyped

    private void Email2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Email2KeyTyped
        // TODO add your handling code here:
         Email2.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_Email2KeyTyped

    private void passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyTyped
        // TODO add your handling code here:
         password.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_passwordKeyTyped

    private void password1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1KeyTyped
        // TODO add your handling code here:
         password1.setForeground(new Color(116, 15, 43));
    }//GEN-LAST:event_password1KeyTyped

    private void TermsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TermsMouseClicked
        // TODO add your handling code here:
     try {
         
        Desktop.getDesktop().browse(new URI("https://www.spongebobshop.com/pages/terms-of-use"));
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_TermsMouseClicked

    private void ConditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConditionMouseClicked
        // TODO add your handling code here:
        
         try {
         
        Desktop.getDesktop().browse(new URI("https://www.spongebobshop.com/pages/spongebob-shop-giveaway-terms-conditions-1"));
        minimize();
         
    } catch (IOException | URISyntaxException e1) {
        e1.printStackTrace();
    }
    }//GEN-LAST:event_ConditionMouseClicked

    
    
    
    
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Register_().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Agreebox;
    private javax.swing.JLabel Condition;
    private java.awt.Choice Day;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField Email2;
    private java.awt.Choice Month;
    private javax.swing.JLabel Signin;
    private javax.swing.JButton Signup;
    private javax.swing.JLabel Terms;
    private java.awt.Choice Year;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel show_validation;
    private javax.swing.JLabel show_validation1;
    private javax.swing.JLabel show_validation_;
    // End of variables declaration//GEN-END:variables
}
