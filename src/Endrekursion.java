public class Endrekursion {

    public static void main(String[] args) throws Exception {
        System.out.print(Fakultat(6));

    }

    public static int Fakultat(int x) {
        return addFakultaet(1, x); //aufruf methode
    }

    public static int addFakultaet(int y, int x) {
        if (x < 0){
            System.out.println("Zahl darf nicht negativ sein!");
            return 0;
        }
        if (x == 0) {
            if (y == 0){
                System.out.println("Zahl ist zu groß");
            }

            return y;
        } else {
            return addFakultaet(y * x, x - 1);
        }
    }
    //Rekursion: In vielen Fällen, wenn die Rekursionstiefe zu groß wird, kommt es sogar zu einem Überlauf des Stacks
    //Endrekusion: dagegen kann der jeweils letzte Eintrag im Aufrufstack wiederverwendet werden, da er nicht mehr benötigt wird.


    }











