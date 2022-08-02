package OrientacaoObjetos;

// CLASSE: utilizar substantivos, nomes significativos o contexto deve ser considerado
public class Carro {

//    ATRIBUTOS: substantivo/adjetivos, nomes significativos, contexto, abstração e tipos adequados
    String cor;
    String modelo;
    int capacidadeTanque;

//    SOBRECARGA DO METODO (CONSTRUTOR)
//    VAZIO
    Carro() {

    }
// COM VALORES
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

//    METODOS (utilizando set/get)
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this. modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}











