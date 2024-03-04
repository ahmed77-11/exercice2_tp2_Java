public class Note {
    private String NomCours;
    private double note;

    @Override
    public String toString() {
        return "Note{" +
                "NomCours='" + NomCours + '\'' +
                ", note=" + note +
                '}';
    }

    public String getNomCours() {
        return NomCours;
    }

    public void setNomCours(String nomCours) {
        NomCours = nomCours;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public Note(String nomCours, double note) {
        NomCours = nomCours;
        this.note = note;
    }
}
