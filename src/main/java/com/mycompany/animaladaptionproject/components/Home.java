/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.animaladaptionproject.components;

import com.mycompany.animaladaptionproject.Pet;
import com.mycompany.animaladaptionproject.dbconnection.DBConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Icon
 */
public class Home extends javax.swing.JFrame {

    DBConnection dbConnection = new DBConnection();
    boolean dateHiddenText = true;
    boolean medicalDateHiddenText=true;
    boolean animalClassHiddenText=true;
    boolean animalBreedHiddenText=true;
    boolean animalColorHiddenText=true;
   
    public Home() {
        initComponents();
        petId.setText(dbConnection.getNewPetId()+"");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        checkbox1 = new java.awt.Checkbox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        tab1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tab4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tab5 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jp = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        petClass = new javax.swing.JTextField();
        ownerPhone = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        petId = new javax.swing.JTextField();
        petName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        petBreed = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        petColor = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        petDOB = new javax.swing.JFormattedTextField();
        jp2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        updatePetId = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petMedicalInfo = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        petMedicalDate = new javax.swing.JFormattedTextField();
        jp3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ownerPagePetId = new javax.swing.JTextField();
        ownerPageName = new javax.swing.JTextField();
        ownerPageEmail = new javax.swing.JTextField();
        ownerPagePhone = new javax.swing.JTextField();
        ownerPageAddress = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jp4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        searchPetId = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jp5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        adoptPetId = new javax.swing.JLabel();
        adoptPetName = new javax.swing.JLabel();
        adoptPetDOB = new javax.swing.JLabel();
        adoptPetGender = new javax.swing.JLabel();
        adoptPetClass = new javax.swing.JLabel();
        adoptPetBreed = new javax.swing.JLabel();
        adoptPetColor = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adoptPetMedicalHistory = new javax.swing.JTextArea();
        adoptButton = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        searchPetByDetails = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        animalColor = new javax.swing.JTextField();
        animalBreed = new javax.swing.JTextField();
        animalClass = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 700));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jSeparator1.setMaximumSize(new java.awt.Dimension(32790, 32767));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\p7.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 190));

        tab1.setBackground(new java.awt.Color(204, 204, 204));
        tab1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\d2 icon.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel6.setText("Register New Animal");

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 40));

        tab2.setBackground(new java.awt.Color(204, 204, 204));
        tab2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel8.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel8.setText("Update Animal Info");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\info.png")); // NOI18N

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(tab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 40));

        tab3.setBackground(new java.awt.Color(204, 204, 204));
        tab3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel10.setText("Add Owner Information");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\ww1.png")); // NOI18N

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(12, 12, 12))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addGroup(tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(tab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, -1));

        tab4.setBackground(new java.awt.Color(204, 204, 204));
        tab4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tab4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab4MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\a.png")); // NOI18N

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel12.setText("Search Animal");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab4Layout = new javax.swing.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab4Layout.createSequentialGroup()
                .addGroup(tab4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(tab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, -1));

        tab5.setBackground(new java.awt.Color(204, 204, 204));
        tab5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab5MouseClicked(evt);
            }
        });

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\up info.png")); // NOI18N

        jLabel50.setBackground(new java.awt.Color(204, 204, 204));
        jLabel50.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel50.setText("Search Animal Details");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tab5Layout = new javax.swing.GroupLayout(tab5);
        tab5.setLayout(tab5Layout);
        tab5Layout.setHorizontalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab5Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab5Layout.setVerticalGroup(
            tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab5Layout.createSequentialGroup()
                .addGroup(tab5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(tab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 800));

        jp.setBackground(new java.awt.Color(255, 255, 255));
        jp.setPreferredSize(new java.awt.Dimension(550, 700));

        jp1.setBackground(new java.awt.Color(255, 255, 255));
        jp1.setPreferredSize(new java.awt.Dimension(550, 800));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel5.setText("Register New Animal ");

        jLabel9.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel9.setText("Animal Name:*");

        jLabel13.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel13.setText("Animal DOB:*");

        jLabel14.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel14.setText("Animal Gender:*");

        jLabel15.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel15.setText("Animal Species:*");

        jLabel16.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel16.setText("Animal Breed:");

        jLabel17.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel17.setText("Owner ID:");

        petClass.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        petClass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        petClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petClassActionPerformed(evt);
            }
        });

        ownerPhone.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPhoneActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        male.setText("Male");

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        female.setText("Female");

        petId.setEditable(false);
        petId.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        petId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        petId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petIdActionPerformed(evt);
            }
        });

        petName.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        petName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        petName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petNameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton1.setText("  Register  ");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        petBreed.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        petBreed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        petBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petBreedActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel18.setText("Animal ID:");

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\p8.jpg")); // NOI18N

        petColor.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        petColor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        petColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petColorActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel33.setText("Animal Color:*");

        petDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        petDOB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        petDOB.setText("Example: 01-Jan-2001");
        petDOB.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        petDOB.setPreferredSize(new java.awt.Dimension(64, 30));
        petDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petDOBActionPerformed(evt);
            }
        });
        petDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                petDOBKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jp1Layout = new javax.swing.GroupLayout(jp1);
        jp1.setLayout(jp1Layout);
        jp1Layout.setHorizontalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel19)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(68, 68, 68)
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(female)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel33)
                            .addComponent(jLabel18)
                            .addComponent(jLabel13)
                            .addComponent(jLabel17)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(petBreed, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(ownerPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(petClass, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(petName, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(petId, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(petColor, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(petDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(99, 99, 99))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jp1Layout.setVerticalGroup(
            jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(petDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(female)
                    .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(male)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(petClass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(22, 22, 22)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(petColor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jp.add(jp1);

        jp2.setBackground(new java.awt.Color(255, 255, 255));
        jp2.setMaximumSize(new java.awt.Dimension(500, 700));
        jp2.setPreferredSize(new java.awt.Dimension(550, 800));

        jLabel20.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel20.setText("Update Pet Information");

        jLabel21.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel21.setText("Pet ID:");

        jLabel22.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel22.setText("Date:");

        updatePetId.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        updatePetId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        updatePetId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePetIdActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\welcome.jpg")); // NOI18N

        petMedicalInfo.setColumns(20);
        petMedicalInfo.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        petMedicalInfo.setRows(5);
        petMedicalInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        jScrollPane1.setViewportView(petMedicalInfo);

        jLabel23.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel23.setText("Medical Info:");

        petMedicalDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 3));
        petMedicalDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yyyy"))));
        petMedicalDate.setText("Example: 01-Jan-2001");
        petMedicalDate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        petMedicalDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                petMedicalDateKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(36, 36, 36)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(92, 92, 92)
                                .addComponent(updatePetId, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(103, 103, 103)
                                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(petMedicalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatePetId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22)
                    .addComponent(petMedicalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jp.add(jp2);

        jp3.setBackground(new java.awt.Color(255, 255, 255));
        jp3.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jp3.setPreferredSize(new java.awt.Dimension(550, 800));

        jLabel41.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel41.setText("Adopt Pet ");

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdoption1\\src\\images\\animal parent2.jpg")); // NOI18N

        jLabel42.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel42.setText("Owner Name:");

        jLabel43.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel43.setText("Email:");

        jLabel44.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel44.setText("Phone No:");

        jLabel45.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel45.setText("Address:");

        jLabel46.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel46.setText("Pet ID:");

        ownerPagePetId.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPagePetId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPagePetId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPagePetIdActionPerformed(evt);
            }
        });

        ownerPageName.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPageName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPageNameActionPerformed(evt);
            }
        });

        ownerPageEmail.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPageEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPageEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPageEmailActionPerformed(evt);
            }
        });

        ownerPagePhone.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPagePhone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPagePhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPagePhoneActionPerformed(evt);
            }
        });

        ownerPageAddress.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        ownerPageAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        ownerPageAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownerPageAddressActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton4.setText("Adopt");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jp3Layout.createSequentialGroup()
                            .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jp3Layout.createSequentialGroup()
                                    .addGap(211, 211, 211)
                                    .addComponent(jLabel41))
                                .addGroup(jp3Layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(jLabel27)))
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp3Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp3Layout.createSequentialGroup()
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ownerPageAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jp3Layout.createSequentialGroup()
                                        .addComponent(jLabel46)
                                        .addGap(32, 32, 32)
                                        .addComponent(ownerPagePetId, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp3Layout.createSequentialGroup()
                                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ownerPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp3Layout.createSequentialGroup()
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ownerPageEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp3Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ownerPagePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jp3Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addGap(57, 57, 57)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(ownerPagePetId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(ownerPageName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ownerPageEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(22, 22, 22)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(ownerPagePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(ownerPageAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jp.add(jp3);

        jp4.setBackground(new java.awt.Color(255, 255, 255));
        jp4.setMaximumSize(new java.awt.Dimension(550, 700));
        jp4.setPreferredSize(new java.awt.Dimension(550, 800));

        jLabel28.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel28.setText("Search Pet");

        jLabel29.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel29.setText("Pet ID:");

        searchPetId.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        searchPetId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));

        jButton3.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton3.setText("Search");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\s4.jpg")); // NOI18N

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel26))
                    .addGroup(jp4Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPetId, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(124, 124, 124)))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp4Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(22, 22, 22)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPetId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(49, 49, 49)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        jp.add(jp4);

        jp5.setBackground(new java.awt.Color(255, 255, 255));
        jp5.setMinimumSize(new java.awt.Dimension(500, 700));
        jp5.setPreferredSize(new java.awt.Dimension(500, 700));

        jLabel24.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel24.setText("Pet Gender:");

        jLabel34.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel34.setText("Pet Class:");

        jLabel35.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel35.setText("Pet Breed:");

        jLabel37.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel37.setText("Pet Name:");

        jLabel38.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel38.setText("Pet DOB:");

        jLabel39.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel39.setText("Pet ID:");

        jLabel40.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel40.setText("Pet Color:");

        adoptPetId.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetId.setText("jLabel41");
        adoptPetId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetName.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetName.setText("jLabel41");
        adoptPetName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetDOB.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetDOB.setText("jLabel41");
        adoptPetDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetGender.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetGender.setText("jLabel41");
        adoptPetGender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetClass.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetClass.setText("jLabel41");
        adoptPetClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetBreed.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetBreed.setText("jLabel41");
        adoptPetBreed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        adoptPetColor.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        adoptPetColor.setText("jLabel41");
        adoptPetColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));

        jLabel49.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jLabel49.setText("Medical History:");

        adoptPetMedicalHistory.setEditable(false);
        adoptPetMedicalHistory.setColumns(20);
        adoptPetMedicalHistory.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        adoptPetMedicalHistory.setRows(5);
        jScrollPane2.setViewportView(adoptPetMedicalHistory);

        adoptButton.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        adoptButton.setText("Adopt");
        adoptButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        adoptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adoptButtonActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel36.setText("Adopt Pet");

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tanmay\\Documents\\NetBeansProjects\\AnimalAdaptionProject\\src\\main\\java\\images\\w3.png")); // NOI18N
        jLabel48.setText("jLabel48");

        javax.swing.GroupLayout jp5Layout = new javax.swing.GroupLayout(jp5);
        jp5.setLayout(jp5Layout);
        jp5Layout.setHorizontalGroup(
            jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(adoptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addComponent(jLabel35)
                        .addComponent(jLabel34)
                        .addComponent(jLabel40)
                        .addComponent(jLabel24)))
                .addGap(11, 11, 11)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adoptPetId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetBreed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adoptPetColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jp5Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jp5Layout.setVerticalGroup(
            jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(21, 21, 21)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adoptPetId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(22, 22, 22)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(adoptPetName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adoptPetDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(20, 20, 20)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adoptPetGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel34)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel35)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel40))
                    .addGroup(jp5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(adoptPetClass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(adoptPetBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adoptPetColor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adoptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jp.add(jp5);

        searchPetByDetails.setBackground(new java.awt.Color(255, 255, 255));
        searchPetByDetails.setMinimumSize(new java.awt.Dimension(550, 700));

        jLabel51.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel51.setText("Search Animal Details");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        animalColor.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        animalColor.setText("Color");
        animalColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalColorActionPerformed(evt);
            }
        });
        animalColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                animalColorKeyTyped(evt);
            }
        });

        animalBreed.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        animalBreed.setText("Breed");
        animalBreed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalBreedActionPerformed(evt);
            }
        });
        animalBreed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                animalBreedKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                animalBreedKeyTyped(evt);
            }
        });

        animalClass.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        animalClass.setText("Species");
        animalClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalClassActionPerformed(evt);
            }
        });
        animalClass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                animalClassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                animalClassKeyTyped(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(30, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMinimumSize(new java.awt.Dimension(30, 10));

        jButton5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jButton5.setText("Search");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 3, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(animalClass, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(animalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(animalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(animalColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(animalBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(animalClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Class", "Breed", "Color", "Owner", "Status"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        javax.swing.GroupLayout searchPetByDetailsLayout = new javax.swing.GroupLayout(searchPetByDetails);
        searchPetByDetails.setLayout(searchPetByDetailsLayout);
        searchPetByDetailsLayout.setHorizontalGroup(
            searchPetByDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPetByDetailsLayout.createSequentialGroup()
                .addGroup(searchPetByDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPetByDetailsLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel51))
                    .addGroup(searchPetByDetailsLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(searchPetByDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        searchPetByDetailsLayout.setVerticalGroup(
            searchPetByDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPetByDetailsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel51)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(473, Short.MAX_VALUE))
        );

        jp.add(searchPetByDetails);

        getContentPane().add(jp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 550, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jp1.setVisible(true);
        //jp.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        tab1.setBackground(Color.WHITE);
        tab2.setBackground(new Color(204,204,204));
        tab3.setBackground(new Color(204,204,204));
        tab4.setBackground(new Color(204,204,204));
        tab5.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jp2.setVisible(true);
        //jp.setVisible(false);
        jp1.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        tab2.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204,204,204));
        tab3.setBackground(new Color(204,204,204));
        tab4.setBackground(new Color(204,204,204));
        tab5.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel8MouseClicked

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        // TODO add your handling code here:
        jp3.setVisible(true);
        //jp.setVisible(false);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp4.setVisible(false);
        tab3.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204,204,204));
        tab2.setBackground(new Color(204,204,204));
        tab4.setBackground(new Color(204,204,204));
        tab5.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_tab3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        jp4.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        tab4.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204,204,204));
        tab2.setBackground(new Color(204,204,204));
        tab3.setBackground(new Color(204,204,204));
        tab5.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_jLabel12MouseClicked

    private void petClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petClassActionPerformed

    private void ownerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPhoneActionPerformed

    private void petIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petIdActionPerformed

    private void petNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petNameActionPerformed

    private void petBreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petBreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petBreedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(petId.getText());
        String name = petName.getText();
        String dob = petDOB.getText();
        String gender="";
        if(male.isSelected())
            gender="male";
        else if(female.isSelected())
            gender="female";
        String pClass = petClass.getText();
        String breed = petBreed.getText();
        String color = petColor.getText();
        String ownerMobile = ownerPhone.getText();
        if(name.equals("") || gender.equals("") || pClass.equals("") || color.equals("") || dob.equals("") ||dob.equals("Example: 01-Jan-2001"))
        {
            showMessageDialog(null,"Please fill required fields");
            return;
        }
        if(breed.equals(""))
            breed="-";
        if(ownerMobile.equals(""))
            ownerMobile="-";
        boolean status=dbConnection.addNewPet(id,name,dob,gender,pClass,breed,color,ownerMobile);
        if(status)
        {
            showMessageDialog(null,"New Pet Added Successfully");
            petId.setText((id+1)+"");
            petName.setText("");
            petDOB.setText("Example: 01-Jan-2001");
            male.setSelected(false);
            female.setSelected(false);
            petClass.setText("");
            petBreed.setText("");
            petColor.setText("");
            ownerPhone.setText("");
            dateHiddenText=true;
            return;
        }
        showMessageDialog(null,"Data not inserted");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatePetIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePetIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatePetIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(updatePetId.getText());
        String medicalInfo = petMedicalInfo.getText();
        String medicalDate = petMedicalDate.getText();
        
        if(updatePetId.getText().equals("") || medicalInfo.equals("") || medicalDate.equals("") || 
                medicalDate.equals("Example: 01-Jan-2001"))
        {
            showMessageDialog(null,"Please fill all the details");
            return;
        }
        boolean status=dbConnection.addMedicalInfo(id,medicalInfo,medicalDate);     
        if(status)
        {
            showMessageDialog(null,"Medical Information added");
            updatePetId.setText("");
            petMedicalInfo.setText("");
            petMedicalDate.setText("Example: 01-Jan-2001");
            medicalDateHiddenText=true;
            return;
        }
        showMessageDialog(null,"Pet ID not found");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void petColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petColorActionPerformed

    private void petDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petDOBActionPerformed

    private void petDOBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petDOBKeyTyped
        // TODO add your handling code here:
        if(dateHiddenText)
        {
            dateHiddenText=false;
            petDOB.setText("");
        }
        
    }//GEN-LAST:event_petDOBKeyTyped

    private void petMedicalDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_petMedicalDateKeyTyped
        // TODO add your handling code here:
        if(medicalDateHiddenText)
        {
            medicalDateHiddenText=false;
            petMedicalDate.setText("");
        }
        
    }//GEN-LAST:event_petMedicalDateKeyTyped

    private void adoptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adoptButtonActionPerformed
        // TODO add your handling code here:
        jp3.setVisible(true);
        //jp.setVisible(false);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp4.setVisible(false);
        tab3.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204,204,204));
        tab2.setBackground(new Color(204,204,204));
        tab4.setBackground(new Color(204,204,204));
        ownerPagePetId.setText(adoptPetId.getText());
    }//GEN-LAST:event_adoptButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(searchPetId.getText());
        Pet pet = dbConnection.searchPet(id);
        if(pet!=null)
        {
            adoptPetId.setText(id+"");
            adoptPetName.setText(pet.getName());
            adoptPetDOB.setText(pet.getDOB());
            adoptPetGender.setText(pet.getGender());
            adoptPetClass.setText(pet.getPClass());
            adoptPetBreed.setText(pet.getBreed());
            adoptPetColor.setText(pet.getColor());
            adoptPetMedicalHistory.setText(pet.getMedicalInfo());
//            adoptButton.setText(pet.getStatus());
            if(pet.getStatus().equals("adopted"))
            {
                adoptButton.setText("Adopted");
                adoptButton.setEnabled(false);
            }
            else
            {
                adoptButton.setText("Adopt");
                adoptButton.setEnabled(true);
            }
            
            jp5.setVisible(true);
            jp1.setVisible(false);
            jp2.setVisible(false);
            jp3.setVisible(false);
            jp4.setVisible(false);
            searchPetByDetails.setVisible(false);
        }
        else
            showMessageDialog(null,"Pet ID not found");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ownerPagePetIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPagePetIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPagePetIdActionPerformed

    private void ownerPageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPageNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPageNameActionPerformed

    private void ownerPageEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPageEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPageEmailActionPerformed

    private void ownerPagePhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPagePhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPagePhoneActionPerformed

    private void ownerPageAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownerPageAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ownerPageAddressActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int pID = Integer.parseInt(ownerPagePetId.getText());
        String oName = ownerPageName.getText();
        String oEmail = ownerPageEmail.getText();
        String oPhone = ownerPagePhone.getText();
        String oAddress = ownerPageAddress.getText();
        
        if(ownerPagePetId.getText().equals("") || oName.equals("") || oEmail.equals("") || oPhone.equals("") || oAddress.equals(""))
        {
            showMessageDialog(null,"Fill all the fields");
            return;
        }
        dbConnection.adoptPet(pID,oName,oEmail,oPhone,oAddress);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab4MouseClicked
        // TODO add your handling code here:
        jp3.setVisible(false);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp4.setVisible(false);
        tab4.setBackground(Color.WHITE);
        tab3.setBackground(new Color(204,204,204));
        tab1.setBackground(new Color(204,204,204));
        tab2.setBackground(new Color(204,204,204));
        
    }//GEN-LAST:event_tab4MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        searchPetByDetails.setVisible(true);
        jp1.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        jp5.setVisible(false);
        tab5.setBackground(Color.WHITE);
        tab1.setBackground(new Color(204,204,204));
        tab2.setBackground(new Color(204,204,204));
        tab3.setBackground(new Color(204,204,204));
        tab4.setBackground(new Color(204,204,204));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseClicked

    private void tab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseClicked
        // TODO add your handling code here:
