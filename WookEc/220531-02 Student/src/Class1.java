public class Class1 {
	
	
    private Student[] stu = new Student[3];

    public Class1(Student a, Student b, Student c) {
        this.stu[0] = a;
        this.stu[1] = b;
        this.stu[2] = c;
    }

    void setStu(int n, String s,int k, int e, int m) {
        stu[n].setName(s);
        stu[n].setKor(k);
        stu[n].setEng(e);
        stu[n].setMath(m);
    }

    public int avgAll() {
        System.out.println("총 평균점수");
        int sum = stu[0].getAverage() + stu[1].getAverage() + stu[2].getAverage();
        return (sum / 3);
    }

    void printName() {
        System.out.println("----------------------");
        System.out.println("1반 학생의 이름");
        for (Student student : stu) {
            System.out.println(String.format("%s  ", student.getName()));
        }
        System.out.println("----------------------");
    }

    void printAvg() {
        System.out.println("----------------------");
        System.out.println("1반 학생 각각의 평균(이름순)");
        for (Student student : stu) {
            System.out.println(String.format("%s  ",student.getAverage()));
        }
        System.out.println("----------------------");
    }

    void printPotg() {
        System.out.println("----------------------");
        System.out.println("potg");
        if (stu[0].getAverage() >= stu[1].getAverage() && stu[0].getAverage() >= stu[2].getAverage()) {
            System.out.println(String.format("%s  %d", stu[0].getName(), stu[0].getAverage()));
        }
        else if (stu[1].getAverage() >= stu[2].getAverage()) {
            System.out.println(String.format("%s  %d", stu[1].getName(), stu[1].getAverage()));
        }
        else {
            System.out.println(String.format("%s  %d", stu[2].getName(), stu[2].getAverage()));
        }
        System.out.println("----------------------");
    }
}
