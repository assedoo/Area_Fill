package ua.net.assedoo;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: Area_Fill
 * Date: 11/10/13
 * Time: 12:00 PM
 */
public class Main {
    private int[] columns;
    private int volume;

    public static void main(String[] args) {
        Main main = new Main();
        main.setColumns(new int[]{2,0,1});
        main.perform();
        System.out.println(main.getSum());
    }

    public void perform() {
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = columns.length - 1;

        while (left < right) {
            if(columns[left] > leftMax) {
                leftMax = columns[left];
            }
            if(columns[right] > rightMax) {
                rightMax = columns[right];
            }
            if(leftMax >= rightMax) {
                volume += rightMax - columns[right];
                right--;
            } else {
                volume += leftMax - columns[left];
                left++;
            }
        }
    }

    public void setColumns(int[] columns) {
        this.columns = columns;
    }

    public int getSum() {
        return volume;
    }
}
