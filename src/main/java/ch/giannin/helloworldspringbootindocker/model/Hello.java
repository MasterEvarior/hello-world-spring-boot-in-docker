package ch.giannin.helloworldspringbootindocker.model;

public class Hello {
    private String helloTo;

    public Hello(String helloTo){
        this.helloTo = helloTo;
    }

    @Override
    public String toString(){
        return "Hello " + this.helloTo;
    }
}
