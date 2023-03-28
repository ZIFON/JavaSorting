import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> Nubers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(100);
            Nubers.add(x);
        }

        System.out.println(Nubers);

        Sort(Nubers);
        bubbleSort(Nubers);
        InsertionSort(Nubers);
    }
    public static void Sort(ArrayList<Integer> arrayToSort){
        int IndexMin;

        for(int Index = 0; Index < arrayToSort.size() - 1; Index++){
            IndexMin = Index;
            for(int IndexScan = Index; IndexScan < arrayToSort.size(); IndexScan++ ){
                if(arrayToSort.get(IndexMin) > arrayToSort.get(IndexScan)){
                    IndexMin = IndexScan;
                }
            }
            int temp = arrayToSort.get(Index);
            arrayToSort.set(Index, arrayToSort.get(IndexMin));
            arrayToSort.set(IndexMin, temp);
        }
        System.out.println("Just Sort:");
        System.out.println(Arrays.toString(new ArrayList[]{arrayToSort}));
    }
    public static void bubbleSort(ArrayList<Integer> arrayToSort){
        //Пройти по массиву
        // Сравнить 2 соседних елемента
        // повторить дейстие пока массив не отсартирован
        int change;
        do{
            change = 0;
        for(int Index = 0; Index < arrayToSort.size() - 1 ;Index++){
            if(arrayToSort.get(Index) > arrayToSort.get(Index + 1)){
                int temp = arrayToSort.get(Index);
                arrayToSort.set(Index, arrayToSort.get(Index + 1));
                arrayToSort.set(Index + 1, temp);
                change++;
            }
        }} while (change > 0);
        System.out.println("bubbleSort:");
        System.out.println(Arrays.toString(new ArrayList[]{arrayToSort}));


    }

    public static void InsertionSort(ArrayList<Integer> arrayToSort){
        //пройти по массиву
        //выбираем елемент
        //устанавлеваем елемент на свое место
        int element;
        int IndexToInsert;
        for (int Index = 0; Index < arrayToSort.size(); Index++) {
            element = arrayToSort.get(Index);
            IndexToInsert = Index;
            while (IndexToInsert > 0 && arrayToSort.get(IndexToInsert - 1) > element) {
                arrayToSort.set(IndexToInsert, arrayToSort.get(IndexToInsert - 1));
                IndexToInsert--;
            }
            arrayToSort.set(IndexToInsert, element);
        }
        System.out.println("InsertionSort:");
        System.out.println(Arrays.toString(new ArrayList[]{arrayToSort}));
    }
}
