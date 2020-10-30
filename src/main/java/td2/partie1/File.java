package td2.partie1;

public class File extends ComposantImpl implements Composant{
    public File(String name, Owner owner1) {
        super(name, owner1);
    }

    @Override
    public void appendContent(String s) {

    }

    @Override
    public String getNameComposant() {
        return this.name;
    }

    @Override
    public Owner getOwnerComposant() {
        return this.owner;
    }

    @Override
    public Owner setOwnerComposant(Owner o) {
        return this.owner = o;
    }

    @Override
    public String getContentComposant() {
            StringBuilder sb = new StringBuilder("File content:\n");
            sb.append(super.getContentComposant());
            return sb.toString();
    }

    @Override
    public int getSizeComposant() {
        return this.content.size();
    }

    @Override
    public boolean isComposite() {
        return false;
    }
}
