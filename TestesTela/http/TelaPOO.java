/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package po23s.http;

import po23s.DTO.BookDTO;
import po23s.DTO.VolumeDTO;

import java.awt.Frame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author leo
 */
public class TelaPOO extends javax.swing.JDialog {

    /**
     * Creates new form TelaPOO
     *
     * @param parent
     * @param modal
     */
    private VolumeDTO volumeDTO;

    public TelaPOO(Frame parent, boolean modal) {
        super(parent, modal);
        this.volumeDTO = volumeDTO;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaBusca = new javax.swing.JTextField();
        botaoBusca = new javax.swing.JButton();
        lblMax = new javax.swing.JLabel();
        caixaMax = new javax.swing.JTextField();
        lblConfig = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItens = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        caixaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaBuscaActionPerformed(evt);
            }
        });

        botaoBusca.setText("Buscar");
        botaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaActionPerformed(evt);
            }
        });

        lblMax.setText("Máximo:");

        caixaMax.setText("10");
        caixaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaMaxActionPerformed(evt);
            }
        });

        lblConfig.setText("Configuração de busca");

        listItens.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listItens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoBusca)
                .addGap(18, 18, 18)
                .addComponent(lblMax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caixaMax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConfig)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBusca)
                    .addComponent(lblMax)
                    .addComponent(caixaMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfig))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caixaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaMaxActionPerformed

    private void caixaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caixaBuscaActionPerformed

    private void botaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaActionPerformed
        // TODO add your handling code here:
        List<String> bookStrings = volumeDTO.getVolumeStrings();
        listItens.setListData(bookStrings.toArray(new String[0]));
    }//GEN-LAST:event_botaoBuscaActionPerformed
    private void botaoCarregarActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> bookStrings = volumeDTO.getVolumeStrings();
        listItens.setListData(bookStrings.toArray(new String[0]));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VolumeDTO volumeDTO = new VolumeDTO();
                BookDTO book1 = new BookDTO();
                book1.setTitle("Java Programming");
                book1.setAuthors("Author 1");
                book1.setPublisher("Publisher 1");
                book1.setPdfAvailability(true);
                book1.setPrice(49.99);
                volumeDTO.add(book1);

                BookDTO book2 = new BookDTO();
                book2.setTitle("Effective Java");
                book2.setAuthors("Author 2");
                book2.setPublisher("Publisher 2");
                book2.setPdfAvailability(false);
                book2.setPrice(39.99);
                volumeDTO.add(book2);

                TelaPOO dialog = new TelaPOO(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBusca;
    private javax.swing.JTextField caixaBusca;
    private javax.swing.JTextField caixaMax;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblMax;
    private javax.swing.JList<String> listItens;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JButton botaoCarregar;

}
