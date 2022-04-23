/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniProject;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class GasolineCalculator extends javax.swing.JFrame {

    static final double PTT[] = {36.50, 33.24, 41.54, 29.34};
    static final double BCP[] = {37.74, 35.24, 42.64, 28.99};
    static final double SHELL[] = {37.34, 35.04, 41.84, 28.20};
    static final double ESSO[] = {37.03, 35.34, 41.55, 29.10};
    static int carType, petrolType, type, num, brand, amountNototal, vat, newLitre;
    static double litre = 0.0, amount = 0.0;
    private static final DecimalFormat df = new DecimalFormat("0.00");
        int i;

    /**
     * Creates new form GasolineCalculator
     */
    public GasolineCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoBcp = new javax.swing.JRadioButton();
        rdoPpt = new javax.swing.JRadioButton();
        rdoEsso = new javax.swing.JRadioButton();
        rdoShell = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cbxCartype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox<>();
        btnTax = new javax.swing.JButton();
        btnReceipt = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txrResult = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        ราคา = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("เติมน้ำมัน");

        jLabel2.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        jLabel2.setText("เลือกปั้ม");

        buttonGroup1.add(rdoBcp);
        rdoBcp.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        rdoBcp.setText("บางจาก");

        buttonGroup1.add(rdoPpt);
        rdoPpt.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        rdoPpt.setText("ปตท");

        buttonGroup1.add(rdoEsso);
        rdoEsso.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        rdoEsso.setText("เอสโซ่");

        buttonGroup1.add(rdoShell);
        rdoShell.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        rdoShell.setText("เซลล์");

        jLabel3.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        jLabel3.setText("เลือกปั้ม");

        cbxCartype.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        cbxCartype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEDAN", "PICKUP" }));
        cbxCartype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCartypeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        jLabel4.setText("ประเภทน้ำมัน");

        cbxType.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        cbxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gassohol95", "Gassohol91", "Benzin91", "Diesel" }));

        btnTax.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        btnTax.setText("พิมพ์ใบกำกับภาษี");
        btnTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaxActionPerformed(evt);
            }
        });

        btnReceipt.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        btnReceipt.setText("พิมพ์ใบเสร็จรับเงิน");
        btnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceiptActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 24)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txrResult.setColumns(20);
        txrResult.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 10)); // NOI18N
        txrResult.setRows(5);
        jScrollPane1.setViewportView(txrResult);

        jLabel8.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 18)); // NOI18N
        jLabel8.setText("บาท");

        txtAmount.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 18)); // NOI18N
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        ราคา.setFont(new java.awt.Font("FC Subject Rounded [Non-cml.] Bd", 0, 18)); // NOI18N
        ราคา.setText("ราคา");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ราคา, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTax)
                        .addGap(40, 40, 40)
                        .addComponent(btnReceipt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(rdoPpt)
                        .addGap(26, 26, 26)
                        .addComponent(rdoBcp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoShell)
                        .addGap(26, 26, 26)
                        .addComponent(rdoEsso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCartype, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoPpt)
                    .addComponent(rdoBcp)
                    .addComponent(rdoShell)
                    .addComponent(rdoEsso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCartype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ราคา, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTax)
                    .addComponent(btnReceipt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to Exit ?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                        

    private void btnTaxActionPerformed(java.awt.event.ActionEvent evt) {                                       

         i = 0;
        if (rdoPpt.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "PTT";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoBcp.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "BCP";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoShell.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "SHELL";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoEsso.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "ESSO";
            Camnal(CarType, OilPrice, Brand);
        }

    }                                      

    public double Camnal(String CarType, double OilPrice, String Brand) throws NumberFormatException {
        if (CarType == "SEDAN") {
            String OilType = (String) cbxType.getSelectedItem();
            if (OilType == "Gassohol95") {
                if (Brand == "PTT") {
                    OilPrice = PTT[0];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[0];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[0];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[0];
                }
            } else if (OilType == "Gassohol91") {
                if (Brand == "PTT") {
                    OilPrice = PTT[1];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[1];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[1];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[1];
                }
            } else if (OilType == "Benzin91") {
                if (Brand == "PTT") {
                    OilPrice = PTT[2];
                } else if (Brand == "BCP") {
                    OilPrice = BCP[2];
                } else if (Brand == "SHELL") {
                    OilPrice = SHELL[2];
                } else if (Brand == "ESSO") {
                    OilPrice = ESSO[2];
                }
            }
            Camnal2(OilPrice, Brand, OilType);
        } else if (CarType == "PICKUP") {
            String OilType = "Diesel";
            if (Brand == "PTT") {
                OilPrice = PTT[3];
            } else if (Brand == "BCP") {
                OilPrice = BCP[3];
            } else if (Brand == "SHELL") {
                OilPrice = SHELL[3];
            } else if (Brand == "ESSO") {
                OilPrice = ESSO[3];
            }
            Camnal2(OilPrice, Brand, OilType);
        }
        return OilPrice;

    }

    public void Camnal2(double OilPrice, String Brand, String OilType) throws NumberFormatException {
        String AmountString = txtAmount.getText();
        double AmountDouble = Double.valueOf(AmountString);
        double Litre = AmountDouble / OilPrice;
        double AmountPrice = AmountDouble / 1.07;
        double VAT = AmountDouble - AmountPrice;
        double Litre2 = (double) (Math.round(Litre * 100.0) / 100.0);
        double AmountPrice2 = (double) (Math.round(AmountPrice * 100.0) / 100.0);
        double VAT2 = (double) (Math.round(VAT * 100.0) / 100.0);
        if (i == 1) {
            txrResult.setText("\t" + Brand + " Gas Station\n"
                    + "\t" + "Tax Invoice\n"
                    + "-----------------------------------------------------------\n"
                    + OilType + "\t" + Litre2 + " Litre     " + AmountDouble + " Baht\n"
                    + "-----------------------------------------------------------\n"
                    + "\n"
                    + "Amount       : " + AmountPrice2 + "\n"
                    + "VAT 7%       : " + VAT2 + "\n"
                    + "Total Amount  : " + AmountDouble);
        } else if (i==0) {
            txrResult.setText("\t" + Brand + " Gas Station\n"
                    + "\t" + "Tax Invoice\n"
                    + "-----------------------------------------------------------\n"
                    + OilType + "\t" + Litre2 + " Litre     " + AmountDouble + " Baht\n"
                    + "-----------------------------------------------------------\n");
        }

    }
    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }                                  

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txrResult.setText("");
        txtAmount.setText("");
        buttonGroup1.clearSelection();
    }                                        

    private void cbxCartypeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
         i = 1;
        if (rdoPpt.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "PTT";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoBcp.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "BCP";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoShell.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "SHELL";
            Camnal(CarType, OilPrice, Brand);
        }
        if (rdoEsso.isSelected()) {
            String amount = txtAmount.getText();
            String CarType = (String) cbxCartype.getSelectedItem();
            double OilPrice = 0;
            String signtype = "" + cbxType.getSelectedItem();
            String Brand = "ESSO";
            Camnal(CarType, OilPrice, Brand);
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolineCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnReceipt;
    private javax.swing.JButton btnTax;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxCartype;
    private javax.swing.JComboBox<String> cbxType;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoBcp;
    private javax.swing.JRadioButton rdoEsso;
    private javax.swing.JRadioButton rdoPpt;
    private javax.swing.JRadioButton rdoShell;
    private javax.swing.JTextArea txrResult;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JLabel ราคา;
    // End of variables declaration                   
}
