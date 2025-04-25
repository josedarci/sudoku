package br.com.dio.model;

public class Space {

    private Integer actual;
    private final Integer expected;

    private final boolean fixed;


    public Space(Integer expected, boolean fixed)
    {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed){
            actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
