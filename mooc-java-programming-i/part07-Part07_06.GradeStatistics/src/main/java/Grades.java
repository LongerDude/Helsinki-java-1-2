
import static java.lang.Math.round;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author salma
 */
public class Grades {

    private ArrayList<Integer> gradeList;

    public void distribution() {
        int[] array = new int[6];
        for (int points : this.gradeList) {
            if (points < 50) {
                array[0] += 1;
                continue;
            }
            if (points < 60) {
                array[1] += 1;
                continue;
            }
            if (points < 70) {
                array[2] += 1;
                continue;
            }
            if (points < 80) {
                array[3] += 1;
                continue;
            }
            if (points < 90) {
                array[4] += 1;
                continue;
            }
            if (points >= 90) {
                array[5] += 1;
            }

        }
        for (int i = 5; i >= 0; i--) {
            String star = "*";
            String repeated = star.repeat(array[i]);
            System.out.println(i + ": " + repeated);

        }
    }

    public Grades() {
        this.gradeList = new ArrayList<>();
    }

    public void add(int points) {
        if (points > 100 || points < 0) {
            return;
        }
        this.gradeList.add(points);

    }

    public double average() {
        int sum = 0;
        int count = 0;
        for (int points : this.gradeList) {
            if (points > 0) {
                sum += points;
                count++;
            }

        }
        return round((float) sum / count);

    }

    public double averagePassing() {
        int sum = 0;
        int count = 0;
        for (int points : this.gradeList) {
            if (points >= 50) {
                sum += points;
                count++;
            }
        }
        return round((float) sum / count);
    }

    public double passPercentage() {
        int passed = 0;
        for (int points : this.gradeList) {
            if (points >= 50) {
                passed++;
            }
        }
        return (float) 100 * passed / this.gradeList.size();

    }

}
