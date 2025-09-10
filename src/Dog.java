/**
 * Represents a basic dog.
 */
public class Dog {
    private String speech = "Woof!";
    private String name = "Clayton";

    /**
     * Dog retrieves specified object
     * @param thing what was thrown to the dog
     * @return the object picked up by the dog
     */
    public Object fetch(Object thing){
        return thing;
    }


    /**
     * Prints the dog's speech to the console.
     */
    public void speak(){
        System.out.println(speech);
    }
}