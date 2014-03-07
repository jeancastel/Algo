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
		
		BinaryTree<DisquePrefere> D1 = new BinaryTree<>(new DisquePrefere("Album 4","Artiste4",5));
		BinaryTree<DisquePrefere> D2 = new BinaryTree<>(new DisquePrefere("Album 2","Artiste2",153),D1,null);
		BinaryTree<DisquePrefere> D3 = new BinaryTree<>(new DisquePrefere("Album 6","Artiste6",0));
		BinaryTree<DisquePrefere> D4 = new BinaryTree<>(new DisquePrefere("Album 5","Artiste5",19),D3, null);
		BinaryTree<DisquePrefere> D5 = new BinaryTree<>(new DisquePrefere("Album 7","Artiste7",7));
		BinaryTree<DisquePrefere> D6 = new BinaryTree<>(new DisquePrefere("Album 3","Artiste3",57),D4,D5);
		BinaryTree<DisquePrefere> D7 = new BinaryTree<>(new DisquePrefere("Album 1","Artiste1",5),D2,D6);
		D7.affichagePrefixe();

		if (estAbr(D1)) System.out.println("D1 est un ABR !");
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
	
	// affiche les éléments du BT
	
	public void affichagePrefixe(){
		
		System.out.println(this.getElement().toString());
		
		if(this.getLeft()!=null || this.getRight()!=null){
			
			this.getLeft().affichagePrefixe();
			
			if(this.getRight()!=null){
				
				this.getRight().affichagePrefixe();
			}
		}
	}
	
	public static <F extends Comparable <F>> boolean estAbr(BinaryTree<F> bt){
		
		if(bt.getLeft() != null){
			if(estAbr(bt.getLeft()) == false) return false;
		}
		
		else if  (bt.getRight() != null){
			if(estAbr(bt.getRight()) == false) return false;
		}
		
		return true;
	}
	
}
