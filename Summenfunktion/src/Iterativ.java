public class Iterativ {
    static long berechneFakultaet(int n)
    {
        long faku =1;
        // Iterative Berechnung
        for(int i = 1; i<=n; i++)
        {
            faku += i;
        }
        return faku;
    }

    public static void main(String[] args) {
        long faku = berechneFakultaet(5);
        System.out.println("5! = "+faku);

    }
}
