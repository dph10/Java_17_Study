    
public class OperatorEvaluationEx1 {	
	public static void main(String[] args)
    {
        int a = 5;
        int i = ++a + ++a + a--; // (++a) + (++a) + (a--) = 6+7+7, 8=>a
        System.out.println(a);  // outputs 6
        System.out.println(i);  // outputs 20
        
        a=5;
        i = a-- + ++a + ++a;    // (a--) + (++a) + (++a) = (5, 4=>a)+(5)+(6)=16
        System.out.println(a);  // outputs 16
        System.out.println(i);  // outputs 6
        
        a=5;
        i = ++a + a-- + ++a;    // (++a)+(a--)+(++a) = (6)+(6, 5=>a)+(6)=18
        System.out.println(a);  // outputs 6
        System.out.println(i);  // outputs 18
        
        int r=7;
        boolean r1 = r == r++;  // r1=(r==(r++)) r1=true, r=8
        boolean r2 = r++ == r;  // r2=((r++)==r) r2=false, r=9
        System.out.println(r1); // outputs true
        System.out.println(r2); // outputs false
        System.out.println(r);  // outputs 9
        
        int c = 10;
        System.out.println(++c * c--); // (++c) *(c--) = (11)*(11, 10=>c), outputs 121, c=10
        System.out.println(c-- * ++c); // (c--)*(++c) = (10, 9=>r)*(10), outputs 100, c=10
    }
}