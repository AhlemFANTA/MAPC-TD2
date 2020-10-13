package td2.partie1;

public interface Composant {

    void appendContent(String s);

    String getNameComposant();

    String getContentComposant();

    String getOwnerComposant();

    String getSizeComposant();

    String setOwnerComposant();

}