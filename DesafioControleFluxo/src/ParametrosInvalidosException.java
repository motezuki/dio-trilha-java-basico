public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super("Parametros Inválidos: " + message);
    }

}
