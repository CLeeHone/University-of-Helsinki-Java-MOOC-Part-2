public class Program {
 
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("Hello", "Bonjour");
        dictionary.add("Hello", "Salut");
 
        dictionary.add("Goodbye", "Au revoir");
        dictionary.add("Goodbye", "À bientôt");
        
        System.out.println(dictionary.translate("Hello"));
        System.out.println(dictionary.translate("Goodbye"));
        
        dictionary.remove("Goodbye");
        System.out.println(dictionary.translate("Goodbye"));
    }
}