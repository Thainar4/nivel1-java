package narutoensina;

public class uchiha extends ninja{ // extends -> irá estender para classe uchiha
//então a classe uchiha vai herdar carasteristícas da classe ninja
      
      
      String nivelDoSharingan = "sharingan 2";
      
      
      public void shariganAtivado(){
        System.out.println("sharigan Ativado!");
      }
      
      
      @Override // aprendi sobre polimorfismo
      public void ataqueBase(){
        
        System.out.println("Eu sou ninja e taquei uma kunai do elemento fogo");
        
      }
      
      public void ataqueBase(int nivelDeChacra){
        
        if (nivelDeChacra>2){
          System.out.println("Susano Ativado!");
        }else if(nivelDeChacra==1){
          
          System.out.println("Eu so consegui ativar o sharigan");
          
        }else{
          System.out.println("To sem sharingan");
        }
        
      }
    
    
}

// Colocando em prática o conceito  Herança
//Somente os objetos criados nessa classe terá acesso ao método shariganAtivado
