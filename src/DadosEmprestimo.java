//Classe "DadosCadastrados" herdará os atributos e métodos exitentes na 
//biblioteca java.swing.JFrame:
public class DadosEmprestimo extends javax.swing.JFrame 
{
    //Método construtor:
    public DadosEmprestimo() 
    {
        //Inicialização dos componentes com as configurações que foram
        //definidas no design:
        initComponents();
    }
    
    //Passagem de parâmetros
    //Os valores recebidos na janela 1 estão sendo passados para este método
    //Método nomeado como enviaDados
    //Os valores serão recebidos pelas variáveis criadas dentro dos parênteses 
    //do método:
    public void enviaDados (DadosEmprestimo veioDo1,  String rm, String nome, 
            String serie, String curso, String livro)
    {
        //Setando qual label vai receber os dados de qual variável:
        //A lbl_exibirRm receberá sua informação da variável "rm" e a exibirá:
        lbl_exibirRm.setText(rm);
        //A lbl_exibirNome receberá sua informação para a variável "nome" e a
        //exibirá:
        lbl_exibirNome.setText(nome);
        //A lbl_exibirSerie receberá sua informação para a variável "serie" e a
        //exibirá:
        lbl_exibirSerie.setText(serie);
        //A lbl_exibirCurso receberá sua informação para a variável "curso" e a 
        //exibirá:
        lbl_exibirCurso.setText(curso);
        //A lbl_exibirLivro receberá sua informação para a variável "livro" e a 
        //exibirá:
        lbl_exibirLivro.setText(livro);      
    }

    //Notação que impede o compilador de emitir certas adventências:
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_rm = new javax.swing.JLabel();
        lbl_serie = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        lbl_livro = new javax.swing.JLabel();
        lbl_exibirNome = new javax.swing.JLabel();
        lbl_exibirRm = new javax.swing.JLabel();
        lbl_exibirSerie = new javax.swing.JLabel();
        lbl_exibirCurso = new javax.swing.JLabel();
        lbl_exibirLivro = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        lbl_title.setText("DADOS DO EMPRÉSTIMO");

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        lbl_nome.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(51, 51, 51));
        lbl_nome.setText("Nome do Aluno:");

        lbl_rm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_rm.setForeground(new java.awt.Color(51, 51, 51));
        lbl_rm.setText("RM:");

        lbl_serie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_serie.setForeground(new java.awt.Color(51, 51, 51));
        lbl_serie.setText("Série:");

        lbl_curso.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_curso.setForeground(new java.awt.Color(51, 51, 51));
        lbl_curso.setText("Curso:\n");

        lbl_livro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_livro.setForeground(new java.awt.Color(51, 51, 51));
        lbl_livro.setText("Livro Requerido:");

        lbl_exibirNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_exibirNome.setText("...");

        lbl_exibirRm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_exibirRm.setText("...");

        lbl_exibirSerie.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_exibirSerie.setText("...");

        lbl_exibirCurso.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_exibirCurso.setText("...");

        lbl_exibirLivro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbl_exibirLivro.setText("...");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(170, 170, 170)
                .addComponent(lbl1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_exibirNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_livro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_exibirLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_rm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_exibirRm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_serie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_exibirSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_curso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_exibirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_title)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lbl_title))
                    .addComponent(lbl2))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome)
                    .addComponent(lbl_exibirNome))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rm)
                    .addComponent(lbl_exibirRm))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_serie)
                    .addComponent(lbl_exibirSerie))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_curso)
                            .addComponent(lbl_exibirCurso))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_livro)
                            .addComponent(lbl_exibirLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(lbl1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Atribuição de funcionalidade ao botão "fechar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Código de status 0 para que a janela feche-se:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
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
                //DadosEmprestimo:
                new DadosEmprestimo().setVisible(true);
            }
        });
    }

    //Variáveis declaradas e seus tipos:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_exibirCurso;
    private javax.swing.JLabel lbl_exibirLivro;
    private javax.swing.JLabel lbl_exibirNome;
    private javax.swing.JLabel lbl_exibirRm;
    private javax.swing.JLabel lbl_exibirSerie;
    private javax.swing.JLabel lbl_livro;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_rm;
    private javax.swing.JLabel lbl_serie;
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
}
