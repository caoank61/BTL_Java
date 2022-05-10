package DoHoa;

import static DoHoa.XuatDS.ID;
import static DoHoa.XuatDS.tblModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import quanly.Hoc_Sinh;
import quanly.Hoc_Sinhs;
import quanly.Hoc_Sinh_Olympic;
import quanly.Hoc_Sinh_Olympics;
import static quanly.Hoc_Sinhs.hs;
import quanly.Mon_Olympic;
import quanly.DangKy;
public class DangKyOlympic extends javax.swing.JFrame {

    public DangKyOlympic() {
        initComponents();
        initTable();
        loadData();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("ĐĂNG KÝ OLYMPIC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("MSHS:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Môn Thi:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toan", "Ly", "Hoa", "Van", "Su", "Dia", "Tin", "Anh" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Ngày Thi:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MSHS", "Họ và Tên", "Lớp", "Địa Chỉ", "Ngày ", "Tháng", "Năm", "Môn Thi", "Ngày Thi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 204, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setText("Đăng Ký");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 204, 0));
        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông Tin Đã Đăng Ký");

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 204, 51));
        jButton4.setText("RELOAD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toan", "Ly", "Hoa", "Van", "Su", "Dia", "Tin", "Anh" }));

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 204, 51));
        jButton5.setText("Hủy Môn");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Chọn Môn Hủy:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(437, 437, 437))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(439, 439, 439))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)
                        .addGap(439, 439, 439))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(1, 1, 1))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Hoc_Sinh_Olympics hsos = new Hoc_Sinh_Olympics();
        String selectMon = jComboBox1.getSelectedItem().toString();
        if(selectMon.equals(DangKy.checkMon(selectMon,ID))){
            JOptionPane.showMessageDialog(rootPane, "Mon Dang Ky Bi Trung", "Loi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Mon_Olympic.insertMonSQL(selectMon, ID);
        hsos = Hoc_Sinh_Olympics.printOlympic(ID);
        tblModel.setRowCount(0);
         for(int i=0; i< hsos.size() ;i++){
            Object[] row = new Object[] {
            hsos.elementAt(i).getMSHS(),
            hsos.elementAt(i).getHoTen(),
            hsos.elementAt(i).getLop(),
            hsos.elementAt(i).getDia_Chi(),
            hsos.elementAt(i).getNgay(),
            hsos.elementAt(i).getThang(),
            hsos.elementAt(i).getNam(),
            hsos.elementAt(i).getTENMON(),
            hsos.elementAt(i).getNGAYTHI(),
            };
            tblModel.addRow(row);
         }
       tblModel.fireTableDataChanged();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame ChucNang = new ChucNang();
        JFrame DangKyOlympic = new DangKyOlympic();
        ChucNang.setVisible(true);
        DangKyOlympic.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
  
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

        jComboBox1.getSelectedItem();
        if (jComboBox1.getSelectedItem().equals("Toan")){
            jLabel5.setText("04/06/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Ly")){
            jLabel5.setText("10/06/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Hoa")){
            jLabel5.setText("14/07/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Van")){
            jLabel5.setText("06/08/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Su")){
            jLabel5.setText("03/06/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Dia")){
            jLabel5.setText("05/06/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Tin")){
            jLabel5.setText("10/10/2022");
        }
        else if (jComboBox1.getSelectedItem().equals("Anh")){
            jLabel5.setText("30/06/2022");
        }
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Hoc_Sinh hs = new Hoc_Sinh(); 
        Hoc_Sinhs hss = new Hoc_Sinhs();
        hss.connect();
        ID = jTextField1.getText();
        StringBuffer sb = new StringBuffer();
        if (jTextField1.getText().equals("")){
            sb.append("Trong!");
        }
        else if (Hoc_Sinhs.checkID(ID)){
            JOptionPane.showMessageDialog(rootPane, "OK, Tiep Tuc Chon Mon Thi");
            outfindID();
        }
        else{
            JOptionPane.showMessageDialog(new JFrame(),"MSHS Khong Ton Tai","Loi",JOptionPane.ERROR_MESSAGE); 
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(rootPane, "MSHS Khong Duoc De Trong!", "Loi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5AncestorAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        initTable();
        loadData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jComboBox2.getSelectedItem();
        if (jComboBox2.getSelectedItem().equals("Toan")){
            
        }
        else if (jComboBox2.getSelectedItem().equals("Ly")){
            
        }  
        else if (jComboBox2.getSelectedItem().equals("Hoa")){
            
        }
        else if (jComboBox2.getSelectedItem().equals("Van")){

        }
        else if (jComboBox2.getSelectedItem().equals("Su")){

        }
        else if (jComboBox2.getSelectedItem().equals("Dia")){

        }
        else if (jComboBox2.getSelectedItem().equals("Tin")){

        }
        else if (jComboBox2.getSelectedItem().equals("Anh")){

        }
    }//GEN-LAST:event_jButton5ActionPerformed
    public void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[] {"MSHS","Họ Tên", "Lớp", "Địa Chỉ","Ngày", "Tháng", "Năm", "Môn Thi", "Ngày Thi"});
        jTable1.setModel(tblModel);
    }
    public void outfindID(){
        Hoc_Sinh_Olympics hsos = new Hoc_Sinh_Olympics();
        Hoc_Sinh_Olympic hso= new Hoc_Sinh_Olympic();
        hsos = Hoc_Sinh_Olympics.printOlympic(ID);
        initTable();
        tblModel.setRowCount(0);
         for(int i=0; i< hsos.size() ;i++){
            Object[] row = new Object[] {
            hsos.elementAt(i).getMSHS(),
            hsos.elementAt(i).getHoTen(),
            hsos.elementAt(i).getLop(),
            hsos.elementAt(i).getDia_Chi(),
            hsos.elementAt(i).getNgay(),
            hsos.elementAt(i).getThang(),
            hsos.elementAt(i).getNam(),
            hsos.elementAt(i).getTENMON(),
            hsos.elementAt(i).getNGAYTHI()
            };
        tblModel.addRow(row);
         }  
         if(hsos.size()==0){
            hso = Hoc_Sinh_Olympics.printresult2(ID);
            Object[] row1 = new Object[] {
            hso.getMSHS(),
            hso.getHoTen(),
            hso.getLop(),
            hso.getDia_Chi(),
            hso.getNgay(),
            hso.getThang(),
            hso.getNam(),
            hso.getTENMON(),
            hso.getNGAYTHI(),
            };
            tblModel.addRow(row1);
            }
            tblModel.fireTableDataChanged();
    }
        
   public void loadData() {
        Hoc_Sinh_Olympics hsos = new Hoc_Sinh_Olympics();
        Hoc_Sinh_Olympics hsos1 = new Hoc_Sinh_Olympics();
        hsos = Hoc_Sinh_Olympics.printOlympic("1%");
        for(int i=0; i< hsos.size() ;i++){
            Object[] row = new Object[] {
            hsos.elementAt(i).getMSHS(),
            hsos.elementAt(i).getHoTen(),
            hsos.elementAt(i).getLop(),
            hsos.elementAt(i).getDia_Chi(),
            hsos.elementAt(i).getNgay(),
            hsos.elementAt(i).getThang(),
            hsos.elementAt(i).getNam(),
            hsos.elementAt(i).getTENMON(),
            hsos.elementAt(i).getNGAYTHI()
            };
        tblModel.addRow(row);
         }  
        hsos1 = Hoc_Sinh_Olympics.printresult1(Hoc_Sinh_Olympics.printID());
        for(int i=0; i< hsos1.size() ;i++){
            Object[] row1 = new Object[] {
            hsos1.elementAt(i).getMSHS(),
            hsos1.elementAt(i).getHoTen(),
            hsos1.elementAt(i).getLop(),
            hsos1.elementAt(i).getDia_Chi(),
            hsos1.elementAt(i).getNgay(),
            hsos1.elementAt(i).getThang(),
            hsos1.elementAt(i).getNam(),
            hsos1.elementAt(i).getTENMON(),
            hsos1.elementAt(i).getNGAYTHI(),
            };
            tblModel.addRow(row1);
         }
            tblModel.fireTableDataChanged();
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyOlympic().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
