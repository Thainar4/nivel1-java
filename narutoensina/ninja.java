package narutoensina;

/*Aqui aprendi que sobre herança*/



public class ninja {
    private String nome;
    private String aldeia;
    private int idade;
    
    
    //encapsulamento
    /*getter - criar getter para mostra ao usuário*/
    public String getNome(){
        return nome;
    }
    
    
    /*setter - settar o valor da variavel*/
    public void setNome (String nome){
        this.nome = nome;
    }
    
    
    public String getAldeia(){
        return aldeia;
    }
    
    public void setAldeia (String aldeia){
        this.aldeia = aldeia;
    }

    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void ataqueBase(){
        
        System.out.println("Eu sou ninja e taquei uma kunai");
        
    }
    
}
