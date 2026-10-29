package padroescomportamentais.strategy;

public class FreteEconomico implements EstrategiaFrete {

    public float calcular(float peso) {
        return peso * 5.0f;
    }
}
