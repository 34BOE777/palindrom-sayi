public class cu{

 static void palindrom(int sayi){
    int yedek=sayi;
    int a=0;
    int son;
    while(sayi!=0){
        son=sayi%10;
        a=a*10+son;
        sayi=sayi/10;
    }
if(a==yedek){
    System.out.println("sayı palindromdur");
}
else System.out.println("sayı palindrom değildir");
 }

    public static void main(String[] args) {
        palindrom(1991);
    }
}
