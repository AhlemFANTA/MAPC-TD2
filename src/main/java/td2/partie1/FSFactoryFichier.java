package td2.partie1;

public class FSFactoryFichier extends ComposantImpl {
    String name;
    Owner sonOwner;

    public FSFactoryFichier(String name, Owner sonOwner){
        this.name = name;
        this.sonOwner = sonOwner;
    }
}
