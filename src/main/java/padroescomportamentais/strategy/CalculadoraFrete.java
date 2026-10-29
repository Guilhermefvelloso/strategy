package padroescomportamentais.strategy;

public class CalculadoraFrete {

    private float peso;

    public CalculadoraFrete(float peso) {
        this.peso = peso;
    }

    public float calcular(EstrategiaFrete estrategia) {
        return estrategia.calcular(peso);
    }
}
