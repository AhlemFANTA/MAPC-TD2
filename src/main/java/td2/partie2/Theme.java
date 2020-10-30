package td2.partie2;

import java.util.ArrayList;
import java.util.List;

public class Theme extends Conteneur <Salon> {

    public Theme(String sujet) {
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
        final String parent = "Theme : ";
        StringBuilder sb = new StringBuilder();
        sb.append(parent); sb.append(this.sujet);sb.append(" \n");
        for (Salon child : children) {
            sb.append(String.format("- %s\n", child));
        }
        return sb.toString();
    }
}
