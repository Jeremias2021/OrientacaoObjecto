package POO;


public class SaidaDadosPessoais {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCodigo(0001);
        pessoa1.setNome("Jeremias");
        pessoa1.setApelido("João Mané");
        pessoa1.setDataNasc("11/09/2008");
        pessoa1.setSexo("M");


        Pessoa pessoa2 = new Pessoa();
        pessoa2.setCodigo(0001);
        pessoa2.setNome("Anitta");
        pessoa2.setApelido("Da Silva");
        pessoa2.setDataNasc("17/10/2005");
        pessoa2.setSexo("F");


        System.out.println("**********DADOS DA PESSOA 1 **********");
        System.out.println("CODIGO: " + pessoa1.getCodigo());
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Apelido: " + pessoa1.getApelido());
        System.out.println("Data Nascimento: " + pessoa1.getDataNasc());
        System.out.println("Sexo: " + pessoa1.getSexo());
        System.out.println();
        System.out.println("**********DADOS DA PESSOA 2 **********");
        System.out.println("CODIGO: " + pessoa2.getCodigo());
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Apelido: " + pessoa2.getApelido());
        System.out.println("Data Nascimento: " + pessoa2.getDataNasc());
        System.out.println("Sexo: " + pessoa2.getSexo());

    }

}
