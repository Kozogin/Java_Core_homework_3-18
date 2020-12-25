package ua.lviv.lgs.t1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sizeArray = getRandomValueRangeFrom(20, 40);
		int sizeArray2 = getRandomValueRangeFrom(2, 8);
			System.out.println("Розмір масиву " + sizeArray + " x " + sizeArray2);
			
		List<List> listCar = new ArrayList<>();			
		String hemlMaterial;
						
		for(int i = 0; i < sizeArray; i++) {						
			listCar.add(new ArrayList<>());
			
			for(int j = 0; j < sizeArray2; j++) {
				if(getRandomValueRangeFrom(0, 100) > 50) {
					hemlMaterial = "skin";
				} else {
					hemlMaterial = "alcantara";
				}				
				listCar.get(i).add(new Car(getRandomValueRangeFrom(44, 380), 
						getRandomValueRangeFrom(1960, 2020), new Helm(getRandomValueRangeFrom(20, 45), 
						hemlMaterial), new Engine(2*getRandomValueRangeFrom(2, 6))));
			}
		}
								
		while(true) {
			menu();
			String chois = sc.next();
			switch (chois) {
			case "1":				
				printArrayCar(sizeArray, sizeArray2, listCar);
				break;
			case "2":
				changeArrayCar(sizeArray, sizeArray2, listCar);
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
	
	public static void printArrayCar(int sizeArray,int sizeArray2, List<List> listCar) {
				
		for (List<Car> row : listCar) {
		for (Car lCar : row) {							            	
                System.out.println("");               
                System.out.print(lCar);
			}  
        }
		System.out.println("");
	}
	
	public static void changeArrayCar(int sizeArray,int sizeArray2, List<List> listCar){
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
					Integer copyHorsepowerCar = ((Car) listCar.get(measurement1).get(measurement2)).getHorsepower();
					Integer copyProducedCar = ((Car) listCar.get(measurement1).get(measurement2)).getProduced();
					Integer copySizeHelm = ((Car) listCar.get(measurement1).get(measurement2)).helm.getSize();
					String copyMaterialHelm = ((Car) listCar.get(measurement1).get(measurement2)).helm.getMaterial();
					Integer copyCylinderEngine = ((Car) listCar.get(measurement1).get(measurement2)).engine.getCylinder();
										
					listCar.clear();
					List listRow = new ArrayList();
					
					for(int j = 0; j < sizeArray2; j++) {
						listRow.add((new Car(copyHorsepowerCar, copyProducedCar, 
								new Helm(copySizeHelm, copyMaterialHelm), new Engine(copyCylinderEngine))));
					}
						
					for(int i = 0; i < sizeArray; i++) {
						listCar.add(new ArrayList<>());
						listCar.get(i).addAll(listRow);
					}
					listRow.clear();
					
				
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
