package OrientacaoObjetos.Heranca;

public class RodarAplicacao2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

//        Upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

//        Downcast deve ser evitado! O exemplo abaixo dará um erro de ClassCastException
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
