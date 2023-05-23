
public class Main {

    public static void main(String[] args) {
      Pagamento pagCartao = new CartaoDeCredido();
      Pagamento pagPix = new Pix();
      Pagamento pagTransferencia = new TranferenciaBancaria();
      
      pagCartao.RealizarPagamente(500);
        
    }
    
}
