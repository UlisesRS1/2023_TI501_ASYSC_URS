package tools;

import java.util.ArrayList;
import java.util.List;

public class TestComlexNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TP02_P5();
    }
    
    public static void TP02_P5() {
        ComplexNumber a = new ComplexNumber((float)(2*Math.sqrt(3)), -2);
        List<ComplexNumber> list = a.rootN(2);
        printArrayList(list);
        
        ComplexNumber b = new ComplexNumber(0, -16);
        list = b.rootN(4);
        printArrayList(list);
        
    }
    
    public static void printArrayList(List<ComplexNumber> list){
        for (ComplexNumber cn:list) {
            System.out.println(cn.toCIS() + " ");
        }
    }
    
    public static void TP01_P1() {
        /*ComplexNumber a0 = new ComplexNumber(-1, 2);
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
        System.out.println("TP01_P1: " + TP01_P1.getA() + " + " + TP01_P1.getB() + "i");*/
        
        ComplexNumber a0 = new ComplexNumber(0, -4);
        
        System.out.println("Conjugado : " + a0.toN(5).getB() + "i");
    }
    
}
