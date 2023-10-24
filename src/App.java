import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=================================================");
        System.out.println("Olá,  iremos falar um pouco sobre ancestralidade");
        System.out.println("=================================================");
        System.out.println("A ancestralidade está em cada gesto, em cada ritual em cada modo de ser e de fazer. Vivemos pelo respeito à ancestralidade e ao cuidado para com o equilíbrio da natureza. ");
        System.out.println("=================================================");
        System.out.println("A partir dessa ancestralidade podemos observar os Orixás, que são arquétipos da natureza cultiados há séculos pela cultura africana.");
        System.out.println("=================================================");
    // Início do Programa após as exibições
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua ancestralidade por parte de pai: ");
        System.out.println("1- Óxossi, 2- Xangô, 3- Omolu, 4- Ogum: ");
        int orixa = scanner.nextInt();
    //História, para conseguir eles precisam pelo menos um ter uma arma de ataque e o outro uma arma de cura que é a de Omolu
        System.out.println("=================================================");
        System.out.println("Sua tribo estava passando por uma grave epidemia de uma doença desconhecida...");
        System.out.println("=================================================");
        System.out.println("Você conhece um parceiro que se chama Mumbò, e vocês tornam-se amigos!");
        System.out.println("=================================================");
        System.out.println("Juntos vocês buscam o Xaxará de Omolu, tal qual é capaz de curar qualquer doença, porém no caminho encontram um grande e feroz urso...");
        System.out.println("=================================================");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Insira a ancestralidade de Mumbò: ");
        System.out.println("1- Óxossi, 2- Xangô, 3- Omolu, 4- Ogum: ");
        int orixaDemumbo = scanner2.nextInt();
        scanner2.close();
        
// Vou ter três finais possíveis, onde dois eles não conseguem e um eles conseguem!

        if(orixaDemumbo!=3&&orixa!=3){
                System.out.println("=================================================");
                System.out.println("Vocês conseguem derrotar o urso mas não conseguem vencer a doença...!");
                System.out.println("=================================================");

        }

        if(orixaDemumbo==3&&orixa==3){

                System.out.println("=================================================");
                System.out.println("Vocês receberam o Xaxará de Omolu para curar qualquer doença, porém vocês não conseguem derrotar o urso!");
                System.out.println("=================================================");


        }


        if(orixaDemumbo==3||orixa==3){
        
        
            if (orixa==1){
                System.out.println("=================================================");
                System.out.println("Seu ancestral é Oxóssi, você recebeu um arco encatado chamado de Ofá e Mumbò recebeu o Xaxará de Omolu para curar qualquer doença, juntos vocês conseguem derrotar o urso e vencer a doença!");
                System.out.println("=================================================");

            }
             if (orixa==2){
                System.out.println("=================================================");
                System.out.println("Seu ancestral é Xangô, você recebeu um machado sagrado chamado de Ofá e Mumbò recebeu o Xaxará de Omolu para curar qualquer doença, juntos vocês conseguem derrotar o urso e vencer a doença!");
                System.out.println("=================================================");

            }
            if (orixa==3&&(orixaDemumbo==1||orixaDemumbo==2||orixaDemumbo==4)){
                System.out.println("=================================================");
                System.out.println("Seu ancestral é Omolu, você recebeu um instrumento sagrado chamado de Xaxará, capaz de curar todas as feridas e mumbo recebeu uma arma de ataque e juntos vocês são capazes de derrotar o urso e curar a doença!");
                System.out.println("=================================================");

            }
            if (orixa==4){
                System.out.println("=================================================");
                System.out.println("Seu ancestral é Ogum, você recebeu uma lança sagrada e Mumbò recebeu o Xaxará de Omolu para curar qualquer doença, juntos vocês conseguem derrotar o urso e vencer a doença!");
                System.out.println("=================================================");
        
            }
        
        
        
        }
        scanner.close();
        scanner2.close();
        
   
    }

}






