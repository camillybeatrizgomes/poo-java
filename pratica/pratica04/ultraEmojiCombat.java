package pratica4;

public class ultraEmojiCombat {
	
	public static void main(String[] args) {
		lutador l[] = new lutador[6];
				
			l[0] = new lutador("Pretty Boy","França", 31, 1.75f,68.9f,11,2,1);
			l[1] = new lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
			l[2] = new lutador("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
			l[3] = new lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
			l[4] = new lutador("UfoCobol","Brasil",37,1.70f,119.3f,5,4,3);
			l[5] = new lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
			
			luta UEC1 = new luta();
			UEC1.marcaLuta(l[4], l[5]);
			UEC1.lutar();
			
	}
}
