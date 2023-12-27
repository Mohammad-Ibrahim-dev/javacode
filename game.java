// game stone paper scissor
import java.util.*;
  class play{
          play( int a,int b){
         if(a==b)
         {System.out.println(" ---- GAME DRAW----\n"); }
         else if((a==0 && b==2) || (a==1 && b==0 ) || (a==2 && b==1) )
         {System.out.println("---- YOU WIN ----\n");}
         else
         System.out.println("----YOU LOOSE----\n");
        
       }  
   };
public class game  {
	public static void main(String[] args) {
	    Scanner in =new Scanner(System.in);
	   Random random=new Random();
	    int n,j,cmp,i;
	    System.out.print("how many match you want to play :");
	    j=in.nextInt();
	    for(i=1;i<=j;i++){
	System.out.println(" choose yours ---\n stone =0 ; paper=1 ; scisor=2");
	n=in.nextInt();
	cmp=random.nextInt(3);
	System.out.println("computer choose="+cmp);
	play ob=new play(n,cmp);}
}
}