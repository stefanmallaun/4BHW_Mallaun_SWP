public class Rekursiv {
    static long berechneFakultaet(int n)
    {
        System.out.println("Aufruf mit "+n);
        if(n>=1)
        {
            // rekursiver Aufruf (ruft sich selbst auf)
            return n+berechneFakultaet(n-1);
        }
        else
        {
            // Abbruchbedingung der Rekursion
            return 1;
        }
    }

    public static void main(String[] args) {
        long faku = berechneFakultaet(5);
        System.out.println("5! = "+faku);

    }


}
