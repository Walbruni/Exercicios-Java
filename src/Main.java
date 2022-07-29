public class Main {

    public static void main(String[] args) {

//        Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.substracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

//        Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

//        Emprestimo
        System.out.println("Exercicio emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

//        Quadrilatero
        System.out.println("Exercicio quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f,5f);

//        Retornos
        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero2.area(3);
        System.out.println("Area do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero2.area(5,5);
        System.out.println("Area do retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero2.area(7, 8, 9);
        System.out.println("Area do trapezio:" + areaTrapezio);


    }
}
