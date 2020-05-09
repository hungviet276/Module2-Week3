public class TriangleClassifier {
    public static String checkTriangle(int sideA, int sideB, int sideC) {
        String checkTriangle = "";
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            if (sideA == sideB && sideA == sideC) {
                checkTriangle = "Tam giác đều";
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                checkTriangle = "Tam giác cân";
            } else if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
                checkTriangle = "Không phải tam giác";
            } else checkTriangle = "Tam giác thường";
        } else checkTriangle = "Không phải tam giác";
        return checkTriangle;
    }
}
