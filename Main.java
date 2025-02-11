import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
//
////    1.Write a program that checks the role of the user

        //تعريف الشخص بنفسه او مسماه
//        System.out.print("Enter your role: ");
//        String role = data.nextLine().trim().toLowerCase();

        // تخزين المسميات ومقارنتها مع المدخلات
//        if (role.equals("admin")) {
//            System.out.println("welcome admin");
//        } else if (role.equals("superuser")) {
//            System.out.println("welcome superuser");
//        } else if (role.equals("user")) {
//            System.out.println("welcome user");
//        } else {
//            System.out.println("Error, try again");//طباعه رساله خطأ حال ادخل المستخدم بيانات غير المخزنه
//        }

////    2.Take three numbers from the user and print the greatest number.
////                Test Data
        //اخذ ثلاث ارقام من المستخدم وتخزينها باختصار
//        System.out.print("Input the 1st number: ");
//        int num1 = data.nextInt();
//        System.out.print("Input the 2nd number: ");
//        int num2 = data.nextInt();
//        System.out.print("Input the 3rd number: ");
//        int num3 = data.nextInt();

        //المقارنه بين الارقام
//        int greatest;
//        if (num1 >= num2 && num1 >= num3) {// اذا كان الرقم الاول اكبر من او يساوي الرقم الثاني 'و' الرقم الاول اكبر من او يساوي الرقم الثالث
//            greatest = num1;//يطبع الرقم الاول
//        } else if (num2 >= num1 && num2 >= num3) {// اذا كان الرقم الثاني اكبر من او يساوي الرقم الاول و الرقم الثاني اكبر من او يساوي الرقم الثالث
//            greatest = num2;//يطبع الرقم الثاني
//        } else {//غير ذلك يطبع الرقم الثالث
//            greatest = num3;
//        }
//        System.out.println("The greatest: " + greatest);

////    3.Write a Java program that generates an integer between 1 and 7
////        and displays the name of the weekday.
//
//        //Call Random class
//        Random random = new Random();
//
//        //Definition of randomness
//        int number = random.nextInt(7) + 1;//The number is between 1-7
//
//        //Defining numbers by days of the week
//        String weekday;
//        switch (number) {
//            case 1: weekday = "Sunday"; break;
//            case 2: weekday = "Monday"; break;
//            case 3: weekday = "Tuesday"; break;
//            case 4: weekday = "Wednesday"; break;
//            case 5: weekday = "Thursday"; break;
//            case 6: weekday = "Friday"; break;
//            case 7: weekday = "Saturday"; break;
//            default: weekday = "Invalid";
//        }
//        //Prints the result of the random number and the corresponding day of the week
//        System.out.println("Number: " + number);
//        System.out.println("Weekday: " + weekday);

////      4. Write a program that takes a numeric score as input and prints
////        the corresponding letter grade using the following grading scale:
//
//        //Take the score from the user
//        System.out.print("Enter your numeric score: ");
//        int score = data.nextInt();
//
//        //Store each score group with a specific letter
//        char grade;
//        if (score >= 90 && score <= 100) {
//            grade = 'A';
//        } else if (score >= 80 && score <= 89) {
//            grade = 'B';
//        } else if (score >= 70 && score <= 79) {
//            grade = 'C';
//        } else if (score >= 60 && score <= 69) {
//            grade = 'D';
//        } else if (score >= 0 && score <= 59) {
//            grade = 'F';
//        } else {
//            System.out.println("Please try again, choosing a number between 0-100 ");
//            return;
//
//        }
//        //Print the result and letter grade
//        System.out.println("Numeric Score:"+score);
//        System.out.print("Letter Grade: "+grade);

////        5. Write a Java program that takes a person's age as input and
////        categorizes them into one of three age categories: "Child,"
////        "Teenager," or "Adult" using an if statement.
//        //Taking the age of the user
//        System.out.print("Enter your age: ");
//        int age = data.nextInt(); //Store in AGE variable
//
//        //مقارنة العمر بالمرحله المخزنة
//        String category;
//        if (age < 13) {
//            category = "Child";
//        } else if (age >= 13 && age <= 19) {
//            category = "Teenager";
//        } else if (age > 20) {
//            category = "Adult";
//        } else {
//            category = "Error,tray Again";//طباعه رساله خطأ في حال كان الرقم غير الارقام المذكورة
//        }
//
//        //طباعه المرحله العمرية
//        System.out.println("You are a " + category + ".");
//


    }
}