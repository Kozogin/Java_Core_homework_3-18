package ua.lviv.lgs.t2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sizeArray = getRandomValueRangeFrom(20, 40);
		int sizeArray2 = getRandomValueRangeFrom(2, 8);
			System.out.println("Розмір масиву " + sizeArray + " x " + sizeArray2);
			
		Car [] [] ArrayCar = new Car [sizeArray] [sizeArray2];
		String hemlMaterial;
						
		for(int i = 0; i < sizeArray; i++) {
			for(int j = 0; j < sizeArray2; j++) {
				if(getRandomValueRangeFrom(0, 100) > 50) {
					hemlMaterial = "skin";
				} else {
					hemlMaterial = "alcantara";
				}
				
				ArrayCar[i][j] = new Car(getRandomValueRangeFrom(44, 380), 
						getRandomValueRangeFrom(1960, 2020), new Helm(getRandomValueRangeFrom(20, 45), 
								hemlMaterial), new Engine(2*getRandomValueRangeFrom(2, 6)));
			}
		}
				
		while(true) {
			menu();
			String chois = sc.next();
			switch (chois) {
			case "1":
				System.out.println(Arrays.deepToString(ArrayCar));
//**********//printArrayCar(sizeArray, sizeArray2, ArrayCar);
				break;
			case "2":
				changeArrayCar(sizeArray, sizeArray2, ArrayCar);
				break;
			default:
				System.out.println("Невірний ввід");
			}
		}

	}
	
	public static int getRandomValueRangeFrom(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
	public static void printArrayCar(int sizeArray,int sizeArray2, Car [] [] ArrayCar) {
		for(int i = 0; i < sizeArray; i++) {
			for(int j = 0; j < sizeArray2; j++) {
				
				System.out.println();
				System.out.print("Car [" + i + "] [" + j + "] ");
				System.out.print(ArrayCar[i][j]);
			}
		}
	}
	
	public static void changeArrayCar(int sizeArray,int sizeArray2, Car [] [] ArrayCar){
		Scanner sc = new Scanner(System.in);
		String chois;
		boolean again = true;
		int measurement1 = 0;
		int measurement2 = 0;
		while(again) {
			System.out.println
				("     Введіть номер обєкту, для копіювання в цілий масив, Вимір 1 від 0 до " + (sizeArray-1));
			chois = sc.next();
			if(Integer.parseInt(chois) < sizeArray) {
				System.out.println("Вірний ввід");
				again = false;
				measurement1 = Integer.parseInt(chois);
			} else {
				System.out.println("Невірний ввід");
			}
				
			if(!again) {	
				System.out.println
					("     Введіть номер обєкту, для копіювання в цілий масив, Вимір 2 від 0 до "+ (sizeArray2-1));
				chois = sc.next();
				if(Integer.parseInt(chois) < sizeArray2) {
					System.out.println("Вірний ввід");
					again = false;
					measurement2 = Integer.parseInt(chois);
					Integer copyHorsepowerCar = ArrayCar[measurement1][measurement2].getHorsepower();
					Integer copyProducedCar = ArrayCar[measurement1][measurement2].getProduced();
					Integer copySizeHelm = ArrayCar[measurement1][measurement2].helm.getSize();
					String copyMaterialHelm = ArrayCar[measurement1][measurement2].helm.getMaterial();
					Integer copyCylinderEngine = ArrayCar[measurement1][measurement2].engine.getCylinder();
					//fill										
					for (Car [] row : ArrayCar)		
						Arrays.fill(row, new Car(copyHorsepowerCar, copyProducedCar, 
								new Helm(copySizeHelm, copyMaterialHelm), new Engine(copyCylinderEngine)));
					
					System.out.println(Arrays.deepToString(ArrayCar));		
//**************//printArrayCar(sizeArray, sizeArray2, ArrayCar);
				} else {
					System.out.println("Невірний ввід");
					again = true;
				}
			}
		}
	}
	
	public static void menu() {
		System.out.println("        Вивести дані елементів масиву,                            Введіть 1:");
		System.out.println("        Для всіх обєктів даного масиву засетити одинаковий обєкт, Введіть 2:");
	}

}
