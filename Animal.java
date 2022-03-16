public class Animal{
    private String species;
    private String sciName;
    private double avgSize;

    public Animal(String sp, String sc, double avg){
        species = sp;
        sciName = sc;
        avgSize = avg;
    }

    public String toString(){
        return "I am a " + species + ", also known as a " + sciName + ". My average size is " + avgSize + ".";
    }
}