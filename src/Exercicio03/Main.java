
package Exercicio03;

public class Main {

    public static void main(String[] args) {
        
        CalculoSalario gerente = new Gerente();
        CalculoSalario analista = new Analista();
        CalculoSalario desenvolvedor = new Desenvolvedor();
        
        gerente.calcularSalario();
        analista.calcularSalario();
        desenvolvedor.calcularSalario();
        
    }
}
