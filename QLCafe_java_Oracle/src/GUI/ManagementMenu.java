package GUI;

import BLL.GetData;
import DAL.DataAccess;
import Ultilities.ConvertData.ConvertDataORCL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManagementMenu extends javax.swing.JFrame {

    private JFrame parent;

    public ManagementMenu(JFrame parent) {
        initComponents();
        this.parent = parent;
        showDataOnTableStaff();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        exportResourceDetailBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        resourceBtn = new javax.swing.JButton();
        inputBtn = new javax.swing.JButton();
        inputDetailBtn = new javax.swing.JButton();
        exportResourceBtn1 = new javax.swing.JButton();
        main_page = new javax.swing.JTabbedPane();
        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        refreshStaff = new javax.swing.JButton();
        addStaffBtn = new javax.swing.JButton();
        updateStaffBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMaNv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        txtTaiKhoan = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        clearStaffBtn = new javax.swing.JButton();
        deleteStaffBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        resouceTable = new javax.swing.JTable();
        refreshResouce = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMaNL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTenNL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        deleteResourceBtn = new javax.swing.JButton();
        addResourceBtn = new javax.swing.JButton();
        updateResourceBtn = new javax.swing.JButton();
        clearResourceBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputTable = new javax.swing.JTable();
        refreshInput = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMaPN = new javax.swing.JTextField();
        dateNgayNhap = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        cbMaNV = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        deleteInputBtn = new javax.swing.JButton();
        addInputBtn = new javax.swing.JButton();
        updateInputBtn = new javax.swing.JButton();
        clearInputBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        inputDetailTable = new javax.swing.JTable();
        refreshInputDetail = new javax.swing.JButton();
        txtSoLuong2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        dateInputDetail = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        cbMaNL = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cbMaPN = new javax.swing.JComboBox<>();
        clearInputDetailBtn = new javax.swing.JButton();
        updateInputDetailBtn = new javax.swing.JButton();
        addInputDetailBtn = new javax.swing.JButton();
        deleteInputDetailBtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        exportResourceTable = new javax.swing.JTable();
        refreshExportResource = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtMaXuat = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cbMaNV1 = new javax.swing.JComboBox<>();
        deleteExportResourceBtn = new javax.swing.JButton();
        addExportResourceBtn = new javax.swing.JButton();
        updateExportResourceBtn = new javax.swing.JButton();
        clearExportResourceBtn = new javax.swing.JButton();
        dateExportResource = new com.toedter.calendar.JDateChooser();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        exportResourceDetailTable = new javax.swing.JTable();
        refreshExportResourceDetail = new javax.swing.JButton();
        cbMaNL1 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbMaXuat = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtSoLuong3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtDonVi1 = new javax.swing.JTextField();
        deleteExportResourceDetailBtn = new javax.swing.JButton();
        addExportResourceDetailBtn = new javax.swing.JButton();
        updateExportResourceDetailBtn = new javax.swing.JButton();
        clearExportResourceDetailBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(222, 244, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 139, 143));
        jLabel5.setText("Quản Lý");

        exportResourceDetailBtn.setBackground(new java.awt.Color(255, 153, 153));
        exportResourceDetailBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exportResourceDetailBtn.setText("Chi Tiết Xuất Nguyên liệu");
        exportResourceDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportResourceDetailBtnMouseClicked(evt);
            }
        });
        exportResourceDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportResourceDetailBtnActionPerformed(evt);
            }
        });

        staffBtn.setBackground(new java.awt.Color(255, 153, 153));
        staffBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        staffBtn.setText("Nhân Viên");
        staffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffBtnMouseClicked(evt);
            }
        });
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        resourceBtn.setBackground(new java.awt.Color(255, 153, 153));
        resourceBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        resourceBtn.setText("Nguyên Liệu");
        resourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resourceBtnMouseClicked(evt);
            }
        });
        resourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceBtnActionPerformed(evt);
            }
        });

        inputBtn.setBackground(new java.awt.Color(255, 153, 153));
        inputBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inputBtn.setText("Phiếu Nhập");
        inputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputBtnMouseClicked(evt);
            }
        });
        inputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBtnActionPerformed(evt);
            }
        });

        inputDetailBtn.setBackground(new java.awt.Color(255, 153, 153));
        inputDetailBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inputDetailBtn.setText("Chi Tiết Phiếu Nhập");
        inputDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDetailBtnActionPerformed(evt);
            }
        });

        exportResourceBtn1.setBackground(new java.awt.Color(255, 153, 153));
        exportResourceBtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exportResourceBtn1.setText("Xuất Nguyên Liệu");
        exportResourceBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportResourceBtn1MouseClicked(evt);
            }
        });
        exportResourceBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportResourceBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportResourceDetailBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputDetailBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(resourceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exportResourceBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resourceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportResourceBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportResourceDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_page.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        main_page.setDoubleBuffered(true);
        main_page.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                main_pageStateChanged(evt);
            }
        });
        main_page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                main_pageMouseClicked(evt);
            }
        });

        staffTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt);
            }
        });
        staffTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                staffTablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(staffTable);

        refreshStaff.setText("Refresh");
        refreshStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStaffActionPerformed(evt);
            }
        });

        addStaffBtn.setBackground(new java.awt.Color(204, 51, 0));
        addStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        addStaffBtn.setText("Thêm");
        addStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addStaffBtnMouseClicked(evt);
            }
        });
        addStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffBtnActionPerformed(evt);
            }
        });

        updateStaffBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateStaffBtn.setText("Cập Nhật");
        updateStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateStaffBtnMouseClicked(evt);
            }
        });
        updateStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStaffBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.black);
        jLabel6.setText("Mã Nhân Viên");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setForeground(java.awt.Color.black);
        jLabel12.setText("Tên Nhân Viên");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.black);
        jLabel13.setText("Giới Tính");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.black);
        jLabel14.setText("SĐT");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.black);
        jLabel15.setText("Tài Khoản");

        male.setText("Nam");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Nữ");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        clearStaffBtn.setBackground(new java.awt.Color(204, 51, 0));
        clearStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearStaffBtn.setText("Làm Mới");
        clearStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearStaffBtnMouseClicked(evt);
            }
        });
        clearStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStaffBtnActionPerformed(evt);
            }
        });

        deleteStaffBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteStaffBtn.setText("Xóa");
        deleteStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteStaffBtnMouseClicked(evt);
            }
        });
        deleteStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(refreshStaff)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13))
                                        .addGap(138, 138, 138)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(male)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(female))
                                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtMaNv, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                                        .addComponent(txtSdt)
                                                        .addComponent(txtTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(clearStaffBtn))
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(updateStaffBtn)
                                .addGap(18, 18, 18)
                                .addComponent(addStaffBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteStaffBtn)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(refreshStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(clearStaffBtn)
                .addGap(70, 70, 70)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateStaffBtn)
                    .addComponent(addStaffBtn)
                    .addComponent(deleteStaffBtn))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        main_page.addTab("Nhân Viên", panel);

        resouceTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resouceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        resouceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resouceTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(resouceTable);

        refreshResouce.setText("Refresh");
        refreshResouce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshResouceActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.black);
        jLabel7.setText("Mã Nguyên Liệu");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.black);
        jLabel8.setText("Tên Nguyên Liệu");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(java.awt.Color.black);
        jLabel9.setText("Số Lượng");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.black);
        jLabel10.setText("Đơn Vị");

        deleteResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteResourceBtn.setText("Xóa");
        deleteResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteResourceBtnMouseClicked(evt);
            }
        });
        deleteResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResourceBtnActionPerformed(evt);
            }
        });

        addResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        addResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        addResourceBtn.setText("Thêm");
        addResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addResourceBtnMouseClicked(evt);
            }
        });
        addResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResourceBtnActionPerformed(evt);
            }
        });

        updateResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateResourceBtn.setText("Cập Nhật");
        updateResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateResourceBtnMouseClicked(evt);
            }
        });
        updateResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateResourceBtnActionPerformed(evt);
            }
        });

        clearResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        clearResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearResourceBtn.setText("Làm Mới");
        clearResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearResourceBtnMouseClicked(evt);
            }
        });
        clearResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearResourceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(refreshResouce)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(updateResourceBtn)
                            .addGap(18, 18, 18)
                            .addComponent(addResourceBtn)
                            .addGap(18, 18, 18)
                            .addComponent(deleteResourceBtn))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTenNL, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMaNL, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clearResourceBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshResouce)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearResourceBtn)
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateResourceBtn)
                    .addComponent(addResourceBtn)
                    .addComponent(deleteResourceBtn))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        main_page.addTab("Nguyên Liệu", jPanel4);

        inputTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        inputTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(inputTable);

        refreshInput.setText("Refresh");
        refreshInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshInputActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.black);
        jLabel11.setText("Mã Phiếu Nhập");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.black);
        jLabel16.setText("Ngày Nhập");

        cbMaNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel17.setForeground(java.awt.Color.black);
        jLabel17.setText("Mã Nhân Viên");

        deleteInputBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteInputBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteInputBtn.setText("Xóa");
        deleteInputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteInputBtnMouseClicked(evt);
            }
        });
        deleteInputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInputBtnActionPerformed(evt);
            }
        });

        addInputBtn.setBackground(new java.awt.Color(204, 51, 0));
        addInputBtn.setForeground(new java.awt.Color(255, 255, 255));
        addInputBtn.setText("Thêm");
        addInputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addInputBtnMouseClicked(evt);
            }
        });
        addInputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInputBtnActionPerformed(evt);
            }
        });

        updateInputBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateInputBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateInputBtn.setText("Cập Nhật");
        updateInputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateInputBtnMouseClicked(evt);
            }
        });
        updateInputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInputBtnActionPerformed(evt);
            }
        });

        clearInputBtn.setBackground(new java.awt.Color(204, 51, 0));
        clearInputBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearInputBtn.setText("Làm Mới");
        clearInputBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearInputBtnMouseClicked(evt);
            }
        });
        clearInputBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(refreshInput)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(updateInputBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addInputBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteInputBtn))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearInputBtn)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbMaNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaPN, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                .addComponent(dateNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshInput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearInputBtn)
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInputBtn)
                    .addComponent(addInputBtn)
                    .addComponent(deleteInputBtn))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        main_page.addTab("Phiếu Nhập", jPanel5);

        inputDetailTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        inputDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        inputDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputDetailTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(inputDetailTable);

        refreshInputDetail.setText("Refresh");
        refreshInputDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshInputDetailActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel18.setForeground(java.awt.Color.black);
        jLabel18.setText("Số Lượng");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setForeground(java.awt.Color.black);
        jLabel19.setText("Giá Nhập");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setForeground(java.awt.Color.black);
        jLabel20.setText("Tên NCC");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setForeground(java.awt.Color.black);
        jLabel21.setText("Ngày Nhập");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setForeground(java.awt.Color.black);
        jLabel22.setText("Nguyên Liệu Mã NL");

        cbMaNL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setForeground(java.awt.Color.black);
        jLabel23.setText("Phiếu Nhập Mã PN");

        cbMaPN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        clearInputDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        clearInputDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearInputDetailBtn.setText("Làm Mới");
        clearInputDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearInputDetailBtnMouseClicked(evt);
            }
        });
        clearInputDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputDetailBtnActionPerformed(evt);
            }
        });

        updateInputDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateInputDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateInputDetailBtn.setText("Cập Nhật");
        updateInputDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateInputDetailBtnMouseClicked(evt);
            }
        });
        updateInputDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInputDetailBtnActionPerformed(evt);
            }
        });

        addInputDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        addInputDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        addInputDetailBtn.setText("Thêm");
        addInputDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addInputDetailBtnMouseClicked(evt);
            }
        });
        addInputDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInputDetailBtnActionPerformed(evt);
            }
        });

        deleteInputDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteInputDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteInputDetailBtn.setText("Xóa");
        deleteInputDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteInputDetailBtnMouseClicked(evt);
            }
        });
        deleteInputDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInputDetailBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(refreshInputDetail)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSoLuong2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clearInputDetailBtn)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbMaNL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateInputDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTenNCC)
                                        .addComponent(cbMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateInputDetailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addInputDetailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteInputDetailBtn)))
                .addGap(366, 366, 366))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshInputDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtSoLuong2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateInputDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearInputDetailBtn)
                .addGap(82, 82, 82)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateInputDetailBtn)
                    .addComponent(addInputDetailBtn)
                    .addComponent(deleteInputDetailBtn))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        main_page.addTab("Chi Tiết Phiếu Nhập", jPanel6);

        exportResourceTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        exportResourceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        exportResourceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportResourceTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(exportResourceTable);

        refreshExportResource.setText("Refresh");
        refreshExportResource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshExportResourceActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel24.setForeground(java.awt.Color.black);
        jLabel24.setText("Mã Xuất");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel25.setForeground(java.awt.Color.black);
        jLabel25.setText("Ngày Xuất");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel26.setForeground(java.awt.Color.black);
        jLabel26.setText("Nhân Viên Mã NV");

        cbMaNV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deleteExportResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteExportResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteExportResourceBtn.setText("Xóa");
        deleteExportResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteExportResourceBtnMouseClicked(evt);
            }
        });
        deleteExportResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExportResourceBtnActionPerformed(evt);
            }
        });

        addExportResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        addExportResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        addExportResourceBtn.setText("Thêm");
        addExportResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExportResourceBtnMouseClicked(evt);
            }
        });
        addExportResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExportResourceBtnActionPerformed(evt);
            }
        });

        updateExportResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateExportResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateExportResourceBtn.setText("Cập Nhật");
        updateExportResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateExportResourceBtnMouseClicked(evt);
            }
        });
        updateExportResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateExportResourceBtnActionPerformed(evt);
            }
        });

        clearExportResourceBtn.setBackground(new java.awt.Color(204, 51, 0));
        clearExportResourceBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearExportResourceBtn.setText("Làm Mới");
        clearExportResourceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearExportResourceBtnMouseClicked(evt);
            }
        });
        clearExportResourceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearExportResourceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refreshExportResource)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(updateExportResourceBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(addExportResourceBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteExportResourceBtn))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel26))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(dateExportResource, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMaXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                                            .addComponent(clearExportResourceBtn))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshExportResource)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtMaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(dateExportResource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMaNV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addComponent(clearExportResourceBtn)
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateExportResourceBtn)
                    .addComponent(addExportResourceBtn)
                    .addComponent(deleteExportResourceBtn))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        main_page.addTab("Xuất Nguyên Liệu", jPanel7);

        exportResourceDetailTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        exportResourceDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        exportResourceDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportResourceDetailTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(exportResourceDetailTable);

        refreshExportResourceDetail.setText("Refresh");
        refreshExportResourceDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshExportResourceDetailActionPerformed(evt);
            }
        });

        cbMaNL1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel28.setForeground(java.awt.Color.black);
        jLabel28.setText("Nguyên Liệu Mã NL");

        cbMaXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setForeground(java.awt.Color.black);
        jLabel29.setText("Mã Xuất NL");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel30.setForeground(java.awt.Color.black);
        jLabel30.setText("Số Lượng");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel27.setForeground(java.awt.Color.black);
        jLabel27.setText("Đơn Vị");

        deleteExportResourceDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        deleteExportResourceDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteExportResourceDetailBtn.setText("Xóa");
        deleteExportResourceDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteExportResourceDetailBtnMouseClicked(evt);
            }
        });
        deleteExportResourceDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteExportResourceDetailBtnActionPerformed(evt);
            }
        });

        addExportResourceDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        addExportResourceDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        addExportResourceDetailBtn.setText("Thêm");
        addExportResourceDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addExportResourceDetailBtnMouseClicked(evt);
            }
        });
        addExportResourceDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExportResourceDetailBtnActionPerformed(evt);
            }
        });

        updateExportResourceDetailBtn.setBackground(new java.awt.Color(204, 51, 0));
        updateExportResourceDetailBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateExportResourceDetailBtn.setText("Cập Nhật");
        updateExportResourceDetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateExportResourceDetailBtnMouseClicked(evt);
            }
        });
        updateExportResourceDetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateExportResourceDetailBtnActionPerformed(evt);
            }
        });

        clearExportResourceDetailBtn1.setBackground(new java.awt.Color(204, 51, 0));
        clearExportResourceDetailBtn1.setForeground(new java.awt.Color(255, 255, 255));
        clearExportResourceDetailBtn1.setText("Làm Mới");
        clearExportResourceDetailBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearExportResourceDetailBtn1MouseClicked(evt);
            }
        });
        clearExportResourceDetailBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearExportResourceDetailBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(refreshExportResourceDetail)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(updateExportResourceDetailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(addExportResourceDetailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteExportResourceDetailBtn))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbMaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbMaNL1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clearExportResourceDetailBtn1)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDonVi1)
                                    .addComponent(txtSoLuong3, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshExportResourceDetail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMaNL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoLuong3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(txtDonVi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearExportResourceDetailBtn1)
                .addGap(45, 45, 45)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateExportResourceDetailBtn)
                    .addComponent(addExportResourceDetailBtn)
                    .addComponent(deleteExportResourceDetailBtn))
                .addContainerGap(213, Short.MAX_VALUE))
        );

        main_page.addTab("Chi Tiết Xuất Nguyên Liệu", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        parent.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void staffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_staffBtnMouseClicked

    private void resourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resourceBtnMouseClicked

    private void inputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBtnMouseClicked

    private void exportResourceDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportResourceDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exportResourceDetailBtnMouseClicked

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
        main_page.setSelectedIndex(0);

    }//GEN-LAST:event_staffBtnActionPerformed
    public void showDataOnTableStaff() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) staffTable.getModel();

        ArrayList arr = x.showDataALL_Staff();

        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));

        model.setDataVector(data, columnNames);
    }

    public void showDataOnTableResource() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) resouceTable.getModel();

        ArrayList arr = x.showDataALL_Resource();

        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));

        model.setDataVector(data, columnNames);
    }

    public void showDataOnTableInput() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) inputTable.getModel();

        ArrayList arr = x.showDataALL_Input();
        ArrayList nhanViens = x.showDataALL_Staff();
        if (nhanViens != null && nhanViens.size() > 0) {
            cbMaNV.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) nhanViens.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaNV.addItem(row[0]);
                }
                cbMaNV.setSelectedIndex(0);
            }
        }
        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));
        model.setDataVector(data, columnNames);
    }

    public void showDataOnTableInputDetail() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) inputDetailTable.getModel();

        ArrayList arr = x.showDataALL_InputDetail();
        ArrayList dsNguyenLieu = x.showDataALL_Resource();
        if (dsNguyenLieu != null && dsNguyenLieu.size() > 0) {
            cbMaNL.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) dsNguyenLieu.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaNL.addItem(row[0]);
                }
                cbMaNL.setSelectedIndex(0);
            }
        }
        ArrayList dsPN = x.showDataALL_Input();
        if (dsPN != null && dsPN.size() > 0) {
            cbMaPN.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) dsPN.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaPN.addItem(row[0]);
                }
                cbMaPN.setSelectedIndex(0);
            }
        }
        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));

        model.setDataVector(data, columnNames);
    }

    public void showDataOnTableExportResource() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) exportResourceTable.getModel();

        ArrayList arr = x.showDataALL_ExportResource();
        ArrayList nhanViens = x.showDataALL_Staff();
        if (nhanViens != null && nhanViens.size() > 0) {
            cbMaNV1.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) nhanViens.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaNV1.addItem(row[0]);
                }
                cbMaNV1.setSelectedIndex(0);
            }
        }
        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));

        model.setDataVector(data, columnNames);
    }

    public void showDataOnTableExportResourceDetail() {
        GetData x = new GetData();
        DefaultTableModel model = (DefaultTableModel) exportResourceDetailTable.getModel();

        ArrayList arr = x.showDataALL_ExportResourceDetail();
        ArrayList dsNguyenLieu = x.showDataALL_Resource();
        if (dsNguyenLieu != null && dsNguyenLieu.size() > 0) {
            cbMaNL1.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) dsNguyenLieu.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaNL1.addItem(row[0]);
                }
                cbMaNL1.setSelectedIndex(0);
            }
        }
        ArrayList dsXuat = x.showDataALL_ExportResource();
        if (dsXuat != null && dsXuat.size() > 0) {
            cbMaXuat.removeAllItems();
            String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) dsXuat.get(1));
            if (data != null && data.length > 0) {
                for (String[] row : data) {
                    cbMaXuat.addItem(row[0]);
                }
                cbMaXuat.setSelectedIndex(0);
            }
        }
        String[] columnNames = (String[]) arr.get(0);
        String[][] data = ConvertDataORCL.ConvertObject2DToString2D((Object[][]) arr.get(1));

        model.setDataVector(data, columnNames);
    }

    private void resourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceBtnActionPerformed
        main_page.setSelectedIndex(1);
    }//GEN-LAST:event_resourceBtnActionPerformed

    private void inputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBtnActionPerformed
        main_page.setSelectedIndex(2);
    }//GEN-LAST:event_inputBtnActionPerformed

    private void inputDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDetailBtnActionPerformed
        main_page.setSelectedIndex(3);
    }//GEN-LAST:event_inputDetailBtnActionPerformed

    private void exportResourceDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportResourceDetailBtnActionPerformed
        main_page.setSelectedIndex(5);
    }//GEN-LAST:event_exportResourceDetailBtnActionPerformed

    private boolean addNewStaff(String maNv, String tenNV, String sdt, String gioiTinh, String taiKhoan) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO NHANVIEN (MANV, TENNV, SDT, GIOITINH, TAIKHOAN) "
                    + "VALUES ('" + maNv + "', '" + tenNV + "', '" + sdt + "', '" + gioiTinh + "', '" + taiKhoan + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean addNewResource(String maNL, String tenNL, int soLuong, String donVi) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO KHONGUYENLIEU (MANL, TENNL, SOLUONG, DONVI) "
                    + "VALUES ('" + maNL + "', '" + tenNL + "', '" + soLuong + "', '" + donVi + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    private String toDateFormat(Date date) {
        return "TO_DATE('" + (date.getMonth() + 1) + "/" + date.getDate() + "/" + (date.getYear() + 1900) + "', 'MM/DD/YYYY')";
    }
    private boolean addNewInput(String maPN, Date ngayNhap, String maNv) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO PHIEUNHAP (MAPN, NGAYNHAP, NHANVIENMANV) "
                    + "VALUES ('" + maPN + "', " + toDateFormat(ngayNhap) + ", '" + maNv + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    private boolean addNewInputDetail(String soLuong, String giaNhap, String tenNcc, Date ngayNhap, String maNL, String maPN) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO CHITIETPHIEUNHAP (SOLUONG, GIANHAP, TENNCC, NGAYNHAP, NGUYENLIEUMANL, PHIEUNHAPMAPN) "
                    + "VALUES ('" + soLuong + "', '" + giaNhap + "', '" + tenNcc + "', " + toDateFormat(ngayNhap) + ", '" + maNL + "', '" + maPN + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean addNewExportResource(String maXuat, Date ngayXuat, String maNV) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO XUATNGUYENLIEU (MAXUAT, NGAYXUAT, NHANVIENMANV) "
                    + "VALUES ('" + maXuat + "', " + toDateFormat(ngayXuat) + ", '" + maNV + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean addNewExportResourceDetail(String maNL, String maXuat, String soLuong, String donVi) {
        try {
            DataAccess ds = new DataAccess("INSERT INTO CHITIETXUAT (KHONGUYENLIEUMANL, XUATNGUYENLIEUMAXUAT, SOLUONG, DONVI) "
                    + "VALUES ('" + maNL + "', '" + maXuat + "', '" + soLuong + "', '" + donVi + "')");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean updateStaff(String maNv, String tenNV, String sdt, String gioiTinh, String taiKhoan) {
        try {
            DataAccess ds = new DataAccess("Update NHANVIEN "
                    + "Set TENNV = '" + tenNV + "' , SDT = '" + sdt + "' , GIOITINH = '" + gioiTinh + "' , TAIKHOAN = '" + taiKhoan + "' "
                    + "Where MANV = '" + maNv + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean updateResource(String maNL, String tenNL, int soLuong, String donVi) {
        try {
            DataAccess ds = new DataAccess("Update KHONGUYENLIEU "
                    + "Set TENNL = '" + tenNL + "' , SOLUONG = '" + soLuong + "' , DONVI = '" + donVi + "' "
                    + "Where MANL = '" + maNL + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean updateInput(String maPN, Date ngayNhap, String maNv) {
        try {
            DataAccess ds = new DataAccess("Update PHIEUNHAP "
                    + "Set NGAYNHAP = " + toDateFormat(ngayNhap) + " , NHANVIENMANV = '" + maNv + "' "
                    + "Where MAPN = '" + maPN + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean updateInputDetail(String soLuong, String giaNhap, String tenNcc, Date ngayNhap, String maNL, String maPN) {
        try {
            DataAccess ds = new DataAccess("Update CHITIETPHIEUNHAP "
                    + "Set SOLUONG = '" + soLuong + "' , GIANHAP = '" + giaNhap + "' , TENNCC = '" + tenNcc + "' , NGAYNHAP = " + toDateFormat(ngayNhap) + " "
                    + "Where NGUYENLIEUMANL = '" + maNL + "' AND PHIEUNHAPMAPN = '" + maPN + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean updateExportResource(String maXuat, Date ngayXuat, String maNV) {
        try {
            DataAccess ds = new DataAccess("Update XUATNGUYENLIEU "
                    + "Set NGAYXUAT = " + toDateFormat(ngayXuat) + " , NHANVIENMANV = '" + maNV + "' "
                    + "Where MAXUAT = '" + maXuat + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean updateExportResourceDetail(String maNL, String maXuat, String soLuong, String donVi) {
        try {
            DataAccess ds = new DataAccess("Update CHITIETXUAT "
                    + "Set SOLUONG = '" + soLuong + "', DONVI = '" + donVi + "' "
                    + "Where KHONGUYENLIEUMANL = '" + maNL + "' AND XUATNGUYENLIEUMAXUAT = '" + maXuat + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteStaff(String maNv) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM NHANVIEN Where MANV = '" + maNv + "'");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private boolean deleteResource(String maNL) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM KHONGUYENLIEU Where MANL = '" + maNL + "'");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean deleteInput(String maPN) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM PHIEUNHAP Where MAPN = '" + maPN + "'");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean deleteInputDetail(String maNL, String maPN) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM CHITIETPHIEUNHAP "
                                         + "Where NGUYENLIEUMANL = '" + maNL + "' AND PHIEUNHAPMAPN = '" + maPN + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean deleteExportResource(String maXuat) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM XUATNGUYENLIEU "
                                         + "Where MAXUAT = '" + maXuat + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    private boolean deleteExportResourceDetail(String maNL, String maXuat) {
        try {
            DataAccess ds = new DataAccess("DELETE FROM CHITIETXUAT "
                                         + "Where KHONGUYENLIEUMANL = '" + maNL + "' AND XUATNGUYENLIEUMAXUAT = '" + maXuat + "' ");
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private void addStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addStaffBtnMouseClicked

    }//GEN-LAST:event_addStaffBtnMouseClicked

    private void updateStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateStaffBtnMouseClicked

    }//GEN-LAST:event_updateStaffBtnMouseClicked

    private void updateStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStaffBtnActionPerformed
        if (txtMaNv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nhân Viên không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNhanVien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên Nhân Viên không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Điện Thoại không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSdt.getText().trim().length() < 10 || txtSdt.getText().trim().length() > 12) {
            JOptionPane.showMessageDialog(this, "Ô Số Điện Thoại phải nằm trong khoảng 10 - 12!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tài Khoản không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((!male.isSelected() && !female.isSelected())) {
            JOptionPane.showMessageDialog(this, "Chọn giới tính!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gender = "";
        if (male.isSelected()) {
            gender = "Nam";
        } else {
            gender = "Nữ";
        }
        if (updateStaff(txtMaNv.getText().trim(), txtTenNhanVien.getText().trim(), txtSdt.getText().trim(),
                gender, txtTaiKhoan.getText().trim())) {
            showDataOnTableStaff();
            JOptionPane.showMessageDialog(this, "Sửa Nhân Viên thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldStaff();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateStaffBtnActionPerformed

    private void refreshStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStaffActionPerformed
        showDataOnTableStaff();
    }//GEN-LAST:event_refreshStaffActionPerformed

    private void refreshResouceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshResouceActionPerformed
        showDataOnTableResource();
    }//GEN-LAST:event_refreshResouceActionPerformed

    private void refreshInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInputActionPerformed
        showDataOnTableInput();
    }//GEN-LAST:event_refreshInputActionPerformed

    private void refreshInputDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshInputDetailActionPerformed
        showDataOnTableInputDetail();
    }//GEN-LAST:event_refreshInputDetailActionPerformed

    private void refreshExportResourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshExportResourceActionPerformed
        showDataOnTableExportResource();
    }//GEN-LAST:event_refreshExportResourceActionPerformed

    private void exportResourceBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportResourceBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exportResourceBtn1MouseClicked

    private void exportResourceBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportResourceBtn1ActionPerformed
        main_page.setSelectedIndex(4);
    }//GEN-LAST:event_exportResourceBtn1ActionPerformed

    private void refreshExportResourceDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshExportResourceDetailActionPerformed
        showDataOnTableExportResourceDetail();
    }//GEN-LAST:event_refreshExportResourceDetailActionPerformed

    private void main_pageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_pageMouseClicked

    }//GEN-LAST:event_main_pageMouseClicked

    private void main_pageStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_main_pageStateChanged
        switch (main_page.getSelectedIndex()) {
            case 0:
                showDataOnTableStaff();
                break;
            case 1:
                showDataOnTableResource();
                break;
            case 2:
                showDataOnTableInput();
                break;
            case 3:
                showDataOnTableInputDetail();
                break;
            case 4:
                showDataOnTableExportResource();
                break;
            case 5:
                showDataOnTableExportResourceDetail();
                break;
        }
    }//GEN-LAST:event_main_pageStateChanged

    private void addStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffBtnActionPerformed
        if (txtMaNv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nhân Viên không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNhanVien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên Nhân Viên không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Điện Thoại không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSdt.getText().trim().length() < 10 || txtSdt.getText().trim().length() > 12) {
            JOptionPane.showMessageDialog(this, "Ô Số Điện Thoại phải nằm trong khoảng 10 - 12!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTaiKhoan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tài Khoản không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if ((!male.isSelected() && !female.isSelected())) {
            JOptionPane.showMessageDialog(this, "Chọn giới tính!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String gender = "";
        if (male.isSelected()) {
            gender = "Nam";
        } else {
            gender = "Nữ";
        }
        if (addNewStaff(txtMaNv.getText().trim(), txtTenNhanVien.getText().trim(), txtSdt.getText().trim(),
                gender, txtTaiKhoan.getText().trim())) {
            showDataOnTableStaff();
            JOptionPane.showMessageDialog(this, "Tạo Nhân Viên thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldStaff();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addStaffBtnActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void staffTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_staffTablePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_staffTablePropertyChange

    private void ResetFieldStaff() {
        txtMaNv.setText("");
        txtTenNhanVien.setText("");
        txtSdt.setText("");
        male.setSelected(false);
        female.setSelected(false);
        txtTaiKhoan.setText("");
    }

    private void ResetFieldResource() {
        txtMaNL.setText("");
        txtTenNL.setText("");
        txtSoLuong.setText("");
        txtDonVi.setText("");
    }
    
    private void ResetFieldInput() {
        txtMaPN.setText("");
        dateNgayNhap.setDate(new Date());
        cbMaNV.setSelectedIndex(0);
    }
    
    private void ResetFieldInputDetail() {
        txtSoLuong2.setText("");
        txtGiaNhap.setText("");
        txtTenNCC.setText("");
        dateInputDetail.setDate(new Date());
        cbMaNL.setSelectedIndex(0);
        cbMaPN.setSelectedIndex(0);
    }
    
    private void ResetFieldExportResource() {
        txtMaXuat.setText("");
        dateExportResource.setDate(new Date());
        cbMaNV1.setSelectedIndex(0);
    }
    
    private void ResetFieldExportResourceDetail() {
        cbMaNL1.setSelectedIndex(0);
        cbMaXuat.setSelectedIndex(0);
        txtSoLuong3.setText("");
        txtDonVi1.setText("");
    }
    private void staffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMouseClicked
        if (staffTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = staffTable.getSelectedRow();
        String maNv = staffTable.getValueAt(row, 0).toString();
        String tenNv = staffTable.getValueAt(row, 1).toString();
        String sdt = staffTable.getValueAt(row, 2).toString();
        String gioiTinh = staffTable.getValueAt(row, 3).toString();
        String taiKhoan = staffTable.getValueAt(row, 4).toString();

        txtMaNv.setText(maNv);
        txtTenNhanVien.setText(tenNv);
        txtSdt.setText(sdt);
        if (gioiTinh.equalsIgnoreCase("nam")) {
            male.setSelected(true);
            female.setSelected(false);
        } else {
            male.setSelected(false);
            female.setSelected(true);
        }
        txtTaiKhoan.setText(taiKhoan);
    }//GEN-LAST:event_staffTableMouseClicked

    private void clearStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearStaffBtnMouseClicked
        ResetFieldStaff();
    }//GEN-LAST:event_clearStaffBtnMouseClicked

    private void clearStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearStaffBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearStaffBtnActionPerformed

    private void deleteStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteStaffBtnMouseClicked
        if (txtMaNv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nhân Viên không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (deleteStaff(txtMaNv.getText().trim())) {
            showDataOnTableStaff();
            JOptionPane.showMessageDialog(this, "Xóa Nhân Viên thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldStaff();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteStaffBtnMouseClicked

    private void deleteStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffBtnActionPerformed

    }//GEN-LAST:event_deleteStaffBtnActionPerformed

    private void deleteResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteResourceBtnMouseClicked

    private void deleteResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResourceBtnActionPerformed
        if (txtMaNL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nguyên Liệu không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (deleteResource(txtMaNL.getText().trim())) {
            showDataOnTableResource();
            JOptionPane.showMessageDialog(this, "Xóa Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteResourceBtnActionPerformed

    private void addResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addResourceBtnMouseClicked

    private void addResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResourceBtnActionPerformed
        if (txtMaNL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nguyên Liệu không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên Nguyên Liệu không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtDonVi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Đơn Vị không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addNewResource(txtMaNL.getText().trim(), txtTenNL.getText().trim(), Integer.parseInt(txtSoLuong.getText().trim()),
                txtDonVi.getText().trim())) {
            showDataOnTableResource();
            JOptionPane.showMessageDialog(this, "Tạo Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addResourceBtnActionPerformed

    private void updateResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateResourceBtnMouseClicked

    private void updateResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateResourceBtnActionPerformed
        if (txtMaNL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Nguyên Liệu không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên Nguyên Liệu không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtDonVi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Đơn Vị không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (updateResource(txtMaNL.getText().trim(), txtTenNL.getText().trim(), Integer.parseInt(txtSoLuong.getText().trim()),
                txtDonVi.getText().trim())) {
            showDataOnTableResource();
            JOptionPane.showMessageDialog(this, "Sửa Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateResourceBtnActionPerformed

    private void clearResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearResourceBtnMouseClicked

    private void clearResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearResourceBtnActionPerformed
        ResetFieldResource();
    }//GEN-LAST:event_clearResourceBtnActionPerformed

    private void resouceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resouceTableMouseClicked
        if (resouceTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = resouceTable.getSelectedRow();
        String maNL = resouceTable.getValueAt(row, 0).toString();
        String tenNL = resouceTable.getValueAt(row, 1).toString();
        String soLuong = resouceTable.getValueAt(row, 2).toString();
        String donVi = resouceTable.getValueAt(row, 3).toString();

        txtMaNL.setText(maNL);
        txtTenNL.setText(tenNL);
        txtSoLuong.setText(soLuong);
        txtDonVi.setText(donVi);
    }//GEN-LAST:event_resouceTableMouseClicked

    private void deleteInputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInputBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInputBtnMouseClicked

    private void deleteInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInputBtnActionPerformed
        if (txtMaPN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Phiếu Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (deleteInput(txtMaPN.getText().trim())) {
            showDataOnTableInput();
            JOptionPane.showMessageDialog(this, "Xóa Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInput();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteInputBtnActionPerformed

    private void addInputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInputBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addInputBtnMouseClicked

    private void addInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInputBtnActionPerformed
        if (txtMaPN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Phiếu Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateNgayNhap.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Ngày Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addNewInput(txtMaPN.getText().trim(), dateNgayNhap.getDate(), cbMaNV.getSelectedItem().toString())) {
            showDataOnTableInput();
            JOptionPane.showMessageDialog(this, "Tạo Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInput();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addInputBtnActionPerformed

    private void updateInputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInputBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateInputBtnMouseClicked

    private void updateInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInputBtnActionPerformed
        if (txtMaPN.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Phiếu Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateNgayNhap.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ô Ngày Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (updateInput(txtMaPN.getText().trim(), dateNgayNhap.getDate(), cbMaNV.getSelectedItem().toString())) {
            showDataOnTableInput();
            JOptionPane.showMessageDialog(this, "Sửa Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInput();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateInputBtnActionPerformed

    private void clearInputBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearInputBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearInputBtnMouseClicked

    private void clearInputBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInputBtnActionPerformed
        ResetFieldInput();
    }//GEN-LAST:event_clearInputBtnActionPerformed

    private void inputTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputTableMouseClicked
        if (inputTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = inputTable.getSelectedRow();
        String maPN = inputTable.getValueAt(row, 0).toString();
        String ngayNhap = inputTable.getValueAt(row, 1).toString();
        String maNV = inputTable.getValueAt(row, 2).toString();
        
        txtMaPN.setText(maPN);
        try {
            dateNgayNhap.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhap));
        } catch (ParseException ex) {
            Logger.getLogger(ManagementMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbMaNV.setSelectedItem(maNV);
    }//GEN-LAST:event_inputTableMouseClicked

    private void clearInputDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearInputDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearInputDetailBtnMouseClicked

    private void clearInputDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInputDetailBtnActionPerformed
        ResetFieldInputDetail();
    }//GEN-LAST:event_clearInputDetailBtnActionPerformed

    private void updateInputDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateInputDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateInputDetailBtnMouseClicked

    private void updateInputDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInputDetailBtnActionPerformed
        if (txtSoLuong2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong2.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtGiaNhap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Giá Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtGiaNhap.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Giá Nhập chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNCC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên NCC không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateInputDetail.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ô Ngày Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (updateInputDetail(txtSoLuong2.getText().trim(), txtGiaNhap.getText().trim(), txtTenNCC.getText().trim()
                , dateInputDetail.getDate(), cbMaNL.getSelectedItem().toString() , cbMaPN.getSelectedItem().toString())) {
            showDataOnTableInputDetail();
            JOptionPane.showMessageDialog(this, "Sửa Chi Tiết Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInputDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateInputDetailBtnActionPerformed

    private void addInputDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addInputDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addInputDetailBtnMouseClicked

    private void addInputDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInputDetailBtnActionPerformed
        if (txtSoLuong2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong2.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtGiaNhap.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Giá Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtGiaNhap.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Giá Nhập chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtTenNCC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Tên NCC không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateInputDetail.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ô Ngày Nhập không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addNewInputDetail(txtSoLuong2.getText().trim(), txtGiaNhap.getText().trim(), txtTenNCC.getText().trim()
                , dateInputDetail.getDate(), cbMaNL.getSelectedItem().toString() , cbMaPN.getSelectedItem().toString())) {
            showDataOnTableInputDetail();
            JOptionPane.showMessageDialog(this, "Tạo Chi Tiết Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInputDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addInputDetailBtnActionPerformed

    private void deleteInputDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteInputDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteInputDetailBtnMouseClicked

    private void deleteInputDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInputDetailBtnActionPerformed
        if (deleteInputDetail(cbMaNL.getSelectedItem().toString(), cbMaPN.getSelectedItem().toString())) {
            showDataOnTableInputDetail();
            JOptionPane.showMessageDialog(this, "Xóa Chi Tiết Phiếu Nhập thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldInputDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteInputDetailBtnActionPerformed

    private void inputDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputDetailTableMouseClicked
        if (inputDetailTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = inputDetailTable.getSelectedRow();
        String soLuong = inputDetailTable.getValueAt(row, 0).toString();
        String giaNhap = inputDetailTable.getValueAt(row, 1).toString();
        String tenNCC = inputDetailTable.getValueAt(row, 2).toString();
        String ngayNhap = inputDetailTable.getValueAt(row, 3).toString();
        String maNL = inputDetailTable.getValueAt(row, 4).toString();
        String maPN = inputDetailTable.getValueAt(row, 5).toString();
        txtSoLuong2.setText(soLuong);
        txtGiaNhap.setText(giaNhap);
        txtTenNCC.setText(tenNCC);
        cbMaNL.setSelectedItem(maNL);
        cbMaPN.setSelectedItem(maPN);
        try {
            dateInputDetail.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(ngayNhap));
        } catch (ParseException ex) {
            Logger.getLogger(ManagementMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inputDetailTableMouseClicked

    private void deleteExportResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteExportResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteExportResourceBtnMouseClicked

    private void deleteExportResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExportResourceBtnActionPerformed
        if (txtMaXuat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Xuất không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (deleteExportResource(txtMaXuat.getText().trim())) {
            showDataOnTableExportResource();
            JOptionPane.showMessageDialog(this, "Xóa Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteExportResourceBtnActionPerformed

    private void addExportResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExportResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addExportResourceBtnMouseClicked

    private void addExportResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExportResourceBtnActionPerformed
        if (txtMaXuat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Xuất không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateExportResource.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ô Ngày Xuất không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addNewExportResource(txtMaXuat.getText().trim(), dateExportResource.getDate(), cbMaNV1.getSelectedItem().toString())) {
            showDataOnTableExportResource();
            JOptionPane.showMessageDialog(this, "Tạo Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addExportResourceBtnActionPerformed

    private void updateExportResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateExportResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateExportResourceBtnMouseClicked

    private void updateExportResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateExportResourceBtnActionPerformed
        if (txtMaXuat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Mã Xuất không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (dateExportResource.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ô Ngày Xuất không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (updateExportResource(txtMaXuat.getText().trim(), dateExportResource.getDate(), cbMaNV1.getSelectedItem().toString())) {
            showDataOnTableExportResource();
            JOptionPane.showMessageDialog(this, "Sửa Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResource();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateExportResourceBtnActionPerformed

    private void clearExportResourceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearExportResourceBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearExportResourceBtnMouseClicked

    private void clearExportResourceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearExportResourceBtnActionPerformed
        ResetFieldExportResource();
    }//GEN-LAST:event_clearExportResourceBtnActionPerformed

    private void deleteExportResourceDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteExportResourceDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteExportResourceDetailBtnMouseClicked

    private void deleteExportResourceDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteExportResourceDetailBtnActionPerformed
        if (deleteExportResourceDetail(cbMaNL1.getSelectedItem().toString(), cbMaXuat.getSelectedItem().toString())) {
            showDataOnTableExportResourceDetail();
            JOptionPane.showMessageDialog(this, "Xóa Chi Tiết Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResourceDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteExportResourceDetailBtnActionPerformed

    private void addExportResourceDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addExportResourceDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addExportResourceDetailBtnMouseClicked

    private void addExportResourceDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExportResourceDetailBtnActionPerformed
        if (txtSoLuong3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong3.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtDonVi1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Đơn Vị không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addNewExportResourceDetail(cbMaNL1.getSelectedItem().toString(), cbMaXuat.getSelectedItem().toString()
                , txtSoLuong3.getText().toString(), txtDonVi1.getText().toString())) {
            showDataOnTableExportResourceDetail();
            JOptionPane.showMessageDialog(this, "Tạo Chi Tiết Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResourceDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addExportResourceDetailBtnActionPerformed

    private void updateExportResourceDetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateExportResourceDetailBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateExportResourceDetailBtnMouseClicked

    private void updateExportResourceDetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateExportResourceDetailBtnActionPerformed
        if (txtSoLuong3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Integer.parseInt(txtSoLuong3.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ô Số Lượng chỉ có thể nhập số!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (txtDonVi1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ô Đơn Vị không được để trống!", "Cảnh Báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (updateExportResourceDetail(cbMaNL1.getSelectedItem().toString(), cbMaXuat.getSelectedItem().toString()
                , txtSoLuong3.getText().toString(), txtDonVi1.getText().toString())) {
            showDataOnTableExportResourceDetail();
            JOptionPane.showMessageDialog(this, "Sửa Chi Tiết Xuất Nguyên Liệu thành công !", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            ResetFieldExportResourceDetail();
        } else {
            JOptionPane.showMessageDialog(this, "Thất bại", "Lỗi tạo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateExportResourceDetailBtnActionPerformed

    private void clearExportResourceDetailBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearExportResourceDetailBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_clearExportResourceDetailBtn1MouseClicked

    private void clearExportResourceDetailBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearExportResourceDetailBtn1ActionPerformed
        ResetFieldExportResourceDetail();
    }//GEN-LAST:event_clearExportResourceDetailBtn1ActionPerformed

    private void exportResourceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportResourceTableMouseClicked
        if (exportResourceTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = exportResourceTable.getSelectedRow();
        String maXuat = exportResourceTable.getValueAt(row, 0).toString();
        String ngayXuat = exportResourceTable.getValueAt(row, 1).toString();
        String maNV = exportResourceTable.getValueAt(row, 2).toString();
        
        txtMaXuat.setText(maXuat);
        try {
            dateExportResource.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(ngayXuat));
        } catch (ParseException ex) {
            Logger.getLogger(ManagementMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        cbMaNV1.setSelectedItem(maNV);
    }//GEN-LAST:event_exportResourceTableMouseClicked

    private void exportResourceDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportResourceDetailTableMouseClicked
        if (exportResourceDetailTable.getSelectedRowCount() == 0) {
            return;
        }
        int row = exportResourceDetailTable.getSelectedRow();
        String maNL = exportResourceDetailTable.getValueAt(row, 0).toString();
        String maXuat = exportResourceDetailTable.getValueAt(row, 1).toString();
        String soLuong = exportResourceDetailTable.getValueAt(row, 2).toString();
        String donVi = exportResourceDetailTable.getValueAt(row, 3).toString();
        
        cbMaNL1.setSelectedItem(maNL);
        cbMaXuat.setSelectedItem(maXuat);
        txtSoLuong3.setText(soLuong);
        txtDonVi1.setText(donVi);
    }//GEN-LAST:event_exportResourceDetailTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addExportResourceBtn;
    private javax.swing.JButton addExportResourceDetailBtn;
    private javax.swing.JButton addInputBtn;
    private javax.swing.JButton addInputDetailBtn;
    private javax.swing.JButton addResourceBtn;
    private javax.swing.JButton addStaffBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbMaNL;
    private javax.swing.JComboBox<String> cbMaNL1;
    private javax.swing.JComboBox<String> cbMaNV;
    private javax.swing.JComboBox<String> cbMaNV1;
    private javax.swing.JComboBox<String> cbMaPN;
    private javax.swing.JComboBox<String> cbMaXuat;
    private javax.swing.JButton clearExportResourceBtn;
    private javax.swing.JButton clearExportResourceDetailBtn1;
    private javax.swing.JButton clearInputBtn;
    private javax.swing.JButton clearInputDetailBtn;
    private javax.swing.JButton clearResourceBtn;
    private javax.swing.JButton clearStaffBtn;
    private com.toedter.calendar.JDateChooser dateExportResource;
    private com.toedter.calendar.JDateChooser dateInputDetail;
    private com.toedter.calendar.JDateChooser dateNgayNhap;
    private javax.swing.JButton deleteExportResourceBtn;
    private javax.swing.JButton deleteExportResourceDetailBtn;
    private javax.swing.JButton deleteInputBtn;
    private javax.swing.JButton deleteInputDetailBtn;
    private javax.swing.JButton deleteResourceBtn;
    private javax.swing.JButton deleteStaffBtn;
    private javax.swing.JButton exportResourceBtn1;
    private javax.swing.JButton exportResourceDetailBtn;
    private javax.swing.JTable exportResourceDetailTable;
    private javax.swing.JTable exportResourceTable;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton inputBtn;
    private javax.swing.JButton inputDetailBtn;
    private javax.swing.JTable inputDetailTable;
    private javax.swing.JTable inputTable;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane main_page;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel panel;
    private javax.swing.JButton refreshExportResource;
    private javax.swing.JButton refreshExportResourceDetail;
    private javax.swing.JButton refreshInput;
    private javax.swing.JButton refreshInputDetail;
    private javax.swing.JButton refreshResouce;
    private javax.swing.JButton refreshStaff;
    private javax.swing.JTable resouceTable;
    private javax.swing.JButton resourceBtn;
    private javax.swing.JButton staffBtn;
    private javax.swing.JTable staffTable;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtDonVi1;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMaNL;
    private javax.swing.JTextField txtMaNv;
    private javax.swing.JTextField txtMaPN;
    private javax.swing.JTextField txtMaXuat;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoLuong2;
    private javax.swing.JTextField txtSoLuong3;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTenNCC;
    private javax.swing.JTextField txtTenNL;
    private javax.swing.JTextField txtTenNhanVien;
    private javax.swing.JButton updateExportResourceBtn;
    private javax.swing.JButton updateExportResourceDetailBtn;
    private javax.swing.JButton updateInputBtn;
    private javax.swing.JButton updateInputDetailBtn;
    private javax.swing.JButton updateResourceBtn;
    private javax.swing.JButton updateStaffBtn;
    // End of variables declaration//GEN-END:variables
}
