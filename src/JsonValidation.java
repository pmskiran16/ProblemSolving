import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JsonValidation {

	final static private Gson gson = new Gson();
	
	public String removeUserPII(String result, Class classType) {
		
		System.out.println("Login Result :: "+result);
		Gson gson = new Gson();
		Object currentObj = gson.fromJson(result.toString(), classType);
		
		for(Field field : classType.getDeclaredFields()) {			
			if(field.isAnnotationPresent(UserPIIdata.class)) {
				try {
					if(Modifier.isPrivate(field.getModifiers())) {
						field.setAccessible(true);
					}
					
					System.out.println("Class type :: "+field.getType());
					
					if(field.getType().equals(String.class)) {
						
						field.set(currentObj, "");	
					} else if(field.getType().equals(List.class)) {

						List list = (List) field.get(currentObj);
						List copyList = new ArrayList<>();
						System.out.println("List size :: "+list.size());
						
						for(int i=0; i<list.size(); i++) {
							System.out.println("Class type :: "+list.get(i).getClass());
							String objJson = gson.toJson(currentObj, classType);
							objJson = removeUserPII(objJson, list.get(i).getClass());
							System.out.println("Object Index :: "+i);
							copyList.add(i, gson.fromJson(objJson, list.get(i).getClass()));
						}
												
						System.out.println("List :: "+copyList);
						field.set(currentObj, copyList);
					}		
					
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Final ::"+ gson.toJson(currentObj));
		return gson.toJson(currentObj);
	}
	
	public static void main(String args[]) {
		JsonValidation obj = new JsonValidation();
		
		DigiSTLoginResponse digiSTLoginResponse = new DigiSTLoginResponse();
		digiSTLoginResponse.setDaysCount("10");
		
		DigiSTLoginResponse.EmailDetl emailDetl_1 = new DigiSTLoginResponse.EmailDetl();
		emailDetl_1.setEmailAddr("email1@dbs.com");
		DigiSTLoginResponse.EmailDetl emailDetl_2 = new DigiSTLoginResponse.EmailDetl();
		emailDetl_2.setEmailAddr("email2@dbs.com");
		List<DigiSTLoginResponse.EmailDetl> emailList = new ArrayList<>();
		emailList.add(emailDetl_1);
		emailList.add(emailDetl_2);
		
		digiSTLoginResponse.setEmailDetl(emailList);
		
		String resString = gson.toJson(digiSTLoginResponse, DigiSTLoginResponse.class);
		
		System.out.println("resString :: "+resString);
		
		obj.removeUserPII(resString, digiSTLoginResponse.getClass());
		
	}
	
}
