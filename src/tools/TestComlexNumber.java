package tools;

public class TestComlexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComplexNumber a0 = new ComplexNumber(-1, 2);
        ComplexNumber a1 = new ComplexNumber(4, 0);
        ComplexNumber a2 = new ComplexNumber(1, -1);
        ComplexNumber a3 = new ComplexNumber(2, -1);
        ComplexNumber a4 = new ComplexNumber(1, 1);
        
        ComplexNumber a0_2 = a0.toN(2);
        System.out.println(a0_2.getA() + " + " + a0_2.getB() + "i");
        ComplexNumber div0 = a1.div(a2);
        ComplexNumber div1 = a3.div(a4);
        ComplexNumber suma = div0.add(div1);
        
        ComplexNumber TP01_P1 = a0_2.mult(suma);
        System.out.println("TP01_P1: " + TP01_P1.getA() + " + " + TP01_P1.getB() + "i");
        
        /*ComplexNumber a0 = new ComplexNumber(2, 3);
        ComplexNumber a1 = new ComplexNumber(2, 3);
        
        ComplexNumber suma = a0div(a1);
        
        System.out.println("Multiplicación : " + suma.getA() + " + " + suma.getB() + "i");*/
    }
    
}
