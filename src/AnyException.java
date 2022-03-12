public class AnyException extends RuntimeException{
    private String myLine;

    public String getMyLine() {
        return myLine;
    }

    public AnyException (String message, String myLine){
        super(message);
    this.myLine=myLine;
}

}
