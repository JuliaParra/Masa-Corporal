package dev.julia;

public class IMCCalculator {
    private double peso;
    private double estatura;

    
    public IMCCalculator(double peso, double estatura) {
        if (peso <= 0 || estatura <= 0) {
            throw new IllegalArgumentException("Peso y estatura deben ser mayores que cero.");
        }
        this.peso = peso;
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }

    
    public String obtenerCategoriaIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 24.9 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    
    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }
}