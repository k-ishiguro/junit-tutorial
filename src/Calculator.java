/**
 * Written by Katsuhiko Ishiguro <ishiguro.katsuhiko@lab.ntt.co.jp>
 * Last update: 04/19, 2016
 */
public class Calculator {

    public int multiply(int x, int y){
        return x * y;
    }

    public float divide(int x, int y){
        if(y == 0) {
            throw new IllegalArgumentException("divide by zero.");
        }
        return (float)x / (float)y;
    }

}
