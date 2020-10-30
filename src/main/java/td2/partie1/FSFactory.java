package td2.partie1;

// factory Singleton
public class FSFactory {
    private final static FSFactory instance = new FSFactory();

    public Composant createComposant(ComposantType type, String name, Owner owner1) {
        Composant composant = null;
        switch(type){
            case FICHIER -> composant = new File(name, owner1);
            case REPERTOIRE -> composant = new Folder(name, owner1);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        } return composant;
    }

    public static FSFactory getInstance() {
        return instance;
    }
}
