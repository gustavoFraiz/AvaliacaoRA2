import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL tree =  new ArvoreAVL();
//        ArvoreBinaria tree = new ArvoreBinaria();
        Random random = new Random();
        for(int i = 0; i < 10000; i++){
            tree.inserir(random.nextInt(10000));
        }
        tree.imprimirEmOrdem();
    }
}