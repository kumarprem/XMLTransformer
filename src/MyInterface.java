
public interface MyInterface {

	
	default String getName(String name){
		return "Hello " +name;
	}
}
