import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // 1 задание
        Integer[] arr = {1,2,3,4,5};
        String[] arr1 = {"Q", "W","E", "R", "T"};
        replacement (arr, 1,2); // поменять местами значение в массиве №1
        replacement (arr1, 1,2); // поменять местами значение в массиве №2

        // 2 задание

        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        /// 3 задание

        Box<Orange> orange0 = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple0 = new Box<>();
        Box<Apple> apple1 = new Box<>();

        System.out.println("Результат задания №3: ");

        System.out.println("Добавление фруктов: ");

        orange0.addFruit(new Orange(),1);
        orange1.addFruit(new Orange(),2);
        apple0.addFruit(new Apple(),3);
        apple1.addFruit(new Apple(),4);

        System.out.println("в Коробке № 1 апельсины: " + orange0.getWeight());
        System.out.println("в Коробке № 2 апельсины: " + orange1.getWeight()); ///
        System.out.println("в Коробке № 3 яблоки: " + apple0.getWeight());
        System.out.println("в Коробке № 4 яблоки: " + apple1.getWeight());


        System.out.println("Сравнивание коробок compare: ");

        System.out.println("Коробка № 1 (апельсины) = Коробке №3 (яблоки): " + orange0.compare(apple0));
        System.out.println("Коробка № 2 (апельсины) = Коробке №4 (яблоки): " + orange1.compare(apple1));


        // переносы фруктов из коробок
        orange0.transfer (orange1);
        apple0.transfer (apple1);

        System.out.println("После перенесения коробок через transfer: ");
        System.out.println("Коробка 1: "+ orange0.getWeight());
        System.out.println("Коробка 2: "+ orange1.getWeight());
        System.out.println("Коробка 3: "+ apple0.getWeight());
        System.out.println("Коробка 4: "+ apple1.getWeight());

    }

    // Для задания №1
    public static void replacement (Object[] arr, int int1, int int2) {
        Object temp = arr[int1];
        arr[int1] = arr[int2];
        arr[int2] = temp;
        System.out.println ("Результат: " + Arrays.toString (arr) + "\n");
    }

    // Для задания №2
    public static <T> void asList(T[]arr){
        ArrayList<T> array = new ArrayList<> (Arrays.asList (arr));
        System.out.println ("Результат №2: " + array + "\n");
    }
}



