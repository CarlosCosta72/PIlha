package Pilha;
public class Teste {
    public static void main(String[] args) throws Exception {
        Pilha p= new Pilha(10); 
        for(int i=0;i<=p.getTamMax();i++){
            if(i%2==0){
                p.push(i);
            }
        }



        while(p.tamanho()!=0){
        if(p.vazia()){
            break;
        }
            System.out.println(p.pop());
        }

        System.out.println(p.tamanho()); 
    }

}