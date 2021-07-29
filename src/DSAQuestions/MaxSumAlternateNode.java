package DSAQuestions;

class NewNode{
	int sum;
	int data;
	NewNode left,right;
	NewNode(int data){
		this.data=data;
		sum=0;
		left=null;
		right=null;
	}
}
public class MaxSumAlternateNode {
	Node<Integer> root;
	static int findSum(Node<Integer> root) {
		if(root==null)
			return 0;
		int sum1=findSum(root.left)+findSum(root.right);
		int sum2=root.data;
		if(root.left!=null)
			sum2+=findSum(root.left.left)+findSum(root.left.right);
		if(root.right!=null)
			sum2+=findSum(root.right.left)+findSum(root.right.right);
		return sum1>sum2?sum1:sum2;
	}
	
	//better approach used dp
	//calculated direct and indirect sum and return max of both as sum
	static int findSum2(NewNode root) {
		if(root==null)
			return 0;
		if(root.sum!=0)
			return root.sum;
		int left=findSum2(root.left);
		int right=findSum2(root.right);
		int ll=0,lr=0,rl=0,rr=0;
		if(root.left!=null) {
			ll=findSum2(root.left.left);
			lr=findSum2(root.left.right);
		}
		if(root.right!=null) {
			rl=findSum2(root.right.left);
			rr=findSum2(root.right.right);
		}
		int indirectSum,directSum;
		indirectSum=root.data+ll+lr+rr+rl;
		directSum=left+right;
		root.sum=Math.max(indirectSum,directSum);
		return root.sum;
	}
	public static void main(String[] args) {
//		Node<Integer> root= new Node<Integer>(1);
//		root.left= new Node<Integer>(2);
//		root.right = new Node<Integer>(3);
//		root.left.left= new Node<Integer>(9); 
//		root.left.right= new Node<Integer>(3); 
//		root.right.left= new Node<Integer>(4); 
//		root.right.right= new Node<Integer>(5); 
//		root.left.right.right= new Node<Integer>(5);
//		root.left.right.left= new Node<Integer>(88);
//		root.left.left.left = new Node<Integer>(44);
//		root.left.left.right = new Node<Integer>(66); 
//		System.out.println(findSum(root));
//		
//		//better approach
//		NewNode root2= new NewNode(1);
//		root2.left= new NewNode(2);
//		root2.right = new NewNode(3);
//		root2.left.left= new NewNode(9); 
//		root2.left.right= new NewNode(3); 
//		root2.right.left= new NewNode(4); 
//		root2.right.right= new NewNode(5); 
//		root2.left.right.right= new NewNode(5);
//		root2.left.right.left= new NewNode(88);
//		root2.left.left.left = new NewNode(44);
//		root2.left.left.right = new NewNode(66); 
//		System.out.println(findSum2(root2));
//		
//		Node<Integer> root= new Node<Integer>(1); 
//		root.left= new Node<Integer>(2);
//		root.right = new Node<Integer>(3);
//		root.left.left= new Node<Integer>(9);
//		root.left.right= new Node<Integer>(3);
//		root.right.left= new Node<Integer>(4); 
//		root.right.right= new Node<Integer>(5); 
//		root.left.right.right= new Node<Integer>(500);
//		root.left.right.left= new Node<Integer>(88);
//		root.left.left.left = new Node<Integer>(44);
//		root.left.left.right = new Node<Integer>(66);
//		root.right.left.left = new Node<Integer>(120); 
//		root.right.left.right = new Node<Integer>(2);
//		root.right.right.left = new Node<Integer>(12);
//		root.right.right.right = new Node<Integer>(8);
//		root.left.right.right.left= new Node<Integer>(15); 
//		root.left.right.right.right= new Node<Integer>(25); 
//		root.left.right.left.left= new Node<Integer>(68);
//		root.left.right.left.right= new Node<Integer>(38);
//		root.left.left.left.left = new Node<Integer>(14);
//		root.left.left.left.right = new Node<Integer>(2);
//		root.left.left.right.left = new Node<Integer>(100); 
//		root.left.left.right.right = new Node<Integer>(105);
//		root.right.left.left.left = new Node<Integer>(12); 
//		root.right.left.left.right = new Node<Integer>(13);
//		root.right.left.right.left = new Node<Integer>(255); 
//		root.right.left.right.right = new Node<Integer>(28); 
//		long start = System.nanoTime(); 
//		System.out.println(findSum(root));
//		System.out.println(" Time taken "+(System.nanoTime()-start)); 
		

		NewNode root= new NewNode(1); 
		root.left= new NewNode(2);
		root.right = new NewNode(3);
		root.left.left= new NewNode(9);
		root.left.right= new NewNode(3);
		root.right.left= new NewNode(4); 
		root.right.right= new NewNode(5); 
		root.left.right.right= new NewNode(500);
		root.left.right.left= new NewNode(88);
		root.left.left.left = new NewNode(44);
		root.left.left.right = new NewNode(66);
		root.right.left.left = new NewNode(120); 
		root.right.left.right = new NewNode(2);
		root.right.right.left = new NewNode(12);
		root.right.right.right = new NewNode(8);
		root.left.right.right.left= new NewNode(15); 
		root.left.right.right.right= new NewNode(25); 
		root.left.right.left.left= new NewNode(68);
		root.left.right.left.right= new NewNode(38);
		root.left.left.left.left = new NewNode(14);
		root.left.left.left.right = new NewNode(2);
		root.left.left.right.left = new NewNode(100); 
		root.left.left.right.right = new NewNode(105);
		root.right.left.left.left = new NewNode(12); 
		root.right.left.left.right = new NewNode(13);
		root.right.left.right.left = new NewNode(255); 
		root.right.left.right.right = new NewNode(28); 
		long start = System.nanoTime(); 
		System.out.println(findSum2(root));
		System.out.println(" Time taken "+(System.nanoTime()-start)); 
	}
}
