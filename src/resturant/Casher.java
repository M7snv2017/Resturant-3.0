package resturant;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Casher extends javax.swing.JFrame {

    public Casher() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        Item1 = new javax.swing.JButton();
        Item2 = new javax.swing.JButton();
        Item3 = new javax.swing.JButton();
        Item4 = new javax.swing.JButton();
        Item5 = new javax.swing.JButton();
        Item6 = new javax.swing.JButton();
        Item7 = new javax.swing.JButton();
        Item8 = new javax.swing.JButton();
        Item12 = new javax.swing.JButton();
        Item11 = new javax.swing.JButton();
        Item9 = new javax.swing.JButton();
        Item13 = new javax.swing.JButton();
        Item14 = new javax.swing.JButton();
        Item10 = new javax.swing.JButton();
        Item15 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        print = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        SumL = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casher");
        setMinimumSize(new java.awt.Dimension(1357, 777));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane2.setAutoscrolls(true);

        Item1.setBackground(new java.awt.Color(186, 0, 0));
        Item1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item1.setForeground(new java.awt.Color(255, 255, 255));
        Item1.setText("Shawerma");
        Item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item1ActionPerformed(evt);
            }
        });

        Item2.setBackground(new java.awt.Color(186, 0, 0));
        Item2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item2.setForeground(new java.awt.Color(255, 255, 255));
        Item2.setText("Shawerma");
        Item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item2ActionPerformed(evt);
            }
        });

        Item3.setBackground(new java.awt.Color(186, 0, 0));
        Item3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item3.setForeground(new java.awt.Color(255, 255, 255));
        Item3.setText("Shawerma");
        Item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item3ActionPerformed(evt);
            }
        });

        Item4.setBackground(new java.awt.Color(186, 0, 0));
        Item4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item4.setForeground(new java.awt.Color(255, 255, 255));
        Item4.setText("Shawerma");
        Item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item4ActionPerformed(evt);
            }
        });

        Item5.setBackground(new java.awt.Color(186, 0, 0));
        Item5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Item5.setForeground(new java.awt.Color(255, 255, 255));
        Item5.setText("Shawerma");
        Item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item5ActionPerformed(evt);
            }
        });

        Item6.setBackground(new java.awt.Color(186, 0, 0));
        Item6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Item6.setForeground(new java.awt.Color(255, 255, 255));
        Item6.setText("Shawerma");
        Item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item6ActionPerformed(evt);
            }
        });

        Item7.setBackground(new java.awt.Color(186, 0, 0));
        Item7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item7.setForeground(new java.awt.Color(255, 255, 255));
        Item7.setText("Shawerma");
        Item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item7ActionPerformed(evt);
            }
        });

        Item8.setBackground(new java.awt.Color(186, 0, 0));
        Item8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Item8.setForeground(new java.awt.Color(255, 255, 255));
        Item8.setText("Shawerma");
        Item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item8ActionPerformed(evt);
            }
        });

        Item12.setBackground(new java.awt.Color(186, 0, 0));
        Item12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item12.setForeground(new java.awt.Color(255, 255, 255));
        Item12.setText("Shawerma");
        Item12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item12ActionPerformed(evt);
            }
        });

        Item11.setBackground(new java.awt.Color(186, 0, 0));
        Item11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item11.setForeground(new java.awt.Color(255, 255, 255));
        Item11.setText("Shawerma");
        Item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item11ActionPerformed(evt);
            }
        });

        Item9.setBackground(new java.awt.Color(186, 0, 0));
        Item9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item9.setForeground(new java.awt.Color(255, 255, 255));
        Item9.setText("Shawerma");
        Item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item9ActionPerformed(evt);
            }
        });

        Item13.setBackground(new java.awt.Color(186, 0, 0));
        Item13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Item13.setForeground(new java.awt.Color(255, 255, 255));
        Item13.setText("Shawerma");
        Item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item13ActionPerformed(evt);
            }
        });

        Item14.setBackground(new java.awt.Color(186, 0, 0));
        Item14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Item14.setForeground(new java.awt.Color(255, 255, 255));
        Item14.setText("Shawerma");
        Item14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item14ActionPerformed(evt);
            }
        });

        Item10.setBackground(new java.awt.Color(186, 0, 0));
        Item10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item10.setForeground(new java.awt.Color(255, 255, 255));
        Item10.setText("Shawerma");
        Item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item10ActionPerformed(evt);
            }
        });

        Item15.setBackground(new java.awt.Color(186, 0, 0));
        Item15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item15.setForeground(new java.awt.Color(255, 255, 255));
        Item15.setText("Shawerma");
        Item15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item15ActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(Item1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(Item15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Item14, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item15, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item14, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Item15, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
        );

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Q", "Item", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setAutoscrolls(false);
        jTable1.setMinimumSize(new java.awt.Dimension(200, 0));
        jTable1.setRowHeight(35);
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        print.setBackground(new java.awt.Color(204, 204, 204));
        print.setForeground(new java.awt.Color(51, 51, 51));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setText("Total: ");

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setForeground(new java.awt.Color(51, 51, 51));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        SumL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SumL.setForeground(new java.awt.Color(0, 0, 0));

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setForeground(new java.awt.Color(51, 51, 51));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SumL, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SumL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Add items");

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setForeground(new java.awt.Color(51, 51, 51));
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(Logout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Logout)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public boolean OrderConfirme=false;
    Logain l;
    public Casher(Logain l)
    {
        initComponents();
        this.l=l; 
    }
    
    
    void sum() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int rowCount = model.getRowCount();
    int total = 0;
    
    // Iterate through each row
    for (int i = 0; i < rowCount; i++) {
        // Get the value from the third column (index 2) of the current row
        int value = (int) model.getValueAt(i, 2);
        total += value; // Add the value to the total sum
    }
    
    // Set the total sum to the label
    SumL.setText(Integer.toString(total));
}
    Item find(String s){
        
        if(s.equals(l.it1.Item))
        {return l.it1;}
        else if(s.equals(l.it2.Item))
        {return l.it2;}
        else if(s.equals(l.it3.Item))
        {return l.it3;}
        else if(s.equals(l.it4.Item))
        {return l.it4;}
        else if(s.equals(l.it5.Item))
        {return l.it5;}
        else if(s.equals(l.it6.Item))
        {return l.it6;}
        else if(s.equals(l.it7.Item))
        {return l.it7;}
        else if(s.equals(l.it8.Item))
        {return l.it8;}
        else if(s.equals(l.it9.Item))
        {return l.it9;}
        else if(s.equals(l.it10.Item))
        {return l.it10;}
        else if(s.equals(l.it11.Item))
        {return l.it11;}
        else if(s.equals(l.it12.Item))
        {return l.it12;}
        else if(s.equals(l.it13.Item))
        {return l.it13;}
        else if(s.equals(l.it14.Item))
        {return l.it14;}
        else if(s.equals(l.it15.Item))
        {return l.it15;}
        else
        {return null;}
    }

    
    String setItemQ() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    int[] it = new int[15];
    
    for (int i = 0; i < model.getRowCount(); i++) {
        int v = (int) model.getValueAt(i, 0);
        String s = (String) model.getValueAt(i, 1);

        if (s.equals(l.it1.Item)) {
            l.it1.q = v;
            it[0] += v;
        } else if (s.equals(l.it2.Item)) {
            l.it2.q = v;
            it[1] += v;
        } else if (s.equals(l.it3.Item)) {
            l.it3.q = v;
            it[2] += v;
        } else if (s.equals(l.it4.Item)) {
            l.it4.q = v;
            it[3] += v;
        } else if (s.equals(l.it5.Item)) {
            l.it5.q = v;
            it[4] += v;
        } else if (s.equals(l.it6.Item)) {
            l.it6.q = v;
            it[5] += v;
        } else if (s.equals(l.it7.Item)) {
            l.it7.q = v;
            it[6] += v;
        } else if (s.equals(l.it8.Item)) {
            l.it8.q = v;
            it[7] += v;
        } else if (s.equals(l.it9.Item)) {
            l.it9.q = v;
            it[8] += v;
        } else if (s.equals(l.it10.Item)) {
            l.it10.q = v;
            it[9] += v;
        } else if (s.equals(l.it11.Item)) {
            l.it11.q = v;
            it[10] += v;
        } else if (s.equals(l.it12.Item)) {
            l.it12.q = v;
            it[11] += v;
        } else if (s.equals(l.it13.Item)) {
            l.it13.q = v;
            it[12] += v;
        } else if (s.equals(l.it14.Item)) {
            l.it14.q = v;
            it[13] += v;
        } else if (s.equals(l.it15.Item)) {
            l.it15.q = v;
            it[14] += v;
        }
    }

    // Use a StringBuilder to build the comma-separated quantities string
    StringBuilder value = new StringBuilder();
    for (int i = 0; i < it.length; i++) {
        if (i > 0) {
            value.append(","); // Add a comma before each quantity except the first one
        }
        value.append(it[i]);
    }
    
    return value.toString();
}

