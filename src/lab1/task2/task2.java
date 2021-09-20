package lab1.task2;

public class task2 {

    public static void main(String[] args) {

                                                        // 1ST UNIVERSITY
        student student1 = new student();
        student1.mark = 7.45f;
        student1.name = "David B";
        student1.age = 21;

        student student2 = new student();
        student2.mark = 8.25f;
        student2.name = "Kanye W";
        student2.age = 19;

        student student3 = new student();
        student3.mark = 6.00f;
        student3.name = "Albert E";
        student3.age = 21;

        student student4 = new student();
        student4.mark = 9.33f;
        student4.name = "George B";
        student4.age = 21;

        university university1 = new university();
        university1.name = "TTU";
        university1.foundationYear = 1923;
        university1.studentList = new student[]{student1, student2, student3, student4};
        // assign university1 the list of students already created

                                                        // 2ND UNIVERSITY
        // students for 2nd university
        student student5 = new student();
        student5.mark = 4.20f;
        student5.name = "Billie E";
        student5.age = 19;

        student student6 = new student();
        student6.mark = 8.60f;
        student6.name = "Erwin S";
        student6.age = 24;

        student student7 = new student();
        student7.mark = 10.00f;
        student7.name = "Levi A";
        student7.age = 22;

        university university2 = new university();
        university2.name = "Kunren Heidan";
        university2.foundationYear = 1852;
        university2.studentList = new student[]{student5, student6, student7};

                                                    // 3RD UNIVERSITY

        //students for 3rd university
        student student8 = new student();
        student8.mark = 6.66f;
        student8.name = "Ilya R";
        student8.age = 25;

        student student9 = new student();
        student9.mark = 8.66f;
        student9.name = "Meryl S";
        student9.age = 20;

        student student10 = new student();
        student10.mark = 9.00f;
        student10.name = "Tom H";
        student10.age = 23;

        university university3 = new university();
        university3.name = "UVA";
        university3.foundationYear = 1632;
        university3.studentList = new student[]{student8, student9, student10};

                                                    // AVERAGE MARKS

        university[] universityList = {university1, university2, university3};
        float avgMarkGlobal = 0f;

        for (university university : universityList){
            avgMarkGlobal += university.getAverage();
        }

        System.out.println("Average mark of the 3 universities is: " + avgMarkGlobal / universityList.length);
    }

}
