import java.util.List;

public class Stats {
    public void afficheGroupe(List<Etudient> l){
        for (Etudient e:l) {
            System.out.println(e);
            System.out.println(e.getMaxNote());
            System.out.println(e.getMinNote());
        }
    }
    public double getMoyenneGroupe(List<Etudient> l){
        double moy=0;
        for (Etudient e:l) {
            moy+=e.getValue();
        }
        return moy/l.size();
    }
    public double getMinimumGroupe(List<Etudient> l){
        double min=l.getFirst().getValue();;
        for (Etudient e:l) {
           if(e.getValue()<min){
               min=e.getValue();
           }
        }
        return min;
    }
    public double getMaximumGroupe(List<Etudient> l){
        double max=l.getFirst().getValue();;
        for (Etudient e:l) {
            if(e.getValue()>max){
                max=e.getValue();
            }
        }
        return max;
    }
}
