public class Pilha {

    private No refnoEntradaPilha;

    public Pilha(){
        this.refnoEntradaPilha = null;

    }

    // retorna a referencia do topo da pilha
    public No top(){
        return refnoEntradaPilha;
    }

    //empilha 
    public void push(No novoNo){
        No refAuxiliar = refnoEntradaPilha;
        refnoEntradaPilha = novoNo;
        refnoEntradaPilha.setRefNo(refAuxiliar);
    }

    //desenpilha
    public No pop(){
        if(!isEmpty()){
            No noPoped = refnoEntradaPilha;
            refnoEntradaPilha = refnoEntradaPilha.getRefNo();
        }
        return null;
    }

    public boolean isEmpty(){
        if(refnoEntradaPilha == null){
            return true;
        }
        return false;
    }
    
}
