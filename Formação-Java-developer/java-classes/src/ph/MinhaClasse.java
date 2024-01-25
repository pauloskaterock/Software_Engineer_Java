package ph;
public class MinhaClasse {

    public static void main(String [] args){
        String primeiroNome = "PH";
        String segundoNome = "Fodao";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        //String br  = "brazil";
        //ystem.out.println(br);
}
    public static String nomeCompleto (String primeiroNome , String segundoNome) {
        return  "meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
    

