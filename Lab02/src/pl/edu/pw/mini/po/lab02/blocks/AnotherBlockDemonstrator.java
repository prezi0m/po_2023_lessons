package pl.edu.pw.mini.po.lab02.blocks;

public class AnotherBlockDemonstrator {
	public static void main(String[] args) {
		
		BlocksDemonstrator blocksDemonstrator = new BlocksDemonstrator();
		blocksDemonstrator.publicNonstaticDoSomething();//Teraz sie kompiluje bo metoda est wywolywana z obiektu
		
		//blocksDemonstrator.privateDoSomething();//To juz sie nie kompiluje, bo blockDemonstrator jest instancja innej klasy 
													//co klasa z punktu widzenia ktorej metoda prywatna jest wywolywana 
													//AnotherBlockDemonstrator.main
		
		
		
	}
}
