import java.util.*;
import java.lang.*;

public class MyPolynomial{
	private LinkedList<Term> poly = null;

	public MyPolynomial(){
		this.poly = new LinkedList<Term>();
	}

	public void addTerm(int c, int e){
		Term t = new Term(c, e);
		this.poly.add(t);
	}

	public ListIterator<Term> polyIterator(){
		return poly.listIterator(0);
	}

	public MyPolynomial addPoly(MyPolynomial poly2){
		
		MyPolynomial sum = new MyPolynomial();

		ListIterator<Term> itrPoly1 = this.polyIterator();
		ListIterator<Term> itrPoly2 = null;

		while(itrPoly1.hasNext() == true){

			Term tempPoly1 = itrPoly1.next();
			itrPoly2 = poly2.polyIterator();

			int c = tempPoly1.coeff;
			int e = tempPoly1.exp;
			
			while(itrPoly2.hasNext() == true){
				Term tempPoly2 = itrPoly2.next();
				
				if(e == tempPoly2.exp){
					c = tempPoly1.coeff + tempPoly2.coeff;
				} // inner if
			} // inner while
			sum.addTerm(c, e);
		} // outer while

		itrPoly2 = poly2.poly.listIterator(0);	

		while(itrPoly2.hasNext() == true){
			Term tempPoly2 = itrPoly2.next();
			int flag = 0;

			int c = tempPoly2.coeff;
			int e = tempPoly2.exp;

			itrPoly1 = this.poly.listIterator(0);
			while(itrPoly1.hasNext() == true){
				Term tempPoly1 = itrPoly1.next();
				
				if(tempPoly1.exp == e){
					flag = 1;
					break;
				} // inner if
			} // inner while

			if(flag == 0){
				sum.addTerm(c, e);
			}
		} // outer while
		return sum;
	} // addPoly()

	public MyPolynomial subPoly(MyPolynomial poly2){
		
		MyPolynomial sum = new MyPolynomial();

		ListIterator<Term> itrPoly1 = this.polyIterator();
		ListIterator<Term> itrPoly2 = null;

		while(itrPoly1.hasNext() == true){

			Term tempPoly1 = itrPoly1.next();
			itrPoly2 = poly2.polyIterator();

			int c = tempPoly1.coeff;
			int e = tempPoly1.exp;
			
			while(itrPoly2.hasNext() == true){
				Term tempPoly2 = itrPoly2.next();
				
				if(e == tempPoly2.exp){
					c = tempPoly1.coeff - tempPoly2.coeff;
				} // inner if
			} // inner while
			sum.addTerm(c, e);
		} // outer while

		itrPoly2 = poly2.poly.listIterator(0);	

		while(itrPoly2.hasNext() == true){
			Term tempPoly2 = itrPoly2.next();
			int flag = 0;

			int c = tempPoly2.coeff;
			int e = tempPoly2.exp;

			itrPoly1 = this.poly.listIterator(0);
			while(itrPoly1.hasNext() == true){
				Term tempPoly1 = itrPoly1.next();
				
				if(tempPoly1.exp == e){
					flag = 1;
					break;
				} // inner if
			} // inner while

			if(flag == 0){
				sum.addTerm(c, e);
			}
		} // outer while
		return sum;
	} // subPoly()

	public MyPolynomial mulPoly(MyPolynomial poly2){
		MyPolynomial mul = new MyPolynomial();
		ListIterator<Term> itrPoly1 = this.polyIterator();

		while(itrPoly1.hasNext() == true){
			Term tempPoly1 = itrPoly1.next();
			int c = tempPoly1.coeff;
			int e = tempPoly1.exp;

			ListIterator<Term> itrPoly2 = poly2.polyIterator();
			while(itrPoly2.hasNext() == true){
				Term tempPoly2 = itrPoly2.next();
				c = c * tempPoly2.coeff;
				e = e + tempPoly2.exp;
				mul.addTerm(c, e);
			}
		}
		return mul;
	} // multPoly()

	public MyPolynomial mulConst(int x){
		MyPolynomial mul = new MyPolynomial();
		ListIterator<Term> itr = this.polyIterator();

		while(itr.hasNext() == true){
			Term temp = itr.next();
			int c = x * temp.coeff;
			int e = temp.exp;
			mul.addTerm(c, e);
		}
		return mul;
 	}

	public double evaluate(double x){
		ListIterator<Term> itr = this.poly.listIterator(0);
		double sum = 0;
		Term temp = null;

		while(itr.hasNext() == true){
			temp = itr.next();
			sum += temp.coeff * Math.pow(x , temp.exp); 
		}

		return sum;
	} // evaluate()

	public MyPolynomial derivate(){
		MyPolynomial der = new MyPolynomial();
		ListIterator<Term> itr = poly.listIterator(0);

		while(itr.hasNext() == true){
			Term temp = itr.next();
			int c = temp.coeff * temp.exp;
			int e = temp.exp - 1;

			if(temp.exp != 0){
				der.addTerm(c, e);
			}
		} // while
		return der;
	} // derivative()

	public String toString(){
		String str = "";
		ListIterator<Term> itr = poly.listIterator(0);
		while(itr.hasNext() == true){
			Term t = itr.next();
			
			if(t.coeff > 0)
				str += " +" + t.coeff + "x^" + t.exp + " ";

			if(t.coeff < 0)
				str += t.coeff + "x^" + t.exp + " ";
		}
		
		return str;
	}
}