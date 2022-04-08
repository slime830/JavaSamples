package p_3;


// interface 
// interfaceは、「クラスのひな型」というイメージ

// interfaceは抽象クラスと異なり、「定数と抽象メソッド」しかもてない
// （抽象クラスは、通常のメソッドやメンバ変数ももてる）

interface HogeInterface{
    final int VALUE1 = 10;
    final String NAME = "HogeInterface";

    void func1();
    double func2();
}

public class InterfaceExample implements HogeInterface{ // implements インタフェース名で、インタフェースを「実装」する
    
    public void func1(){//publicが必要
        System.out.println(VALUE1);
    }

    public double func2(){//publicが必要
        return 3.14;
    }

    public static void main(String[] args){
        InterfaceExample ex = new InterfaceExample();
        
        ex.func1();
        System.out.println(ex.func2());
    }
    
    
}


