/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoquest;

/**
 *
 * @author Paiva Morais
 */
public class Tabela extends javax.swing.JPanel {

    /**
     * Creates new form Tabela
     */
    public Tabela() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaTabela = new javax.swing.JTable();
        editarTabela = new javax.swing.JButton();
        excluirTabela = new javax.swing.JButton();
        homeTabela = new javax.swing.JButton();

        tabelaTabela.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tabelaTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matéria ", "Conteúdo", "Dificuldade", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaTabela);

        editarTabela.setBackground(new java.awt.Color(33, 150, 243));
        editarTabela.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        editarTabela.setForeground(new java.awt.Color(255, 255, 255));
        editarTabela.setText("EDITAR");

        excluirTabela.setBackground(new java.awt.Color(33, 150, 243));
        excluirTabela.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        excluirTabela.setForeground(new java.awt.Color(255, 255, 255));
        excluirTabela.setText("EXCLUIR");

        homeTabela.setBackground(new java.awt.Color(33, 150, 243));
        homeTabela.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        homeTabela.setForeground(new java.awt.Color(255, 255, 255));
        homeTabela.setText("HOME");
        homeTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(editarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void homeTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeTabelaActionPerformed
        FormInicial home = new FormInicial();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeTabelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editarTabela;
    private javax.swing.JButton excluirTabela;
    private javax.swing.JButton homeTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaTabela;
    // End of variables declaration//GEN-END:variables
}
