package DSAQuestions;

public class Node<T> {
	T data;
	Node<T> left,right;
	Node(T data){
		this.data=data;
		left=null;
		right=null;
	}
}
