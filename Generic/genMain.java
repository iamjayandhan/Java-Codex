package generic;

public class genMain {
    public static void main(String args[]){
        Test <String,Integer> obj = new Test<String,Integer>("killer",20);
        obj.print();
        Test <String,String> obj2 = new Test<String,String>("killer","rolex");
        obj2.print();
        Test <Integer,Integer> obj3 = new Test<Integer,Integer>(100,20);
        obj3.print();
        Test <Double,Float> obj4 = new Test<Double,Float>(2.000020202,20.222f);
        obj4.print();
    }
}
