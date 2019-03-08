package jshred;

import java.awt.Color;
import java.io.File;
import javax.swing.DefaultListModel;


/**
 *
 * @author dmusiolik
 */
public class MainFrame extends javax.swing.JFrame {
    
    //Global varz
    public DefaultListModel JLData = new DefaultListModel();
    public DefaultListModel PurgeUs = new DefaultListModel();
    public String homepath = System.getProperty("user.home");
    boolean again = false;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        jList1.setModel(PurgeUs);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogShred");
        setBackground(new java.awt.Color(99, 99, 99));

        jPanel1.setBackground(new java.awt.Color(77, 77, 80));
        jPanel1.setForeground(new java.awt.Color(184, 2, 2));

        jProgressBar1.setBackground(new java.awt.Color(51, 51, 52));
        jProgressBar1.setForeground(new java.awt.Color(184, 2, 2));

        jButton1.setBackground(new java.awt.Color(51, 51, 52));
        jButton1.setForeground(new java.awt.Color(184, 2, 2));
        jButton1.setText("Shred");
        jButton1.setBorderPainted(false);
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(184, 2, 2));
        jLabel1.setText("LogShred");

        jLabel2.setForeground(new java.awt.Color(184, 2, 2));
        jLabel2.setText("It never happend ;)");

        jList1.setBackground(new java.awt.Color(36, 36, 37));
        jList1.setForeground(new java.awt.Color(184, 2, 2));
        jList1.setSelectionBackground(new java.awt.Color(255, 0, 216));
        jScrollPane1.setViewportView(jList1);

        jList2.setBackground(new java.awt.Color(36, 36, 37));
        jList2.setForeground(new java.awt.Color(184, 2, 2));
        jList2.setEnabled(false);
        jScrollPane2.setViewportView(jList2);

        jButton2.setBackground(new java.awt.Color(51, 51, 52));
        jButton2.setForeground(new java.awt.Color(184, 2, 2));
        jButton2.setText("Search");
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 52));
        jButton3.setForeground(new java.awt.Color(255, 0, 216));
        jButton3.setText("Autoshred");
        jButton3.setBorderPainted(false);
        jButton3.setEnabled(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Shred Btn
        
        JLData.addElement("Shredding " + jList1.getSelectedValue() + " ...");
        jList1.ensureIndexIsVisible(PurgeUs.size() - 1);
        jList2.ensureIndexIsVisible(JLData.size() - 1);
        jProgressBar1.setValue(20);
        shred(jList1.getSelectedValue());
        jProgressBar1.setValue(100);
        JLData.addElement(jList1.getSelectedValue() + " destroyed!");    
        jList1.ensureIndexIsVisible(PurgeUs.size() - 1);
        jList2.ensureIndexIsVisible(JLData.size() - 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Search Btn
        
        jProgressBar1.setValue(1);
        JLData.removeAllElements();
        PurgeUs.removeAllElements();
        jList2.setModel(JLData);
        if (again) {
            JLData.addElement("Starting Search again ...");
        } else {
            JLData.addElement("Starting Search ...");
        }
        JLData.addElement("Set homepath to: " + homepath);
        chkexst(homepath + "/.bash_history", "Bash History File");
        jProgressBar1.setValue(2);
        chkexst(homepath + "/.viminfo", "Viminfo");
        jProgressBar1.setValue(4);
        chkexst(homepath + "/.swp", "Vim SWAP File");
        jProgressBar1.setValue(10);
        varlogsearch("alternatives.log", "Alternatives Logfile");
        jProgressBar1.setValue(15);
        varlogsearch("auth.log", "Auth Logfile");
        jProgressBar1.setValue(25);
        varlogsearch("daemon.log", "Daemon Logfile");
        varlogsearch("apt/history.log", "APT History");
        varlogsearch("apt/term.log", "APT Term");
        varlogsearch("apt/eipp.log.xz", "EIPP");
        jProgressBar1.setValue(30);
        varlogsearch("debug.log", "Debug Logfile");
        varlogsearch("cups/access_log", "CUPS Access Log");
        varlogsearch("cups/error_log", "CUPS Error Log");
        varlogsearch("cups/page_log", "CUPS Page Log");
        jProgressBar1.setValue(40);
        varlogsearch("dpkg.log", "DPKG Logfile");
        jProgressBar1.setValue(50);
        varlogsearch("faillog.log", "FAIL Logfile");
        jProgressBar1.setValue(60);
        varlogsearch("kern.log", "Linux Kernel Logfile");
        jProgressBar1.setValue(70);
        varlogsearch("messages", "Messages Logfile");
        jProgressBar1.setValue(80);
        varlogsearch("syslog", "Syslog Logfile");
        jProgressBar1.setValue(90);
        varlogsearch("user.log", "User Logfile");
        varlogsearch("wmtp", "WMTP Logfile");
        JLData.addElement("Found " + PurgeUs.getSize() + " sensetive files!");
        
        if (again) {
            JLData.addElement("Ready again!");
        } else {
            JLData.addElement("Ready!");
        }

        jProgressBar1.setValue(100);
        jButton1.setEnabled(true);
        jButton3.setEnabled(true);
        jList1.ensureIndexIsVisible(PurgeUs.size() - 1);
        jList2.ensureIndexIsVisible(JLData.size() - 1);
        again = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
     public void shred(String path) { 
        try {
            Process p = new ProcessBuilder("shred", "-n 7", "-u", "-z", path).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
    public void chkexst(String Path, String Name) {
        File f = new File(Path);
        if(f.exists() && !f.isDirectory()) { 
            JLData.addElement("[FOUND] " + Name);
            PurgeUs.addElement(Path);
        }
    }
    
    public void varlogsearch(String Name, String Bezeichnung) {
        chkexst("/var/log/" + Name, Bezeichnung);
        for (int i = 0; i < 100; i++) {
            chkexst("/var/log/" + Name + "." + i, Bezeichnung);
        }
        for (int i = 0; i < 1000; i++) {
            chkexst("/var/log/" + Name + "." + i + ".gz", Bezeichnung);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JList<String> jList1;
    public static javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
