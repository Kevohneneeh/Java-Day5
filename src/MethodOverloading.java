public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(average(34.4,23.4,55.2));
        System.out.println(average(44,54,55));
    }
    public static double average(double a,double b,double c){
        double answer =(a+b+c)/3.0;
        return answer;
    }
    public static Integer average(int a,int b,int c){
        int answer = (a+b+c)/3;
        return answer;
    }
}
