public class BmiService {
    public double calculate(double mass, double height) {
        double bmi;
        bmi = mass/(height*height);
        return bmi;
    }
}
