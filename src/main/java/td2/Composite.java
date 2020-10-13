package td2;

public interface Composite<C> {
    void addChild(C f1);
    //removeChild : supprime un composant de ce composite ;
    void removeChild(C f1);
    //getChildren : renvoie les composants contenus dans ce composite ;
    void getChildren(C f1);
    // removeChildren : supprime une liste de composants de ce composite ;
    void removeChildren(C f1);
}
