package Chapters.chapter_10.Exercises.Exercise_21;

import java.math.BigDecimal;

public class Exercise_21 {
    public static void main(String[] args) {
        int count = 0;
        BigDecimal number = new BigDecimal(Long.MAX_VALUE);
        while (count < 10) {
            if (number.remainder(new BigDecimal("5")).equals(BigDecimal.ZERO) ||
                    number.remainder(new BigDecimal("6")).equals(BigDecimal.ZERO)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigDecimal.ONE);
        }
    }
}
//9223372036854775810
//9223372036854775812
//9223372036854775815
//9223372036854775818
//9223372036854775820
//9223372036854775824
//9223372036854775825
//9223372036854775830
//9223372036854775835
//9223372036854775836