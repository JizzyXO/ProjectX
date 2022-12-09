import java.util.Scanner;

public class QuadraticEquations {
    private double Discriminant;
    private double x1;
    private double x2;
    Scanner scan = new Scanner(System.in);
    public double coefficientA = scan.nextDouble();
    public double coefficientB = scan.nextDouble();
    public double coefficientC = scan.nextDouble();
    private void countDiscriminant() {
        Discriminant = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
    }
    public void equationRoots() {
        if(Discriminant>0) {
            x1=-coefficientB+Math.sqrt(Discriminant)/2*coefficientA;
            x2=-coefficientB-Math.sqrt(Discriminant)/2*coefficientA;
            System.out.println("x1\n + x2");
        } else if (Discriminant==0) {
            x1=-coefficientB/2*coefficientA;
            System.out.println(x1);
        }
            else {
            System.out.println("Корней нет");
        }
    }
}
