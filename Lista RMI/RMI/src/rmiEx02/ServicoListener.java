// ACQUILA SANTOS ROCHA e JULIANA DE MELO TEIXEIRA
package rmiEx02;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoListener extends Remote {

	void calculoEfetuado(String resultado) throws RemoteException;
}
