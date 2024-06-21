package po23s.http;

import po23s.DTO.VolumeDTO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;
import po23s.DTO.BookDTO;
import po23s.deserialer.Deserializer;

public class TelaPOO extends javax.swing.JDialog {

    private VolumeDTO volumeDTO;
    ClienteHttp clienteHttp = new ClienteHttp();

    public TelaPOO(Frame parent, boolean modal ) {
        super(parent, modal);

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
        labelTitulo = new javax.swing.JLabel();
        labelAutor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelPublicadora = new javax.swing.JLabel();
        labelDisponibilidade = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelretornarTitulo = new javax.swing.JLabel();
        labelretornarAutores = new javax.swing.JLabel();
        labelretornarPDF = new javax.swing.JLabel();
        labelretornarPublicadora = new javax.swing.JLabel();
        labelretornarValor = new javax.swing.JLabel();

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

        listItens.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listItens.setToolTipText("");
        listItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listItensMouseClicked(evt);
            }
        });
        listItens.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listItensValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listItens);
        listItens.getAccessibleContext().setAccessibleName("");

        labelTitulo.setText("Titulo:");

        labelAutor.setText("Autor:");

        labelPublicadora.setText("Publicadora:");

        labelDisponibilidade.setText("Disponibilidade em pdf:");

        labelValor.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(lblConfig))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPublicadora)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDisponibilidade)
                                    .addComponent(labelValor)))
                            .addComponent(labelAutor)
                            .addComponent(labelTitulo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelretornarTitulo)
                            .addComponent(labelretornarAutores)
                            .addComponent(labelretornarPDF)
                            .addComponent(labelretornarPublicadora)
                            .addComponent(labelretornarValor))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(labelretornarTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(labelretornarAutores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPublicadora)
                    .addComponent(labelretornarPublicadora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDisponibilidade)
                    .addComponent(labelretornarPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValor)
                    .addComponent(labelretornarValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(47, Short.MAX_VALUE))
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

        String valorBusca = caixaBusca.getText();

        String jsonString = clienteHttp.buscaDados("https://www.googleapis.com/books/v1/volumes?q=" + valorBusca.replace(' ', '+'));
        Deserializer deserializer = new Deserializer();
        this.volumeDTO = deserializer.deserialize(jsonString);
        List<String> TitleString = volumeDTO.getArrayTitle();
        listItens.setListData(TitleString.toArray(new String[0]));

        String autores = volumeDTO.volume.stream()
                .map(BookDTO::getAuthors)
                .collect(Collectors.joining(", "));

        System.out.println(caixaBusca.getText());
    }//GEN-LAST:event_botaoBuscaActionPerformed

    private void listItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listItensMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listItensMouseClicked

    private void listItensValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listItensValueChanged
    if(!evt.getValueIsAdjusting()){
        int selectedIndex = listItens.getSelectedIndex();
        if(selectedIndex != -1){
            BookDTO selectedBook = volumeDTO.getVolumeByIndex(selectedIndex);
            labelTitulo.setText("Titulo: " + selectedBook.getTitle()) ;
            labelAutor.setText("Autor: " + selectedBook.getAuthors());
            labelPublicadora.setText("Publicadora: "+ selectedBook.getPublisher());
            labelDisponibilidade.setText("Disponibilidade em PDF: " + (selectedBook.getAvaliability() ? "sim" : "não"));
            labelValor.setText("Valor: " + selectedBook.getPrice());
            }
        }
    }//GEN-LAST:event_listItensValueChanged
    private void botaoCarregarActionPerformed(java.awt.event.ActionEvent evt) {
        List<String> bookStrings = volumeDTO.getVolumeStrings();
        listItens.setListData(bookStrings.toArray(new String[0]));

        String autores = volumeDTO.volume.stream()
        .map(BookDTO::getAuthors)
        .collect(Collectors.joining(", "));
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                VolumeDTO volumeDTO = new VolumeDTO();
                // Adicionando exemplos de livros
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

                TelaPOO dialog = new TelaPOO(new javax.swing.JFrame(), true );
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelDisponibilidade;
    private javax.swing.JLabel labelPublicadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelretornarAutores;
    private javax.swing.JLabel labelretornarPDF;
    private javax.swing.JLabel labelretornarPublicadora;
    private javax.swing.JLabel labelretornarTitulo;
    private javax.swing.JLabel labelretornarValor;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblMax;
    private javax.swing.JList<String> listItens;
    // End of variables declaration//GEN-END:variables

}
