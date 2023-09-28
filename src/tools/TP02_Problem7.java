/*
*   ITTES-TICS
*   ASYSC
*   Semestre agosto-septiembre
    TP02 Funciones
    By URS
    
*/
package tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uli Rodriguez
 */
public class TP02_Problem7 {
    public List<ComplexNumber> z = new ArrayList();
    public List<ComplexNumber> w = new ArrayList();
    
    public void initZ(){
        z.add(new ComplexNumber(1, 1));
        z.add(new ComplexNumber(2, -2));
        
    }
    
    public void computeW(){
        for (ComplexNumber c : z) {
            w.add(c.mult(new ComplexNumber(2, 0).subs(c)));
        }
    }
    
    public static void printArrayList(List<ComplexNumber> list){
        for (ComplexNumber cn:list) {
            System.out.println(cn + " ");
        }
    }
    public static void main(String[] args) {
        TP02_Problem7 p = new TP02_Problem7();
        p.initZ();
        p.computeW();
        System.out.println("Z:");
        printArrayList(p.z);
        System.out.println("W:");
        printArrayList(p.w);
    }
    
}
