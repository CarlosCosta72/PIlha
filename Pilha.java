package Pilha;

public class Pilha implements Metodos {
    private int dados[];
    private int topo;
    private int tamMax;

    public Pilha( int tamMax){
        this.topo=-1;
        this.setTamMax(tamMax);
        dados=new int [this.tamMax];
    }

    public int getTamMax(){
        return this.tamMax;
    }
    public void setTamMax(int tam){
        this.tamMax=tam;
    }
    public void setTopo(int topo){
        this.topo=topo;
    }
    @Override
    public boolean vazia() {
        if(this.topo==-1){
            return true;
        }else 
            return false;
        
    }

    @Override
    public boolean cheia() {
        if(this.topo== (this.tamMax-1)  ){
            return true;
        }else
            return false;
    }

    @Override
    public int tamanho() {
        return this.topo+1;
    }

    @Override
    public int top() {
        if(vazia()){
            return -1;//
        }
        return dados[this.topo];
    }


    @Override
    public boolean push(int valor) {
        if(cheia()){
            return false;
        }
        topo++;
        dados[this.topo]= valor;
        return true;

    }

    @Override
    public int pop() {
        if(vazia()){
            return -1;
        }
        int valor= dados[this.topo];
        topo--;
        return valor;    
        
    }



}
