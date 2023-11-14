public class Personagem2 {
//Personagem Mumbo
String Nome;
int Energia;



void exibirmensagem(int a,int b){

    //'a' é o  orixa de mumbo e 'b' é o seu
    if((a!=3&&b!=3 || a==3&&b==3)== false){
        
        this.Energia -= 2;
        System.out.println("=================================================");
        System.out.println("Você seguiu um caminnho longo e tortuosoo, onde você encontrou uma nova ilha chamada de Zanzibar, essa ilha é representada por ter uma influência muito forte do meio Europeu, e apartir disso você se depara com outro problema... VOCÊ TEM " + this.Energia + "DE ENERGIA PELO CAMINHO");
        System.out.println("=================================================");
        }
    else{
        this.Energia -= 10;
        System.out.println("=================================================");
        System.out.println("Infelizmente você não pode seguir para o próximo passo pois não venceu o obstáculo... VOCÊ TEM: "+this.Energia+" DE ENERGIA PELO CAMINHO");
        System.out.println("=================================================");
       
         }
            



}
}
