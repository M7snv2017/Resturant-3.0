
package resturant;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.io.BufferedWriter;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.lang.Object;
import java.text.Format;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inventory extends javax.swing.JFrame {

    
    DefaultTableModel dtm;
    
    private JButton jbtFilter = new JButton("Filter");
    private TableRowSorter<TableModel> rowSorter;
    
    
    public Inventory() {
        
        initComponents();
        dtm = new DefaultTableModel();
        rowSorter = new TableRowSorter();
        
         
        //Date date = dateFormat.parse("31/05/2011");
        
        /*
        try {
            // String to date
           DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = (Date)formatter.parse("12/12/2023");
            jDateChooser1.setDate(date);
            
            // date to String
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(dateFormat.format(jDateChooser1.getDate()));
            
        } catch (ParseException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
       */ 
        
        String filePath = "Inventory.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(JTable_import_and_export_to_text_file.class.getName()).log(Level.SEVERE, null, ex);
          ex.printStackTrace();
        }
        jfilterBox.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        rowSorter = new TableRowSorter<> (jTable1.getModel());
        jTable1.setRowSorter(rowSorter);
    }
    
    Chef c;
    Manger m;
    
    public Inventory(Chef ch) {
        initComponents();
        c=ch;
        
        dtm = new DefaultTableModel();
        rowSorter = new TableRowSorter();
        
        
        String filePath = "Inventory.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(JTable_import_and_export_to_text_file.class.getName()).log(Level.SEVERE, null, ex);
          ex.printStackTrace();
        }
        jfilterBox.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        rowSorter = new TableRowSorter<> (jTable1.getModel());
        jTable1.setRowSorter(rowSorter);
    }
    
    public Inventory(Manger m) {
        initComponents();
        this.m=m;
        
        dtm = new DefaultTableModel();
        rowSorter = new TableRowSorter();
        
        
        String filePath = "Inventory.txt";
        File file = new File(filePath);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
          //  Logger.getLogger(JTable_import_and_export_to_text_file.class.getName()).log(Level.SEVERE, null, ex);
          ex.printStackTrace();
        }
        jfilterBox.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jfilterBox.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });
        rowSorter = new TableRowSorter<> (jTable1.getModel());

        jTable1.setRowSorter(rowSorter);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ingBox = new javax.swing.JTextField();
        qntBox = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jfilterBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updBtn = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingredients List");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        logout.setBackground(new java.awt.Color(255, 51, 0));
        logout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Back");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 0));
        jLabel2.setText("Search");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("Expire date");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Quantity");

        ingBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingBoxActionPerformed(evt);
            }
        });

        qntBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntBoxActionPerformed(evt);
            }
        });
        qntBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qntBoxKeyTyped(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 0));
        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Ingredient");

        updBtn.setBackground(new java.awt.Color(102, 102, 102));
        updBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        updBtn.setForeground(new java.awt.Color(255, 255, 255));
        updBtn.setText("Update");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(710, 710, 710)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jfilterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(96, 96, 96))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qntBox, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ingBox, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(439, 439, 439))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ingBox)
                                .addGap(1, 1, 1))
                            .addComponent(jfilterBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qntBox, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updBtn))
                .addGap(34, 34, 34))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredient", "Expire date", "Quantity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String f3 = ingBox.getText();
            //String s3 = expBox.getText();
            if(jDateChooser1.getDate() != null){
                
                String s3 = dateFormat.format(jDateChooser1.getDate());
            }
            String t3 = qntBox.getText();
            
            String em = "";
            boolean state = f3.equals(em) || jDateChooser1.getDate() == null || t3.equals(em);
        
            
            // only for the name box
        if(!state){
                int jc = jTable1.getRowCount();
                boolean addState = true;
                for(int i = 0; i < jc; i++){
                String f1 = jTable1.getValueAt(i, 0).toString();
                String f2 = ingBox.getText();
                if(f1.equals(f2)){
                    addState = false;
                    JOptionPane.showMessageDialog(this, "Item Already added");
                    break;
                  }
                 }


            if(addState) {
                String ing = ingBox.getText();
                String exp = "";
            //String exp = expBox.getText();
            if(jDateChooser1.getDate() != null){
                
                exp = dateFormat.format(jDateChooser1.getDate());
            }
            //String exp = expBox.getText();
            String qnt = qntBox.getText();


            dtm = (DefaultTableModel) jTable1.getModel();
            dtm.addRow(new Object[]{ing, exp, qnt}); 
            jTable1.setModel(dtm);
            rowSorter = new TableRowSorter<> (jTable1.getModel());
            jTable1.setRowSorter(rowSorter);

            String filePath = "Inventory.txt";

            File file = new File(filePath);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for(int i = 0; i < jTable1.getRowCount(); i++){//rows
                    for(int j = 0; j < jTable1.getColumnCount(); j++){//columns
                        bw.write(jTable1.getValueAt(i, j).toString()+" ");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            }
        } else {
            JOptionPane.showMessageDialog(this, "One or More text Box/es are empty");
        }
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
      //  System.out.println(dateFormat.format(date)); 
       // System.out.println(dateFormat.format(jDateChooser1.getDate()));
        
        
         DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //Date date = dateFormat.parse("31/05/2011");
        Date date;
        //date = (Date)formatter.parse("11/12/2023");
//        jDateChooser1.setDate(date);
        
       dtm = (DefaultTableModel) jTable1.getModel();
       
       if(jTable1.getSelectedRowCount()==1){
           
           dtm.removeRow(jTable1.getSelectedRow());
           
        ingBox.setText("");
        // old
        // expBox.setText("");
        // new
        jDateChooser1.setDate(null);
        qntBox.setText("");
           
            String filePath = "Inventory.txt";

            File file = new File(filePath);
            try {
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);

                for(int i = 0; i < jTable1.getRowCount(); i++){//rows
                    for(int j = 0; j < jTable1.getColumnCount(); j++){//columns
                        bw.write(jTable1.getValueAt(i, j).toString()+" ");
                    }
                    bw.newLine();
                }

                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
       } else {
           if (jTable1.getRowCount()==0){
               JOptionPane.showMessageDialog(this, "Table is empty");
           } else {
               JOptionPane.showMessageDialog(this, "Please Select A Single Row");
           }
       }
       
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void qntBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qntBoxActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        dtm = (DefaultTableModel) jTable1.getModel();
        
       int selectedRow = jTable1.getSelectedRow();
       
       if(jTable1.getSelectedRowCount()==1){
            
            
            String f1 = jTable1.getValueAt(selectedRow, 0).toString();
            String s1 = jTable1.getValueAt(selectedRow, 1).toString();
            String t1 = jTable1.getValueAt(selectedRow, 2).toString();
            
            String f2 = ingBox.getText();
            
            //new
            String s2 = "";
            if(jDateChooser1.getDate() != null){
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                s2 = dateFormat.format(jDateChooser1.getDate());
            }
            // old
            //String s2 = expBox.getText();
            
            String t2 = qntBox.getText();
            
            boolean state = !( (f1.equals(f2)) && (s1.equals(s2))  && (t1.equals(t2)));
            
           
           
            if(state){
           
                dtm.setValueAt(f2, selectedRow, 0);
                dtm.setValueAt(s2, selectedRow, 1);
                dtm.setValueAt(t2, selectedRow, 2);

                String filePath = "Inventory.txt";

                File file = new File(filePath);
                try {
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);

                    for(int i = 0; i < jTable1.getRowCount(); i++){//rows
                        for(int j = 0; j < jTable1.getColumnCount(); j++){//columns
                            bw.write(jTable1.getValueAt(i, j).toString()+" ");
                        }
                        bw.newLine();
                    }

                    bw.close();
                    fw.close();
                   // ""
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Change Data");
                    }
                }else {
                    if (jTable1.getRowCount()==0){
                        JOptionPane.showMessageDialog(this, "Table is empty");
                    } else {
                        JOptionPane.showMessageDialog(this, "Please Select A Single Row");
                    }
                }
    }//GEN-LAST:event_updBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        dtm = (DefaultTableModel) jTable1.getModel();
       
       int selectedRow = jTable1.getSelectedRow();
        
       if(jTable1.getSelectedRowCount()==1){
           
           
        ingBox.setText(jTable1.getValueAt(selectedRow, 0).toString());
        
        // old
        // expBox.setText(jTable1.getValueAt(selectedRow, 1).toString());
        // new date
        
            Date date;
            try {
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                date = (Date)formatter.parse(jTable1.getValueAt(selectedRow, 1).toString());
                jDateChooser1.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        qntBox.setText(jTable1.getValueAt(selectedRow, 2).toString());
        
        
       } else {
           if (jTable1.getRowCount()==0){
           } else {
               JOptionPane.showMessageDialog(this, "Please Select A Single Row");
           }
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void ingBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingBoxActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        if(c!=null)
        c.setVisible(true);
        else if(m!=null)
            m.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void qntBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntBoxKeyTyped
        char c = evt.getKeyChar();
        
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_qntBoxKeyTyped

    private void jDateChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jDateChooser1MouseExited

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField ingBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jfilterBox;
    private javax.swing.JButton logout;
    private javax.swing.JTextField qntBox;
    private javax.swing.JButton updBtn;
    // End of variables declaration//GEN-END:variables
}
