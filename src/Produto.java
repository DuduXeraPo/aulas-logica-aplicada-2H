public class Produto {
    //Atributos
   private double preco;
   String modelo;

   // Setter
    public void setPreco(double _preco){
        this.preco = _preco;
   //     if(nivelAcessso == 5) {
   //         this.preco = _preco;
        //          }
    }

    // Método construtor
    Produto(){}
    // sobrecarga do método construtor
    Produto(double preco){
        this.preco = preco;

    }
    // Mais uma sobrecarga
    Produto(String modelo, double preco){
        this.modelo = modelo;
        this.preco = preco;
    }


}
