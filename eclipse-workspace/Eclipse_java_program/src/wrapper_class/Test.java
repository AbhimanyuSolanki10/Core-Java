package wrapper_class;

public class Test {

	public static void checkData(Object o) {
		if(o instanceof String) {
			System.out.println("This is String Data");
			String s=(String)o;
			System.out.println("Length is: " + ((String)o).length());
		}else if(o instanceof Integer) {
			System.out.println("This is Integer data");
			System.out.println(o + "+" + 100 + "= " + (((Integer)o)+100));
		}else if(o instanceof Double) {
			System.out.println("This is Double data");
			System.out.println(o+"+"+100+"= "+(((Double)o)+100));
		}
		else if(o instanceof Character) {
			System.out.println("This is Character data");
			Character x= (Character)o;
			System.out.println(o+"+"+100+"= "+(x+100));
		}
		else if(o instanceof Boolean) {
			System.out.println("This is Boolean data");
			Boolean p=(Boolean)o;
			System.out.println(p);
		}
	}

}
