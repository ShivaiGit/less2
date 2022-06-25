package lessOOP;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle (double sideA,double sideB,double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public void areaTriangle (){
        double halfMeter = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(halfMeter*(halfMeter-sideA)*(halfMeter-sideB)*(halfMeter-sideC));
        System.out.printf("The area of the triangle = %.4f",area);
    }
}