package universidade;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();
        Curso curso = new Curso();
        Curso curso2 = new Curso();
        Departamento depto = new Departamento();
        
        aluno.setNome("Arthur Cáceres Melo");
        aluno.setMatricula("201907446");
        aluno.setAnoIngresso(2019);
        
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno);
        
        curso.setNome("Sistemas de Informação");
        curso.setSigla("SI");
        curso.setDuracao(8);
        curso.setAlunos(alunos);
        
        List<Curso> cursos = new ArrayList<>();
        cursos.add(curso);
        
        aluno2.setNome("Ana Clara Sousa Rezende");
        aluno2.setMatricula("201904567");
        aluno2.setAnoIngresso(2019);
        alunos.add(aluno2);
        
        curso2.setNome("Engenharia de Software");
        curso2.setSigla("ES");
        curso2.setDuracao(10);
        curso2.setAlunos(alunos);
        cursos.add(curso2);
        
        depto.setNome("Instituto de Informática");
        depto.setSigla("INF");
        depto.setCursos(cursos);
        
        for (int i=0; i<alunos.size();i++){
            System.out.println("Nome do(a) aluno(a): " + alunos.get(i).getNome()
                + "\nMatrícula: " + alunos.get(i).getMatricula() + "\nAno de ingresso: "
                + alunos.get(i).getAnoIngresso() + "\n");
            
            System.out.println("Nome do curso: " + cursos.get(i).getNome()
                + "\nSigla: " + cursos.get(i).getSigla() + "\nDuração [em semestres]: "
                + cursos.get(i).getDuracao() + "\n");
            
            System.out.println("Nome do departamento: " + depto.getNome()
                + "\nSigla: " + depto.getSigla() + "\n------------------------\n");
        }
    }
    
}
