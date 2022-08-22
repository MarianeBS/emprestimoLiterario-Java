//Importação da biblioteca referente ao uso da inteface JOption:
import javax.swing.JOptionPane;

//Classe "Emprestimo" herdará os atributos e métodos exitentes na 
//biblioteca java.swing.JFrame:
public class Emprestimo extends javax.swing.JFrame 
{
    //Método construtor:
    public Emprestimo() 
    {
        //Inicialização dos componentes com as configurações que foram
        //definidas no design:
        initComponents();
        //Atribuição para que os ComboBox iniciem com o dado inserido na linha
        // (-1), ou seja, iniciem sem dado algum:
        cmbox_curso.setSelectedIndex(-1);
        cmbox_livro.setSelectedIndex(-1);
        //Atribuindo null ao modo relativo para que a janela do programa surja 
        //no centro da tela:
        setLocationRelativeTo(null);
    }
    //Instanciando a classe "DadosEmprestimo" para um objeto chamado janela2:
    DadosEmprestimo janela2 = new DadosEmprestimo();

    //Notação que impede o compilador de emitir certas adventências:
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        cmbox_curso = new javax.swing.JComboBox<>();
        lbl_nome = new javax.swing.JLabel();
        lbl_serie = new javax.swing.JLabel();
        lbl_rm = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        lbl_dadosAluno = new javax.swing.JLabel();
        txtField_rm = new javax.swing.JTextField();
        txtField_nome = new javax.swing.JTextField();
        txtField_serie = new javax.swing.JTextField();
        lbl_livroRequerido = new javax.swing.JLabel();
        cmbox_livro = new javax.swing.JComboBox<>();
        btn_emprestar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbl_title.setText("EMPRÉSTIMO DE LIVROS");

        cmbox_curso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbox_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração", "Desenvolvimento de Sistemas", "Logística", "Recursos Humanos", " " }));

        lbl_nome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_nome.setText("NOME:");

        lbl_serie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_serie.setText("SÉRIE:");

        lbl_rm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_rm.setText("RM:");

        lbl_curso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_curso.setText("CURSO:");

        lbl_dadosAluno.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_dadosAluno.setText("DADOS DO ALUNO");

        txtField_rm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtField_nome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtField_serie.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lbl_livroRequerido.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbl_livroRequerido.setText("LIVRO REQUERIDO");

        cmbox_livro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbox_livro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13 Segundos", "Boneca de Ossos", "E o Vento Levou", "Homem de Giz", "O Caçador de Pipas", "Oitavo Vilarejo", "O Quinze", "Persuasão", "Trono de Vidro", "Vidas Secas", " ", " ", " " }));

        btn_emprestar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_emprestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        btn_emprestar.setText("Emprestar");
        btn_emprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_emprestarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_limpar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btn_limpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl1)
                                        .addComponent(lbl_rm)
                                        .addComponent(lbl_nome))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_serie)
                                        .addGap(16, 16, 16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField_rm, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_title)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl2))
                                    .addComponent(txtField_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_curso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lbl_dadosAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbox_livro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_livroRequerido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btn_cancelar)
                .addGap(88, 88, 88)
                .addComponent(btn_limpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_emprestar)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl2)
                            .addComponent(lbl1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lbl_title)))
                .addGap(44, 44, 44)
                .addComponent(lbl_dadosAluno)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField_rm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_rm))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(txtField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_serie)
                    .addComponent(txtField_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_curso)
                    .addComponent(cmbox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lbl_livroRequerido)
                .addGap(32, 32, 32)
                .addComponent(cmbox_livro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_emprestar)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_limpar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Atribuição de funcionalidade ao botão "emprestar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_emprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_emprestarActionPerformed
        //Atribuindo dispose para que a primeira janela (Classe Emprestimo) 
        //se feche e a segunda janela (Classe DadosEmprestimo) abra em
        //seu lugar:
        dispose();
        //Atribuindo visibilidade à segunda janela:
        janela2.setVisible(true);
        //Atribuindo null ao modo relativo para que a segunda janela do programa
        //surja no centro da tela:
        janela2.setLocationRelativeTo(null);
        //Atribuindo false ao setResizable para que não seja possível 
        //redimencionar a janela do programa:
        janela2.setResizable(false);
        //Enviando os dados recolhidos no formulário de empréstimo 
        //para a segunda janela a partir do método get:
        janela2.enviaDados(janela2, txtField_rm.getText(), txtField_nome.getText(), 
                txtField_serie.getText(), cmbox_curso.getSelectedItem().toString(), cmbox_livro.getSelectedItem().toString());
    }//GEN-LAST:event_btn_emprestarActionPerformed
    //Atribuição de funcionalidade ao botão "cancelar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        //Criando uma variável para que seja possível imprimir uma mensagem:
        //A variável ser int não causará problemas, pois em JOption, tudo é 
        //considerado string:
        int opcao;
        //Atribuindo a mensagem que será exibida na caixa pela variável criada:
        //Será atribuido para que, como resposta, a caixa de texto possua as 
        //opções de botão yes or no:
        opcao=JOptionPane.showConfirmDialog(null, 
            "Deseja mesmo cancelar o empréstimo de livros?",
            "Cancelar",JOptionPane.YES_NO_OPTION);
            //Condição: "Se o botão "yes" dentre as duas opções for selecionado,
            //o programa irá fechar":
            if (opcao==JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_btn_cancelarActionPerformed
    //Atribuição de funcionalidade ao botão "limpar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        //Atribuindo "nulo" a todos os campos de textField:
        txtField_rm.setText(null);    
        txtField_nome.setText(null);
        txtField_serie.setText(null);
        //Atribuindo a linha -1 aos comboBox:
        cmbox_curso.setSelectedIndex(-1);
        cmbox_livro.setSelectedIndex(-1);
        //Retornando o ponteiro de foco para o primeiro campo:
        txtField_rm.requestFocus();
    }//GEN-LAST:event_btn_limparActionPerformed
    //Método principal, responsável pela execução 
    //e chamamento das outras classes do programa:   
    public static void main(String args[]) 
    {
        //Evento que faz com que o "Runnable" tenha seu método "run" chamado
        //Evento ao qual o método run depende para poder ser chamado:
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            //Método de execução das atividades:
            public void run() 
            {
                //Atribuindo visibilidade à janela presente na classe
                //Emprestimo:
                new Emprestimo().setVisible(true);
            }
        });
    }
    //Variáveis declaradas e seus tipos:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_emprestar;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JComboBox<String> cmbox_curso;
    private javax.swing.JComboBox<String> cmbox_livro;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_dadosAluno;
    private javax.swing.JLabel lbl_livroRequerido;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_rm;
    private javax.swing.JLabel lbl_serie;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JTextField txtField_nome;
    private javax.swing.JTextField txtField_rm;
    private javax.swing.JTextField txtField_serie;
    // End of variables declaration//GEN-END:variables
}
