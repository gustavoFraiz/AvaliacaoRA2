public class ArvoreBinaria {
    Node raiz;
    Node atual;


    public ArvoreBinaria(){
        this.raiz = null;
        this.atual = null;
    }

    public boolean vazio(){
        if(raiz == null){
            return true;
        }
        return false;
    }

    public void inserir(int informação){
        Node no = new Node();
        no.setInformação(informação);
        if (vazio()) {
            raiz = no;
        }
        else{
            atual = raiz;

            while(true){
                if(informação >= atual.getInformação()){
                    if(atual.getFilhoDireita() != null){ atual = atual.getFilhoDireita();}
                    else{
                        atual.setFilhoDireita(no);
                        break;
                    }
                }
                else{
                    if(atual.getFilhoEsquerda() != null){ atual = atual.getFilhoEsquerda();}
                    else{
                        atual.setFilhoEsquerda(no);
                        break;
                    }
                }
            }
        }
    }

    public void imprimirEmOrdem(Node node) {
        if (node != null) {
            imprimirEmOrdem(node.getFilhoEsquerda());
            System.out.print(node.getInformação() + " ");
            imprimirEmOrdem(node.getFilhoDireita());
        }
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdem(raiz);
        System.out.println();
    }

    public Node minimo(Node node){
        if(node.filhoEsquerda != null){
            return minimo(node.filhoEsquerda);
        }
        else{
            return node;
        }
    }

    public void delete(int informacao){
        delete(raiz, informacao);
    }
    public Node delete(Node node, int informacao){
        if(node == null){return null;}

        else{
            if(node.getInformação() > informacao){ //Checa se o valor para ser deletado é menor que Root. Vai mandar para subarvore da esquerda
                node.filhoEsquerda = delete(node.filhoEsquerda, informacao);
            }
            else if(node.getInformação() < informacao){
                node.filhoDireita = delete(node.filhoDireita, informacao);
            }
            else{ //Else se o valor a ser deletado foi encontrado:
                if(node.filhoDireita == null && node.filhoEsquerda == null){
                    node = null;
                }
                else if(node.filhoEsquerda == null){node = node.filhoDireita;}
                else if(node.filhoDireita == null){node = node.filhoEsquerda;}
                else{
                    Node aux = minimo(node.filhoDireita);
                    node.informacao = aux.informacao;
                    node.filhoDireita = delete(node.filhoDireita, aux.informacao);
                }
            }
            return node;
        }
    }

    public Node busca(int informacao){
        if(this.raiz == null){
            return null;
        }
        else{
            return busca(raiz, informacao);
        }
    }

    public Node busca(Node node, int informacao){
        if(node.informacao == informacao){return node;}
        else if(node.informacao > informacao){
            if(node.filhoEsquerda != null){return busca(node.filhoEsquerda, informacao);}
            else{return null;}
        }
        else{
            if(node.filhoDireita != null){return busca(node.filhoDireita, informacao);}
            else{return null;}
        }
    }

    public void ImprimirBusca(Node node){
        if(node == null){
            System.out.println("Nao foi achado esse elemento na arvore");
        }
        else{
            System.out.println(node.informacao);
        }
    }
}
