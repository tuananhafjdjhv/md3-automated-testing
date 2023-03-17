package thuc_hanh.caculator.test;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import thuc_hanh.caculator.CaculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Caculator {
    @Test
    @DisplayName("Test add 0 + 0")
    public void Test0va0(){
        int fisrt =0;
        int second = 1 ;
        int expected = 1;
        int sum = CaculatorTest.cong(fisrt,second);
        assertEquals(expected,sum);

    }
    @Test
    @DisplayName("Test add 0 + 0")
    public void Test1va2(){
        int fisrt =0;
        int second = 1 ;
        int expected = 1;
        int hieu = CaculatorTest.tru(fisrt,second);
        assertEquals(expected,hieu);

    }
}
