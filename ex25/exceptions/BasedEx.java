package t_12_errorHandingWithExceptions.ex25.exceptions;

public class BasedEx extends Exception {

    private static final long serialVersionUID = -7444151780391672489L;

    public BasedEx()
    {
        super();
    }

    public BasedEx(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

    public BasedEx(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public BasedEx(String arg0)
    {
        super(arg0);
    }

    public BasedEx(Throwable arg0)
    {
        super(arg0);
    }

}
