//criando a class felino
public class Felino {
    
    String nome;
    String cor;
    double peso;
    double altura;
    // criando o método imprimir
    public void imprimir() {
    
    System.out.println(" Felino do tipo "+ nome +
    "\r sua cor é " +cor+
    "\r seu peso é "+peso+
    "\r e sua altura é\r "+altura);
    
    }
    //função principal
    public static void main(String args[]) {
        //instânciando os objetos gato e leão
        Felino gato = new Felino();
        Felino leao = new Felino();
        
        gato.nome = "gato";
        gato.cor = "marjenta";
        gato.peso = 3.1;
        gato.altura = 0.20;
        
        leao.nome = "leao";
        leao.cor = "amarelo dourado";
        leao.peso = 25;
        leao.altura = 0.80;
        
       //invocdando o método 
        gato.imprimir();
        leao.imprimir();
    }
}