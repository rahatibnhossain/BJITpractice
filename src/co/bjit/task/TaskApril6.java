package co.bjit.task;

import java.util.*;

public class TaskApril6 {
    Scanner sc = new Scanner(System.in);


    public void PutValueToHashMap(Map<Integer, String> map) {
        Integer n, key;
        String value;
        System.out.println("Enter the number of key value pair you want to add?");
        try {
            n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The number must be integer. Please Insert Integer");
            sc.nextLine();

            n = sc.nextInt();

        } finally {
            sc.nextLine();

        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Key : ");

            try {
                key = sc.nextInt();

            } catch (Exception e) {
                System.out.println("The Key must be integer. Please Insert Integer");
                sc.nextLine();

                key = sc.nextInt();

            } finally {
                sc.nextLine();

            }
            System.out.print("Enter Value : ");
            value = sc.nextLine();
            map.put(key, value);   // Hash map
            System.out.println(" ");
        }
        PrintHashMap(map);

    }

    public void RemoveSpecificKey(Map<Integer, String> map) {
        System.out.println("Enter the key you want to remove.");
        Integer key;
        try {
            key = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The Key must be integer. Please Insert Integer");
            sc.nextLine();

            key = sc.nextInt();

        } finally {
            sc.nextLine();

        }
        map.remove(key);
        PrintHashMap(map);

    }

    public void FindKey(Map<Integer, String> map) {
        System.out.println("Enter the key to Search.");
        Integer key;
        try {
            key = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The Key must be integer. Please Insert Integer");
            sc.nextLine();

            key = sc.nextInt();

        } finally {
            sc.nextLine();

        }
        System.out.println(map.containsKey(key));
    }

    public void PrintHashMap(Map<Integer, String> map) {
        System.out.println();
        System.out.println("The Key Value Pairs of HashMap are :");
        for (Integer key : map.keySet()) {
            System.out.print("Key :");
            System.out.print(key);
            System.out.print(" Value :");
            System.out.print(map.get(key));
            System.out.println();
        }
    }

    public void AddValueToArrayList(ArrayList<String> str) {
        System.out.println("Enter the number of elements you want to store :");
        Integer n;
        String value;
        try {
            n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The number must be integer. Please Insert Integer");
            sc.nextLine();

            n = sc.nextInt();

        } finally {
            sc.nextLine();

        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element  : ");
            value = sc.nextLine();
            str.add(value);
        }

        PrintArray(str);
    }

    public void PrintArray(ArrayList<String> str) {
        System.out.println();
        System.out.println("The Values are : ");
        for (String s : str) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void getValueOfIndex(ArrayList<String> str) {

        System.out.println("Enter the index to search:");

        Integer n;
        try {
            n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The number must be integer. Please Insert Integer");
            sc.nextLine();

            n = sc.nextInt();

        } finally {
            sc.nextLine();

        }
        System.out.println("The Value of this index is : " + str.get(n));
        System.out.println();
    }

    public void replaceValueOfIndex(ArrayList<String> str) {

        System.out.println("Enter the index to Relpace Element");

        Integer n;
        try {
            n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The number must be integer. Please Insert Integer");
            sc.nextLine();

            n = sc.nextInt();

        } finally {
            sc.nextLine();

        }
        System.out.println("Enter the value you want to replace");
        String value = sc.nextLine();
        str.set(n, value);

        PrintArray(str);
    }

    public void getIndexOfValue(ArrayList<String> str) {

        System.out.println("Enter the Value to search index:");

        String value = sc.nextLine();
        System.out.println("The Value of this index is : " + str.indexOf(value));


        System.out.println();
    }

    public void DeleteValueOfIndex(ArrayList<String> str) {

        System.out.println("Enter the index to Delete:");

        int n;
        try {
            n = sc.nextInt();

        } catch (Exception e) {
            System.out.println("The number must be integer. Please Insert Integer");
            sc.nextLine();

            n = sc.nextInt();

        } finally {
            sc.nextLine();

        }
        try {
            str.remove(n);
            System.out.println("The Value is deleted " + n);

        } catch (Exception e) {
            System.out.println("Your entered a Invalid Index");
        }

        System.out.println();
        PrintArray(str);
    }

    public void start() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        ArrayList<String> str = new ArrayList<String>();

        int x;
        for (; ; ) {
            System.out.println();
            System.out.println("---------------------------------");
            System.out.println("1 Put Value to HashMap");
            System.out.println("2 Find key in HashMap");
            System.out.println("3 Remove element in HashMap");
            System.out.println();
            System.out.println("4 Add Value to ArrayList");
            System.out.println("5 Get Value of the Index");
            System.out.println("6 Replace Value of Index");
            System.out.println("7 Delete Value of Index");
            System.out.println("8 Print the ArrayList");
            System.out.println("9 Sort the ArrayList");
            System.out.println("---------------------------------");
            System.out.println("Enter the option: ");

            x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1:
                    PutValueToHashMap(map);
                    break;
                case 2:
                    FindKey(map);
                    break;
                case 3:
                    RemoveSpecificKey(map);
                    break;
                case 4:
                    AddValueToArrayList(str);
                    break;
                case 5:
                    getValueOfIndex(str);
                    break;
                case 6:
                    replaceValueOfIndex(str);
                    break;
                case 7:
                    DeleteValueOfIndex(str);
                    break;
                case 8:
                    PrintArray(str);
                    break;
                case 9:
                    Collections.sort(str);
                    PrintArray(str);
                    break;

            }

        }
    }

    public static void main(String args[]) {


        TaskApril6 ta = new TaskApril6();
        ta.start();
//        ta.PutValueToHashMap(map);
//        ta.FindKey(map);
//        ta.RemoveSpecificKey(map);
//
//
//        System.out.println("Lets Add Some Element to ArrayList");
//        ArrayList<String> str = new ArrayList<String>();
//
//        ta.AddValueToArrayList(str);
//        System.out.println();
//        System.out.println("After Sort");
//        Collections.sort(str);
//        ta.PrintArray(str);
//        ta.getValueOfIndex(str);
//        ta.replaceValueOfIndex(str);
//        ta.DeleteValueOfIndex(str);
//        ta.getIndexOfVAlue(str);
    }

}
