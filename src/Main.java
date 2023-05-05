import worker4_company.*;
import homework1.*;

public class Main {
    public static void main(String[] args) {
        //  EnterLetterIf letter = new EnterLetterIf();
        // letter.printVowelOrConsonantLetter();

        // EnterLetterSwitch letterSwitch =new EnterLetterSwitch();
        // letterSwitch.switchPrintVowelOrConsonantLetter();

        // Seasons month = new Seasons();
        // month.displayTheSeason();

        //  EnterWord word = new EnterWord();
        // word.theUserEntersTheWord();

        // EnterNumber number = new EnterNumber();
        // number.findTheSumOfTheNumbersBetweenTwoNumbers();


        // Fibonacci arr = new Fibonacci();
        // arr.fillTheArrayWithFibonacciNumbers(10);


        // SumMinMax array = new SumMinMax();
        // array.findSumMinAndMaxElementsInArray(10);

        // EvenAndOddNumbers sum = new EvenAndOddNumbers();
        //  sum.differenceBetweenSumOfEvenAndOddNumbers();

        Employee director1 = new Director("Владимир", "Иванов", 2010, 2023);
        Employee director2 = new Director("Дмитрий", "Иванов", 2015, 2023);
        Employee worker1 = new Worker("dd", "cc", 2017, 2023);
        Employee worker2 = new Worker("SS", "DD", 2011, 2023);
        Employee worker3 = new Worker("ww", "yy", 2019, 2023);
        Employee intern1 = new Intern("Дмитрий", "Соколов", PROFESSION.INTERN);
        director1.addWorker(director2);
        director2.addWorker(worker1);
        director2.addWorker(worker2);

        System.out.println(worker1);
        System.out.println(director1);
        System.out.println(director2);
        Worker worker = new Worker("Коля","Сидоров",2017,2023);
        worker.addWorker(worker3);
        worker.addWorker(intern1);
        worker.findEmployeeByName(worker3,"ll");
        System.out.println(worker+" "+ worker.findEmployeeByName(worker3,"WW"));


    }
}
