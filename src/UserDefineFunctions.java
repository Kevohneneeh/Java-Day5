public class UserDefineFunctions {
    public static void main(String[] args) {
        System.out.println(motto());
        System.out.println(motto());
        System.out.println(average(45,90,76));
        System.out.println(ongeza(45,65,32));
    }
    public static String motto(){
        String moto = "Hello this is the motto";
        return moto;
    }
    public static double average(double a,double b,double c){
        double answer = (a+b+c)/3.0;
        return answer;
    }
    public static Integer ongeza(int a,int b,int c){
        int jibu = a+b+c;
        return jibu;
    }
}
