package coreConcepts.Question4;

/**
 * Created by gaurav on 15/3/17.
 */
public class Question4 {
    public static void main(String[] args) {
        String sourceString = "abcdABCDe@!@#$";

        String lowerCaseLetters = getLowerCaseLetters(sourceString);
        String upperCaseLetters = getUpperCaseLetters(sourceString);
        String specialCharacters = getSpecialCaseLetters(sourceString);

        System.out.println("Source String: "+sourceString);

        System.out.println("lowerCaseLetters("+lowerCaseLetters+"): number of letters: " + lowerCaseLetters.length()+" and percentage:" + ((lowerCaseLetters.length()/sourceString.length())*100));
        System.out.println("upperCaseLetters("+upperCaseLetters+"): number of letters: " + upperCaseLetters.length()+" and percentage:" + ((upperCaseLetters.length()/sourceString.length())*100));
        System.out.println("specialCharacters("+specialCharacters+"): number of letters: " + specialCharacters.length()+" and percentage:" + ((specialCharacters.length()/sourceString.length())*100));

    }

    public static String getLowerCaseLetters(String sourceString){
        String patternLowerCase = "[A-ZA@!#$ ]";
        return sourceString.replaceAll(patternLowerCase, "");
    }

    public static String getUpperCaseLetters(String sourceString){
        String patternUpperCase = "[a-z@!#$ ]";
        return sourceString.replaceAll(patternUpperCase, "");
    }

    public static String getSpecialCaseLetters(String sourceString){
        String patternSpclChars = "[a-zA-Z]";
        return sourceString.replaceAll(patternSpclChars, "");
    }
}
