public class Bird extends Animal{
    private int wingSpan;
    private String endaLevel;
    public Bird(String sp, String sc, double avg, int ws, String el) {
        super(sp, sc, avg);
        wingSpan = ws;
        endaLevel = el;
    }

    public String toString(){
        return super.toString() + " Additionally, I have an average wing span of " + wingSpan + " and my current endanger level is " + endaLevel + ".";
    }
    
}