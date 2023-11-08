package EstruraCondicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
       // int nota = 5;
        int nota = 6;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "reprovado";
        //String resultado = nota >=7 ? "Aprovado" : "Reprovado";

        //System.out.println(resultado);
        System.out.println(resultado);



    }
}
