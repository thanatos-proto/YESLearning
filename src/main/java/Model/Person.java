package Model;

/**
 * Created by moonwolfzy on 2017-11-25.
 */
public class Person {
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String name, Integer age){
        super();
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