void saveData() {
    String order = setItemQ();
    
    String filename1 = "Data.txt";
    File file = new File(filename1);
    
    String filename2 = "Status.txt";
    File fileStatus = new File(filename2);
    
    if (file.exists()) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("\n" + order);
            JOptionPane.showMessageDialog(null, "Order Placed successfully");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
        }
    } else {
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(order);
            JOptionPane.showMessageDialog(null, "Created successfully: " + order);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
        }
    }
    
    boolean x = false;
    
    if (fileStatus.exists()) {
        try (FileWriter writer = new FileWriter(fileStatus, true)) {
            writer.write(x+"\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
        }
    } else {
        try (FileWriter writer = new FileWriter(fileStatus)) {
            writer.write(Boolean.toString(x)+"\n");
            JOptionPane.showMessageDialog(null, "Created successfully: " + order);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error creating or writing to file: " + e.getMessage());
        }
    }
}
    
    
    
    void update(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        int price;
        int currentQuantity;
        
        Item I=find((String)model.getValueAt(selectedRowIndex, 1));
        price=I.Price;
        currentQuantity = (int) model.getValueAt(selectedRowIndex, 0);
        
        price*=currentQuantity;
        model.setValueAt( price, selectedRowIndex, 2);
        sum();
    }   
    
    
    private void Item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item1ActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it1.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it1.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it1.Item, l.it1.Price});
        }
        sum();
    }//GEN-LAST:event_Item1ActionPerformed
    
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
            
        if(jTable1.getRowCount()!=0)
        {
            PrintPage p = new PrintPage(this);
            p.L1.setText(SumL.getText());

            try {
            float sum = Float.parseFloat(SumL.getText());
            float vat = sum * 0.15f;
            p.L2.setText(String.valueOf(vat));

            // Calculating the total sum including VAT
            float total = sum + vat;
            p.L3.setText(String.valueOf(total));
            p.setVisible(true);
            
            } catch (NumberFormatException e) {
                // Handle invalid number input
                p.L2.setText("Invalid number");
                p.L3.setText("Invalid number");
            }
        }else{
        JOptionPane.showMessageDialog( this,"Order is empty,please add items to the ordre");
        }
        
            
    }//GEN-LAST:event_printActionPerformed
    
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            
            this.setVisible(false);
            l.setVisible(true);  
        } 
    }//GEN-LAST:event_LogoutActionPerformed

    private void Item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item9ActionPerformed
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it9.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it9.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
    Object[] newRow = {1, l.it9.Item, l.it9.Price};
    model.addRow(newRow);
}
        sum();
    }//GEN-LAST:event_Item9ActionPerformed

    private void Item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item2ActionPerformed
        
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it2.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it2.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it2.Item, l.it2.Price});
        }
        sum();
    }//GEN-LAST:event_Item2ActionPerformed

    private void Item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it3.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it3.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it3.Item, l.it3.Price});
        }
        sum();
    }//GEN-LAST:event_Item3ActionPerformed

    private void Item12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item12ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it12.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it12.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it12.Item, l.it12.Price});
        }
        sum();
    }//GEN-LAST:event_Item12ActionPerformed

    private void Item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item8ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it8.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it8.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it8.Item, l.it8.Price});
        }
        sum();
    }//GEN-LAST:event_Item8ActionPerformed

    private void Item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it4.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it4.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it4.Item, l.it4.Price});
        }
        sum();
    }//GEN-LAST:event_Item4ActionPerformed

    private void Item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item5ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it5.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it5.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it5.Item, l.it5.Price});
        }
        sum();
    }//GEN-LAST:event_Item5ActionPerformed

    private void Item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item13ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it13.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it13.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it13.Item, l.it13.Price});
        }
        sum();
    }//GEN-LAST:event_Item13ActionPerformed

    private void Item15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item15ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it15.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it15.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it15.Item, l.it15.Price});
        }
        sum();
    }//GEN-LAST:event_Item15ActionPerformed

    private void Item6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item6ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it6.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it6.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it6.Item, l.it6.Price});
        }
        sum();
    }//GEN-LAST:event_Item6ActionPerformed

    private void Item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item7ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it7.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it7.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it7.Item, l.it7.Price});
        }
        sum();
    }//GEN-LAST:event_Item7ActionPerformed

    private void Item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item10ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it10.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it10.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it10.Item, l.it10.Price});
        }
        sum();
    }//GEN-LAST:event_Item10ActionPerformed

    private void Item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item11ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it11.Item)) {
//                JOptionPane.showConfirmDialog(null, "Do you want to open the second dialog?", "Confirmation", JOptionPane.YES_NO_OPTION);

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it11.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it11.Item, l.it11.Price});
        }
        sum();
    }//GEN-LAST:event_Item11ActionPerformed

    private void Item14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item14ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        boolean itemFound = false;

        // Iterate through existing rows to find if the item already exists
        for (int i = 0; i < rowCount; i++) {
            if (model.getValueAt(i, 1).equals(l.it14.Item)) {

                // If the item exists, update its quantity by adding 1
                int currentQuantity = (int) model.getValueAt(i, 0);
                model.setValueAt(currentQuantity + 1, i, 0);
                model.setValueAt((currentQuantity+1) *l.it14.Price, i, 2);
                itemFound = true;
                break;
            }
        }

        // if the item does not exist then add a new item
        if (!itemFound) {
            model.addRow(new Object[]{1, l.it14.Item, l.it14.Price});
        }
        sum();
    }//GEN-LAST:event_Item14ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        int price,currentPrice;
        int currentQuantity;
        // Check if a row is selected
        if (selectedRowIndex != -1) {
            currentQuantity = (int) model.getValueAt(selectedRowIndex, 0);
            currentPrice=(int) model.getValueAt(selectedRowIndex, 2);
            price =currentPrice;
            // Check if the current quantity is more than 1
            if (currentQuantity > 1) {
                
                price/=currentQuantity;
                price=currentPrice-price;
                // Decrease the quantity by 1
                model.setValueAt(currentQuantity - 1, selectedRowIndex, 0);
                // Calculate the new total price based on the new quantity and update it in the third column
                model.setValueAt( price, selectedRowIndex, 2);
//                JOptionPane.showMessageDialog(null, ""+price+" "+currentQuantity+" "+selectedRowIndex, "No Row Selected", JOptionPane.WARNING_MESSAGE);
            } else {
                // If quantity is 1, remove the row
                model.removeRow(selectedRowIndex);
                
            }
        } else {
            // Inform the user to select a row
            JOptionPane.showMessageDialog(null, "Please select a row to decrease its quantity.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }

        sum();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update();
        
    }//GEN-LAST:event_updateActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        update();
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseExited

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        update();
    }//GEN-LAST:event_jTable1MouseReleased

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Casher casher = new Casher();
                casher.setVisible(true);

                casher.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        casher.update();
                    }
                }
            });
            }
        });
    } 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    public javax.swing.JButton Item1;
    public javax.swing.JButton Item10;
    public javax.swing.JButton Item11;
    public javax.swing.JButton Item12;
    public javax.swing.JButton Item13;
    public javax.swing.JButton Item14;
    public javax.swing.JButton Item15;
    public javax.swing.JButton Item2;
    public javax.swing.JButton Item3;
    public javax.swing.JButton Item4;
    public javax.swing.JButton Item5;
    public javax.swing.JButton Item6;
    public javax.swing.JButton Item7;
    public javax.swing.JButton Item8;
    public javax.swing.JButton Item9;
    private javax.swing.JButton Logout;
    public javax.swing.JLabel SumL;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JButton print;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
