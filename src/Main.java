import java.util.*;

class Main{
    void f1(int i,float j){
        System.out.println("int");
    }
    void f1(float j,int i){
        System.out.println("float");
    }
    public static void main(String[] args) {
        Main x=new Main();
        x.f1(20,20);
    }
    MinMoves x=new MinMoves();

}
