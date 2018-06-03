import java.util.*;

public  class Term{
	public int coeff;
	public int exp;

	public Term(){
		this.coeff = 0;
		this.exp = 0;
	}

	public Term(int c, int e){
		this.coeff = c;
		this.exp = e;
	}

	public String toString(){
		String str = "";
		str += this.coeff + "x^" + this.exp;
		return str;
	}
}