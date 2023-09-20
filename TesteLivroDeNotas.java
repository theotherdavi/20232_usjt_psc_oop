public class TesteLivroDeNotas {
    public static void main (String... args)    {
        LivroDeNotas livroDeNotas = new LivroDeNotas("Ciência da Computação", 8, 400.00);
        livroDeNotas.exibeMensagem();

        LivroDeNotas livroDeNotas2 = new LivroDeNotas("Sistemas de Informação", 8, 380.00);
        livroDeNotas.setSemesters(8);
        livroDeNotas.setExtensionHours(380.00);
        livroDeNotas2.exibeMensagem();

    }
}
