package corejava;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by nat on 2014/03/26.
 */
public class Hierarchy
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("e1", 100);
        Manager manager1= new Manager("m1", 200, 100);

        try
        {
            Manager manager2 = Manager.class.getConstructor(String.class, double.class, double.class).newInstance("m2", 150, 50);
            System.out.println(manager2);
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        } catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        } catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }

        System.out.println(employee1);
        System.out.println(manager1);
    }

    private static class Employee
    {
        private String name;
        private double baseSalary;

        private Employee(String name, double baseSalary)
        {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        @Override
        public String toString()
        {
            return this.getClass().getName() + "{" +
                    "name='" + name + '\'' +
                    ", baseSalary=" + baseSalary +
                    '}';
        }
    }

    private static class Manager extends Employee
    {
        private double bonus;

        public Manager(String name, double baseSalary, double bonus)
        {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public String toString()
        {
            return super.toString() + "{bonus=" + bonus +'}';
        }
    }
}
