import java.util.Comparator;

public class CompareMat implements Comparator<Etudient> {
    @Override
    public int compare(Etudient o1, Etudient o2) {
        return o1.getMatricule().compareTo(o2.getMatricule());}
}
