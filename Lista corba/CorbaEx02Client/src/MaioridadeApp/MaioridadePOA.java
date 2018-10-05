package MaioridadeApp;


/**
* MaioridadeApp/MaioridadePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Maioridade.idl
* Sexta-feira, 5 de Outubro de 2018 12h03min27s BRT
*/

public abstract class MaioridadePOA extends org.omg.PortableServer.Servant
 implements MaioridadeApp.MaioridadeOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("maioridadeF", new java.lang.Integer (0));
    _methods.put ("maioridadeM", new java.lang.Integer (1));
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
       case 0:  // MaioridadeApp/Maioridade/maioridadeF
       {
         int idade = in.read_long ();
         int $result = (int)0;
         $result = this.maioridadeF (idade);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // MaioridadeApp/Maioridade/maioridadeM
       {
         int idade = in.read_long ();
         int $result = (int)0;
         $result = this.maioridadeM (idade);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // MaioridadeApp/Maioridade/shutdown
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
    "IDL:MaioridadeApp/Maioridade:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Maioridade _this() 
  {
    return MaioridadeHelper.narrow(
    super._this_object());
  }

  public Maioridade _this(org.omg.CORBA.ORB orb) 
  {
    return MaioridadeHelper.narrow(
    super._this_object(orb));
  }


} // class MaioridadePOA
