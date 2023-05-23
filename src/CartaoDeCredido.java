
public class CartaoDeCredido implements Pagamento {

    @Override
    public void RealizarPagamente(double valor) {
        System.out.println("Pago com sucesso " + valor);
    }
    
}
