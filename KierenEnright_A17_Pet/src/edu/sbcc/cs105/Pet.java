package edu.sbcc.cs105;

public class Pet {

    protected String name;
    protected int age;

    /**
     * 
     * @param userName used to assign to protected variable name
     */
    public void setName(String userName) {
        name = userName;
    }

    /**
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param userAge used to assign to protected variable age
     */
    public void setAge(int userAge) {
        age = userAge;
    }

    /**
     * 
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Prints pet info
     */
    public void printInfo() {
        System.out.println("Pet Information: ");
        System.out.println("   Name: " + name);
        System.out.println("   Age: " + age);
    }
}
