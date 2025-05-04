package common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DistanciaService extends Remote {
    double calcularDistancia(double[] obj1, double[] obj2, String tipo) throws RemoteException;
}