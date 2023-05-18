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
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
    }


}