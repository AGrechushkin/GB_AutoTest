
package com.company;

 class Sotrudnik {
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;
    public Sotrudnik(String name, String position, String email, String number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }
    @Override
    public String toString(){
        return (name+""+position+""+email+""+number+""+number+""+salary+""+age);
    }

    public int getAge(){
        return age;
    }
}