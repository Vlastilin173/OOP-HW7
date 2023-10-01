package calculator;

import complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}