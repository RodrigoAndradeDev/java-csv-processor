package application;

import model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    List<Product> list = new ArrayList<>();



    String path = "/home/rodrigo/Downloads/exemplo.csv";
    File file = new File(path);

    String folder = file.getParent();

    boolean success = new File(folder + "/out").mkdir();

    System.out.println("Folder Created : " + success);

    String targetFileStr = folder + "/out/summary.csv";


    try(BufferedReader br = new BufferedReader(new FileReader(path))){


        String line = br.readLine();
        while(line!= null){
            String[] data = line.split(",");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity =  Integer.parseInt(data[2]);

            list.add(new Product(name,price,quantity));
            line = br.readLine();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
            for(Product item:list ){
                bw.write(item.getName() + ","+ String.format( item.totalPrice()) + "\n");
            }
        }catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

    }
}