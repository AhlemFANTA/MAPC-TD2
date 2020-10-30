package td2.partie2;

public interface IConteneur <T extends IContenu>{
    void add(T contenu);
    void remove(int i);
    int size();
}
