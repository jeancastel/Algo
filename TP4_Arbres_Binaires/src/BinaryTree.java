import java.util.Scanner;


public class BinaryTree <E>{
	private E _elmt=null;
	private BinaryTree < E > _leftTree=null;
	private BinaryTree < E > _rightTree=null;
	
	public BinaryTree(E elmt, BinaryTree<E> lt, BinaryTree<E> rt){
		_elmt = elmt;
		_leftTree= lt;
		_rightTree=rt;
	}
	public BinaryTree(E elmt){
		_elmt = elmt;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez entrer le nombre d'arbres :");
		int nbArbres=sc.nextInt();
	}
	
}
