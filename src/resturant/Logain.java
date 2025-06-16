package resturant;

import java.awt.Image;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Logain extends javax.swing.JFrame {


    public Logain() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("/restaurant.png")).getImage();
        this.setIconImage(icon);
        
        
    }
    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logain().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LCasherR = new javax.swing.JRadioButton();
        LChefR = new javax.swing.JRadioButton();
        LMangerR = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Logain");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1223, 729));

        jPanel1.setBackground(new java.awt.Color(149, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        LCasherR.setBackground(new java.awt.Color(145, 0, 0));
        LCasherR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LCasherR.setForeground(new java.awt.Color(255, 255, 255));
        LCasherR.setText("Cashier");
        LCasherR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LCasherRActionPerformed(evt);
            }
        });

        LChefR.setBackground(new java.awt.Color(145, 0, 0));
        LChefR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LChefR.setForeground(new java.awt.Color(255, 255, 255));
        LChefR.setText("Chef");
        LChefR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LChefRActionPerformed(evt);
            }
        });

        LMangerR.setBackground(new java.awt.Color(145, 0, 0));
        LMangerR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LMangerR.setForeground(new java.awt.Color(255, 255, 255));
        LMangerR.setText("Manager");
        LMangerR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMangerRActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resturant   3.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(LMangerR)
                    .addComponent(LChefR)
                    .addComponent(LCasherR)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(LCasherR)
                .addGap(18, 18, 18)
                .addComponent(LChefR)
                .addGap(18, 18, 18)
                .addComponent(LMangerR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name");

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(LCasherR.isSelected()==true)
            {
                LogainCasher();
        }
        else if(LChefR.isSelected()==true)    
            {
                LogainChef();
        }
        else if(LMangerR.isSelected()==true)
            {
                LogainManger();
        }else{
           
            JOptionPane.showMessageDialog(null, "You did not select any user!");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LCasherRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LCasherRActionPerformed
        if (LCasherR.isSelected()==true)
        {
            LMangerR.setSelected(false);
            LChefR.setSelected(false);
            jTextField1.setText("");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_LCasherRActionPerformed

    private void LChefRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LChefRActionPerformed
        if (LChefR.isSelected()==true)
        {
            LMangerR.setSelected(false);
            LCasherR.setSelected(false);
            jTextField1.setText("");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_LChefRActionPerformed

    private void LMangerRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMangerRActionPerformed
        if (LMangerR.isSelected()==true)
        {
            LChefR.setSelected(false);
            LCasherR.setSelected(false);
            jTextField1.setText("");
            jTextField2.setText("");
        }
    }//GEN-LAST:event_LMangerRActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

public Item it1 = new Item("Shawerma", 14);
public Item it2 = new Item("Burger", 10);
public Item it3 = new Item("Kebab", 18);
public Item it4 = new Item("Nuggets", 20);
public Item it5 = new Item("Sheesh Tawook", 12);
public Item it6 = new Item("Chicken Wings", 8);
public Item it7 = new Item("Falafel", 15);
public Item it8 = new Item("Onion Rings", 16);
public Item it9 = new Item("Fries", 13);
public Item it10 = new Item("Cookies", 25);
public Item it11 = new Item("Water", 7);
public Item it12 = new Item("Kinza", 19);
public Item it13 = new Item("Orange Juice", 16);
public Item it14 = new Item("Lemon Juice", 11);
public Item it15 = new Item("Fruit Salad", 8);

Casher c=new Casher(this);


    void LogainCasher()
    {
        String filename = "Casher.txt";
        File file = new File(filename);
        
        
        
        if (file.exists()) {
            // File exists, read its content
            String expectedUsername = jTextField1.getText();
        String expectedPassword = jTextField2.getText();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            String username = reader.readLine();
            String password = reader.readLine();
            if (username != null && password != null) {
                
                if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
                    
                    JOptionPane.showMessageDialog(null, "Login successful.");
                    
                    this.setVisible(false);
                   
                    // Set the text of each button to display the name and price of the corresponding item
                    c.Item1.setText(it1.Item + "      " + it1.Price);
                    c.Item2.setText(it2.Item + "      " + it2.Price);
                    c.Item3.setText(it3.Item + "      " + it3.Price);
                    c.Item4.setText(it4.Item + "      " + it4.Price);
                    c.Item5.setText(it5.Item + "   " + it5.Price);
                    c.Item6.setText(it6.Item + "      " + it6.Price);
                    c.Item7.setText(it7.Item + "      " + it7.Price);
                    c.Item8.setText(it8.Item + "      " + it8.Price);
                    c.Item9.setText(it9.Item + "      " + it9.Price);
                    c.Item10.setText(it10.Item + "      " + it10.Price);
                    c.Item11.setText(it11.Item + "      " + it11.Price);
                    c.Item12.setText(it12.Item + "      " + it12.Price);
                    c.Item13.setText(it13.Item + "      " + it13.Price);
                    c.Item14.setText(it14.Item + "      " + it14.Price);
                    c.Item15.setText(it15.Item + "      " + it15.Price);
                    
                    c.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't contain both username and password.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }
        } 
        
        else {
            // File doesn't exist, create it and write to it
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(jTextField1.getText()+"\n");
                writer.write(jTextField2.getText());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }
        }
    }
    
    void LogainChef()
    {
    String filename = "Chef.txt";
        File file = new File(filename);
        
        
        
        if (file.exists()) {
            // File exists, read its content
            String expectedUsername = jTextField1.getText();
        String expectedPassword = jTextField2.getText();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            String username = reader.readLine();
            String password = reader.readLine();
            if (username != null && password != null) {
                
                if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
                    
                    JOptionPane.showMessageDialog(null, "Login successful.");
                    this.setVisible(false);
                    ch.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't contain both username and password.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }
        } 
        
        else {
            // File doesn't exist, create it and write to it
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(jTextField1.getText()+"\n");
                writer.write(jTextField2.getText());
                JOptionPane.showMessageDialog(null, "File '" + filename + "' created and content written.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }
        }
    }
    Chef ch=new Chef(this);
Manger m =new Manger(this);
    
    void LogainManger()
    {
        String filename = "Manger.txt";
        File file = new File(filename);
        
        
        
        if (file.exists()) {
            // File exists, read its content
            String expectedUsername = jTextField1.getText();
        String expectedPassword = jTextField2.getText();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            String username = reader.readLine();
            String password = reader.readLine();
            if (username != null && password != null) {
                
                if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
                    
                    JOptionPane.showMessageDialog(null, "Login successful.");
                    this.setVisible(false);
                    m.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "File doesn't contain both username and password.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
        }
        } 
        
        else {
            // File doesn't exist, create it and write to it
            try (FileWriter writer = new FileWriter(file)) {
                writer.write(jTextField1.getText()+"\n");
                writer.write(jTextField2.getText());
                JOptionPane.showMessageDialog(null, "File '" + filename + "' created and content written.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
            }
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton LCasherR;
    private javax.swing.JRadioButton LChefR;
    private javax.swing.JRadioButton LMangerR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
