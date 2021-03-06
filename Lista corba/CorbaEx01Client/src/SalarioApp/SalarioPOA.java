package SalarioApp;


/**
* SalarioApp/SalarioPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SalarioApp.idl
* Sexta-feira, 5 de Outubro de 2018 11h38min02s BRT
*/

public abstract class SalarioPOA extends org.omg.PortableServer.Servant
 implements SalarioApp.SalarioOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("novoSal1", new java.lang.Integer (0));
    _methods.put ("novoSal2", new java.lang.Integer (1));
    _methods.put ("shutdown", new java.lang.Integer (2));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // SalarioApp/Salario/novoSal1
       {
         double sal = in.read_double ();
         double $result = (double)0;
         $result = this.novoSal1 (sal);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // SalarioApp/Salario/novoSal2
       {
         double sal = in.read_double ();
         double $result = (double)0;
         $result = this.novoSal2 (sal);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 2:  // SalarioApp/Salario/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:SalarioApp/Salario:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Salario _this() 
  {
    return SalarioHelper.narrow(
    super._this_object());
  }

  public Salario _this(org.omg.CORBA.ORB orb) 
  {
    return SalarioHelper.narrow(
    super._this_object(orb));
  }


} // class SalarioPOA
