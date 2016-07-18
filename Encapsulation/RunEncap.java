package Encapsulation;

/* File name : RunEncap.java */
public class RunEncap{

   public static void main(String args[]){
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}
/* *****************************
*The fields of a class can be made read-only or write-only.
*A class can have total control over what is stored in its fields.
*The users of a class do not know how the class stores its data. 
*A class can change the data type of a field and users of the class do not need to change any of their code.
******************************* */