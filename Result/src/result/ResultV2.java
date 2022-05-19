package result;

public class ResultV2 {
	public String TestResult(int a,int b ,int c) {
		int result = a*(b-c);
		if(result>=0) //Modefied
			return "Positive Result";
		else if(result<0)
			return "Negative Result";
		else
			return"0";
		
	}

}
