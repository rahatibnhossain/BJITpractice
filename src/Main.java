
import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public void ArraylistPractice(){
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Lamborgini");
        cars.add("Tesla");
        cars.add("Tata");

        cars.set(2,"Electric");// Replace the index of 2

        for (String car: cars){
            System.out.println(car);

        }
        System.out.println("After Remove");

//        System.out.println(cars.get(2));
        cars.remove(2);// Removed from index 2

        for (String car: cars){
            System.out.println(car);

        }

//        System.out.println(cars.get(2));


        System.out.println(" ");
        System.out.println("After Sorting");
        Collections.sort(cars);
        for (String car: cars){
            System.out.println(car);

        }

    }
    public static void main(String[] args) {




        Main obj = new Main();
        obj.ArraylistPractice();
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }

//
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(4);
//        numbers.add(1);
//
//        int sum = 0 ;
//        for(int number: numbers){
//            sum+=number;
//        }
////        System.out.println("Sum of the numbers :"+ sum);
//
//        Collections.sort(numbers);
////        System.out.println("Sorted numbers :"+ numbers);
////        System.out.println(" ");
//
//
//        byte[] bytes = {72, 111, 108 ,108 ,111 , 32, 87, 111, 114,108,100};
//        String str = new String(bytes);
////        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder();
//        for (byte b : bytes){
//            sb.append(Byte.toString(b)).append(" ");
//        }
//
//
////        System.out.println(sb.getClass().getSimpleName() );
//
//        String byteStr = sb.toString().trim();
////        System.out.println(byteStr);
////        System.out.println(byteStr.getClass().getSimpleName() );
//
//
//        String s1 = "Welcome to the BJIT";
//        String[] m1= s1.split(" ");
////        System.out.println(m1[0]);
//        String[] m2 = s1.split(" ",2);
////        System.out.println(m2[0]);
////        System.out.println(m2[1]);
//
//
//        String str1= "hi HI Hi";
//        ArrayList<String> name = new ArrayList<>();
//        name.add("he djfl");
//        name.add("HI HI HI");
//         for(String na : name){
//             if(str1.equalsIgnoreCase(na)){
////                 System.out.println(na+ " is present");
//             }
//         }
//





//
//        int num1,num2,num3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st Number");
//        num1 = sc.nextInt();// input 1st number
//
//        System.out.println("Enter 2nd Number");
//        num2 = sc.nextInt();// input 2nd number
//
//        System.out.println("Enter 3rd Number");
//        num3 = sc.nextInt();// input 3rd number
//
//        int largestNumber;
//        if (num1>=num2 && num1>=num3){
//            largestNumber= num1;
//        } else if (num2>=num1 && num2>=num3) {
//            largestNumber= num2;
//        }
//        else {
//            largestNumber= num3;
//        }
//        System.out.println("The largest number is "+ largestNumber);

//        String str="He is a good student., He is a good player also.";
//        String[] strChangedTense = (str.replaceAll("is", "was")).split(",");
//        for (String sentence: strChangedTense){
//            String trimedValue = sentence.trim();
//            System.out.println(trimedValue);

//        }





    }
}