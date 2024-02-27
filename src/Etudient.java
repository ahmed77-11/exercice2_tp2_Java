import java.util.ArrayList;

public class Etudient implements IStatisticable,Comparable<Etudient>{
    private String matricule;
    private String nom;
    private ArrayList<Note> listNote;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Note> getListNote() {
        return listNote;
    }

    public void setListNote(ArrayList<Note> listNote) {
        this.listNote = listNote;
    }

    public Etudient(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        this.listNote = new ArrayList<>();
    }
    public void addNote(Note n){
        this.listNote.add(n);
    }
    public double getMoyenne(){
        double moy=0;
        for(Note n :listNote){
            moy+=n.getNote();
        }
        return (moy/listNote.size());
    }
    @Override
    public double getValue() {
        return this.getMoyenne();
    }
    public double getMinNote(){
        double min=listNote.getFirst().getNote();
        for (Note n: listNote) {
            if(n.getNote()<min){
                min=n.getNote();
            }
        }
        return min;
    }
    public double getMaxNote(){
        double max=listNote.getFirst().getNote();
        for (Note n: listNote) {
            if(n.getNote()>max){
                max=n.getNote();
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return "Etudient{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", moy=" + getValue() +
                '}';
    }

    @Override
    public int compareTo(Etudient etudient) {
        if(this.getValue()>etudient.getValue())
            return 1;
        if(this.getValue()<etudient.getValue())
            return  -1;
        return 0;
    }
}