public class FElemCalc {
   public static Valeur creerValeur(Double valeur) {
       return new Valeur(valeur);
   }
    public static Operateur creerOperateur(EOperation operateur) {
       return new Operateur(operateur);
    }

}