//        jp6.setVisible(true);
//        jp5.setVisible(false);
//        jp1.setVisible(false);
//        jp2.setVisible(false);
//        jp3.setVisible(false);
//        jp4.setVisible(false);
//        tab5.setBackground(Color.WHITE);
//        tab1.setBackground(new Color(204,204,204));
//        tab2.setBackground(new Color(204,204,204));
//        tab3.setBackground(new Color(204,204,204));
//        tab4.setBackground(new Color(204,204,204));
        

    }//GEN-LAST:event_tab5MouseClicked

    private void animalColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalColorActionPerformed

    private void animalBreedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalBreedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalBreedActionPerformed

    private void animalClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalClassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_animalClassActionPerformed

    private void animalClassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalClassKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_animalClassKeyPressed

    private void animalBreedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalBreedKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_animalBreedKeyPressed

    private void animalClassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalClassKeyTyped
        // TODO add your handling code here:
                
        if(animalClassHiddenText)
        {
            animalClassHiddenText = false;
            animalClass.setText("");
        }
    }//GEN-LAST:event_animalClassKeyTyped

    private void animalBreedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalBreedKeyTyped
        // TODO add your handling code here:
                
        if(animalBreedHiddenText)
        {
            animalBreedHiddenText = false;
            animalBreed.setText("");
        }
    }//GEN-LAST:event_animalBreedKeyTyped

    private void animalColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_animalColorKeyTyped
        // TODO add your handling code here:
                
        if(animalColorHiddenText)
        {
            animalColorHiddenText = false;
            animalColor.setText("");
        }
    }//GEN-LAST:event_animalColorKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String type = animalClass.getText();
        String breed = animalBreed.getText();
        String color = animalColor.getText();
        if(type.equals(""))
            animalClassHiddenText=true;
        if(breed.equals(""))
            animalBreedHiddenText=true;
        if(color.equals(""))
            animalColorHiddenText=true;
       DefaultTableModel defaultTable = (DefaultTableModel)jTable1.getModel();
       defaultTable.getDataVector().removeAllElements();
       defaultTable.fireTableDataChanged();
