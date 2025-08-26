public class App {
    public static void main(String[] args) throws Exception {
        Validador v1 = ValidadorFactory.getValidador(ValidadorFactory.Tipo.INTEIRO);
        System.out.println("Inteiro 12345: " + v1.valida("12345"));
        System.out.println("Inteiro 12a45: " + v1.valida("12a45"));

        Validador v2 = ValidadorFactory.getValidador(ValidadorFactory.Tipo.EMAIL);
        System.out.println("Email test@site.com: " + v2.valida("test@site.com"));
        System.out.println("Email errado: " + v2.valida("testsite.com"));

        Validador v3 = ValidadorFactory.getValidador(ValidadorFactory.Tipo.MATRICULA);
        System.out.println("Matrícula 12340: " + v3.valida("12340"));
        System.out.println("Matrícula 12345: " + v3.valida("12345"));
    }
}
