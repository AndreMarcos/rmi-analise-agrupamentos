package server;

import common.DistanciaService;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class DistanciaServiceImpl extends UnicastRemoteObject implements DistanciaService {
    public DistanciaServiceImpl() throws RemoteException {
        super();
    }

    public double calcularDistancia(double[] a, double[] b, String tipo) throws RemoteException {
        double dist = 0;
        if (tipo.equalsIgnoreCase("euclidiana")) {
            for (int i = 0; i < a.length; i++) {
                dist += Math.pow(a[i] - b[i], 2);
            }
            return Math.sqrt(dist);
        } else if (tipo.equalsIgnoreCase("cityblock")) {
            for (int i = 0; i < a.length; i++) {
                dist += Math.abs(a[i] - b[i]);
            }
            return dist;
        } else {
            throw new IllegalArgumentException("Tipo inválido: " + tipo);
        }
    }
}