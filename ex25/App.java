package t_12_errorHandingWithExceptions.ex25;

import t_12_errorHandingWithExceptions.ex25.exceptions.BasedEx;
import t_12_errorHandingWithExceptions.ex25.model.*;

public class App {

    public static void main(String[] args) throws BasedEx
    {
        ((A) new C()).throwException();
    }

}
