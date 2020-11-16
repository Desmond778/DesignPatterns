package org.des.designpatterns.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        long start = System.currentTimeMillis();
        Employees emps = new Employees();
        emps.loadData();
        System.out.println("Initial Creation : " + (System.currentTimeMillis() - start));

        long start2 = System.currentTimeMillis();
        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        System.out.println("Other  Creation : " + (System.currentTimeMillis() - start2));

        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
