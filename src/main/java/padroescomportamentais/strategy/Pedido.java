package padroescomportamentais.strategy;

public class Pedido {

    private float frete;

    public float getFrete() {
        return frete;
    }

    public void calcularFreteEconomico(float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso);
        this.frete = calculadora.calcular(new FreteEconomico());
    }

    public void calcularFreteExpresso(float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso);
        this.frete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFreteAgendado(float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso);
        this.frete = calculadora.calcular(new FreteAgendado());
    }

    public void calcularFreteGratis(float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso);
        this.frete = calculadora.calcular(new FreteGratis());
    }

    public void calcularFreteRetirada(float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso);
        this.frete = calculadora.calcular(new FreteRetirada());
    }

}
