

package resturant;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Chef extends javax.swing.JFrame {

    final String[] ITEMS = {
        "shawerma", "burger", "kebab", "Nuggets", "Sheesh Tawook",
        "Chicken Wings", "Falafel", "Onion Rings", "Fries", "Cookies",
        "Water", "Kinza", "Orange Juice", "Lemon Juice", "Fruit Salad"
    }; 
    
    public Chef() {
        initComponents();
    }
    Logain l;
    public Chef(Logain lo) {
        initComponents();
        l=lo;
    }
    
    orderStatus os =new orderStatus(this);
    Inventory in =new Inventory(this);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(169, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Inventory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(169, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Order Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setForeground(new java.awt.Color(51, 51, 51));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

String orderToString(String fileName, int l) {
    StringBuilder result = new StringBuilder();
    
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        int currentLine = 0;
        
        while ((line = br.readLine()) != null) {
            currentLine++;
            if (currentLine == l) {
                String[] quantities = line.split(",");
                if (quantities.length != 15) {
                    throw new IllegalArgumentException("Line " + l + " does not have exactly 15 items.");
                }
                
                StringBuilder lineResult = new StringBuilder();
                
                for (int i = 0; i < quantities.length; i++) {
                    int quantity = Integer.parseInt(quantities[i].trim());
                    if (quantity > 0) {
                        if (lineResult.length() > 0) {
                            lineResult.append("-");
                        }
                        lineResult.append(quantity).append(" ").append(ITEMS[i]);
                    }
                }
                
                result.append(lineResult.toString());
                break; // Line found and processed, exit the loop
            }
        }
        
        if (currentLine < l) {
            throw new IllegalArgumentException("Line " + l + " does not exist in the file.");
        }
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return result.toString();
}

int fileLines(String fileName) {
    File file = new File(fileName);
    
    int lineCount = 0;
    
    // Ensure the file exists and is a file
    if (!file.exists() || !file.isFile()) {
        throw new IllegalArgumentException("The file does not exist or is not a file.");
    }
    
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
        while (reader.readLine() != null) {
            lineCount++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return lineCount;
}

boolean orderStatus(String fileName, int l) {
    boolean status = false;
    
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        int currentLine = 0;
        
        while ((line = br.readLine()) != null) {
            currentLine++;
            if (currentLine == l) {
                if (line.equalsIgnoreCase("true")) {
                    status = true;
                } else if (line.equalsIgnoreCase("false")) {
                    status = false;
                } 
                break; // Line found and processed, exit the loop
            }
        }
        
        if (currentLine < l) {
            throw new IllegalArgumentException("Line " + l + " does not exist in the file.");
        }
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return status;
}

     void read(){
        String filename = "Data.txt";
        File file = new File(filename);
        
        String filename2 = "Status.txt";
        File fileStatus = new File(filename2);
        
        if (file.exists()) {
            // File exists, read its content
            
        DefaultTableModel model = (DefaultTableModel) os.jTable1.getModel();
        String read;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            for(int i=0;i<fileLines(filename);i++)
            {
                read = (i+1)+"";
                if(fileLines(filename)>model.getRowCount())
                model.addRow(new Object[]{read, null,false});
                
            }
            for(int i=0;i<fileLines(filename);i++)
            {
                read = orderToString(filename,i+1);
                
                model.setValueAt(read, i, 1);
                
            }
            boolean r;
            for(int i=0;i<fileLines(filename2);i++)
            {
                r = orderStatus(filename2,i+1);
                
                model.setValueAt(r, i, 2);
                
            }
            
            
        } catch (IOException e) {
        }catch (Exception e) {
        }
        }
    }
    
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {

            this.setVisible(false);
            l.setVisible(true);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        read();
        this.setVisible(false);
        os.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        in.setTitle("Chef");
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chef().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
