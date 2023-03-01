
package aula05bank;


public class Aula05Bank {

    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        //p1.setTipo(t);
        p1.setDono("Eduardo");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Rafa");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(50);
       
        
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
