public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getAge() {
        return age;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age



    // MODIFY this method so that the the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak()
    {
        int random = (int) (Math.random() * 3 ) + 1;
        if (random ==1)  {
            return "purrrr";
        }
        return "meow!";
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}