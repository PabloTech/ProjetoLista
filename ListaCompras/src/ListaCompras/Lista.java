package ListaCompras;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lista extends javax.swing.JFrame {

    private final String CAMINHO = "C:/Projeto/ListaIpressa.txt";

    public Lista() {
        initComponents();
    }
    public String teste;
    String testeSoma;

    Produtos produtos = new Produtos();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNadicionar = new javax.swing.JButton();
        BNTremover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TXTnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTquantidade = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        TXTpreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BTNremover2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Jtotal = new javax.swing.JLabel();
        TXTsomaTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNadicionar.setText("Adicionar");
        BTNadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNadicionarActionPerformed(evt);
            }
        });

        BNTremover.setText("Remover");
        BNTremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNTremoverActionPerformed(evt);
            }
        });

        tblista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pão", "1", "2.8"},
                {"Queijo", "1", "3.8"},
                {"Mortadela", "1", "4"},
                {"Leite", "1", "5"},
                {"Salame", "1", "3.4"}
            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ));
        tblista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblista);

        jLabel1.setText("Produtos Escolhidos");

        jLabel2.setText("Produto");

        jLabel3.setText("Quantidade");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ));
        Tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        jLabel4.setText("Preço");

        BTNremover2.setText("Remover");
        BTNremover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNremover2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Lista Pronta");

        Jtotal.setText("Total :");

        jButton1.setText("Imprimir Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(BTNremover2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TXTnome, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(TXTquantidade)
                                .addComponent(TXTpreco))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTNadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(BNTremover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(55, 55, 55)
                        .addComponent(Jtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTsomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(473, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jtotal)
                            .addComponent(TXTsomaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(BTNremover2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TXTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TXTpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNadicionar)
                        .addGap(18, 18, 18)
                        .addComponent(BNTremover)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(56, 56, 56)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNadicionarActionPerformed

        //Variáveis para converção e somas...
        Double precoConvertido = null;
        Integer quantidadeConvertido;
        Double somaTotal;
        //Recebendo Dados classe PRODUTO
        produtos.nome = TXTnome.getText().trim();
        produtos.quantidade = TXTquantidade.getText().trim();
        produtos.preco = TXTpreco.getText().trim();

           //Tabela
        DefaultTableModel valor = (DefaultTableModel) Tabela.getModel();
        valor.addRow(new String[]{produtos.nome, produtos.quantidade, produtos.preco});

        TXTnome.setText("");
        TXTquantidade.setText("");
        TXTpreco.setText("");

        
        produtos.Somar();
        testeSoma = String.valueOf(produtos.somaTotal);

        DecimalFormat df = new DecimalFormat("##.00");

        df.format(produtos.somaTotal);
        
        TXTsomaTotal.setText(df.format(produtos.somaTotal));

        System.out.println(valor.getDataVector());
        ((DefaultTableModel) tblista.getModel()).removeRow(tblista.getSelectedRow());


    }//GEN-LAST:event_BTNadicionarActionPerformed

    private void BNTremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNTremoverActionPerformed

        String quantidade, preco;
        Double soma, somaFinal, valorQuantidade, valorPreco;

        int linhaSelecionada = Tabela.getSelectedRow();
        quantidade = Tabela.getValueAt(linhaSelecionada, 2).toString();
        preco = Tabela.getValueAt(linhaSelecionada, 1).toString();

        valorQuantidade = Double.parseDouble(quantidade);
        valorPreco = Double.parseDouble(preco);
        soma = valorPreco * valorQuantidade;

        somaFinal = (produtos.somaTotal - soma);
        produtos.somaTotal -= soma;
        System.out.println("soma total" + produtos.somaTotal);

        System.out.println("soma total - soma" + somaFinal);

        System.out.println("teste de soma" + soma);
        String somaTotal2;
        somaTotal2 = String.valueOf(somaFinal);
        TXTsomaTotal.setText(somaTotal2);

        ((DefaultTableModel) Tabela.getModel()).removeRow(Tabela.getSelectedRow());

    }//GEN-LAST:event_BNTremoverActionPerformed

    private void BTNremover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNremover2ActionPerformed
        ((DefaultTableModel) tblista.getModel()).removeRow(tblista.getSelectedRow());
    }//GEN-LAST:event_BTNremover2ActionPerformed

    private void tblistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblistaMouseClicked

        int linhaSelecionada = tblista.getSelectedRow();
        TXTnome.setText(tblista.getValueAt(linhaSelecionada, 0).toString());
        TXTpreco.setText(tblista.getValueAt(linhaSelecionada, 2).toString());
        TXTquantidade.setText(tblista.getValueAt(linhaSelecionada, 1).toString());


    }//GEN-LAST:event_tblistaMouseClicked

    private void TabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaKeyPressed

    }//GEN-LAST:event_TabelaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel valor = (DefaultTableModel) Tabela.getModel();

        int linhaSelecionada = tblista.getSelectedRow();

//        System.out.println(tabelaArquivo);
        try {

            FileWriter lista = new FileWriter(new File(CAMINHO));

            BufferedWriter buff = new BufferedWriter(lista);

            String tabelaArquivo = "";

            for (int i = 0; i < Tabela.getRowCount(); i++) {

                tabelaArquivo = Tabela.getValueAt(i, 0).toString() + "  R$ " +
                Tabela.getValueAt(i, 2).toString() + " - Quantidade : " +
                Tabela.getValueAt(i, 1).toString();
                buff.write(tabelaArquivo);
                buff.newLine();

            }
            
        
            DecimalFormat df = new DecimalFormat("##.00");
            
            
            buff.write("Valor Total R$ "+df.format(produtos.somaTotal));
            buff.flush();

           buff.close();
           
            JOptionPane.showMessageDialog(null, "Arquivo Gerado com sucesso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gerar arquivo");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNTremover;
    private javax.swing.JButton BTNadicionar;
    private javax.swing.JButton BTNremover2;
    private javax.swing.JLabel Jtotal;
    private javax.swing.JTextField TXTnome;
    private javax.swing.JTextField TXTpreco;
    private javax.swing.JTextField TXTquantidade;
    private javax.swing.JTextField TXTsomaTotal;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblista;
    // End of variables declaration//GEN-END:variables
}
