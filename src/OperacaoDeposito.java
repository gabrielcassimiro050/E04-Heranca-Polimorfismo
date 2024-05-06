public class OperacaoDeposito extends Operacao{
    public OperacaoDeposito(double valor){
        this.setValor(valor);
        this.setTipo('d');
    }
}
