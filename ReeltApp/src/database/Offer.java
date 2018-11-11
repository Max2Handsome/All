package database;

public class Offer {
    private char currensy;
    private Integer  quantity;
    private String rules;

    public Offer(char currensy, Integer quantity, String rules) {
        this.currensy = currensy;
        this.quantity = quantity;
        this.rules = rules;
    }

    public char getCurrensy() {
        return currensy;
    }

    public void setCurrensy(char currensy) {
        this.currensy = currensy;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "\n\tcurrensy " + currensy + "\n\tquantity " + quantity + "\n\trules " + rules;
    }
}
