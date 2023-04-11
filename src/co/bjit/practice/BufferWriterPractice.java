package co.bjit.practice;

import java.io.*;
import java.util.Scanner;

public class BufferWriterPractice {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        BufferWriterPractice bp = new BufferWriterPractice();
        bp.start();
    }

    public void start() {

        int x;
        for (; ; ) {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("1 Wtire");
            System.out.println("2 Read");
            System.out.println("3 Check if the file exists");
            System.out.println("0 Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter the option: ");

            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    writeToTheFIle();
                    break;
                case 2:
                    System.out.println("Enter the name of the file");
                    String name = sc.nextLine();
                    readTheFile(name);
                    break;
                case 3:
                    checkIfExists();
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public void checkIfExists(){
        System.out.println("Enter the name of the file if it exists or not");
        String filePathString = sc.nextLine();
        File f = new File(filePathString);

        if (f.exists()){
            System.out.println("The file exists");
        }
        else {
            System.out.println("The file does not exist");
        }
    }


    public void writeToTheFIle() {
        System.out.println();
        System.out.println("Enter the name of the file");
        String fileName = sc.nextLine();
        System.out.println("Enter the text you want to write to the file");

        String input = sc.nextLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(input);
            writer.flush();
            writer.close();
            readTheFile(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void readTheFile(String name) {
        System.out.println();
        System.out.println("The text value of the file :");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(name));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
