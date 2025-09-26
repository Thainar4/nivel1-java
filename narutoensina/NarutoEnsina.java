package narutoensina;

/**
Aprendi sobre herança, polimorfismo e encapsulamento com o Naruto
Vídeo do canal Fiasco link:https://youtu.be/OIYWA1GwCEs?si=RbpEZrmXRMmfLTgv
 */
public class NarutoEnsina {

    public static void main(String[] args) {
        
          // Criando objeto 1
    System.out.println("Criando objeto 1");
    System.out.println("----------------------------------------------");
    
     uzumaki naruto = new uzumaki(); // o naruto não tem acesso ao método shariganAtivado
     
     naruto.setNome("Naruto Uzumaki"); // aplicando encapsulamento
     naruto.getNome();
     System.out.println("Meu nome e " + naruto.getNome());
     
     
     naruto.setIdade(19);
     naruto.getIdade();
     System.out.println("Minha idade e " + naruto.getIdade() + " anos");
     
     naruto.setAldeia("Konoha");
     naruto.getAldeia();
     System.out.println("Minha aldeia e " + naruto.getAldeia());
     
     
     naruto.temBiju = false;
     System.out.println("Voce tem biju? "+ naruto.temBiju);
     naruto.chacraInfinito(); // criamos uma classe Uzumaki, ele terá acesso á ao método chacraInfinito
     naruto.ataqueBase();
     System.out.println("----------------------------------------------");
     
     
     
     //Criando objeto 2
     System.out.println("Criando objeto 2");
     System.out.println("----------------------------------------------");
     uchiha sasuke = new uchiha(); // não tem acesso ao método chacraInfinito
     
     sasuke.setNome("sasuke uchiha"); //aplicando encapsulamento
     sasuke.getNome();
     System.out.println("Meu nome e " + sasuke.getNome());
     
     
     
     sasuke.setIdade(20);
     sasuke.getIdade();
     System.out.println("Eu tenho " + sasuke.getIdade() + " anos");
     
    
     sasuke.setAldeia("Konoha");
     sasuke.getAldeia();
     System.out.println("Minha aldeia e " + sasuke.getAldeia());
     
     System.out.println(sasuke.nivelDoSharingan);
     sasuke.shariganAtivado();
     sasuke.ataqueBase();
     sasuke.ataqueBase(0);

    }
}
