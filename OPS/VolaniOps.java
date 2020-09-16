import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class VolaniOps {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input;
        int suma = 0;
        int avg;
        ArrayList<String> StringList = new ArrayList<>();
        ArrayList<Integer> IntList = new ArrayList<>(StringList.size());

        do {
            System.out.println("Zadejte libovolne cislo. Po napsani hesla 'END' se program ukonci. ");
            input = sc.nextLine();
            //String end = "END";          
            StringList.add(input);

        } while (!input.equals("END"));

        StringList.remove("END");

        for(String myInt : StringList) {
            IntList.add(Integer.valueOf(myInt));
        }
        for(int i = 0; i < IntList.size(); i++){
            suma = suma + IntList.get(i);
        }

        System.out.println("Soucet vsech vasich zadanych cisel je: " + suma);
        avg = suma / IntList.size();
        System.out.println("Prumer vsech vasich zadanych cisel je: " + avg);
        System.out.println("Vase nejvetsi zadane cislo je: " + Collections.max(IntList));
        System.out.println("Vase nejmensi zadane cislo je: " + Collections.min(IntList));

        
    }

}
