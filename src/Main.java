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
    }


}