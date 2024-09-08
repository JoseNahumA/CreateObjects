public enum Operator {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    // attributes
    private final char symbol;

    // constructor
    Operator(char symbol){
        this.symbol = symbol;
    }

    // Getter
    public char getSymbol() {
        return symbol;
    }

    // static method
    public static Operator fromSymbol(char symbol){
        for(Operator operator : values()){
            if(operator.getSymbol() == symbol){
                return operator;
            }
        }
        return null;
    }
}