public class MinhaClasse {

    public static void main(String[] args) {
      System.out.println("olá, mundo"); 

      
      System.out.println(nomeCompleto("Luana", "Fernanda"));
    }
    

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }
}
