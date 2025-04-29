public class Aula4 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        p1.setNome("Jacobe Junior Jonas Jeremias");
        p1.setIdade(677);
        p1.setAltura(1.67);
        p1.setIsCasado(true);
        p1.setPrimeiraLetra('J');
        
        a1.setMatricula("20241144010016");
        a1.setAno(2);
        a1.setCursando(true);
        a1.setCurso('I');
        a1.setNotaMatematica(9.99);
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("IsCasado: " + p1.getIsCasado());
        System.out.println("PrimeiraLetra: " + p1.getPrimeiraLetra());
        
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Ano: " + a1.getAno());
        System.out.println("Cursando: " + a1.getCursando());
        System.out.println("Curso: " + a1.getCurso());
        System.out.println("NotaMatematica: " + a1.getNotaMatematica());
        
    }
   
}

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private boolean isCasado;
    private char primeiraLetra;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setIsCasado(boolean isCasado) {
        this.isCasado = isCasado;
    }
    
    public void setPrimeiraLetra(char primeiraLetra) {
        this.primeiraLetra = primeiraLetra;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public boolean getIsCasado() {
        return this.isCasado;
    }
    
    public char getPrimeiraLetra() {
        return this.primeiraLetra;
    }
}

public class Aluno {
    private String matricula;
    private int ano;
    private boolean cursando;
    private char curso;
    private double notaMatematica;
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void setCursando(boolean cursando) {
        this.cursando = cursando;
    }
    
    public void setCurso(char curso) {
        this.curso = curso;
    }
    
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    
    public String getMatricula() {
        return this.matricula;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public boolean getCursando() {
        return this.cursando;
    }
    
    public char getCurso() {
        return this.curso;
    }
    
    public double getNotaMatematica() {
        return this.notaMatematica;
    }
}
