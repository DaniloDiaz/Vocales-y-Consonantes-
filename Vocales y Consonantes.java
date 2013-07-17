import java.io.*;

public class letra {
    static InputStreamReader entrada = new InputStreamReader(System.in);
    static BufferedReader flujoEntrada = new BufferedReader(entrada);
    static String datoEntrada;
    public static void main(String[] args) throws IOException {
    
    
        char letra = 0;


    		System.out.print("Digite una letra: ");
    		try {
    		letra=(char) System.in.read();
    		} catch (IOException ex) {
    		System.out.print("Error en la lectura");
    		}
    		if('A'==letra || 'a'==letra || 'E'==letra || 'e'==letra || 'i'==letra || 'I'==letra || 'o'==letra || 
    		'O'==letra || 'u'==letra || 'U'==letra){
    		System.out.println("Es una vocal");
    		}
    		else{
    		System.out.println("Es una consonante");}
    		}
    		}
