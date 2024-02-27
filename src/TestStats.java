import java.util.Collections;
import java.util.Vector;

public class TestStats {
    public static void main(String[] args) {
        Vector<Etudient> v=new Vector<>();
        Stats s=new Stats();
        v.add(new Etudient("123","hamed"));
        v.get(0).addNote(new Note("histoire",1));
        v.get(0).addNote(new Note("geo",0));
        v.add(new Etudient("130","ahmed"));
        v.get(1).addNote(new Note("histoire",6));
        v.get(1).addNote(new Note("geo",16));
        v.add(new Etudient("128","same7"));
        v.get(2).addNote(new Note("histoire",1.5));
        v.get(2).addNote(new Note("geo",2.25));

        s.afficheGroupe(v);
        System.out.println("max classe"+ s.getMaximumGroupe(v));
        System.out.println("min classe"+ s.getMinimumGroupe(v));
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);

        CompareNom compareNom=new CompareNom();
        Collections.sort(v,compareNom);
        System.out.println(v);

        CompareMat compareMat=new CompareMat();
        Collections.sort(v,compareMat);
        System.out.println(v);


    }
}
