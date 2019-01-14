public class scannermultiplyno{
   public static void main (string[] args) {
   scanner console = new scanner(System.in) ;
   System.out.print("please type two numbers") ;
   int num1 = console.next() ;
   int num2 = console.next() ;
   int prod = num1 * num2 ;
   System.out.printin("the product is" +prod) ;
}
}
