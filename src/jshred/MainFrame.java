/*
 * MainFrame.java
 * 
 * Copyright 2019 Secure-Solutions <dmusiolik@Bellatrix>
 * 
 * www.Secure-Solutions.org
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

package jshred;

import java.awt.FileDialog;
import java.io.File;
import java.net.InetAddress;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


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
    public String version = "1.4";
    int shredcount = 7;
    String addzeros = "-z";
    String deletefileafter = "-u";

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        jList2.setModel(JLData);
        jList1.setModel(PurgeUs);
        if (!"/root".equals(homepath)) {
            JOptionPane.showMessageDialog(null, "Please run as root user", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        welcome();
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

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

        jCheckBox1.setBackground(new java.awt.Color(77, 77, 80));
        jCheckBox1.setForeground(new java.awt.Color(222, 222, 221));
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Overwrite with zeros after shred");
        jCheckBox1.setFocusable(false);

        jCheckBox2.setBackground(new java.awt.Color(77, 77, 80));
        jCheckBox2.setForeground(new java.awt.Color(222, 222, 221));
        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Delete files after shred");
        jCheckBox2.setFocusable(false);

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
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Add file");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setText("Add folder");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setText("Add device");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Clear Shredbox");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Clear Infobox");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ForceCTRL");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Set Shred count");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Print current Shred count");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("About");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_COMMA, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setText("About this tool");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
        
        if (jList1.getSelectedValue() == null) {
            JOptionPane.showMessageDialog(null, "Please select a file", "No file selected!", JOptionPane.INFORMATION_MESSAGE);
        } else {
        
            JLData.addElement("Shredding " + jList1.getSelectedValue() + " ...");
            jList1.ensureIndexIsVisible(PurgeUs.size() - 1);
            jList2.ensureIndexIsVisible(JLData.size() - 1);
            jProgressBar1.setValue(20);
            shred(jList1.getSelectedValue());
            jProgressBar1.setValue(100);
            JLData.addElement(jList1.getSelectedValue() + " destroyed!");    
            scroll();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Search Btn
        
        jProgressBar1.setValue(1);
        JLData.removeAllElements();
        PurgeUs.removeAllElements();
    
        if (again) {
            JLData.addElement("Starting Search again ...");
        } else {
            JLData.addElement("Starting Search ...");
        }
        JLData.addElement("Set homepath to: " + homepath);
        chkexst(homepath + "/.bash_history", "Bash History File");
        chkexst(homepath + "/.gitconfig", "Git Config File");
        jProgressBar1.setValue(2);
        chkexst(homepath + "/.viminfo", "Viminfo");
        jProgressBar1.setValue(4);
        chkexst(homepath + "/.ssh/known_hosts", "SSH known hosts");
        try {
            chkexst(homepath + "/.config/fish/fishd." + InetAddress.getLocalHost().getHostName(), "Fish History File");
        } catch (Exception e) {
        }
        chkexst(homepath + "/.swp", "Vim SWAP File");
        jProgressBar1.setValue(10);
        varlogsearch("alternatives.log", "Alternatives Logfile");
        chkexst(homepath + "/.zenmap/recent_scans.txt", "Nmap Logfile");
        chkexst(homepath + "/.zenmap/target_list.txt", "Nmap Logfile");
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
        varlogsearch("lastlog", "Lastlog");
        jProgressBar1.setValue(50);
        varlogsearch("faillog.log", "FAIL Logfile");
        varlogsearch("faillog", "FAIL Logfile");
        varlogsearch("httpd/access_log", "Apache Accesslog");
        varlogsearch("httpd/error_log", "Apache Errorlog");
        varlogsearch("pacman.log", "Pacman Logfile");
        varlogsearch("Xorg", "X11 Logfile");
        varlogsearch("xorg", "X11 Logfile");
        for (int i = 0; i < 100; i++) {
            varlogsearch("Xorg." + i + ".log", "X11 Logfile");
            varlogsearch("xorg." + i + ".log", "X11 Logfile");
        }
        varlogsearch("zeronet/debug.log", "Zeronet Logfile");
        varlogsearch("zeronet/debug-last.log", "Zeronet Logfile");
        jProgressBar1.setValue(60);
        varlogsearch("kern.log", "Linux Kernel Logfile");
        jProgressBar1.setValue(70);
        varlogsearch("messages", "Messages Logfile");
        jProgressBar1.setValue(80);
        varlogsearch("syslog", "Syslog Logfile");
        jProgressBar1.setValue(90);
        varlogsearch("user.log", "User Logfile");
        varlogsearch("wmtp", "WMTP Logfile");
        JLData.addElement("Found " + PurgeUs.getSize() + " sensitive files!");
        
        if (again) {
            JLData.addElement("Ready again!");
        } else {
            JLData.addElement("Ready!");
        }

        jProgressBar1.setValue(100);
        freeControls();
        scroll();
        again = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Autoshred btn
        
        jProgressBar1.setValue(20);
        
        for(int i = 0; i < PurgeUs.size(); i++) {
            jList1.setSelectedIndex(i);
            shred(jList1.getSelectedValue());
            JLData.addElement(jList1.getSelectedValue() + " destroyed!");
        }
        JLData.addElement(PurgeUs.size() + " files destroyed!");
        scroll();
        
        jProgressBar1.setValue(100);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Quit
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Add File
        
        //PurgeUs.addElement(JOptionPane.showInputDialog("Bitte geben sie den Pfad an:"));
        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        fd.setDirectory(homepath);
        fd.setVisible(true);
        String filename = fd.getFile();
        if (filename == null) {
          JOptionPane.showMessageDialog(null, "You cancelled the choice", "No file selected!", JOptionPane.INFORMATION_MESSAGE);
        } else {
          PurgeUs.addElement(fd.getDirectory() + filename);
        }
        
        freeControls();
        scroll();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Cls Shredbox
        PurgeUs.removeAllElements();
        JLData.addElement("Cleared Shredbox");
        JLData.addElement("[WARN] Lost all targets !");
        scroll();
        unfreeControls();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Set Shredcount
        String shredinttest = JOptionPane.showInputDialog("How many times should a file be overwritten ?");
        if (shredinttest != null) {
        
            if (isNum(shredinttest)) {
                shredcount = Integer.parseInt(shredinttest);
                JLData.addElement("[WARN] Shredcount was set to " + shredcount);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a Number!", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
            scroll();
        
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //Get Shredcount
        JLData.addElement("[INFO] Current Shredcount: " + shredcount);
        scroll();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Clear INFOBOX
        JLData.removeAllElements();
        welcome();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //About
        JOptionPane.showMessageDialog(null, "LogShred Version " + version + "\n\nThis is free as in freedom Software under GPLv3, created by Darius Musiolik.\nYou can find the Source here: https://www.GitHub.com/MrFlyingToasterman/LogShred\nThis is a Software from Secure Solutions: www.Secure-Solutions.org", "About LogShred", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // Add Folder
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new java.io.File(homepath)); // start at application current directory
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File shredFolder = fc.getSelectedFile();
            JLData.addElement("Adding files from folder: " + shredFolder.getAbsolutePath());
            File[] shredFiles = new File(shredFolder.getAbsolutePath()).listFiles();
            
            for (int i = 0; i < shredFiles.length; i++) {
                chkexst(shredFiles[i].getAbsolutePath(), shredFiles[i].getName());
            }
            freeControls();
            
            scroll();
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Add device
        String shredDevice = JOptionPane.showInputDialog("Wich device should be overwritten ?\nFor example /dev/sdb\n\nWARNING: You device will be erazed!!!");
        if (!shredDevice.equals("")) {
            if (shredDevice.contains("/dev/")) {
                JLData.addElement("[WARN] Entering device shred mode!");
                PurgeUs.removeAllElements();
                PurgeUs.addElement(shredDevice);
                JLData.addElement("[WARN] Lost old targets!");
                JLData.addElement("[WARN] Setting options to shred physical device ...");
                jCheckBox2.setSelected(false);
                shredcount = 2;
                JLData.addElement("[WARN] Shredcount was set to 2");
                jButton3.setEnabled(false);
                jCheckBox2.setEnabled(false);
                deletefileafter = "";
                jButton2.setEnabled(true);
                scroll();
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a physical device", "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No device added!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
    
    public void welcome() {
        JLData.addElement("Welcome to LogShred!");
        JLData.addElement("Version: " + version);
    }
    
     public void shred(String path) { 
        
        if (jCheckBox1.isSelected()) {
            //Fill with zeros ?
            addzeros = "-z";
        } else {
            addzeros = ""; 
        }  
        
        if (jCheckBox2.isSelected()) {
            //Delete file ?
            deletefileafter = "-u";
        } else {
            deletefileafter = ""; 
        }    
        
        try {
            Process p = new ProcessBuilder("shred", "-n " + shredcount, deletefileafter, addzeros, path).start();
        } catch (Exception e) {
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
        chkexst("/var/log/" + Name + ".old", Bezeichnung );
        chkexst("/var/log/" + Name + ".new", Bezeichnung);
        chkexst("/var/log/" + Name + ".log", Bezeichnung);
        for (int i = 0; i < 100; i++) {
            chkexst("/var/log/" + Name + "." + i, Bezeichnung);
        }
        for (int i = 0; i < 1000; i++) {
            chkexst("/var/log/" + Name + "." + i + ".gz", Bezeichnung);
        }
    }
    
    public static boolean isNum(String strNum) {
    boolean ret = true;
    try {

        Double.parseDouble(strNum);

    }catch (NumberFormatException e) {
        ret = false;
    }
    return ret;
    }
    
    public void freeControls() {
        jButton1.setEnabled(true);
        jButton3.setEnabled(true);
        jCheckBox2.setEnabled(true);
    }
    
    public void unfreeControls() {
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
        jCheckBox2.setEnabled(true);
        jProgressBar1.setValue(0);
    }
    
    public void scroll() {
        jList1.ensureIndexIsVisible(PurgeUs.size() - 1);
        jList2.ensureIndexIsVisible(JLData.size() - 1);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JList<String> jList1;
    public static javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
