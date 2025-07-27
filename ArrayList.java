import java.util.*;

public class ArrayList{
    public static void main(String[] args) {
        String nomes;
       List<String> nome= new java.util.ArrayList<>();
       Scanner tec= new Scanner(System.in);
        nome.add("Joana");
        nome.add("Pedro");
        nome.add("Maria");
        nome.add("Francisco");

        System.out.println(nome);
        System.out.println(Arrays.toString(nome.toArray()));
       for (int i=1; i<=4; i++){
           nomes=tec.nextLine();
           nome.add(nomes);
       }

        System.out.println(Arrays.toString(nome.toArray()));

    }
}