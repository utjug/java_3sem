import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private Integer age;
    private Double averageScore;

    Student(String name1, Integer age1, Double averageScore1) {
        this.name = name1;
        this.age = age1;
        this.averageScore = averageScore1;
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Double getAverageScore() {
        return averageScore;
    }
}
public class CW4_1 {

    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<Student>();

        String ans = "y";

        while (!ans.equals("n")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите данные о студенте: \nИмя:\n");
            String name = reader.readLine();
            System.out.print("Возраст: \n");
            Integer age = Integer.parseInt(reader.readLine());
            System.out.print("Средняя успеваемость: \n");
            Double averageScore = Double.parseDouble(reader.readLine());

            studentList.add(new Student(name, age, averageScore));
            System.out.println("Продолжить? (y/n)\n");

            do {
                ans = reader.readLine();
                if (!ans.equals("y") && !ans.equals("n"))   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }

        Student highestScoreStudent = new Student("test",0,-1.0);
        for (Student s: studentList) {
            if (s.getAverageScore() > highestScoreStudent.getAverageScore()) {
                highestScoreStudent = s;
            }
        }

        System.out.println(highestScoreStudent.getName() + " " + highestScoreStudent.getAge() + " " + highestScoreStudent.getAverageScore());
    }

}
