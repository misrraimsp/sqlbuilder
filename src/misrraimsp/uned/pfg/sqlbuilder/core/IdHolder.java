package misrraimsp.uned.pfg.sqlbuilder.core;

public class IdHolder {

    private int id;

    public IdHolder(){
        this.reset();
    }

    public void increment(){
        id++;
    }

    public int getId(){
        return id;
    }

    public void reset(){
        id = 1;
    }
}


