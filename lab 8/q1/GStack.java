public class GStack<T>{
	private GNode<T> head;

	public GStack(){
		this.head = null;
	}

	public void push(T d){
		this.head = new GNode<T>(d, head);
	}	

	public T pop(){
		T d = this.head.data;
		this.head = this.head.ptr;
		return d;
	}

	public String toString(){
		String str = "";
		//GNode<T> temp = this.head;
		while(this.head != null){
			str += this.pop() + " ";
			//temp = temp.ptr;
		}

		//str += "NULL";
		return str;
	}
}
