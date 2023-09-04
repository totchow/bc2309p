public class DataType {
  public static void main(String[] args) {

    //Assign value "Hello World!!!" to a variable str
    String box = "Hello World!!!"; 
    System.out.println(box); //Print value of variable
    System.out.println("box"); //Print exact String

    String str; //Declare String
    box = "Welcome to Bootcamp";
    str = "abc"; //Assign value to variable
    System.out.println(str); //abc
    System.out.println(box);

    // Primitives - one type of data type, 8 types
    int x = 999;
    int salary = 1000;
    x = 10;
    System.out.println(x); //999
    x = x + 2; // 10+2, assign 12 back to variable x
    System.out.println(x); //12
    x = x - 8;
    System.out.println(x); //4

    salary = salary + x;
    System.out.println(x); //1004

    int z = salary / 2;
    System.out.println(z); //502

    int k = z * 5;
    System.out.println(k); //2510

    int sum = x + salary + z + k; 
    System.out.println(sum); //4020

    int result = sum + 10/2;
    System.out.println(result); //4025

    // self + 1
    int j = 0;
    j = j + 1; //approach 1

    j +=  1; // Approach 2 : "= j +" => "+="

    j++; // Approach 3
    ++j; // Approach 4
    System.out.println(j); //4

    // String str = 1; // Not ok
    String s = "hello";
    // s = s/2 ; s-2; s*2; all not ok, error
    s = s + " world."; //string supports + 
    System.out.println(s); //hello world.

    String str1 = "abc";
    String str2 = "xyz";
    String e = str1 + str2;
    System.out.println(e); //abcxyz
    System.out.println("e=" + e); //e=abcxyz

    // int => integer 整數
    // int a = 0.3; // error
    double d = 0.3;
    d = 3.1415;
    System.out.println(d); // 3.1415
    d = d + 0.3 - 0.1 * 2;
    System.out.println(d); // 3.2415
    double d2 = 3; // assint int = d2, convert int to double
    System.out.println(d2); // 3.0

    // boolean (True or False)
    boolean a = true;
    System.out.println(a); // true
    boolean isLeft = false;
    System.out.println(isLeft); //false
    // String w = true; // cannot assign t/f to string
    // Boolean not support +-*/ operation
    boolean isMale = true;
    System.out.println(isMale); // true

    // char 
    char t = 'a';
    System.out.println(t); // a
    // char i = ''; // 1 character
    // char t = 'ab'; // Not ok, not more than 1 character
    char o = '$';
    System.out.println(o); //$

    // byte
    byte b = 1; //Within -128 to 127
    // byte b2 = -129; // out of range
    // byte b3 = 128; // out of range
    // b = b + 10; 
    
    // short
    short sh = 128;
    //short sh = -40000; // Not ok  
    int r2 = sh + 100;
    System.out.println(r2); //228

    // long : bigger range than int
    long l1 = 10000;
    l1 += 20000;
    System.out.println(l1); // 30000
    l1 -= 5000; // l1 = l1 - 5000;
    System.out.println(l1); // 25000

    l1 *= 2;
    System.out.println(l1); // 50000
    l1 /= 10;
    System.out.println(l1); //5000

    // String support +=
    String k2 = "abc";
    k2 += " bcd";
    System.out.println(k2); // abc bcd

    // float 
    int i = 1; // by default, java treat 1 is an integer value
    double d4 = 3.0; // by default, java treat 3.0 is a double value
    double d5 = 3.0d; // Explicityly assign a double value to double variable
    // float f = 3.0; // Not ok, assign double to float
    float f = 3.0f; 

    // byte, short, int, long -> all handle integer
    byte b3 = 3; // no 3B
    short s3 = 4; // no 4S
    int i3 = 5;
    long l3 = 5; // upcast
    long l4 = 5L; //Assign long value 5 to long variable

  }
}