//        dbConnection.getPetDeatils(type,breed,color);
try {
           String query = "select id,name,classification,breed,color,owner_mobile,status from pet";
           if(!animalClassHiddenText && !animalBreedHiddenText && !animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where classification line '"+type+"' and breed line '"+breed+"' and color='"+color+"'";
           else if(!animalClassHiddenText && !animalBreedHiddenText && animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where classification='"+type+"' and breed='"+breed+"'";
           else if(!animalClassHiddenText && animalBreedHiddenText && !animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where classification='"+type+"' and color='"+color+"'";
           else if(!animalClassHiddenText && animalBreedHiddenText && animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where classification='"+type+"'";
           else if(animalClassHiddenText && !animalBreedHiddenText && !animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where breed='"+breed+"' and color='"+color+"'";
           else if(animalClassHiddenText && !animalBreedHiddenText && animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where breed='"+breed+"'";
           else if(animalClassHiddenText && animalBreedHiddenText && !animalColorHiddenText)
               query = "select id,name,classification,breed,color,owner_mobile,status from pet where color='"+color+"'";
           
           Statement stmt = dbConnection.getDBConnection().createStatement();
           ResultSet rs = stmt.executeQuery(query);
           while(rs.next())
           {
               String id = String.valueOf(rs.getInt("id"));
               String name = rs.getString("name");
               String animalClass = rs.getString("classification");
               String animalBreed =rs.getString("breed");
               String animalColor = rs.getString("color");
               String owner_mobile = rs.getString("owner_mobile");
               String status = rs.getString("status");
               String tbData[] = {id,name,animalClass,animalBreed,animalColor,owner_mobile,status};
               DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
               tblModel.addRow(tbData);
           }
       } catch (SQLException ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
//        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
//        tblModel.addRow(tbData);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adoptButton;
    private javax.swing.JLabel adoptPetBreed;
    private javax.swing.JLabel adoptPetClass;
    private javax.swing.JLabel adoptPetColor;
    private javax.swing.JLabel adoptPetDOB;
    private javax.swing.JLabel adoptPetGender;
    private javax.swing.JLabel adoptPetId;
    private javax.swing.JTextArea adoptPetMedicalHistory;
    private javax.swing.JLabel adoptPetName;
    private javax.swing.JTextField animalBreed;
    private javax.swing.JTextField animalClass;
    private javax.swing.JTextField animalColor;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jp;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel jp5;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField ownerPageAddress;
    private javax.swing.JTextField ownerPageEmail;
    private javax.swing.JTextField ownerPageName;
    private javax.swing.JTextField ownerPagePetId;
    private javax.swing.JTextField ownerPagePhone;
    private javax.swing.JTextField ownerPhone;
    private javax.swing.JTextField petBreed;
    private javax.swing.JTextField petClass;
    private javax.swing.JTextField petColor;
    private javax.swing.JFormattedTextField petDOB;
    private javax.swing.JTextField petId;
    private javax.swing.JFormattedTextField petMedicalDate;
    private javax.swing.JTextArea petMedicalInfo;
    private javax.swing.JTextField petName;
    private javax.swing.JPanel searchPetByDetails;
    private javax.swing.JTextField searchPetId;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab5;
    private javax.swing.JTextField updatePetId;
    // End of variables declaration//GEN-END:variables
}
