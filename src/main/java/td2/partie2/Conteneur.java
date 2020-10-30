package td2.partie2;

import java.util.ArrayList;
import java.util.List;

public abstract class Conteneur<T extends IContenu> implements IConteneur<T> , IContenu {
    protected final List<T> children;
    protected String sujet;

    public Conteneur(String sujet) {
        this.sujet = sujet;
        this.children = new ArrayList<>();
    }
    public void add(T child){
        this.children.add(child);
    }

    @Override
    public String toString() {
        return "Conteneur{" +
                "children=" + children +
                ", sujet='" + sujet + '\'' +
                '}';
    }

}
