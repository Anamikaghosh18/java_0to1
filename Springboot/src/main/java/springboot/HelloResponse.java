package springboot;

public class HelloResponse extends Controller {
    private String message ;

    public String getMessage() {
        return message;
    }

    public HelloResponse(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
