# Le retour de la Calculatrice


Nouvelle version du code de la calulatrice java, toujours sans design, mais cette fois-ci on va utiliser:  
1 interface IElemCalc:
```java
public interface IElemCal {
    public EType getType();
}

```
2 enumerateurs:
- EOperation: avec ADDITION, SOUSTRACTION, MULTIPLICATION, DIVISION et MODULO:
```java
public enum EOperation {

    ADDITION,
    SOUSTRACTION,
    MULTIPLICATION,
    DIVISION,
    MODULO
}
```

- EType: operateur, valeur:
```python
public enum EType {

        VALEUR,
        OPERATEUR
}
```
Une factory FElemCalc:
```java
public class FElemCalc {
   public static Valeur creerValeur(Double valeur) {
       return new Valeur(valeur);       
   }
    public static Operateur creerOperateur(EOperation operateur) {
       return new Operateur(operateur);
    }

}

```
1 Classe Operateur:
```java
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
```
1 Classe Valeur:
```java
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

```
1 classe Calcul:
```java
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
```
⚠️