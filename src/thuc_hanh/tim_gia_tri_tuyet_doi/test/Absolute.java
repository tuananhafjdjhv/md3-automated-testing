package thuc_hanh.tim_gia_tri_tuyet_doi.test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import thuc_hanh.tim_gia_tri_tuyet_doi.AbsoluteNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Absolute {
    @Test
    void findAbsolute(){
        int number=1;
        int expected=0;
        int result = AbsoluteNumber.findAbsolute(number);
            assertEquals(expected,result);
    }
    @Test
    @DisplayName("Test FindAbsolute 1")
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test FindAbsolute -1")
    void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }
}
