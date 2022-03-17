package POO_atividade;
/*
Crie um modelo que represente uma equação de segundo grau.
tem o a,b,c e o X. Ex 2x²+3x+8 = 0 OU ax²+gx+c = 0
*/
public class q23 {
    private int a;
    private int b;
    private int c;
    private int x;
    public q23(int a, int b, int c, int x){
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
}
