public class Iterativ_Methode {
    public static void main(String[] args) {


        //Aufwandsklasse ist der Log von 10
        // Binary Search in Java
                char array[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
                int n = array.length;
                char x = 'f';
                int result = binarySearch(array, x, 0, n - 1);
                if (result == -1)
                    System.out.println("Not found");
                else
                    System.out.println("Element found at index " + result);
            }

        public static int binarySearch(char array[], int x, int low, int high) {

            // Repeat until the pointers low and high meet each other
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (array[mid] == x)
                    return mid;

                if (array[mid] < x)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

            return -1;
        }


    }



