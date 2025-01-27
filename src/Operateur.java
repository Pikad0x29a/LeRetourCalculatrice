public class Operateur implements IElemCal {

    private EOperation operation;
    public Operateur(EOperation operation) {
        this.operation = operation;
    }

    @Override
    public EType getType() {
        return EType.OPERATEUR;
    }
}
