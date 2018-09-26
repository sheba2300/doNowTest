public class doNow {
    public static void main (String args[])
    {
        String str1 = "Lovejava";
        while(str1.length() > 0)
        {
            System.out.println(str1);
            str1 = str1.substring(1,str1.length()-1);
        }
        String str2 = "what?";
        for(int i = 0; i< str2.length(); i++)
        {
            System.out.println(str2);
            str2 = str2.substring(str2.length()-1) + str2.substring(0,str2.length()-1);
        }
    }
}
