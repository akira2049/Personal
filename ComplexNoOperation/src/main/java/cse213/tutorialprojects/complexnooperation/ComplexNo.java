package cse213.tutorialprojects.complexnooperation;

public class ComplexNo {
    int real, img;

    public ComplexNo() {
        real = img = 0;
    }

    public ComplexNo(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
       String sign = "";
       if (img>=0) {
           sign = "+";
       }
       return "ComplexNo Operation Result: " + real + sign + img + "i";
    }

    public ComplexNo add(ComplexNo c) {
        ComplexNo temp = new ComplexNo();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }

    public ComplexNo sub(ComplexNo c) {
        ComplexNo temp = new ComplexNo();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;
    }
}
