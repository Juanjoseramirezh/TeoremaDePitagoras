import java.lang.Math;

public class TeoremaDePitagoras {
    public double calcularHipotenusa(int catetoA, int catetoB) {

        double hipotenusa = Math.hypot(catetoA, catetoB);

        return hipotenusa;
    }
}