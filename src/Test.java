import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
   int rno;
   String string;
   float marks;

   private Test(int rno, String string, float marks){
       this.rno = rno;
       this.string = string;
       this.marks = marks;
   }

   public Test(int rno){
       this.rno = rno;
   }

   public Test(float marks){
       this.marks = marks;
   }

    public static void main(String[] args) {
        Test test = new Test(1.1f);
    }



}
