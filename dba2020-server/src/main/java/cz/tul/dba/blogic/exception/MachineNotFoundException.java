package cz.tul.dba.blogic.exception;

public class MachineNotFoundException extends RuntimeException {
    public MachineNotFoundException(String message) {
        super(message);
    }
}
