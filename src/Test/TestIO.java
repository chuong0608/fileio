package Test;

import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestIO {
    public static void main(String[] args) throws Exception {
        File file2 = new File("inp.txt");
//        if(file2.createNewFile()){
//            System.out.println("File đã tồn tại");
//        }
        PrintWriter printWriter = new PrintWriter(file2);
        printWriter.write("10,5,7,8,10");
        printWriter.close();
        Scanner scanner = new Scanner(file2);
        String[] arr = scanner.nextLine().split(",");
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            integers.add(Integer.valueOf(arr[i]));
        }
        double x;
        int tong=0;
        int tich=1;
        int max = integers.get(0);
        int min =  integers.get(0);
        x = -integers.get(0)/integers.get(1);
        for (Integer s : integers) {
            tong = s+tong ;
            tich = s * tich;
            if(max<s){
                max=s;
            }
            if(min>s){
                min=s;
            }
        }
        System.out.println(x);
        System.out.println(tong);
        PrintWriter rs = new PrintWriter("rs.txt");
        rs.println(x);
        rs.println(tong);
        rs.println(tich);
        rs.println(min);
        rs.println(max);
        rs.close();
    }
}
