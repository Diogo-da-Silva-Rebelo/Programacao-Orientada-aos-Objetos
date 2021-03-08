package ficha2;


public class Ex2 {

    private int[][] notasTurma;

    //Método que lê as notas dos alunos e as coloca na matriz 5x5
    public void inicializaPauta() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.notasTurma[i][j] = 0;
            }
        }
    }

    //diz uma nota a uma certa uc de um aluno especifico
    public int getNotaAluno(int aluno, int uc) {
        //Alunos-> linha
        //UC's-> coluna
        return (this.notasTurma[aluno][uc]);
    }

    //devolve array de notas dos alunos de uma uc
    public int[] getNotasUc(int uc) {
        int[] todasNotas = new int[5];
        int k = 0;
        for (int i = uc; i < 5; i++) {
            todasNotas[k++] = this.notasTurma[i][uc];
        }
        return todasNotas;
    }

    //devolve array de todas as notas de um aluno
    public int[] getNotasAluno(int aluno) {
        int[] todasNotas = new int[5];
        int k = 0;
        for (int i = aluno; i < 5; i++) {
            todasNotas[k++] = this.notasTurma[aluno][i];
        }
        return todasNotas;
    }

    public int somaUC(int uc) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += this.notasTurma[i][uc];
        }
        return sum;
    }

    public float mediaNotasAluno(int aluno) {
        int[] arrayNotas = getNotasAluno(aluno);
        int sum = 0;
        float media;

        for (int n : arrayNotas) sum += n;
        media = ((float) sum) / 5;
        return media;
    }

    public float mediaNotasUc(int uc) {
        int[] arrayNotas = getNotasUc(uc);
        int sum = 0;
        float media;

        for (int n : arrayNotas) sum += n;
        media = ((float) sum) / 5;
        return media;
    }

    public int notaMax() {
        int max = this.notasTurma[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                max = Math.max(max, this.notasTurma[i][j]);
            }
        }
        return max;
    }

    public int notaMin() {
        int min = this.notasTurma[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                min = Math.min(min, this.notasTurma[i][j]);
            }
        }
        return min;
    }



    public void atualizaPauta(int[][] notas) {
        System.arraycopy(notas, 0, this.notasTurma, 0, this.notasTurma.length);
    }

}
