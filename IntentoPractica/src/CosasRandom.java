import java.util.Random;
public class CosasRandom {
	Random aleatorio = new Random();
	int max;
	int min;
	
	int numAleatorio = aleatorio.nextInt(/*Desde 0 hasta el parametro -1*/);
	
	
	int numAleatorio2 = (int)(Math.random()*10); //De 0 a 10
	int numAleatorio3 = (int)(Math.random()*(max-min) +1)+min;
}
