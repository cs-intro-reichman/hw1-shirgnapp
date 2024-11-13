public class Ascend {
    public static void main(String[] args)
    {
        int lim= Integer.parseInt(args[0]);
        int a= (int)(Math.random()* lim);
        int b= (int)(Math.random() * lim);
        int c= (int)(Math.random()*lim);
        int small, mid, big;
        small= Math.min(a,b);  
        small= Math.min(small, c); 
        big= Math.max(a, b);
        big= Math.max(big, c);
        mid= (a+b+c) - (small+big);
        System.out.println(a+ " "+ b+ " " + c);  
        System.out.println(small + " "+ mid+ " " + big);
    
       

    }
    
}
