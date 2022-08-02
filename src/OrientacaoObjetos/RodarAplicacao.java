package OrientacaoObjetos;

public class RodarAplicacao {

    public static void main(String[] args) {

//        Exemplo de construtor vazio
        Carro carro1 = new Carro();

                carro1.setCor("Azul");
                carro1.setModelo("BMW");
                carro1.setCapacidadeTanque(50);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.40));

//        Exemplo de construtor com sobrecarga
        Carro carro2 = new Carro("Cinza", "Mercedez-Benz", 60);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.40));
    }
}
