package t_12_errorHandingWithExceptions.ex25.model;

import t_12_errorHandingWithExceptions.ex25.exceptions.DeriveEx;

public class B extends A {

    @Override
    public void throwException() throws DeriveEx
    {
        throw new DeriveEx();
    }

}
