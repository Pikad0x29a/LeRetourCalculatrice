public class Valeur implements IElemCal{
    private double valeur;

    public Valeur(double valeur){
        this.valeur = valeur;
    }

    @Override
    public EType getType() {
        return EType.VALEUR;
    }
}
