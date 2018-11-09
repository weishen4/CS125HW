// A Java program to demonstrate shallow copy
// using clone()

// An object reference of this class is
// contained by A
class Test
{
    int x, y;
}

// Contains a reference of Test and implements clone with shallow copy.
class A implements Cloneable
{
    int a;
    int b;
    Test c = new Test();

    public Object clone() throws
            CloneNotSupportedException
    {
        return super.clone();
    }
}

// Driver class
class Main
{
    public static void main(String args[]) throws
            CloneNotSupportedException
    {
        A t1 = new A();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        //downcasting because it returns a object actually A
        A t2 = (A)t1.clone();

        // Creating a copy of object t1 and passing
        // it to t2
        t2.a = 100;
        t2.b = 30;
        // Change in primitive type of t2 will not
        // be reflected in t1 field
        t2.c.x = 300;

        // Change in object type field will be
        // reflected in both t2 and t1(shallow copy)
        System.out.println(t1.a + " " + t1.b + " " +
                t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " +
                t2.c.x + " " + t2.c.y);
    }
}
