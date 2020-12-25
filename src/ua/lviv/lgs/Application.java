package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, 
				InstantiationException, IllegalAccessException, IllegalArgumentException, 
				InvocationTargetException, NoSuchFieldException {
		
		//get name of class
		Class<Foto> fc = Foto.class;
			System.out.println("Name class full -- " + fc);
		String simpleName = fc.getSimpleName();
			System.out.println("Name class -- " + simpleName);
			
		//get modifier
			int modifier = fc.getModifiers();
			String modifierString = Modifier.toString(modifier);
				System.out.println("modifier class int -- " + modifier + " modifier String -- " + modifierString);
			
				System.out.println("Class is Public   --- " + Modifier.isPublic(modifier));
				System.out.println("Class is Static   --- " + Modifier.isStatic(modifier));
				System.out.println("Class is Private  --- " + Modifier.isPrivate(modifier));
				System.out.println("Class is Abstract --- " + Modifier.isAbstract(modifier));
			
			Package classPackage = fc.getPackage();
				System.out.println("Class in -- " + classPackage);
				
		//getsuperclass
				Class superclass = fc.getSuperclass();
					System.out.println("Class Extends -- " + superclass);
					
			System.out.println();		
		//getinterfaces
				Class [] interfaces = fc.getInterfaces();										
					System.out.println(Arrays.toString(interfaces));
					System.out.println();
					
		//getConstractor
			Constructor<Foto> [] fotoConstructor = (Constructor<Foto>[]) fc.getConstructors();
				for (Constructor<Foto> constructor : fotoConstructor) {
					System.out.println(constructor);
				}
					System.out.println("constructor count -- " + fotoConstructor.length);
					
		//get parametr type of constructor
					System.out.println("         Parametr constructor");
			Constructor<Foto> constructor = fotoConstructor[0];
			Class<?>[] typeParameters = constructor.getParameterTypes();
				for (Class<?> class1 : typeParameters) {
					System.out.println(class1);
				}		
					System.out.println();
					
		//get constractor by parameters
			Constructor<Foto> constractorByParameters = 
								fc.getConstructor(String.class, String.class, int.class, int.class);
				System.out.println(constractorByParameters);
	
			Foto newInstance = constractorByParameters.newInstance("Nature", "nature.jpg", 380, 250);
			Foto newInstance2 = constractorByParameters.newInstance("People", "people.jpg", 480, 350);
				System.out.println(newInstance);
				System.out.println(newInstance2);
				System.out.println();
					
		// get fields
				System.out.println("          public field");
			Field [] fields = fc.getFields();		
			for (Field field : fields) {
				System.out.println(field);
			}	
				
				System.out.println("             all field");		
			fields = fc.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);
			}

		// set field
			Field nameField = fc.getField("name");
			nameField.set(newInstance, "Sity");
				System.out.println(newInstance);
	
			Field privateHrefField = fields[1];
			privateHrefField.setAccessible(true);
			privateHrefField.set(newInstance, "sity.bmp");
				System.out.println(newInstance.getHref());
				System.out.println(newInstance);
				System.out.println();
		
		//get methods
			Method [] methods = fc.getMethods();
			int numberMethod = 0;
			for (Method method : methods) {
				System.out.println(numberMethod + " - " + method);				
				numberMethod++;
			}
			
				System.out.println();			
			methods[9].invoke(newInstance, "shops.png");
				System.out.println(newInstance);
			methods[6].invoke(newInstance, "Shops");
				System.out.println(newInstance);
			
			
			methods[7].invoke(newInstance2, "Food", "Food", 500, 500);			
			System.out.println(newInstance2);
		
	}

}
