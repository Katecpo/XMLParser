/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlparser.hmi;

import javax.swing.JFileChooser;
import xmlparser.hmi.filters.*;

/**
 * HMI
 * @author bd062554
 */
public class ParserFrame extends javax.swing.JFrame {

    /**
     * Creates new form ParserFrame
     */
    public ParserFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputFileXMLLabel = new javax.swing.JLabel();
        inputFileDTDlabel = new javax.swing.JLabel();
        consoleOutputTA = new javax.swing.JScrollPane();
        outputConsoleTA = new javax.swing.JTextArea();
        outputConsoleLabel = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        fieldXMLBrowser = new javax.swing.JTextField();
        XMLBrowserButton = new javax.swing.JButton();
        DTDBrowserButton = new javax.swing.JButton();
        fieldDTDBrowser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputFileXMLLabel.setText("Input file (.XML)");

        inputFileDTDlabel.setText("Input file (.DTD)");

        outputConsoleTA.setColumns(20);
        outputConsoleTA.setRows(5);
        outputConsoleTA.setEnabled(false);
        consoleOutputTA.setViewportView(outputConsoleTA);

        outputConsoleLabel.setText("Output console :");

        logoLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(102, 0, 102));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("XML PARSER");

        fieldXMLBrowser.setText("XML file...");

        XMLBrowserButton.setText("...");
        XMLBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XMLBrowserButtonActionPerformed(evt);
            }
        });

        DTDBrowserButton.setText("...");
        DTDBrowserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTDBrowserButtonActionPerformed(evt);
            }
        });

        fieldDTDBrowser.setText("DTD file...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(consoleOutputTA)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFileDTDlabel)
                            .addComponent(inputFileXMLLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldDTDBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DTDBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldXMLBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(XMLBrowserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(outputConsoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputFileXMLLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldXMLBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XMLBrowserButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputFileDTDlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldDTDBrowser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DTDBrowserButton))
                .addGap(25, 25, 25)
                .addComponent(outputConsoleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consoleOutputTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XMLBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XMLBrowserButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.addChoosableFileFilter(new XmlFilter());
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);
        
        int returnVal = fc.showOpenDialog(ParserFrame.this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.fieldXMLBrowser.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_XMLBrowserButtonActionPerformed

    private void DTDBrowserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTDBrowserButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);
        fc.addChoosableFileFilter(new DtdFilter());
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setAcceptAllFileFilterUsed(false);
        
        int returnVal = fc.showOpenDialog(ParserFrame.this);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.fieldDTDBrowser.setText(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_DTDBrowserButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ParserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DTDBrowserButton;
    private javax.swing.JButton XMLBrowserButton;
    private javax.swing.JScrollPane consoleOutputTA;
    private javax.swing.JTextField fieldDTDBrowser;
    private javax.swing.JTextField fieldXMLBrowser;
    private javax.swing.JLabel inputFileDTDlabel;
    private javax.swing.JLabel inputFileXMLLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel outputConsoleLabel;
    private javax.swing.JTextArea outputConsoleTA;
    // End of variables declaration//GEN-END:variables
}
