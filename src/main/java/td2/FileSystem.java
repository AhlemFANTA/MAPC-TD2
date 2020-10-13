package td2;

import td2.partie1.Composant;
import td2.partie1.ComposantType;
import td2.partie1.Owner;

public class FileSystem {
    public static void main(String[] args) {
        FSFactory fsFactory = FSFactory.getInstance();
        Owner owner1 = new Owner("Sarah");
        Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
        Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);

        ((Composite<Composant>)r1).addChild(f1);
        f1.appendContent("Hello World\n");
        f1.appendContent("How are you doing?");
        System.out.println(r1);


        System.out.println(f1);


    }
}
