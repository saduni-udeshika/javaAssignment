package saduni;

/*create to  custom exception called “IDInvalidException” exception 
 * pass message*/
public class IDInvalidException extends Exception{
    public IDInvalidException(String message) {
        super(message);
    }
}
