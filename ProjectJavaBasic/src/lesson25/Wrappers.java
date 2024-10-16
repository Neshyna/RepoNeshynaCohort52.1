package lesson25;

public class Wrappers {

    /*
    класс обертка
    использ для представления примитивных типов данных как объектов
    Byte - byte
    Short - short
    Integer - int
    Long - long
    Float
    Double
    Character
    Boolean

     */

    public static void main(String [] args){

        // Автоматическое приведение типов
        // Автоупаковка и автораспаковка

        //auto wrapping and rewrapping
        Integer wrapperInt = 5 ;
         //auto wrapping int into Integer (link type from primitive)
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;//auto rewrapp from Integer into  int

        //compare objects
        //cash obj -128 ...127
        Integer a = 127;
        Integer b = 127;
        System.out.println(a==b);//true//links compared
        System.out.println(a.equals(b));//need to use equals method//true

        Integer c =128;
        Integer d = 128;
        System.out.println(c==d);//false
        System.out.println(c.equals(d));//true


        String j1 = "Jave";
        String j2 = "Java";
        System.out.println("j1==j2" + (j1==j2));//true
        String j3 = new String("Java");
        System.out.println(j2==j3);//false
        System.out.println(j2.equals(j3));//true//better use equals to compare strings

        System.out.println("==========");
        Integer maxValue = Integer.MAX_VALUE;
        System.out.println("max" + maxValue);
        System.out.println("min" + Integer.MIN_VALUE);


        /*
        wrap methods
        1 valueOf

         */

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println(e==f);

        Integer intStr = Integer.valueOf("123");//send string
        System.out.println(intStr + 100);//223

        Double doubleWrap = Double.valueOf(154.5);
        System.out.println(doubleWrap);

        //2 parseXXX() transforms string into primitive
        System.out.println(Integer.parseInt("456") + 100);
        double d1 = Double.parseDouble(("345.67") + 200);
        System.out.println(d1);

        //3 toString
        System.out.println(doubleWrap);
    }
}
