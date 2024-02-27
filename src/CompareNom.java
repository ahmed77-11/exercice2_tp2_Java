import java.util.Comparator;

public class CompareNom implements Comparator<Etudient> {
    @Override
    public int compare(Etudient o1, Etudient o2) {
        return o1.getNom().compareTo(o2.getNom());}
}
