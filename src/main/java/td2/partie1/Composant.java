package td2.partie1;

public interface Composant {

    void appendContent(String s);

    String getNameComposant();
    Owner getOwnerComposant();
    Owner setOwnerComposant(Owner o);

    String getContentComposant();
    int getSizeComposant();

    boolean isComposite();
}