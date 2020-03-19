package t_12_errorHandingWithExceptions.ex25.model;

import t_12_errorHandingWithExceptions.ex25.exceptions.BasedEx;

public class A {

    public void throwException() throws BasedEx
    {
        throw new BasedEx();
    }

}
