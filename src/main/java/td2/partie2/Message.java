package td2.partie2;

public class Message implements IContenu{
    private String nom;
    private String description;

    public Message(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    @Override
    public String toString() {
        final String parent = "Message : ";
        return parent + this.nom + " \n"+ this.description + " \n";
    }
}
