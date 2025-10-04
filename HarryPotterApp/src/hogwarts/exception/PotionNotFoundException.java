package hogwarts.exception;

public class PotionNotFoundException extends RuntimeException {
    public PotionNotFoundException(String message) {
        super(message);
    }
}
