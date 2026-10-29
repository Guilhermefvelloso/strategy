package padroescomportamentais.strategy;

public class FreteAgendado implements EstrategiaFrete {

    public float calcular(float peso) {
        return peso * 7.0f;
    }
}
