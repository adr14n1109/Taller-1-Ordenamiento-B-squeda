public class MisAlgoritmos implements Busquedas, Ordenamientos {
    @Override
    public int linearSearch(int[] arrayPorExplorar, int elementoABuscar) {
        int tamanoLista = arrayPorExplorar.length;
        for (int i = 0; i < tamanoLista; i++) {
            int elementoActual = arrayPorExplorar[i];
            if (elementoActual == elementoABuscar) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public int binarySearch(int[] arrayPorExplorar, int elementoABuscar) {
        int inicio = 0;
        int fin = arrayPorExplorar.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arrayPorExplorar[medio] == elementoABuscar) {
                return medio;
            } else if (arrayPorExplorar[medio] < elementoABuscar) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    @Override
    public int[] bubbleSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;
        int[] arrayOrdenado = arrayDesordenado.clone();

        for(int i = 0; i < n -1; i++) {
            boolean huboIntercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arrayOrdenado[j] > arrayOrdenado[j + 1]) {
                    int temp = arrayOrdenado[j];
                    arrayOrdenado[j] = arrayOrdenado[j + 1];
                    arrayOrdenado[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            if (!huboIntercambio){
                break;
            }
        }
        return arrayOrdenado;
    }

    @Override
    public int[] selectionSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;
        int[] arrayOrdenado = arrayDesordenado.clone();

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arrayOrdenado[j] < arrayOrdenado[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int temp = arrayOrdenado[i];
                arrayOrdenado[i] = arrayOrdenado[indiceMenor];
                arrayOrdenado[indiceMenor] = temp;
            }
        }
        return arrayOrdenado;
    }

    @Override
    public int[] insertionSort(int[] arrayDesordenado) {
        int n = arrayDesordenado.length;
        int[] arrayOrdenado = arrayDesordenado.clone();

        for (int i = 1; i < n; i++) {
            int actual = arrayOrdenado[i];
            int j = i - 1;

            while (j >= 0 && arrayOrdenado[j] > actual) {
                arrayOrdenado[j + 1] = arrayOrdenado[j];
                j--;
            }

            arrayOrdenado[j + 1] = actual;
        }

        return arrayOrdenado;
    }

    @Override
    public int[] mergeSort(int[] arrayDesordenado) {
        return new int[0];
    }

    @Override
    public int[] quickSort(int[] arrayDesordenado) {
        return new int[0];
    }
}
