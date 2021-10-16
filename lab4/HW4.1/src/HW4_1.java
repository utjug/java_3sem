import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Planets {
    private Double distanceToSun;
    private Double mass;
    private Double diameter;

    Planets(Double distanceToSun, Double mass, Double diameter) {
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }

    public void setDistanceToSun(Double dist) {
        distanceToSun = dist;
    }
    public void setMass(Double m) {
        mass = m;
    }
    public void setDiameter(Double d) {
        diameter = d;
    }

    public Double getDistanceToSun() {
        return distanceToSun;
    }

    public Double getMass() {
        return mass;
    }

    public Double getDiameter() {
        return diameter;
    }
}

public class HW4_1 {

    public static void main(String[] args) throws IOException {
        Map<String, Planets> planetsMap = new HashMap<String, Planets>();
        planetsMap.put("Меркурий", new Planets(1.1,1.2,1.3));
        planetsMap.put("Венера", new Planets(2.1,2.2,2.3));
        planetsMap.put("Земля", new Planets(3.1,3.2,3.3));
        planetsMap.put("Марс", new Planets(4.1,4.2,4.3));
        planetsMap.put("Юпитер", new Planets(5.1,5.2,5.3));
        planetsMap.put("Сатурн", new Planets(6.1,6.2,6.3));
        planetsMap.put("Уран", new Planets(7.1,7.2,7.3));
        planetsMap.put("Нептун", new Planets(8.1,8.2,8.3));

        String ans = "y";
        while (!ans.equals("n")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите название планеты:\n");
            String name = reader.readLine();
            if (planetsMap.containsKey(name)) {
                Planets planet = planetsMap.get(name);
                System.out.println(planet.getDistanceToSun()+" "+ planet.getMass()+" "+planet.getDiameter());
                System.out.println("Продолжить? (y/n)\n");
            } else
                {
                    System.out.println("Такой планеты нет в мапе");
                    continue;
                }


            do {
                ans = reader.readLine();
                if (!ans.equals("y") && !ans.equals("n"))   {
                    System.out.println("Некорректный запрос\nПродолжить? (y/n)\n");
                }
            } while (!ans.equals("y") && !ans.equals("n"));
        }
    }
}
