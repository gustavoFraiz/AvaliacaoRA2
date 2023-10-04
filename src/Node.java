public class Node {
    int informacao;
    Node filhoDireita;
    Node filhoEsquerda;

    int altura;

    public Node(){
        this.informacao = 0;
        this.filhoDireita = null;
        this.filhoEsquerda = null;
        this.altura = 0;
    }

    public Node(int informacao){
        this.informacao = informacao;
        this.filhoDireita = null;
        this.filhoEsquerda = null;
        this.altura = 0;
    }

    public Node getFilhoDireita() {
        return filhoDireita;
    }

    public void setFilhoDireita(Node filhoDireita) {
        this.filhoDireita = filhoDireita;
    }

    public Node getFilhoEsquerda() {
        return filhoEsquerda;
    }

    public void setFilhoEsquerda(Node filhoEsquerda) {
        this.filhoEsquerda = filhoEsquerda;
    }

    public int getInformação() {
        return informacao;
    }

    public void setInformação(int informacao) {
        this.informacao = informacao;
    }
}

