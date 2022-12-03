package Chapters.chapter_13.Exercises.E15;


import java.math.BigInteger;

public class Rational2 extends Number implements Comparable<Rational2>{
    private BigInteger numerator;
    private BigInteger denominator;

    public Rational2() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }


    public Rational2(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE :
                new BigInteger("-1")).multiply(numerator.divide(gcd));
        this.denominator = denominator.divide(gcd);
    }

    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n;
        BigInteger n2 = d;
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n1) <= 0; k.add(BigInteger.ONE)) {
            if (n1.remainder(k) == BigInteger.ZERO && n1.remainder(k) == BigInteger.ZERO)
                gcd = k;
        }

        return gcd;
    }

    public BigInteger getNumerator() {
        return numerator;
    }


    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational2 add(Rational2 secondRational) {
        BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(
                denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 subtract(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 multiply(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational2(n, d);
    }

    public Rational2 divide(Rational2 secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Rational2(n, d);
    }

    @Override
    public String toString() {
        return (denominator == BigInteger.ONE) ? numerator + "" : numerator + "/" + denominator;

    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((Rational2) (other))).getNumerator().compareTo(BigInteger.ZERO) == 0)
            return true;
        else
            return false;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational2 o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else
            return 0;
    }
}
