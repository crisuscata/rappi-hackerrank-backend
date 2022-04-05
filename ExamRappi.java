package rappi;



public class ExamRappi {

	public static void main(String[] args) {


		System.out.println(Encrypter.getEncryptedName("Kate0 Winslet"));
		

	}

}


class Encrypter{
    public static String getEncryptedName(String name){
    	Validator utilValidator = new Validator();
        boolean isNameValid = utilValidator.validate(name);
        if(isNameValid) {
        	return reverseString(name);
        } else {
        	throw new IllegalArgumentException("Try again with valid name");
        }
    }
    
    public static String reverseString(String strValue){  
	    char chInspected[]=strValue.toLowerCase().toCharArray();  
	    String strValueReverse="";  
	    for(int i=chInspected.length-1;i>=0;i--){  
	    	strValueReverse += chInspected[i];  
	    }  
	    return strValueReverse;  
	}  
    
}


class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        
        return true;
    }
}