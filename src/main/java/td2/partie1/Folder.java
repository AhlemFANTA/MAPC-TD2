package td2.partie1;

import java.util.List;

public class Folder extends ComposantImpl implements Composant, Composite<Composant> {
    protected Folder(String name, Owner owner) {
        super(name, owner);
    }

    @Override
    public Owner setOwnerComposant(Owner o) {
        return this.owner = o;
    }

    @Override
    public boolean isComposite() {
        return false;
    }

    @Override
    public void addChild(Composant composant) {

    }

    @Override
    public void getChildren(List<Composant> composantList) {

    }

    @Override
    public void removeChild(Composant composant) {

    }

    @Override
    public void removeChildren(List<Composant> composantList) {

    }
}
