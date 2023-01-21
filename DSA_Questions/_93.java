import java.util.*;

class ArgumentException extends Exception {
	public ArgumentException(){
		super(" No of Arguments must be greater than 5");
	}
}

public class _93 {
    public static void main(String args[]){
        try{
		if(args.length < 5)
			throw new ArgumentException();
		int sum = 0;
		for(int i = 0 ; i < 5 ; i++){
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("\n Summation : "+sum);
	}
	catch(ArgumentException e){
		System.out.println("Exception : \n"+e);
	}
    }
}
