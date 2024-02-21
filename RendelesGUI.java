/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package etteremrendeles;

import java.awt.event.ItemEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author veres.marcell
 */
public class RendelesGUI extends javax.swing.JFrame {

    private final Rendeles[] rendelesek;
    private int jelenAsztal;
    
    
    public RendelesGUI() {
        initComponents();
        
        jelenAsztal=0;
        ArrayList<AbstractButton> tmp = Collections.list(buttonGroup1.getElements());
        rendelesek= new Rendeles[tmp.size()];
        for (int ix = 0; ix < tmp.size(); ix++) {
            rendelesek[ix] = new Rendeles(tmp.get(ix).getText());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        RadioAsztal1 = new javax.swing.JRadioButton();
        RadioAsztal2 = new javax.swing.JRadioButton();
        RadioAsztal3 = new javax.swing.JRadioButton();
        RadioAsztal4 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        EtelNevText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        EtelList = new javax.swing.JList<>();
        jSpinner1 = new javax.swing.JSpinner();
        RendBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AsztalMenu = new javax.swing.JMenuItem();
        RendelesMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ă‰tterem rendelĂ©s");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Asztal:")));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        buttonGroup1.add(RadioAsztal1);
        RadioAsztal1.setSelected(true);
        RadioAsztal1.setText("Piros");
        RadioAsztal1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asztalValt(evt);
            }
        });
        RadioAsztal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAsztal1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioAsztal2);
        RadioAsztal2.setText("ZĂ¶ld");
        RadioAsztal2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asztalValt(evt);
            }
        });
        RadioAsztal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAsztal4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioAsztal3);
        RadioAsztal3.setText("KĂ©k");
        RadioAsztal3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asztalValt(evt);
            }
        });
        RadioAsztal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAsztal4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioAsztal4);
        RadioAsztal4.setText("FehĂ©r");
        RadioAsztal4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asztalValt(evt);
            }
        });
        RadioAsztal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioAsztal4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioAsztal1)
                    .addComponent(RadioAsztal2)
                    .addComponent(RadioAsztal3)
                    .addComponent(RadioAsztal4))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RadioAsztal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioAsztal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioAsztal3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadioAsztal4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Asztal rendelĂ©sei:")));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 150));

        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ă‰telek:"));

        jButton1.setText("Ăšj Ă©tel hozzĂˇadĂˇsa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EtelNevText.setToolTipText("Ă‰tel neve");
        EtelNevText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EtelNevTextActionPerformed(evt);
            }
        });

        EtelList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "BabgulyĂˇs|1990", "Leves|1290", "Asd|1900", "A|3670" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(EtelList);

        jSpinner1.setToolTipText("Ă‰tel Ăˇra");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EtelNevText, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtelNevText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RendBtn.setText("RendelĂ©s hozzĂˇad");
        RendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        AsztalMenu.setText("Asztal fĂˇjlba Ă­r");
        AsztalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsztalMenuActionPerformed(evt);
            }
        });
        jMenu1.add(AsztalMenu);

        RendelesMenu.setText("Ă‰telek fĂˇjlba Ă­r");
        RendelesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RendelesMenuActionPerformed(evt);
            }
        });
        jMenu1.add(RendelesMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(RendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RendBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioAsztal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAsztal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAsztal1ActionPerformed

    private void AsztalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsztalMenuActionPerformed
        try {
            FileWriter ir = new FileWriter("asztalok.txt");
            ir.write("RendelĂ©sek:\r\n");
            for (Rendeles rendeles : rendelesek) {
                ir.write(rendeles.getAsztal()+"\r\n");
                for (Etel etel : rendeles.getRendelesek()) {
                    ir.write(etel.getNev()+"|"+etel.getAr()+"\r\n");
                }
                ir.write("\r\n");
            }
            ir.close();
        } catch (IOException ex) {
            Logger.getLogger(RendelesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AsztalMenuActionPerformed

    private void RendelesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendelesMenuActionPerformed
        ListModel<String> tmp = EtelList.getModel();
        try {
            FileWriter ir = new FileWriter("etelek.txt");
            ir.write("Ă‰telek:\r\n");
            for (int ix = 0; ix < tmp.getSize(); ix++) {
                ir.write(tmp.getElementAt(ix)+"\r\n");
            }
            ir.close();
        } catch (IOException ex) {
            Logger.getLogger(RendelesGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RendelesMenuActionPerformed

    private void RendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RendBtnActionPerformed
        String[] sorok=EtelList.getSelectedValue().split("[|]");
        rendelesek[jelenAsztal].ujRendeles(new Etel(sorok[0],Integer.parseInt(sorok[1])));
        jList2.setModel( rendelesModelGeneral());
    }//GEN-LAST:event_RendBtnActionPerformed

    private DefaultListModel rendelesModelGeneral() {
        ArrayList<Etel> tmp = rendelesek[jelenAsztal].getRendelesek();
        DefaultListModel dlm = new DefaultListModel();
        for(int ix=0; ix< tmp.size(); ix++)
            dlm.addElement(tmp.get(ix));
        return dlm;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        var model = EtelList.getModel();
        DefaultListModel dlm = new DefaultListModel();
        for(int ix=0; ix< model.getSize(); ix++)
            dlm.addElement(model.getElementAt(ix));
        dlm.addElement(EtelNevText.getText());
        EtelList.setModel(dlm);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void asztalValt(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asztalValt
        if(evt.getStateChange()==ItemEvent.SELECTED){
            ArrayList<AbstractButton> tmp = Collections.list(buttonGroup1.getElements());
            int ix=0;
            while (ix < tmp.size() && !tmp.get(ix).isSelected()) {
                ix++;
            }
            jelenAsztal=ix;
            jList2.setModel( rendelesModelGeneral());
        }
    }//GEN-LAST:event_asztalValt

    private void RadioAsztal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioAsztal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioAsztal4ActionPerformed

    private void EtelNevTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EtelNevTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EtelNevTextActionPerformed

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
            java.util.logging.Logger.getLogger(RendelesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RendelesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RendelesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RendelesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RendelesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AsztalMenu;
    private javax.swing.JList<String> EtelList;
    private javax.swing.JTextField EtelNevText;
    private javax.swing.JRadioButton RadioAsztal1;
    private javax.swing.JRadioButton RadioAsztal2;
    private javax.swing.JRadioButton RadioAsztal3;
    private javax.swing.JRadioButton RadioAsztal4;
    private javax.swing.JButton RendBtn;
    private javax.swing.JMenuItem RendelesMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
