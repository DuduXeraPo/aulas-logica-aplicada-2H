public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação a Objeto
        // Declaração de objeto
        Pessoa adao;
        // Instaciação do objeto
        adao = new Pessoa();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));

        // Criar novos objetos
        // Declarar objeto
        Pessoa rainha;
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição do comportamento
        rainha.falar();
        rainha.comer();

        // Criar podutos
        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        // p2.preco = 233.00
        p2.setPreco(233.00);
        Produto p3;
        p3 = new Produto("Placa Video", 1300.00);
        p3 = new Produto("Placa mãe", 2500.00);

        p2.setPreco(1.00);
    }


}