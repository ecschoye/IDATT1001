package Exercise2;

public class CheapestMincedMeat {
    public static void main(String[] args) {
        float A = 35.9F;
        float B = 39.5F;
        float kiloA = 0.45F;
        float kiloB = 0.5F;
        float kiloPriceA = A/kiloA;
        float kiloPriceB = B/kiloB;

        if (kiloPriceA < kiloPriceB) {
            System.out.println("Minced meat from brand A is cheaper. It costs " + kiloPriceA + " per kg");
        } else {
            System.out.println("Minced meat from brand B is cheaper. It costs " + kiloPriceB + " per kg");
        }

    }
}
