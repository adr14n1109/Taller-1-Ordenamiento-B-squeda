import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class    Main {
    public static void main(String[] args) {
        //int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();

        //int posicion = misAlgoritmos.linearSearch(miArray, 12);
        //System.out.println(posicion);


        //int[] miArray = {11,12,19,26,33,45,70};
        //int posicion = misAlgoritmos.binarySearch(miArray,12);
        //System.out.println(posicion);

        //int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        //int[] resultado = misAlgoritmos.bubbleSort(miArray);
        //System.out.println("Array ordenado: ");
        //for(int num : resultado)
            //System.out.println(num + " ");

        //int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        //int[] resultado = misAlgoritmos.selectionSort(miArray);
        //System.out.println("Array ordenado: ");
        //for (int num : resultado){
        //    System.out.println(num + " ");
        //}

        //int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        //int[] resultado = misAlgoritmos.insertionSort(miArray);
        //System.out.println("Array ordenado: ");
        //for (int num : resultado) {
        //    System.out.println(num + " ");
        //}

        //int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        //int[] resultado = misAlgoritmos.mergeSort(miArray);
        //System.out.println("Array ordenado: ");
        //for (int num : resultado) {
        //   System.out.println(num + " ");
        //}

        int[] miArray = {70, 12, 19, 45, 11, 33, 26};
        int[] resultado = misAlgoritmos.quickSort(miArray);
        System.out.print("Array ordenado: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}

