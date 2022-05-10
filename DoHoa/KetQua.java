// Tìm kiem ID
package DoHoa;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import quanly.Hoc_Sinhs;
import quanly.Hoc_Sinh;
import static DoHoa.XuatDS.ID;
import static DoHoa.XuatDS.tblModel;

public class KetQua extends javax.swing.JFrame {
    public KetQua() {
        initComponents();
        initTable();
        outfindID();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 450));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MSHS", "Họ Tên", "Lớp", "Địa Chỉ", "Ngày ", "Tháng", "Năm", "Điểm Toán", "Điểm Lý", "Điểm Hoá", "Điểm Văn", "Điểm Sử", "Điểm Địa", "Điểm Trung Bình"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("THÔNG TIN DANH SÁCH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(389, 389, 389))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(209, 209, 209))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame XuatDS = new XuatDS();
        JFrame KetQua = new KetQua();
        XuatDS.setVisible(true);
        KetQua.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    
    public void outfindID(){
        Hoc_Sinh a = new Hoc_Sinh();
        Hoc_Sinhs b = new Hoc_Sinhs();
        a= Hoc_Sinhs.TimKiemID(ID);
        tblModel.setRowCount(0);
        Object[] row = new Object[] {
            a.getMSHS(),
            a.getHoTen(),
            a.getLop(),
            a.getDia_Chi(),
            a.getNgay(),
            a.getThang(),
            a.getNam(),
            a.getDiem_Toan(),
            a.getDiem_Ly(),
            a.getDiem_Hoa(),
            a.getDiem_Van(),
            a.getDiem_Su(),
            a.getDiem_Dia(),
            a.Tinh_DiemTB(a.getDiem_Toan(),a.getDiem_Ly(),a.getDiem_Hoa(),a.getDiem_Van(),a.getDiem_Su(),a.getDiem_Dia()),
            
            };  
            tblModel.addRow(row);
        tblModel.fireTableDataChanged();
    }
    

       public void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[] {"MSHS","Họ Tên", "Lớp", "Địa Chỉ","Ngày", "Tháng", "Năm", "Điểm Toán","Điểm Lý","Điểm Hóa","Điểm Văn","Điểm Sư","Điểm Địa", "Điểm TB"});
        jTable1.setModel(tblModel);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KetQua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
