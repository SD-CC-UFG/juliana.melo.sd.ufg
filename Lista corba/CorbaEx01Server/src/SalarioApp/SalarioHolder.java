package SalarioApp;

/**
* SalarioApp/SalarioHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SalarioApp.idl
* Sexta-feira, 5 de Outubro de 2018 11h38min02s BRT
*/

public final class SalarioHolder implements org.omg.CORBA.portable.Streamable
{
  public SalarioApp.Salario value = null;

  public SalarioHolder ()
  {
  }

  public SalarioHolder (SalarioApp.Salario initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SalarioApp.SalarioHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SalarioApp.SalarioHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SalarioApp.SalarioHelper.type ();
  }

}