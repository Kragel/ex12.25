package t_12_errorHandingWithExceptions.ex25.exceptions;

public class DeriveEx extends BasedEx {

    private static final long serialVersionUID = 8015230426075519376L;

    public DeriveEx()
    {
        super();
    }

    public DeriveEx(String arg0, Throwable arg1, boolean arg2, boolean arg3)
    {
        super(arg0, arg1, arg2, arg3);
    }

    public DeriveEx(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }

    public DeriveEx(String arg0)
    {
        super(arg0);
    }

    public DeriveEx(Throwable arg0)
    {
        super(arg0);
    }

}
