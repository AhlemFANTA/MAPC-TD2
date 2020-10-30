package td2.partie2;

public class Salon extends Conteneur<Message>{

    public Salon(String sujet) {
        super(sujet);
    }


    @Override
    public void remove(int i) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        final String parent = "Salon : ";
        StringBuilder sb = new StringBuilder();
        sb.append(parent); sb.append(this.sujet);sb.append(" \n");
        for (Message child : children) {
            sb.append(String.format("- %s\n", child));
        }
        return sb.toString();
    }
}
