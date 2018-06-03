public class GNode<T>{
	
	public T data;
	public GNode<T> ptr;

	public GNode(){
		this.data = null;
		this.ptr = null;
	}

	public GNode(T d, GNode<T> p){
		this.data = d;
		this.ptr = p;
	}
}
