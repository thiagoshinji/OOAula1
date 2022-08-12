
package Aula1;

public class TesteCarro {
    
    public static void main(String[] args) {
// Criando o objeto van
        Carro van = new Carro();
        // Definindo os atributos do objeto van
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        
    }
    
}
