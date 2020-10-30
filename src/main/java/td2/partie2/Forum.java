package td2.partie2;

public class Forum  extends Conteneur<Theme>  {


    public Forum(String sujet) {
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
        final String DELIM = "--------------------\n";
        final String parent = "Forum : ";
        StringBuilder sb = new StringBuilder();
        sb.append(DELIM);
        sb.append(parent); sb.append(this.sujet);sb.append(" \n");
        for (Theme child : children) {
            sb.append(String.format("- %s\n", child));
        }
        return sb.toString();
    }


}


