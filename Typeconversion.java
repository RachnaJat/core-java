public class Typeconversion {
    public static void main(String[] args) {
        

/*EXAMPLES OF TYPE CONVERSION  or Widening or Automatic Type Conversion

byte->short->int->long->double
char->int,long,float,double

 */

/*
boolean x=true;
byte y=x;              // cannot convert from boolean to any data type 
System.out.println("boolean to byte="+y); //error

*/

byte a=127;
short b= a;               //BYTE TO SHORT TYPE CONVERSION
System.out.println("value of b="+b);


short c=32324;
int d=c;                 //SHORT TO INT 
System.out.println("short to int ="+d);
     
int e=12323;
long f=e;               //INT TO LONG
System.out.println("int to long ="+f);


long g=232333242;
float h=g;              //LONG TO FLOAT
System.out.println("long to float="+h);   ///2.3233325E8

float i=23.43534f;
double j=i;                   //FLOAT TO DOUBLE
System.out.println("float to double="+j);  ///23.435340881347656




char l= 'c';
int k =l;           //cannot convert from char to boolean,byte,short and String
System.out.println("char to int="+k);   //99


/*
byte m =126;
char n= m;     ///cannot convert from any data type to char
System.out.println("byte to char="+n);

 */




/*
char m= 'c';
short n =m;           //cannot convert from char to short
System.out.println(n);

 */



 /* 
int o= 97;
 char p=o;             //cannot convert from int to char
 System.out.println("short to char="+p);

*/







    }
    
}
