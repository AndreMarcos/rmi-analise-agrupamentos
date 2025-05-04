package client;

import common.DistanciaService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            DistanciaService service = (DistanciaService) registry.lookup("DistanciaService");

            Scanner sc = new Scanner(System.in);
            double[][] flores = new double[3][4]; // 3 flores, 4 características - como na tabela representada
            String[] nomes = {"A", "B", "C"}; // Como representada na tabela
            String[] atributos = {
                "largura da pétala",
                "altura da pétala",
                "largura da sépala",
                "altura da sépala"
            };

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite as características da flor " + nomes[i] + ":");
                for (int j = 0; j < 4; j++) {
                    System.out.print(atributos[j] + ": ");
                    flores[i][j] = sc.nextDouble();
                }
            }

            sc.nextLine();

            System.out.print("Informe o tipo de distância (euclidiana/cityblock): ");
            String tipo = sc.nextLine();

            double ab = service.calcularDistancia(flores[0], flores[1], tipo);
            double ac = service.calcularDistancia(flores[0], flores[2], tipo);
            double bc = service.calcularDistancia(flores[1], flores[2], tipo);

            System.out.println("\nDistâncias calculadas:");
            System.out.println("A-B: " + ab);
            System.out.println("A-C: " + ac);
            System.out.println("B-C: " + bc);

            double menor = Math.min(ab, Math.min(ac, bc));
            String par;
            if (menor == ab) par = "A-B";
            else if (menor == ac) par = "A-C";
            else par = "B-C";

            System.out.println("Par mais similar: " + par);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
