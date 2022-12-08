package pratica10;

public class objetoYouTube {

	public static void main(String[] args) {
		video v[] = new video[3];
		v[0] = new video("Aula 1 de POO");
		v[1] = new video("Aula 2 de HTML");
		v[2] = new video("Aula 5 de Java");
		
		gafanhoto g[] = new gafanhoto[2];
		g[0] = new gafanhoto("Camilly",19,"F","Milly");
		g[1] = new gafanhoto("Laís",12,"F","Lala");
		
		//System.out.println(v[0].toString());
		//System.out.println(g[0].toString());
		
		//visualizacao v1 = new visualizacao(g[0], v[1]);
		//System.out.println(v1.toString());
		
		visualizacao v1 [] = new visualizacao[5];
		v1 [0] = new visualizacao(g[0], v[2]);
		v1[0].avaliar();
		System.out.println(v1[0].toString());
		
		v1 [1] = new visualizacao(g[0], v[1]);
		v1[1].avaliar(87.0f);
		System.out.println(v1[1].toString());
	}

}
