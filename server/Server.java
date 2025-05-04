package server;

import common.DistanciaService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            DistanciaService service = new DistanciaServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("DistanciaService", service);
            System.out.println("Servidor pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
