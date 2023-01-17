import java.util.*;
import java.lang.*;

public class UniversalSearchClass<T> {

        private T[] A; // массив обобщенного типа T


        public UniversalSearchClass() {

        }
        // Конструктор с 1 параметром.
        // Параметр: _A - внешний массив элементов, которым инициализируется
        // внутренний массив
        public UniversalSearchClass(T[] _A) {

        }

        // Конструктор, который инициализирует экземпляром другого  класса типа LSearch<T>
        public UniversalSearchClass(UniversalSearchClass<T> L) {

        }

        // Метод, возвращающий ссылку на внутренний массив данных
        public T[] Get() {
            return null;
        }

        // Метод, который устанавливает новый массив данных
        public void Set(T[] _A) {

        }
        // -------------- Методы линейного поиска ---------------------
        // Скрытый метод, который определяет, есть ли элемент key в массиве _A
        private boolean IsItem(T[] _A, T key){
            return false;
        }
        // Общедоступный метод, который определяет, есть ли элемент key во внутреннем массиве A
        public boolean IsItem(T key) {

            return false;
        }
        // Скрытый метод, определяющий позицию первого вхождения элемента key в массиве _A.
        // Если элемента нет в массиве, метод возвращает -1
        private int GetFirstPos(T[] _A, T key) {

            return 0;
        }

        // Перегруженный метод GetFirstPos(), обрабатывает внутренний массив A класса
        public int GetFirstPos(T key) {

            return 0;
        }
        // Метод, определяющий позицию последнего вхождения элемента в массиве _A
        private int GetLastPos(T[] _A, T key) {

            return 0;
        }

        // Перегруженный метод GetLastPos() - обрабатывает массив A класса
        public int GetLastPos(T key) {

            return 0;
        }

        // Метод, определяющий количество вхождений элемента в массиве _A
        private int GetNOccurences(T[] _A, T key) {

            return 0;
        }

        // Перегруженный метод GetNOccurences() - работает с внутренним массивом A
        public int GetNOccurences(T key) {

            return 0;
        }

        // Метод, возвращающий массив вхождений элемента key в массиве _A
        private int[] GetPositions(T[] _A, T key) {

            return new int[0];
        }
        // Перегруженный вариант GetPositions()
        public int[] GetPositions(T key) {

            return new int[0];
        }
        // Метод, выводящий внутренний массив
        public void Print(String text) {

        }


    public static void main(String[] args) {

    }
}