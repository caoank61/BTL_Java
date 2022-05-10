// Sap xep theo DTB
package DoHoa;
import static DoHoa.XuatDS.tblModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import quanly.Hoc_Sinh;
import quanly.Hoc_Sinhs;

public class KetQua4 extends javax.swing.JFrame {

    public KetQua4() {
        initComponents();
        initTable();
        sortDiemTB();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 400));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("DANH SÁCH HIỂN THỊ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MSHS", "Họ và Tên", "Lớp", "Địa Chỉ", "Ngày ", "Tháng", "Năm", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "Điểm Văn", "Điểm Sử", "Điểm Địa", "Điểm Trung Bình"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 0));
        jButton1.setText("BACK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jButton1)))
                .addContainerGap(423, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void sortDiemTB(){
        Hoc_Sinh a = new Hoc_Sinh();
        Hoc_Sinhs b = new Hoc_Sinhs();
        b.sortDiem_TB();
        tblModel.setRowCount(0);
        for(int i=0; i< b.size() ;i++){
            Object[] row = new Object[] {
            b.elementAt(i).getMSHS(),
            b.elementAt(i).getHoTen(),
            b.elementAt(i).getLop(),
            b.elementAt(i).getDia_Chi(),
            b.elementAt(i).getNgay(),
            b.elementAt(i).getThang(),
            b.elementAt(i).getNam(),
            b.elementAt(i).getDiem_Toan(),
            b.elementAt(i).getDiem_Ly(),
            b.elementAt(i).getDiem_Hoa(),
            b.elementAt(i).getDiem_Van(),
            b.elementAt(i).getDiem_Su(),
            b.elementAt(i).getDiem_Dia(),
            b.elementAt(i).Tinh_DiemTB(b.elementAt(i).getDiem_Toan(),b.elementAt(i).getDiem_Ly(),b.elementAt(i).getDiem_Hoa(),b.elementAt(i).getDiem_Van(),b.elementAt(i).getDiem_Su(),b.elementAt(i).getDiem_Dia()),
            };
            tblModel.addRow(row);
        }   
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
                new KetQua4().setVisible(true);
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
