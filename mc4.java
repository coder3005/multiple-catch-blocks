/* multiple catch blocks */
class multicatch
{
    public static void main(String[] args) {
        
        try
        {
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[4]);

            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array Exception");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(NumberFormatException n)
        {
            System.out.println("Number Exception");
        }
        catch(Exception x)
        {
            System.out.println("All type Exception handled");
        }
        // Exception x=new NullPointerException();
    }
}
