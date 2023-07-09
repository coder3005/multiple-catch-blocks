/* multiple catch blocks */
class multicatch
{
    public static void main(String[] args) {
        
        try
        {
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[]={10,20,30};
            System.out.println(arr[2]);

            String str=null;
            System.out.println(str.toUpperCase());
        }
        catch(Exception x)
        {
            System.out.println("All type Exception handled");
        }
        // Exception x=new NullPointerException();
    }
}
