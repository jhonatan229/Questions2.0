package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import question.Awnser;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		File start = new File("C:\\projeto-java\\play-with-files\\Question\\Questions\\start.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(start))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
		char begin = sc.next().charAt(0);
		Awnser al = new Awnser();
		clearScreen();
		
		if (begin == 'y' || begin == 'Y') {
			for(int i = 1; i <= 5; i++) {
				File question = new File("C:\\projeto-java\\play-with-files\\Question\\Questions\\Question_" + i + ".txt");
				
				try(BufferedReader qr = new BufferedReader(new FileReader(question))){
					String line1 = qr.readLine();
					while(line1 != null) {
						System.out.println(line1);
						line1 = qr.readLine();
					}
				}
				catch(IOException e ) {
					System.out.println("Error: " + e.getMessage());
				}
				
				char awnser = sc.next().charAt(0);
				al.esquema(awnser, i);
				clearScreen();
				System.out.println(al.getResult());
			}
			System.out.println("\n" + al.toString() + "\n" + al.showStatistc());
			
		}
		else {
			System.out.println("Então vc não tem nada para ver aqui. Adeus ");
		}
		
		sc.close();

	}
	
	public static void clearScreen() {
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}

}
