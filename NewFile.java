public class NewFile
 {
    public static void main(String[] args)
     {
        /* 
        Two types of data types in java 
        1)Primitive DATA TYPES
        2)NON-PRIMITIVE DATA TYPES
             EXAMPLE OF VARIABLES AND All  PRIMITIVE DATA TYPES (8)
             byte,short,int ,long,float,double,boolean and char

*/
                    /* 
                    int x;           Declaration
                    x = 10;          Assignment
                            OR 
                    int x = 10;      Initialization
                    */ 
        
          byte e=127;
          System.out.println(e); // 127
    
                    /* 
                    byte f=128;
                    System.out.println(f); //error 
                    */
           short t = 32767;
           System.out.println(t);
                                    /*
                                        short s =32768;  //error     
                                        System.out.println(s);
                                    */

        int x=10;
        System.out.println(x);        //display the value of x
        System.out.println("x");   // printing a string literal
        System.out.println("my number is= "+x);   //we can  display text msg with variables value

                /*
                    int y=4521768765;   //error: integer number too large  
                    System.out.println(y);


                  */     
                  
           long y=7676758768787787889L;   
            System.out.println(y);

                /*      
                        int z=12343.2; //error
                        System.out.println(z);
                 */ 

             float a = 3.14f;           //must use f
             System.out.println(a);    //3.14

            double b = 3.14f;
             System.out.println(b);    //3.140000104904175

             double c = 3.14;         //while using "double datatype" no need to use f yaa d
             System.out.println(c);  //3.14


             

            boolean d=true;
            System.out.println(d);  // true

            char symbol='@';
            System.out.println(symbol); //@

            float g=23.92323787879864111111111875564645481f; //23.923239
            System.out.println(g);

            float h=254535.7993f; //254535.8
            System.out.println(h);

            
            float i=254535.234393f; //254535.23
            System.out.println(i);


         double j=254535.23439365656532433435; //254535.23439365657 
            System.out.println(j);



            /*
                NON-PRIMITIVE DATA TYPES SUCH AS 
                STRING,ARRAYS AND CLASSES
             
             */

            String name="Rachna jat";
            System.out.println("name ="+name); //Rachna jat

    }

 

}
       
