package model;

public class Student {

    private String name;
    private int m1, m2, m3, m4;
    private int total;
    private double average;
    private String grade;

    public Student(String name, int m1, int m2, int m3, int m4) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;

        this.total = m1 + m2 + m3 + m4;
        this.average = total / 4.0;

        this.grade = (average >= 90) ? "A+" :
                     (average >= 75) ? "A" :
                     (average >= 60) ? "B" :
                     (average >= 50) ? "C" : "Fail";
    }

    // 👇 Add these methods RIGHT HERE

    public String getName() { return name; }

    public int getM1() { return m1; }
    public int getM2() { return m2; }
    public int getM3() { return m3; }
    public int getM4() { return m4; }

    public int getTotal() { return total; }
    public double getAverage() { return average; }
    public String getGrade() { return grade; }

} // 👈 keep this closing brace — don’t put methods after this
