package lab1.task2;

public class university {
    String name;
    int foundationYear;
    float avgMark;
    student[] studentList;

    public float getAverage(){
        avgMark = 0;
        for (student student : studentList){
            avgMark += student.mark;
        }

        return avgMark / studentList.length;
    }
}
