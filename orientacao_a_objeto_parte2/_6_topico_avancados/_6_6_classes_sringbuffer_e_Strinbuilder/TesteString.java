package orientacao_a_objeto_parte2._6_topico_avancados._6_6_classes_sringbuffer_e_Strinbuilder;

public class TesteString {

    public static void main(String[] args) {

        String s = "ola";
        s = s + " pessoal!";

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Ola");
        sb.append(" Pessoal!");
        sb.append(" Eu queo ver gol");
        sb.append(" mas só se for do Flamengo!");

        String resultado = sb.toString();
        System.out.println("com StringBuilder: " + resultado); //ou apenas  System.out.println("com StringBuilder: " + sb); sem a string resultado

    }

}
