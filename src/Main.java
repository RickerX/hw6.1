public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] numberOne = new int[3];
        numberOne[0] = 1;
        numberOne[1] = 2;
        numberOne[2] = 3;
        double[] fraction = {1.57, 7.654, 9.986};
        int[] arbitrary = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Задача 2
        for (int index = 0; index < numberOne.length; index++) {
            if (index == numberOne.length - 1) {
                System.out.println(numberOne[index]);
                break;
            }
            System.out.print(numberOne[index] + ",");
        }
        for (int index = 0; index < fraction.length; index++) {
            if (index == fraction.length - 1) {
                System.out.println(fraction[index]);
                break;
            }
            System.out.print(fraction[index] + ",");
        }
        for (int index = 0; index < arbitrary.length; index++) {
            if (index == arbitrary.length - 1) {
                System.out.println(arbitrary[index]);
                break;
            }
            System.out.print(arbitrary[index] + ",");
        }
        // Задача 3
        for (int index = numberOne.length - 1; index >= 0 ; index--) {
            System.out.print(numberOne[index] + ",");
        }
        System.out.println(" ");
        for (int index = fraction.length - 1; index >= 0; index--) {
            System.out.print(fraction[index] + ",");
        }
        System.out.println(" ");
        for (int index = arbitrary.length - 1; index >= 0; index--) {
            System.out.print(arbitrary[index] + ",");
        }

        // Задание 4
        System.out.println(" ");
        for (int index = 0; index < numberOne.length; index++) {
            if(numberOne[index] % 2 != 0){
                numberOne[index] = numberOne[index] + 1;
            }
            System.out.print(numberOne[index] + ",");
        }
        // Не пойму как сделать что бы перед последним числом не было запятой

    }
}