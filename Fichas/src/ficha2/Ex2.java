package ficha2;


import ficha1.Ficha1;

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

    public int[] notasAcimaDe(int limite) {
        int[] aux = new int[25];
        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int valor = this.notasTurma[i][j];
                if (valor > limite) aux[k++] = valor;
            }
        }
        return aux;
    }

    public void mostraString() {
        String pauta = "";
        for (int i = 0; i < 5; i++) {
            System.out.printf(" Aluno nº %d: |", i + 1);
            for (int j = 0; j < 5; j++) {
                System.out.printf(" -> UC nº %d: %d", j + 1, this.notasTurma[i][j]);
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }

    public String calculaString() {
        String aux = "";
        String string = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aux = "Aluno nº: " + i + " - UC nº: " + j + " - Nota: " + this.notasTurma[i][j] + "; ";
            }
            string += aux;
        }
        return string;
    }

    public int indMaxArray(float[] array) {
        Ex1 p1 = new Ex1();
        float max = p1.maxArray(array);
        int k = 0;

        while (k < array.length && array[k] != max) k++;

        return k;
    }

    public int indMaxUc() {
        float[] index = new float[5];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                index[k++] = mediaNotasUc(j);
            }
        }

        return (indMaxArray(index));
    }

    public void atualizaPauta(int[][] notas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.notasTurma[i][j] = notas[i][j];
            }
        }
    }
}
