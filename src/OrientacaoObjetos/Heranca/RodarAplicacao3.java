package OrientacaoObjetos.Heranca;

public class RodarAplicacao3 {

    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

//        Polimorfismo na Classe Filha 1 e Classe Filha 2
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println(".");

//        Polimorfismo na Classe Filha 2
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println(".");

//        Sobrescrita
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
