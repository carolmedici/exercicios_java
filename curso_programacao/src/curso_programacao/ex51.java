package curso_programacao;

public class ex51 {

    public static class Main {
        public static void main(String[] args) {
            String dadosDaString = "Carolina,34";
            Pessoa pessoa = Pessoa.novaPessoa(dadosDaString);

            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        }
    }

    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public static Pessoa novaPessoa(String dados) {
            String[] partes = dados.split(",");
          
            String nome = partes[0];
            int idade = Integer.parseInt(partes[1]);

            return new Pessoa(nome, idade);
        }
    }
}

