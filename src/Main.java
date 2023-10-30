public class Main {
    public static void main(String[] args) {
        //Task 1
        Car firstCar = new Car();
        firstCar.Brand = "Nissan";
        firstCar.Model = "Qashqai j11";
        firstCar.Year = 2018;
        System.out.println(firstCar.Brand);
        System.out.println(firstCar.Model);
        System.out.println(firstCar.Year);
        firstCar.startEngine();
        firstCar.stopEngine();

        //Task 2
        Calculator calc = new Calculator();
        int calcSum = calc.Addition(5,8);
        System.out.println("Calculation sum = " + calcSum);
        boolean comparison = calc.isGreater(46,42);
        System.out.println("First number is greater = " + comparison);

        //Task 3
        NumberManipulator manipulator = new NumberManipulator();
        int inNum = 45;
        int numberIncrease = manipulator.number;
        System.out.println("Initial number: " + inNum);
        System.out.println("Number after increment: " + manipulator.incrementByOne(inNum));
        System.out.println("Number after decrement: " + manipulator.decrementByOne(inNum));
    }
}