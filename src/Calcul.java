import java.util.ArrayList;

// Product
public class Calcul {
    private ArrayList<IElemCal> liste;

    private Calcul(CalculBuilder builder) {
        this.liste = builder.liste;
    }

    public ArrayList<IElemCal> getListe() {
        return this.liste;
    }

    public String toString() {
        String result = "";
        for (IElemCal item : this.liste) {
            result += item + ", ";
        }

        return result;
    }

    // ConcreteBuilder
    public static class CalculBuilder {
        private ArrayList<IElemCal> liste = new ArrayList<>();


        public CalculBuilder addItemListe (IElemCal item) {
            this.liste.add(item);
            return this;
        }

        public Calcul build() {
            return new Calcul(this);
        }
    }
}