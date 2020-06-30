import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {

    public static void main(String[] args) throws InvalidObjectException {
        Methods methods = new Methods();

        ArrayList<Employee> employeeList = new ArrayList<>(); // Serializable list
        employeeList.add(new Employee("Alex",0,1500));
        employeeList.add(new Employee("Jack",1,450));
        employeeList.add(new Employee("Kate",2,1000));
        employeeList.add(new Employee("Mike",3,2100));

        Object[] objects = employeeList.toArray();
        methods.serialize(objects);

//        Object[] objects = methods.deserialize(); // deserializable list
//
//        for(Object o: objects){
//            System.out.println(o);
//        }




    }

    private String name;
    private Integer id;
    private Integer salary;

    public Employee(String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getSalary(){
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
