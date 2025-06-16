
package resturant;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;


public class Manger extends javax.swing.JFrame {

    final String[] ITEMS = {
        "shawerma", "burger", "kebab", "Nuggets", "Sheesh Tawook",
        "Chicken Wings", "Falafel", "Onion Rings", "Fries", "Cookies",
        "Water", "Kinza", "Orange Juice", "Lemon Juice", "Fruit Salad"
    };
    final int[] PRICES = {
        14, 10, 18, 20, 12, 
        8, 15, 16, 13, 25, 
        7, 19, 16, 11, 8
    };
    public Manger() {
        initComponents();
    }
    Logain l;
    public Manger(Logain lo){
    l=lo;
     initComponents();
    }
    
    OrdersReport or =new OrdersReport(this);
    Inventory in =new Inventory(this);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manger");
        setBackground(new java.awt.Color(14, 13, 13));
        setForeground(java.awt.Color.white);
        setResizable(false);

        jButton2.setBackground(new java.awt.Color(164, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Orders Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(164, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Invintory");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(74, 74, 74)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    int fileLines(String fileName) {
        File file = new File(fileName);
        int lineCount = 0;
        
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
                        throw new IllegalArgumentException("Line " + l + " does not have exactly 15 quantities.");
                    }
                    
                    StringBuilder lineResult = new StringBuilder();
                    
                    for (int i = 0; i < 15; i++) {
                        int quantity = Integer.parseInt(quantities[i]);
                        if (quantity > 0) {
                            if (lineResult.length() > 0) {
                                lineResult.append("-");
                            }
                            lineResult.append(quantity).append(" ").append(ITEMS[i]);
                        }
                    }
                    
                    result.append(lineResult.toString());
                    break;
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
    
    int salesTotal(String fileName, int lineNumber) {
        int totalSales = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int currentLine = 0;
            
            while ((line = br.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    String[] quantities = line.split(",");
                    if (quantities.length != 15) {
                        throw new IllegalArgumentException("Line " + lineNumber + " does not have exactly 15 quantities.");
                    }
                    
                    for (int i = 0; i < 15; i++) {
                        int quantity = Integer.parseInt(quantities[i]);
                        totalSales += quantity * PRICES[i];
                    }
                    break;
                }
            }
            
            if (currentLine < lineNumber) {
                throw new IllegalArgumentException("Line " + lineNumber + " does not exist in the file.");
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return totalSales;
    }
    
    
    void read(){
        String filename = "Data.txt";
        File file = new File(filename);
        
        if (file.exists()) {
            
        DefaultTableModel model = (DefaultTableModel) or.jTable1.getModel();
        String read;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            
            for(int i=0;i<fileLines(filename);i++)
            {
                read = (i+1)+"";
                if(fileLines(filename)>model.getRowCount())
                model.addRow(new Object[]{read, null, 0,0});
                
            }
            for(int i=0;i<fileLines(filename);i++)
            {
                read = orderToString(filename,i+1);
                
                model.setValueAt(read, i, 1);
                
            }
            int sum=0;
            String s="";
            for(int i=0;i<fileLines(filename);i++)
            {
                int r = salesTotal(filename,i+1);
                model.setValueAt(r, i, 2);
                sum+=r;
            }
            
            for(int i=0;i<fileLines(filename);i++)
            {
                int r = salesTotal(filename,i+1);
                model.setValueAt(r*1.15, i, 3);
                
            }
            float f=sum;       
            s=String.format("%.2f", f);
            s+=" SAR";
            or.totalSales.setText(s);
            
            s=String.format("%.2f", (f*1.15));
            s+=" SAR";
            or.vat.setText(s);
            
            s=String.format("%.2f", (f/fileLines(filename)));
            s+=" SAR";
            
            
            or.avg.setText(s);
        } catch (IOException e) {
        }catch (Exception e) {
        }
        }
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        read();
        this.setVisible(false);
        or.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        this.setVisible(false);
        in.setTitle("Manger");
        in.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {

            this.setVisible(false);
            l.setVisible(true);
        }
    }//GEN-LAST:event_LogoutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
