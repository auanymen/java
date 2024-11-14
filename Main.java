public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: barbie escola de princesas");

        int anoDeLancamento = 2011;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;
        //Média calculada pelas 3 notas da auany, fernanda e leticia
        double media = (9.2 + 6.9 + 9.9) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Blair é uma garota simples e órfã que foi sorteada para estudar na exclusiva Escola de Princesas. A escola é um lugar incrível, onde as meninas aprendem dança, 
                etiqueta, arte e outras habilidades indispensáveis a uma princesa. Blair adora suas aulas, suas novas fadinhas assistentes e suas novas amigas, as princesas Hadley e Isla. Porém, 
                quando a malvada Dama Devin desconfia que Blair é a princesa e herdeira desaparecida, ela faz de tudo para impedir que Blair assuma o trono.
                2011
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}