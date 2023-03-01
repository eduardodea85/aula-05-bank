
package aula05bank;


public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //MÉTODOS PERSONALIZADOS
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        //if("cc".equals(t)){ // poderia usar assim (t == "CC"){, mas para parar de reclamar vamos usar o equals.
        if (t == "CC"){  
        //this.saldo = 50; uso do atributo... mas é aconselhaver sempre dar preferencia sempre por usar o método.
            this.setSaldo(50);
        //}else if("CP".equals(t)){ //(t == "CP"){
        }else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechado, pois ainda está com Dinheiro");
        } else if(this.getSaldo() <0){
            System.out.println("Conta não pode ser fechado, pois está com débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {  
            this.setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + getDono());
        } else { 
            System.out.println("Impossível depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        }else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
            
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (getStatus()){
            this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else{
                System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    //MÉTODOS ESPECIAIS
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
          
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
     }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
           
    
    
}
