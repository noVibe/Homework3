public class Main {
    public static void main(String[] args) {
//        =====Task 1=====
        System.out.println("=====Task 1=====");
        var dog = 6;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);
//        =====Task 2=====
        System.out.println("=====Task 2=====");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("After adding 4: dog = " + dog + ", cat = " + cat + ", paper = " + paper);
//        =====Task 3=====
        System.out.println("=====Task 3=====");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("After subtraction: dog = " + dog + ", cat = " + cat + ", paper = " + paper);
//        =====Task 4=====
        System.out.println("=====Task 4=====");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
//        =====Task 5=====
        System.out.println("=====Task 5=====");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog * 10 = " + frog);
        frog /= 3.5;
        System.out.println("/ 3.5 = " + frog);
        frog += 4;
        System.out.println("+ 4 = " + frog);
//        =====Task 6=====
        System.out.println("=====Task 6=====");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        System.out.println("Weight sum is " + (firstBoxer + secondBoxer) + " kg");
        System.out.println("=====Task 7=====");
//        =====Task 7=====
        System.out.println("=====Task 7=====");
        var weightDifference = secondBoxer - firstBoxer;
        var weightDifference2 = secondBoxer % firstBoxer;
        System.out.println("Weight difference is " + weightDifference2 + " kg");
//        =====Task 8=====
        var allHours = 640;
        var employeeAmount = allHours / 8;
        System.out.println("Всего работников в компании - " + employeeAmount + " человек.");
        var newEmployeeAmount = employeeAmount + 94;
        System.out.println("Если в компании работает " + newEmployeeAmount + " человек, то всего " + (allHours / newEmployeeAmount) + " часов работы может быть поделено между сотрудниками.");

    }
}