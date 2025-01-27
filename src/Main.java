import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<IElemCal> liste = new ArrayList();

        liste.add(FElemCalc.creerValeur(10.0));
        liste.add(FElemCalc.creerOperateur(EOperation.ADDITION));
        liste.add(FElemCalc.creerValeur(3.25));

        System.out.println(liste.toString());

    }

}