/*
 * Shannon Duvall and <You>
 * This object does basic reflection functions
 */
import java.lang.reflect.*;

public class ReflectionUtilities {
	
	/* Given a class and an object, tell whether or not the object represents 
	 * either an int or an Integer, and the class is also either int or Integer.
	 * This is really yucky, but the reflection things we need like Class.isInstance(arg)
	 * just don't work when the arg is a primitive.  Luckily, we're only worrying with ints.
	 * This method works - don't change it.
	*/

	private static boolean typesMatchInts(Class<?> maybeIntClass, Object maybeIntObj){
		System.out.println("I'm checking on "+ maybeIntObj);
		System.out.println(maybeIntObj.getClass());
		try{
			return (maybeIntClass == int.class) &&
				(int.class.isAssignableFrom(maybeIntObj.getClass()) || 
						maybeIntObj.getClass()==Class.forName("java.lang.Integer"));
		}
		catch(ClassNotFoundException e){
			return false;
		}
	}
	
	/*
	 * TODO: typesMatch
	 * Takes an array of Classes and an array of Objects and tells whether or not 
	 * the object is an instance of the associated class, and that the two arrays are the
	 * same length.  For objects, the isInstance method makes this easy.  For ints, use the method I 
	 * provided above.  
	 */

	public static boolean typesMatch (Class<?>[] formals, Object[] actuals)
	{
		// if the formals length is not equal to the actuals length, 
		if (formals.length != actuals.length) {

			// return false
			return false;
		}

		// starting at 0 for each element in the formals array incrementing by 1
		for (int i = 0; i < formals.length; i++) {

			// if the formals array is equal to int.class primitive type
			if (formals[i] == int.class) {

				// if the formals array index is not equal to the actuals array index
				if (!typesMatchInts(formals[i], actuals[i])) {

					// return false
					return false;
				}
			
			// else if the formals array is not equal to int.class primitive type then 
			} else {

				// if the formals array index is not equal to the actuals array
				if (!formals[i].isInstance(actuals[i])) {

					// return false
					return false;
				}
			}
		}

		// return true if the actuals array is an instance of the formals array
		return true;

	}
	
	
	/*
	 * TODO: createInstance
	 * Given String representing fully qualified name of a class and the
	 * actual parameters, returns initialized instance of the corresponding 
	 * class using matching constructor.  
	 * You need to use typeMatch to do this correctly.  Use the class to 
	 * get all the Constructors, then check each one to see if the types of the
	 * constructor parameters match the actual parameters given.
	 */
	public static Object createInstance (String name, Object[] args)
	{


		// create a class object
		Class<?> c = null;

		// try to create a class object
		try {

			// set the class object to the class of the name parameter
			c = Class.forName(name);

			// get the constructors of the target class
			Constructor<?>[] constructors = c.getConstructors();

			// for each constructor in the constructors array
			for(int i = 0; i < constructors.length; i++) {

				
				// if the typesMatch method is true
				if (typesMatch(constructors[i].getParameterTypes(), args)) {

					// return the constructor
					return constructors[i].newInstance(args);

					
				}
			}

		// catch the exception
		} catch (Exception e) {

			// print the stack trace
			return false;

		}

		// return null
		return null;
	}
	
	/*
	 * TODO: callMethod
	 * Given a target object with a method of the given name that takes 
	 * the given actual parameters, call the named method on that object 
	 * and return the result. 
	 * 
	 * If the method's return type is void, null is returned.
	 * 
	 * Again, to do this correctly, you should get a list of the object's 
	 * methods that match the method name you are given.  Then check each one to 
	 * see which has formal parameters to match the actual parameters given.  When
	 * you find one that matches, invoke it.
	 */

	public static Object callMethod (Object target, String name, Object[] args)
	{
		
		try {

			// get the class of the target object
			Class<?> targetClass = target.getClass();

			// get the methods of the target object
			Method[] methods = targetClass.getMethods();

			// for each method in the methods array
			for (Method method : methods) {

				// if the method name is equal to the name parameter
				if (method.getName().equals(name)) {

					// get the formal parameters of the method
					Class<?>[] formalParameter = method.getParameterTypes();

					// if the typesMatch method is true matching the formal parameters and the args
					if (typesMatch(formalParameter, args)) {

							// return once found  
							return method.invoke(target, args);
					}
				}
			}
		}

		// catch the exception
		catch (Exception e) {

			// print the stack trace
			e.printStackTrace();
		}

		// return null
		return null;
	}
	
}
