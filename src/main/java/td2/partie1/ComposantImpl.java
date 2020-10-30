package td2.partie1;

import java.util.ArrayList;
import java.util.List;

public abstract class ComposantImpl implements Composant {
    protected final String name;
    protected Owner owner;
    protected final List<String> content;


    protected ComposantImpl(String name, Owner owner) {
        this.name = name;
        this.owner = new Owner("");;
        this.content = new ArrayList<>();
    }

    @Override
    public void appendContent(String s) {

    }

    @Override
    public String getNameComposant() {
        return this.name;
    }

    @Override
    public String getContentComposant() {

        StringBuilder sb = new StringBuilder();
        this.content.forEach(c -> sb.append(c).append(",\n"));
        return sb.toString();
    }

    @Override
    public Owner getOwnerComposant() {
        return this.owner;
    }

    @Override
    public int getSizeComposant() {
        return content.size();
    }

    @Override
    public Owner setOwnerComposant(Owner owner) {
        return this.owner = owner;
    }

}
