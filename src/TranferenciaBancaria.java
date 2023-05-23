
public class TranferenciaBancaria implements Pagamento{

    @Override
    public void RealizarPagamente(double valor) {
        System.out.println("Tranferencia feita com sucesso " + valor);
    }
    
}
