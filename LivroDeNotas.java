public class LivroDeNotas   {
    private String nomeDoCurso;
    private int semesters;
    private double extensionHours;

    public LivroDeNotas (String courseName, int courseSemestersAmount, double courseExtensionHours)  {
        this.nomeDoCurso = courseName;
        this.semesters = courseSemestersAmount;
        this.extensionHours = courseExtensionHours;
        
    }

    public void exibeMensagem   () {
        System.out.println("Bem vindo ao livro de notas do curso " + nomeDoCurso + "!");
        System.out.println("O curso possui duração de " + semesters + " semestres.");
        System.out.println("E são necessárias " + extensionHours + "h de extensão para a sua conclusão.");
    }

    public void setName (String n) {
        nomeDoCurso = n;
    }

    public void setSemesters    (int n)  {
        semesters = n;
    }

    public void setExtensionHours (double n)    {
        extensionHours = n;
    }

    public void decreaseHours (double n) {
        extensionHours -= n;
        System.out.println("Ótimo! Agora são precisas somente " + extensionHours + "h para a conclusão do curso.");
    }

    public String getName   ()   {
        return nomeDoCurso;
    }

    public int getSemesters ()   {
        return semesters;
    }

    public double getExtensionHours ()  {
        return extensionHours;
    }
}