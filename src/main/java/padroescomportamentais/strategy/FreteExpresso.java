package padroescomportamentais.strategy;

public class FreteExpresso implements EstrategiaFrete {

    public float calcular(float peso) {
        return peso * 10.0f;
    }
}
