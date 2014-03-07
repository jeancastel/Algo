package Exo2;

public class BinaryTree <E>{
	private E _elmt;
	private BinaryTree<E> _leftTree=null;
	private BinaryTree<E> _rightTree=null;
	
	public BinaryTree(E elmt){
		_elmt = elmt;
	}
	
	public BinaryTree(E elmt, BinaryTree<E> lt, BinaryTree<E> rt){
		_elmt = elmt;
		_leftTree = lt;
		_rightTree = rt;
	}
	public static void main(String []args){
		//Création de l'arbre
		BinaryTree<Disque> D1= new BinaryTree<>(new Disque("Album 4","Artiste4",5));
		BinaryTree<Disque> D2= new BinaryTree<>(new Disque("Album 2","Artiste2",153),D1,null);
		BinaryTree<Disque> D3= new BinaryTree<>(new Disque("Album 6","Artiste6",0));
		BinaryTree<Disque> D4= new BinaryTree<>(new Disque("Album 5","Artiste5",19),D3, null);
		BinaryTree<Disque> D5= new BinaryTree<>(new Disque("Album 7","Artiste7",7));
		BinaryTree<Disque> D6= new BinaryTree<>(new Disque("Album 3","Artiste3",57),D4,D5);
		BinaryTree<Disque> D7= new BinaryTree<>(new Disque("Album 1","Artiste1",5),D2,D6);
		D7.affichagePrefixe();
	}
	
	public E getElement(){
		return _elmt;
	}
	
	public BinaryTree<E> getLeft(){
		return _leftTree;
	}
	
	public BinaryTree<E> getRight(){
		return _rightTree;
	}
	public void affichagePrefixe(){
		System.out.println(this.getElement().toString());
		if(this.getLeft()!=null || this.getRight()!=null){
			this.getLeft().affichagePrefixe();
			if(this.getRight()!=null){
				this.getRight().affichagePrefixe();
			}
		}
	}	
}
