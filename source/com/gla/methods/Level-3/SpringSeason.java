public class SpringSeason {
    public static boolean isSpring(int m,int d){
        return (m==3&&d>=20)||(m==4||m==5)||(m==6&&d<=20);
    }
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        System.out.println(isSpring(m,d)?"Its a Spring Season":"Not a Spring Season");
    }
}