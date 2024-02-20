public class Aluno {



 private String nome ;

 private String curso;

 private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void cadastrarNome(String nome ) {
        this.nome = nome;

    }
    public static void main (String args []) {
        // cadastrar e imprimir o novo aluno
        Aluno aluno = new Aluno();
        aluno.cadastrarNome("Marcelo Silveira");
        System.out.println(aluno.getNome());
    }
}
