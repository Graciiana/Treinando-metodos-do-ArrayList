import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MetodosArrayList {
    public static void main(String[] args) {
        List<String> nome= new java.util.ArrayList<>();
        String nomes;
        Scanner tec= new Scanner(System.in);

        for (int i=1; i<=4; i++){
            nomes=tec.nextLine();
            //add
            nome.add(nomes);
        }
        System.out.println("Lista actual: "+Arrays.toString(nome.toArray()));

        System.out.println("______________________________________");
        System.out.println("Usando o metódo add- index valor");
        System.out.print("Index: ");
        int index= tec.nextInt();
        tec.nextLine();
        System.out.print("Nome: ");
        String nomeNovo= tec.nextLine();

        if (index>=0 && index<=nome.size()){
            nome.add(index, nomeNovo);
            System.out.println(" Nome inserido com sucesso");

        }else{
            System.out.println(" Nome invalido, deve estar entre 0 e "+nome.size());
        }

        System.out.println("Nova lista: "+  nome);

        //Acessar elementos
        System.out.println("_________________________________________");
        System.out.println("Usando o metodo indexOf e lastIndexOf");
        int primeiro=nome.indexOf("Maria");
        int ultimo=nome.lastIndexOf("Maria");
        System.out.println("Primeira Maria aparece na posição: "+primeiro);
        System.out.println("Segunda Maria aparece na posição: "+ultimo);


        //Remove
        System.out.println("_____________________________________________");
        System.out.println("Usando o metodo remove index e remove valor");
        nome.remove(0);
        nome.remove("Graciana");
        System.out.println("lista Actualizada: "+  nome);




        //Tamanho e verificação
        System.out.println("______________________________________________");
        System.out.println("Usando o metódo isEmpty para comparar se há conteúdo ou não");
        if (nome.isEmpty()){
            System.out.println("Sem conteúdos");
        }else {
        System.out.println("Lista actual: "+nome);
        }


        //Contains
        System.out.println("_______________________________________________");
        System.out.println("Usando o metódo Contains para verificar se na lista contem o elemento Pedro");
        if (nome.contains("Pedro")){
            System.out.println("Pedro existe na lusta"+ nome);
        }else {
            System.out.println("Esse nome não existe na lista");
        }

        //subList
        System.out.println("_____________________________________________");
        System.out.println("Usando o metódo Sublist");
        List<String> subLista= nome.subList(1,4);
        System.out.println("SubLista: "+subLista);


        //clear-> eliminar tudo
        System.out.println("_____________________________________________");
        System.out.println("Usando o metódo Clean com isEmpty");
        nome.clear();

        if (nome.isEmpty()){
            System.out.println("Sem conteúdos");
        }else {
            System.out.println("Lista actual: "+nome);
        }
    }


}
