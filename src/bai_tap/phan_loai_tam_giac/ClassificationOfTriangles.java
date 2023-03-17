package bai_tap.phan_loai_tam_giac;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runners.Parameterized;

public class ClassificationOfTriangles {
    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, equilateral triangle",
            "2, 2, 3, isosceles triangle",
            "2, 4, 5, normal triangle",
            "8, 2, 3, not triangle",
            "-1, 2, 1, not triangle",
            "0, 1, 1, not triangle",
    })
    void getClassFicationOfTriangleSTest(int side1,int side2,int side3,String expected){

    }

}
