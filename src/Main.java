import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW Arrays 13.10.22");

        //Task 1
        //Объявите:
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.

        int[] threeNumbers = new int[3];
        threeNumbers [0] = 1;
        threeNumbers [1] = 2;
        threeNumbers [2] = 3;
        System.out.println(Arrays.toString(threeNumbers));


        // Task 2
        // Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.

        double [] fractionals = { 1.57, 7.654, 9.986 };
        fractionals [0] = 1.57;
        System.out.println(Arrays.toString(fractionals));

        // Task 3
        // Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        byte [] singles = { 1, 2 };
        singles [0] = 1;
        System.out.println(Arrays.toString(singles));

        // Task 4
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        System.out.println(threeNumbers [0] + "," + threeNumbers[1] + "," + threeNumbers[2]);
        System.out.println(fractionals [0] + "," + fractionals [1] + "," + fractionals [2]);
        System.out.println(singles [0] + "," + singles [1]);

        // Task 5
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего.
        // Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        // а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        System.out.println(threeNumbers [2] + "," + threeNumbers [1] + "," + threeNumbers [0]);
        System.out.println(fractionals [2] + "," + fractionals [1] + "," + fractionals [0]);
        System.out.println(singles [1] + "," + singles [0]);

        //Task 6
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.

        int nums[] = new int[2];
        for(int i=1;i<2;i++){
            if(i%2==0)
                nums[i]= i;
            System.out.println(nums[i]);
        }







    }
}