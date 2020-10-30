package td2.partie1;

import java.util.List;

public interface Composite<C> {
    void addChild(Composant composant);

    //getChildren : renvoie les composants contenus dans ce composite ;
    void getChildren(List<Composant> composantList);

    //removeChild : supprime un composant de ce composite ;
    void removeChild(Composant composant);
    // removeChildren : supprime une liste de composants de ce composite ;
    void removeChildren(List<Composant> composantList);
}
