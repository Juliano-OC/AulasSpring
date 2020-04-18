package OliveiraJuliano.ExemploGradleWEB.model;

/**
 * @author Juliano Oliveira
 * @version 1.0
 * @since 4/18/2020
 */
public class Calculadora {

    private double valor1;
    private double valor2;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    /**
     * Metodo que retorna a soma de 2 valores.
     * @return Retorna valor1 + valor2.
     */
    public double somarValores() {
        return this.valor1 + this.valor2;
    }
}
