import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTriangle1() {
        int sidaA = 2;
        int sidaB = 2;
        int sidaC = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle2() {
        int sidaA = 2;
        int sidaB = 2;
        int sidaC = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle3() {
        int sidaA = 3;
        int sidaB = 4;
        int sidaC = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle4() {
        int sidaA = 8;
        int sidaB = 2;
        int sidaC = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle5() {
        int sidaA = -1;
        int sidaB = 2;
        int sidaC = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle6() {
        int sidaA = 0;
        int sidaB = 1;
        int sidaC = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.checkTriangle(sidaA, sidaB, sidaC);
        assertEquals(expected, result);
    }
}