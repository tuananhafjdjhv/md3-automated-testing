package bai_tap.tinh_ngay_tiep_theo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TinhNgayTiepTheo {
    @ParameterizedTest
    @CsvSource({
            "25, 2, 2020, 26/2/2020",
            "29, 2, 2020, 1/3/2020",
            "31,12,2020, 1/1/2021",
            "15,12,2020, 16/12/2020",
            "20,6,2020, 21/6/2020",
            "30,6,2020, 1/7/2020"
    })
    void getNextDay(int day,int month,int year,String nextDay){
        String sum = NextDayCaculator.getNextDay(20,2,2019);
        assertEquals(nextDay, sum);
    }

}
