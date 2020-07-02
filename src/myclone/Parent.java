package myclone;

public class Parent implements Cloneable{
    private int id;
    private Son son;
    private String pname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Son getSon() {
        return son;
    }

    public void setSon(Son son) {
        this.son = son;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", son=" + son +
                ", pname='" + pname + '\'' +
                '}';
    }

    @Override
    protected Object clone()  {
        Object o = null;
        try {
            o = (Parent)super.clone();
            Parent p = null;
            p = (Parent) super.clone();
            p.son = (Son)p.getSon().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
