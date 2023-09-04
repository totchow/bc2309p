public class Operator {
  public static void main(String[] args) {
    // + - * / 
    // ++

    // --
    int i = 0;
    i = i - 1; // -1
    i -= 1; // -2
    i--; // -3
    --i; // -4

    // ++, -- precedence
    int x = 0;
    int result = x++; 
    System.out.println("result=" + result); //0
    System.out.println("x="+ x); //1

    int y = 0;
    int result2 = ++y;
    System.out.println("result2="+result2); // 1
    System.out.println("y="+y); // 1


    int a = 0;
    int result3 = a--;
    System.out.println("result3="+result3); //0
    System.out.println("a="+a); //-1

    int b = 0;
    int result4 = --b;
    System.out.println("result4="+result4); //-1
    System.out.println("b="+b); // -1

    // % operator
    int r = 5 % 2; // remainder of 5/2
    System.out.println(r); //1

    int w = 10 % 6 + 4 * 8;
    System.out.println(w); // 36

    // && ||
    boolean b1 = true && true; //true
    boolean b2 = true && false; //false
    boolean b3 = false && true; // false
    boolean b4 = false && false; // false

    boolean b5 = true || true; //true
    boolean b6 = true || false; //true
    boolean b7 = false || true; // true
    boolean b8 = false || false; // false

    // && go first, || after
    boolean combine = true || false && true; //true

    // ! -> Not
    boolean b9 = !false; //true
    int h = (1+2)*10; //30
    boolean b10 = !(true && false); //true

    // >, <, >=, <=
    boolean g = 5>3; //true
    boolean g2 = 5>=6; //false
    boolean g3 = -1<1;  //true
    boolean g4 = -2<=-3; //false

    // == equal to ; != not equal to
    boolean combine2 = (4+3) > 5 || (10*2) % 3 == 2; // true||true
    System.out.println(combine2);
    boolean combine3 = !(5%2==1) && 10*3 != 20; //false && true
    System.out.println(combine3);

    // *=, /=, %=
    int aa = 2;
    aa *=3; //6
    int f = 3;
    f /= 1; //3
    int e = 10;
    e %= 3; //1

    
  }
}
