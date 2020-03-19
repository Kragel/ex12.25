package t_12_errorHandingWithExceptions.ex25.model;

import t_12_errorHandingWithExceptions.ex25.exceptions.DeriveDeriveEx;

public class C extends B {

    @Override
    public void throwException() throws DeriveDeriveEx
    {
        throw new DeriveDeriveEx();
    }

}
