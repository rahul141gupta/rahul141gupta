package org.example;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {



        /*prime number */
//        int num = 20;  // Define the upper limit
//        int count;  // Initialize counter for divisibility checks
//
//        // Iterate from 1 up to 'num' to identify prime numbers
//        for (int i = 3; i <= num; i++) {
//            count = 0;  // Reset counter for each 'i'
//
//            // Check for divisibility from 2 up to i/2
//            for (int j = 2; j <= i / 2; j++) {
//                if (i % j == 0) {
//                    count++;  // Increment if 'i' is divisible by 'j'
//                    break;  // Exit loop if a divisor is found
//                }
//            }
//
//            // If the count is 0, 'i' is prime
//            if (count == 0) {
//                System.out.println(i);  // Output the prime number
//            }
//        }



        /* Replace the specific word */
//    String str1 = "tomorrow";
//    char ch='$';
//    String str2 =str1.substring(0,3)+ch+str1.substring(4,8);
//    System.out.println("Output="+str2);













//int[] ar1={20,10,30,40,50};
//int temp;
//for(int i =0; i<ar1.length;i++)
//{
//    for(int j=i+1;j<ar1.length;j++)
//    {
//        if(ar1[i]>ar1[j])
//        {temp = ar1[i];
//            ar1[i]=ar1[j];
//            ar1[j]=temp;
//
//        }
//    }
//}
//       for (int i=0 ;i<ar1.length;i++)
//       {System.out.println("Output="+ar1[i]);
//    }}
//    }
//}








//        String str = "tomorrow";
//        int i = str.indexOf("o");
//        if (i == 3) {
//            str.replace("o", "$");
//        }
//        System.out.println("output=" + str);
//    }
//}
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int j = 2; j <= n; j++)
        {
            counter =0 ;
            for (int i = 1; i < j; i++)
            {
                if (j % i == 0)
                    counter++;
                       break;
            }
            if (counter == 2)
            {
                System.out.print("Number is prime number" + j);
            }
        }
    }
}


//        String str1 = "My name is Rahul";
//        char[] ch1=str1.toCharArray();
//        HashMap<Character,Integer> hm= new HashMap<>();
//        for(char ch2:ch1){
//
//            if(hm.containsKey(ch2))
//            {
//                hm.put(ch2,hm.get(ch2)+1);
//            }else
//            {
//                hm.put(ch2,1);
//            }
//        }
//       int maxcount=0;
//        char maxcharacter='a';
//        for(Map.Entry<Character,Integer> hm1 :hm.entrySet())
//        {
//            if(maxcount<hm1.getValue())
//            {
//                maxcount=hm1.getValue();
//                maxcharacter=hm1.getKey();
//            }
//        }
//        System.out.print(+maxcount"+"maxcharacter);
//    }
//}


//    public static void main(String[] args) {
//    String s1="a1b2c3";
//    for (int i =0; i< s1.length();i++)
//    {
//        if(Character.isAlphabetic(s1.charAt(i)))
//        {
//            System.out.println(s1.charAt(i));
//        }else {
//            int x= Character.getNumericValue(s1.charAt(i));
//            for(int j=1;j<x;j++)
//            {
//                System.out.println(s1.charAt(i-1));
//            }
//        }
//    }


//        int counter = 0;
//        for (int j = 2; j < 100; j++) {
//            counter = 0;
//            for (int i = 1; i < j; i++) {
//                if (j % i == 0) {
//                    counter++;
//                }
//
//            }
//            if (counter == 2) {
//                System.out.println("prime number" + j);
//            }
//        }
//    }
//}

//        HashMap<String,Integer> hm = new HashMap<>();
//        {
//            hm.put("Rahul",1);
//            hm.put("Gupta",2);
//            hm.put("Pnakaj",3);
//            hm.put("Gupta",4);
//        }
////        System.out.print(hm);
//        for(Map.Entry<String,Integer> map : hm.entrySet())
//        {
//            System.out.print("output="+map.getKey()+map.getValue());
//        }
//
//    }
//    }

//        int ar1[] = {10, 20, 30, 40, 50};
//        int i, j, temp;
//        for (i = 0; i < ar1.length-1; i++) {
//            for (j = i + 1; j < ar1.length; j++) {
//                if (ar1[i] < ar1[j + 1]) {
//                    temp = ar1[i];
//                    ar1[i] = ar1[j];
//                    ar1[j] = temp;
//                }
//            }
//        }
//        System.out.print("Smallest number=" + ar1[0]);
//    }
//}

//        String s1="Mynameisrahul";
//         char[] ch = s1.toCharArray();
//
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(char ch1 : ch)
//         {
//             if (hm.containsKey(ch1))
//             {
//                 hm.put(ch1,hm.get(ch1)+1);
//             }else
//             {
//                 hm.put(ch1,1);
//             }
//         }
////           System.out.print(hm);
//        int count=0;
//        char Maxcharacter='a';
//         for(Map.Entry<Character,Integer> map:hm.entrySet())
//         {
////             System.out.println("Output="+map.getKey()+"value:"+map.getValue());
//             if(count<map.getValue())
//             {
//                 count=map.getValue();
//                 Maxcharacter=map.getKey();
//             }
//         }
//         System.out.print("count="+count+"maxcharacter"+Maxcharacter);
//    }
//}

//        String s1 = "abcdefghabcdefgha";
//        char ans;
//        int cnt = 0;
//        char[] c1 = s1.toCharArray();
//        HashMap<Character, Integer> hm = new HashMap<>();
//        for (char s2 : c1) {
//            if (hm.containsKey(s2)) {
//                hm.put(s2, hm.get(s2) + 1);
//            } else {
//                hm.put(s2, 1);
//            }
//        }
//        int max = 0;
//        //setting to a by default
//        char maxCharacter = 'a';
//
//        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
////            System.out.println("Key = " + entry.getKey() + ": Value " + entry.getValue());
//            if (max < entry.getValue()) {
//                max = entry.getValue();
//                maxCharacter = entry.getKey();
//            }
//        }
//
//        System.out.println("Max Character = " + maxCharacter + " Max Count : " + max);
//    }
//}

//        int[] ar1 = {10, 20, 30, 0, 0, 40, 50};
//        int[] ar2 = new int[ar1.length];
//        int count = 0;
//        for (int i = 0; i < ar1.length; i++) {
//            if (ar1[i] != 0) {
//                ar2[count] = ar1[i];
//                count++;
//            }
//        }
//        System.out.println("output string=" + Arrays.toString(ar2));
//    }
//}

//        int[] ar1 = {10, 20, 0, 9, 0, 0};
//        int[] ar2 = new int[ar1.length];
//        int count = 0;
//        int i;
//        for (i = 0; i < ar1.length; i++) {
//            if (ar1[i] != 0) {
//                ar2[count++] = ar1[i];
//            }
//        }
//        System.out.print(Arrays.toString(ar2));



//
//
//    }
//}




//      String s1="!!!!123456abcABC";
//      String s2=s1.replaceAll("[^A-Za-z0-9]","");
//      System.out.print("Output ="+s2);



//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Required packages have been imported");
//                System.out.println("A reader object has been defined ");
//                System.out.print("Enter the n value : ");
//                int n=scanner.nextInt();
//                int counter=0;
//                System.out.print("Prime numbers between 1 to 10 are ");
//                for(int j=2;j<=n;j++){
//                    counter=0;
//                    for(int i=1;i<=j;i++){
//                        if(j%i==0){
//                            counter++;
//                        }
//                    }
//                    if(counter==2)
//                        System.out.print(j+" ");
//                }
//            }
//        }






//
//     Scanner sc = new Scanner(System.in);
//     String str1=sc.nextLine();
//     int i=0 ; int j=0;int k=0; int l=0;int m=0;
//     String s2="";
//     for(i=0; i<str1.length()-1;i++)
//     {
//         for (j=i+1;j<str1.length()-1;j++)
//     {
//         s2=str1.substring(i,j);
//         k=s2.length();
//         ArrayList<Integer> ar=new ArrayList<>();
//         ar.add(k);
//         System.out.print(k);
//     }
//     }












//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int number1;
//        int reverse = 0;
//        while (number > 0) {
//            number1 = number % 10;
//            reverse = (reverse * 10) + number1;
//            number = number / 10;
//        }
//        System.out.print(reverse);
//    }
//}










//        int[] ar1={10,20,0,0,30};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        for (int i=0;i <= ar1.length-1;i++)
//        if(ar1[i]!=0)
//        {
//            ar2[count]=ar1[i];
//            count++;
//        }
//        System.out.print(Arrays.toString(ar2));

//        HashMap<Character,Integer> hm = new HashMap<>();
//        String s1= "My name is Rahul gupta";
//        for (int i =0;i<s1.length();i++)
//        {
//           char s2= s1.charAt(i);
//           if (hm.containsKey(s2))
//           {
//               hm.put(s2,hm.get(s2+1));
//           }else
//           {
//               hm.put(s2,1);
//           }
//        }
//        System.out.print(hm);
//        String[] s1={"rahul","gupta","rahul","sahil"};
//        HashMap<String,Integer> hs=new HashMap<>();
//        for (String s2 :s1)
//        {
//            if (hs.containsKey(s1))
//            {
//                hs.put(s2,hs.get(s2+1));
//            }else
//            {
//                hs.put(s2,1);
//            }
//        }
//        System.out.print("Output"+hs);

//        TreeSet<String> ts = new TreeSet();
//        for (String s2:s1)
//        {
//            ts.add(s2);
//        }
//        System.out.print("Print Charcater="+ts);

//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int r;
//        for(r=2;r<=100;r++)
//        {
//            if(n%r==0)
//            {
//                System.out.print("Number is not prime");
//                break;
//            }
//        }
//        if(n==r) {
//            System.out.print("Number is prime"+n);
//        }
//        String s1="My name is rahul";
//        char ch[]=s1.toCharArray();
//        HashMap<Character,Integer> ch1=new HashMap<>();
//        for (Character c1:ch)
//        {
//            if (ch1.containsKey(c1))
//                ch1.put(c1,ch1.get(c1+1));
//            else
//                ch1.put(c1,1);
//        }
//        System.out.print(ch1);


//        String s1="My name is Rahul Gupta";
//        int s2=s1.length();
//        int c=0;
//        HashSet<Character> c1=new HashSet<>();
//        for (int i=0;i<s2;i++)
//        {
//            c1.add(s1.charAt(i));
//            c=c+1;
//        }
//        System.out.print(c1);
//        System.out.print(c);
//        String s1[]={"Rahul","Gupta","Sahil","Gupta"};
//        TreeSet<String> ts=new TreeSet<>();
//        for (String s2 :s1)
//        {
//            ts.add(s2);
//        }
//        System.out.print(ts);

        /*REVERSE THE STRING*/

//        String s1="My name is rahul";
//        String[] s2=s1.split("/s");
//        String s4="";
//        String s5="";
//        for (String s3 :s2)
//        {
//            for(int i=s3.length()-1;i>0;i--)
//            {
//             s4= s4 + s3.charAt(i);
//            }
//            s5=s4+"";
//            System.out.print("Check the output="+s5);
//        }
//

//
//int ar1[]={10,20,0};
//int ar2[]= new int[ar1.length];
//int count=0;
//for (int i=0;i<ar1.length;i++)
//{
//    if(ar1[i]!=0){
//        ar2[count++]=ar1[i];
//    }
//
//}
//System.out.print(Arrays.toString(ar2));















//        char[] s2 = s1.toCharArray();
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//        for (Character s3 : s2) {
//            if (hm.containsKey(s3))
//            {
//                hm.put(s3, hm.get(s3) + 1);
//            } else
//            {
//                hm.put(s3, 1);
//            }
//        }
//        System.out.print(hm);

//    }
//}




//        int[] ar1={10,20,0,30,40,50,60};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        for(int i=0;i<ar1.length;i++) {
//            if(ar1[i]!=0)
//            {
//                ar2[count++]=ar1[i];
//
//            }
//        }
//        System.out.print(Arrays.toString(ar2));
//        }
//
//
//    }




//        String s1 = "My name is Rahul";
//        String[] s2 = s1.split("/s");
//        String s4 = "";
//        String s5 = "";
//        for (String s3 : s2) {
//            for (int i = s3.length() - 1; i >0; i--) {
//                s4 = s4 + s3.charAt(i);
//            }
//            s5 = s4 + "";
//            System.out.println("String =" + s5);
//
//        }
//    }
//}
//        /* Fibonaci Series*/
//    int a=0;
//    int b=1;
//    int d=0;
//    System.out.println("first character"+a);
//    System.out.println("Secons Character="+b);
//    for(int c=2;c<=100;c++)
//    {
//        d=a+b;
//        System.out.println("d="+d);
//        a=b;
//        b=c;
//    }












//
//        String s1[] = {"a", "e", "i", "a", "e", "i"};
//        HashMap<String, Integer> hm = new HashMap<>();
//        for (String s2 : s1) {
//            if (hm.containsKey(s2)) {
//                hm.put(s2, hm.get(s2) + 1);
//            } else {
//                hm.put(s2, 1);
//            }
//        }
//        System.out.print(hm);
//    }
//}

//        String s1="My name is Rahul";
//        String[] s2=s1.split("/s");
//        String rev="";
//        String s5="";
//        for (String s3:s2) {
//            for (int i = s3.length() - 1; i >= 0; i--) {
//                rev = rev + s3.charAt(i);
//            }
//        }
//        s5=s5+rev;
//        System.out.print(s5);

//    }
//}
//        int[] ar1={10,20,30,0,10,20,30,0,40};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        for(int i=0;i<ar1.length;i++)
//        {
//            if(ar1[i]!=0)
//            {
//                ar2[count]=ar1[i];
//                count++;
//            }
//        }
//        System.out.print(Arrays.toString(ar2));
//    }
//    }

//        Scanner sc1 =new Scanner(System.in);
//        int n= sc1.nextInt();
//        int r;
//        for(r=2;r<=n-1;r++)
//        {
//            if(n%r==0)
//            {
//                System.out.print("Not a prime number");
//                break;
//            }
//        }
//            if (r==n)
//            {
//                System.out.println("Number is prime");
//            }
//                }
//}



//        int[] ar1 = {10, 20, 30, 40, 50, 60, 20, 20};
//        int smallest = ar1[0];
//        int largest = ar1[0];
//        for (int i = 1; i < ar1.length; i++) {
//            if (ar1[i] < smallest) {
//                smallest = ar1[i];
//            } else if (ar1[i] > largest) {
//                largest = ar1[i];
//            }
//        }
//        System.out.print(smallest);
//        System.out.print(largest);
////    }
//    }
//}


//        String[] s1={"Rahul","Gupta","Rahul","Gupta"};
//        HashMap<String,Integer> hm=new HashMap<>();
//        for(String s2:s1)
//        {if (hm.containsKey(s2))
//        {
//            hm.put(s2,hm.get(s2)+1);
//        }
//        else {
//            hm.put(s2,1);
//        }
//        }
//        System.out.print(hm);





//        Scanner sc =new Scanner(System.in);
//        int number=sc.nextInt();
//        int s=1;
//        while(number>0)
//        {
//            s=s*number;
//            number--;
//        }
//System.out.print(s);
//        int[] ar1={20,10,30,40};
//        int i,temp,j=0;
//        for(i=0;i<ar1.length;i++)
//        {
//            for(j=i+1;j<ar1.length;j++)
//        {
//            if(ar1[i]>ar1[j])
//            {
//                temp=ar1[i];
//                ar1[i]=ar1[j];
//                ar1[j]=temp;
//            }
//        }
//        }
//System.out.print(ar1[0]);
//        int[] ar1={10,20,30,40,5,4};
//        int i=0;
//        int n = ar1.length;
//        int second_largest=0;
//        for(i=n-2;i>0;i--)
//        {
//            if(ar1[i]!=ar1[i-1])
//            {
//                second_largest=ar1[i];
//                break;
//            }
//        }
//System.out.print(second_largest);

//        int[] ar1={20,10,10,30,40,50};
//        HashSet<Integer> hm=new HashSet<>();
//        for(int i=0;i<ar1.length;i++)
//        {
//            hm.add(ar1[i]);
//        }
//        System.out.print(hm);

//        int[] ar1={10,20,30,0,56,0};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        for(int i=0;i<ar1.length;i++) {
//            if (ar1[i] != 0) {
//                ar2[count] = ar1[i];
//                count++;
//            }
//        }
//        System.out.print(Arrays.toString(ar2));



//        String[] s1 = {"Rahul", "Gupta", "Rahul","Gupta"};
//        int i, j = 0;
//        for (i = 0; i < s1.length; i++) {
//            for (j = i + 1; j < s1.length; j++) {
//                if (s1[i].equals(s1[j])) {
//                    System.out.print(s1[i]);
//
//                }
//            }
//        }
//    }




//        String s1="My name is Rahul";
//        HashSet<Character> hs=new HashSet<>();
//        for(int i=0;i<s1.length();i++)
//        {
//            hs.add(s1.charAt(i));
//        }
//
//        System.out.print(hs);
//        String s1="My name is Rahul";
//        HashMap<Character,Integer> hm=new HashMap<>();
//        char[] ch=s1.toCharArray();
//        for(Character ch1:ch) {
//            if (hm.containsKey(ch)) {
//                hm.put(ch1,hm.get(ch1)+1);
//            }
//            else
//            {
//                hm.put(ch1,1);
//            }
//        }
//        System.out.print(hm);
//        String s1 ="RahulGupta";
//        char[] ch=s1.toCharArray();
//        int i=0;
//        String rev="";
//        for(i=ch.length-1;i>=0;i--)
//        {
//            rev=rev+ch[i];
//        }
//        System.out.print(rev);
//        String s1="My name is Rahul";
//        String[] s2=s1.split("/s");
//        int i =0;
//        String rev="";
//        String s5;
//        for (String s3:s2) {
//            for(i = s3.length() - 1; i >= 0; i--){
//                rev=rev+s3.charAt(i);
//        }
//    }
//    s5=rev+"";
//        System.out.print(s5);

//        String s1="RahulGupta";
//        int i=0;
//        String s2="";
//        for(i=s1.length()-1;i>=0;i--)
//        {
//            s2=s2+s1.charAt(i);
//        }
//        System.out.print(s2);
//
//        String s1 = "My name is Rahul123";
//        char[] ch = s1.toCharArray();
//        int sum = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (Character.isDigit(ch[i])) {
//                sum = sum + (ch[i] - '0');
//            }
//        }
//        System.out.print("Output=" + sum);
//    }
//}







/*Swap string*/
//        String s1="Rahul";
//        String s2="Gupta";
//        s1=s1+s2;
//        s2=s1.substring(0,s1.length()-s2.length());
//        System.out.println("Second string="+s2);
//        s1=s1.substring(s2.length());
//        System.out.print("First String="+s1);








//        String s1= "Rahul";
//        char[] ch= s1.toCharArray();
//        int length=ch.length;
//        recursivefunction(ch,length);
//    }
//
//    public static void recursivefunction(char[] ch,int length)
//    {
//        if(length>0)
//        {
//         System.out.print(ch[length-1]);
//         length--;
//         recursivefunction(ch,length);
//        }
//    }
//}

//        String s1 = "Rahul";
//        char[] ch1 = s1.toCharArray();
//        int i = ch1.length;
//        recursivefunction(ch1, i);
//    }
//
//    public static void recursivefunction(char[] ch1, int i) {
//        if (i > 0) {
//            System.out.print(ch1[i-1]);
//            i--;
//            recursivefunction(ch1, i);
//        }
//    }
//}



//        String s1="Rahul";
//        String rev="";
//        char[] ch=s1.toCharArray();
//        for(int i=s1.length()-1;i>=0;i--)
//        {
//            rev=rev+ch[i];
//        }
//        System.out.print("Reverse="+rev);



//        String s1="My name is Rahul";
//        String[] s2=s1.split("/s");
//        String rev="";
//        String s5="";
//       for(String s3:s2)
//       {
//           for(int i=s3.length()-1;i>=0;i--)
//           {
//               rev=rev+s3.charAt(i);
//           }
//           s5=s5+rev+"";
//       }
//       System.out.print("Reverse="+s5);




//        int[] ar1={1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
//                int[] ar2= new int[ar1.length];
//                int count=0;
//                for(int i=0;i<ar1.length;i++)
//                    if(ar1[i]!=0)
//                    {
//                        ar2[count]=ar1[i];
//                        count++;
//                    }
//
//                System.out.print(Arrays.toString(ar2));


//        String s="nishant";
//        char[] ch=s.toCharArray();
//        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
//        for (Character c1:ch)
//        {
//            if(hm.containsKey(c1))
//            {
//                hm.put(c1,hm.get(c1)+1);
//            }
//            else
//            {
//                hm.put(c1,1);
//            }
//        }
//        System.out.print("Count="+hm);


//        String s7 = "My name is Rahul";
//        HashSet<Character> hs = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            hs.add(s.charAt(i));
//        }
//
//        System.out.print(hs);














/*print zefro in the end*/
//       int[] ar1={0,10,20,30,10,40};
//       int[] ar2=new int[ar1.length];
//       int count=0;
//       int i;
//       for (i=0;i<ar1.length;i++){
//       if(ar1[i]!=0)
//       {
//          ar2[count++]=ar1[i];
//       }
//        }
//       System.out.print(Arrays.toString(ar2));

//HashMap<Integer,String> hm=new HashMap<>();
//hm.put(100,"Amit");
//hm.put(200,"Pankaj");
//
//for(Map.Entry m:hm.entrySet())
//{
//    System.out.println(m.getKey()+":"+m.getValue());
//}






















//
//        int[] ar={10,20,30,40};
//        int n=ar.length;
//        int second_largest=0;
//        for(int i=n-2;i>0;i--)
//        {
//            if(ar[i]!=ar[i-1])
//            {
//                second_largest=ar[i];
//
//            }
//        }
//        System.out.print(second_largest);






//        String s1="My name is 11 rahul";
//        char[] ch= s1.toCharArray();
//        int sum=0;
//        for(int i=0;i<s1.length();i++)
//        {
//            if(Character.isDigit(ch[i]))
//            {
//             sum=sum+(ch[i]-'0');
//            }
//        }
//        System.out.print(sum);



/* fibonacci series*/
//        int a=0;
//        int b =1;
//        int c=0;
//        System.out.println(a+""+b);
//        for(int r=2;r<100;r++)
//        {
//            c=a+b;
//            System.out.println(""+c);
//            a=b;
//            b=c;
//        }
//        int[] ar1={20,0,10,20,30,40};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        for(int i=0;i<ar1.length;i++)
//        {
//            if((ar1[i])!=0)
//            {
//                ar2[count++]=ar1[i];
//            }
//        }
//        System.out.print(Arrays.toString(ar2));


//        int[] ar1={20,10,30,40,40};
//        for(int i=0;i<ar1.length;i++)
//        {
//            for (int j=i+1;j<ar1.length;j++)
//            {
//                if(ar1[i]>ar1[j])
//                {int temp= ar1[i];
//                    ar1[i]=ar1[j];
//                    ar1[j]=temp;
//                }
//            }
//        }
//        for (Integer ar2:ar1)
//        {
//            System.out.print(ar2);
//        }



//        int[] ar1={10,20,30,40,40};
//        HashSet<Integer> hs=new HashSet<Integer>();
//        for(int i=0;i<ar1.length;i++)
//        {
//            hs.add(ar1[i]);
//        }
//        System.out.print(hs);

//        String s1="my name is rahul";
//        String[] s2=s1.split("");
//        String s4="";
//        String b;
//        for(String s3:s2)
//        {
//            char c1= s3.charAt(0);
//            char c2= Character.toUpperCase(c1);
//            b=s3.substring(1);
//            s4=s4+c2+b+"";
//        }
//        System.out.print(s4);


//        String s2 = "rahul";
//        char[] ch = s2.toCharArray();
//        String rev = "";
//        for (int i = s2.length() - 1; i >=0; i--) {
//            rev = rev + ch[i];
//        }
//        System.out.print("reverse=" + rev);
//    }
//}
//        String s = "my name is rahul";
//        String[] s1 = s.split("/s");
//        String rev="";
//        String s5="";
//        for(String s2:s1)
//        {
//        for(int i=s2.length()-1;i>=0;i--)
//        {
//            rev=rev+s2.charAt(i);
//        }
//        }
//        s5=s5+rev+"";
//        System.out.print("reverse="+s5);






//        String s = "my name is rahul";
//        HashSet<Character> hs = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            hs.add(s.charAt(i));
//        }
//        System.out.print("unique charcater" + hs);


//        String[] s1={"Rahul","Gupta","Rahul","Gupta"};
//        HashMap<String,Integer> hm=new HashMap<String,Integer>();
//        for (String s2:s1)
//        {
//             if(hm.containsKey(s2))
//             {
//                 hm.put(s2,hm.get(s2)+1);
//             }else
//                 hm.put(s2,1);
//        }
//        System.out.print("output="+hm);
//    }
//    }



/* Reverse of string*/
//        String s1="rahul";
//        String s2="gupta";
//
//        s1=s1+s2;
//
//
//        s2=s1.substring(0,s1.length()-s2.length());
//        s1=s1.substring(s2.length());
//
//        System.out.println(s2);
//        System.out.print(s1);

















//        String s2 = "my name is Rahul";
//        String[] s1 = s2.split("");
//        String s5 = "";
//        for (String s3 : s1) {
//            char ch = s3.charAt(0);
//            char ch1 = Character.toUpperCase(ch);
//            String s4 = s3.substring(1);
//            s5 = s5+ch1 + s4 + "";
//        }
//        System.out.print(s5);






//        int[] ar1 = {10, 20, 50, 40, 80, 90};
//        int n = ar1.length;
//        int second_largest = 0;
//        for (int i = n - 2; i > 0; i--) {
//            if (ar1[i] > ar1[i - 1]) {
//                second_largest = ar1[i];
//            }
//        }
//        System.out.print("second_largest" + second_largest);
//    }
//}
//        int[] ar1 = {20, 10, 30, 40, 50};
//        int smallest=ar1[0];
//        for (int i = 1; i < ar1.length; i++) {
//            if (ar1[i] < smallest) {
//                smallest = ar1[i];
//            }
//        }
//        System.out.print("Smallest=" + smallest);
//    }
//}
//        int[] ar1={10,0,24,0,56,89};
//        int[] ar2=new int[ar1.length];
//        int count=0;
//        int i;
//        for(i=0;i<ar1.length;i++) {
//            if (ar1[i] !=0)
//            {
//                ar2[count++]=ar1[i];
//            }
//        }
//        System.out.print(Arrays.toString(ar2));
//        }
//    }




//      String s1="rahulrahul";
//      HashMap<Character,Integer> hm=new HashMap<>();
//      char[] ch=s1.toCharArray();
//      for (Character c1:ch)
//      {
//          if(hm.containsKey(c1))
//          {
//              hm.put(c1,hm.get(c1)+1);
//          }
//          else
//          {
//              hm.put(c1,1);
//          }
//      }
//        System.out.print(hm);
//
//
//    }
//}






//        int[] ar1={1,2,3,4,5,6,7,8,9,10};
//        int i = ar1.length;
//        int r;
//        for(int j=0;j<=ar1.length-1;j++) {
//            for (r = 2; r <= ar1.length - 1; r++) {
//                if ((ar1[j]%r) == 0) {
//                    System.out.println("no is not prime"+ar1[j]);
//                    break;
//                }
//            }
//
//                if (ar1[j] == r) {
//                    System.out.println("No is prime"+ar1[j]);
//                }
//            }
//        }


//    }
//}

















//
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(5);
//        numbers.add(9);
//        numbers.add(8);
//        numbers.add(1);
//        numbers.forEach((n) -> {
//            System.out.println(n);
//        });
//    }
//}





















//    String[] s1={"Rahul","Rahul","Gupta","Gupta"};
//    for(int i=0;i<s1.length;i++)
//    {
//        for (int j=i+1;j<s1.length;j++)
//        {
//            if(s1[i].equals(s1[j]))
//            {
//                System.out.print(s1[i]);
//            }
//        }
//    }

//
//    }
//}












/* Find smallest number in array*/
//int[] ar1={10,20,30,40,50};
//int smallest= ar1[0];
//int i,j=0;
//for (i=1;i<ar1.length;i++)
//{
//    for(j=i+1;j<ar1.length;j++)
//    {
//        if(ar1[0]>ar1[j])
//        {
//            int temp=ar1[i];
//            ar1[i]=ar1[j];
//            ar1[j]=temp;
//        }
//    }
//}
//System.out.print(smallest);


//    }
//}

//        int[] ar1 = {10, 20, 30, 40, 50};
//        int n = ar1.length;
//        int smallest = 0;
//        for (int i = n - 2; i >0; i--) {
//            if (ar1[i] != ar1[i - 1]) {
//                smallest = ar1[i];
//            }
//        }
//        System.out.print("Smallest=" + smallest);
//
//    }
//}



//        String s1="My name is Rahul 123";
//        int sum=0;
//        for(int i =0; i<s1.length();i++)
//        {
//            if(Character.isDigit(s1.charAt(i)))
//            {
//                sum=sum+(s1.charAt(i)-'0');
//            }
//        }
//        System.out.print("DIGIT SUM="+sum);


//        String[] s = {"Big", "black", "bug", "bit", "a", "big", "black", "dog", "on", "his", "big", "black", "nose"};
//
//        TreeSet<String> ts= new TreeSet<String>();
//        for(String s1:s)
//        {
//            ts.add(s1);
//        }
//        System.out.print("Ascending order="+ts);



//        String[] s = {"Big", "black", "bug", "bit", "a", "big", "black", "dog", "on", "his", "big", "black", "nose"};
//        HashSet<String> hs=new HashSet<>();
//        for (String s1 : s) {
//            hs.add(s1);
//        }
//        System.out.print("Count=" + hs);


//        String[] s = {"Big", "black", "bug", "bit", "a", "big", "black", "dog", "on", "his", "big", "black", "nose"};
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        for (String s1 : s) {
//            if (hm.containsKey(s1)) {
//                hm.put(s1, hm.get(s1) + 1);
//            } else {
//                hm.put(s1, 1);
//            }
//        }
//        System.out.print("Count=" + hm);
//    }
//}




//
//        String s1 = "Madam";
//        char[] ch = s1.toCharArray();
//        String s2 = "";
//        int length = s1.length();
//        for (int i=0;i<s1.length();i++) {
//            if (length > 0) {
//                s2 = s2 + ch[length-1];
//                length--;
//            }
//        }
//        System.out.print("reverse=" + s2);











/* count repetitive charcter*/
//        String s1 = "abcdefabcdefghijklm";
//        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//        char[] ch = s1.toCharArray();
//        for (Character ch1 : ch) {
//            if (hm.containsKey(ch1)) {
//                hm.put(ch1, hm.get(ch1) + 1);
//            } else {
//                hm.put(ch1, 1);
//            }
//
//        }
//        System.out.print("Repeated Character=" + hm);
//    }
//}




//        int[] ar1 = {10, 20, 0, 30, 40, 0};
//        int[] ar2 = new int[ar1.length];
//        int count = 0;
//        int i = 0;
//        for (i = 0; i < ar1.length; i++) {
//            if (ar1[i] != 0) {
//                ar2[count++] = ar1[i];
//            }
//        }
////        System.out.print(Arrays.toString(ar2));
//    }
//}


//        String s1="My name is Rahul Gupta";
//        String[] s2=s1.split("/s");
//        String s4="";
//        String s5="";
//        for(String s3:s2) {
//            for (int i = s3.length()-1; i > 0; i--) {
//                s4 = s4 + s3.charAt(i);
//            }
//        }
//        s5=s5+s4+"";
//
//    System.out.print("Reverse="+s5);
//}
//}

//        String s1 = "asdtatsdfadda";
//        int s2 = s1.length();
//        Scanner sc = new Scanner(System.in);
////        int k =sc.nextInt();
////        int j= sc.nextInt();
//        for (int l = 0; l < s1.length(); l++) {
//            for (int k = l + 1; k < s1.length(); k++) {
//
//                String s3 = s1.substring(l, k);
//                System.out.println("Susbstring=" + s3);
//                String s4 = "";
//                for (int i = s3.length() - 1; i >= 0; i--) {
//                    s4 = s4 + s3.charAt(i);
//                }
//                System.out.print("Reverse subtring=" + s4);
//
//                if (s3.equals(s4)) {
//                    System.out.println("Substring is plaindrome");
//                } else {
//                    System.out.println("String is not palindrome");
//                }
//            }
//        }
//    }
//}



//        Name Price
//        a    $100
//        b    $200
//        c    $300
//        d    $400

//        HashMap<String,String> hm=new HashMap<String,String>();
//        hm.put("a","$100");
//        hm.put("b","$200");
//        hm.put("c","$200");
//        hm.put("d","$200");
//        System.out.print("Output"+hm);
//
//
//        HashSet<String> hm1= new HashSet<String>();
//        hm1.add("10");
//        hm1.add("20");
//        Iterator<String> itr= hm1.iterator();
//        boolean a =itr.hasNext();
//        System.out.print(a);
//        while(itr.hasNext())
//        {
//            System.out.print("Value is available");
//        }
//        else if (){
//
//        }
















/* count the repitive charcater*/
//        String s1 = "a,b,c,d,a,b,c,f";
//        String[] ch = s1.split(",");
//        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//        for (String c : ch) {
//            if (hm.containsKey(c)) {
//                hm.put(c, hm.get(c) + 1);
//            }else {
//                hm.put(c,1);
//            }
//        }
//        System.out.print(hm);



///* remove special character from String*/
//String s1="@!#$Rahul gupta";
//s1=s1.replaceAll("[^a-zA-Z]","");
//System.out.print("String="+s1);

/*print smallest and largest number in an array*/
//        int[] ar1 = {10, 30, 20, 50};
//        int i;
//        int smallest = ar1[0];
//        int largest = ar1[0];
//        for (i = 1; i < ar1.length; i++) {
//            if (ar1[i] > ar1[0]) {
//                largest = ar1[i];
//            } else if (ar1[i] < ar1[0]) {
//                smallest = ar1[0];
//            }
//            int temp=ar1[i];
//        }
//            System.out.print(Arrays.toString(ar1));
//        System.out.println(smallest);
//        System.out.println(largest);






/* shift zero*/
//        int[] ar1 = {10, 20, 0, 9, 0, 0};
//        int[] ar2 = new int[ar1.length];
//        int count = 0;
//        int i;
//        for (i = 0; i < ar1.length; i++) {
//            if (ar1[i] != 0) {
//                ar2[count++] = ar1[i];
//            }
//        }
//        System.out.print(Arrays.toString(ar2));







//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        int r;
//        for(r=2;r<=n-1;r++)
//        {
//            if(n%r==0)
//            {
//                System.out.print("Not a prime number");
//                break;
//            }
//        }
//            if (r==n)
//            {
//                System.out.println("Number is prime");
//            }
//        }
//    }


//      String s1="My name is Rahul";
//      char[] ch=s1.toCharArray();
//      int length=s1.length();
//      String reverse="";
//      for(int i=0;i<s1.length();i++) {
//          if (length > 0) {
//              reverse = reverse + ch[length - 1];
//              length--;
//          }
//      }
//        System.out.print(reverse);
//    }


        /* sum of the number from the string
String s1="4test rahul3";
int sum1=0;

for(int i=0;i<s1.length();i++) {
    char ch = s1.charAt(i);
    if (ch >= '0' && ch <= '9') {
        sum1 = sum1 + (s1.charAt(i)-'0');
    }
}

System.out.print("Sum="+sum1);
    }
}*/


        /* remove dublicate words from string
        String s = "My name is Rahul";
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
             hs.add(s.charAt(i));
        }

        System.out.print(hs);
        */





//         */
        /* find the second largest(isme hum second largest se lekar niche tak sabhi ko compare karege , length se arrayu ki total length nikal li ie 6 leking array ki hisab se second
        largest ar[4] se start hoga*/

//        int ar[] = {10, 10, 20, 30, 40, 50};
//        int n= ar.length;int i=0;
//        int second_largest=0;
//        for(i=n-2;i>=0;i--)
//        {
//            if(ar[i] != ar[i-1])
//            {
//                second_largest=ar[i];
//                break;
//            }
//        }
//        System.out.println("second highest"+ar[i]);
//    }








//        String[] s={"autozone", "automotive", "automatic"};
//        String s2="";
//
//
//        {
//        }


/*count repetitive charcaters*/
//        char[] s={'a','a','b','b','c','d','e','f'};
//
//        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
//        int count=0;
//        for(Character s1:s)
//        {
//            if(hmap.containsKey(s1))
//            hmap.put(s1,hmap.get(s1)+1);
//            else
//                hmap.put(s1,1);
//        }
//System.out.print(hmap);

//        String s1="My name is 1 to 3";
//        int temp=0;
//        for (int i =0;i<s1.length();i++)
//        {
//        char c=s1.charAt(i);
//        if (Character.isDigit(c))
//        {
//            temp=temp+c;
//        }
//        }
//        System.out.print(temp);

//        String s1="My name is Rahul";
//        HashSet<Character> repeat=new HashSet<Character>();
//        for(int i=0;i<s1.length();i++) {
//            repeat.add(s1.charAt(i));
//        }
//        System.out.print(repeat);

//       String s1="Rahul";
//        char[] ch=s1.toCharArray();
//        int length=ch.length;
//        String s2="";
//        for (int i=length-1;i>=0;i--) {
//            if (length > 0) {
//                s2 = s2 + ch[length - 1];
//                length--;
//            }
//        }
//        System.out.print(s2);




/* reverse a string*/
//        String s1="My name is Rahul";
//        String[] s2=s1.split("/s");
//        String s4="";
//        String s5="";
//        for(String s3:s2)
//        {
//            for (int i=s3.length()-1;i>=0;i--)
//                s4=s4+s3.charAt(i);
//
//        }
//        s5=s4+"";
//        System.out.print(s5);


//        String s1="My name is Rahul";
//        int i;String s2="";String s3="";
//        String[] s4=s1.split("/s");
//        for(String s5:s4){
//            for(i=s5.length()-1;i>=0;i--)
//            s3=s3+s5.charAt(i);
//        }
//        s2=s3+"";
//        System.out.print(s2);



/* 0 in the end*/
//        int[] ar1={10,20,30,0,40,0,50};
//        int count=0;
//
//        int[] ar2=new int[ar1.length];
//
//        for(int i=0;i<ar1.length;i++)
//        {if (ar1[i]!=0)
//        {
//            ar2[count++]=ar1[i];
//        }
//
//        }
//        System.out.print(Arrays.toString(ar2));

//        int[] ar1 = {10,20,10};
//
//        for (int i = 0; i < ar1.length; i++) {
//            for (int j = i + 1; j < ar1.length; j++) {
//                if (!(ar1[i] == ar1[j]) && ar1[i] < ar1[j])
//                    {
//                    int temp = ar1[i];
//                    ar1[i] = ar1[j];
//                    ar1[j] = ar1[i];
//                }
//            }
//        }
//        System.out.print("second highest=" + ar1[1]);
//    }
//    }
//}


















//        String s1 = "Rahul";
//        char[] ch = s1.toCharArray();
//        String rev="";
//        for (int i = s1.length() - 1; i >= 0; i--) {
//            rev = rev + ch[i];
//        }
//        System.out.print(rev);
//    }}
////        String s1 = "Rahul";
//        String s2 = "";
//        for (int i = s1.length()-1; i >= 0; i--) {
//            s2 = s2 + s1.charAt(i);
//        }
//        System.out.print(s2);
//    }
//}

//        int[] ar1={10,20,30,40,60,70};
//        for(int i=0;i<ar1.length;i++)
//        {for(int j=i+1;j<ar1.length;j++){
//            if(ar1[i]<ar1[j])
//            {int temp=ar1[i];
//                ar1[i]=ar1[j];
//                ar1[j]=temp;
//            }
//        }}
//        for(int i =0;i<ar1.length;i++)
//        {
//            System.out.println(ar1[i]);
//        }
//        int number=12345;
//        int lastdigit;
//        int finaldigit;
//        int firstdigit = 0;
////        lastdigit=number%10;
////        System.out.print(lastdigit);
//        while (number != 0) {
//            firstdigit = Math.abs(number % 10);
//            number /= 10;
//        }
////        finaldigit=firstdigit+lastdigit;
//        System.out.print(firstdigit);


//
//    }
//}
////String s1="Samuel has 3 dogs and he goes to walk with them at 5 in the morning";
//           String[] s2=s1.split("");
//           int c =0;int a=0;
//           int b=0;
//           Scanner sc =new Scanner(System.in);
//           int n=sc.nextInt();
//           int n1=sc.nextInt();
//           for (String s3:s2) {
//               if (s3.equals(n) || s3.equals(n1)) {
//                   a = n; b=n1;
//                   System.out.print(a);
//                   System.out.print(b);
//               }
//               c = a + b;
//           }
//        System.out.print("Sum is" + c);
//    }
//
//
//}























//        String s1="My Name is Rahul";
//        String[] s5=s1.split("");
//        String s3="";
//        String s4="";
//        for(String s2:s5)
//        {
//            char ch=s2.charAt(0);
//            s3=s3.substring(1);
//            Character.toUpperCase(ch);
//            s4=ch+s3;
//        }
//        System.out.print(s4);
//
//
//    }
//    }

//        String s1 = "Rahul";
//        char[] ch = s1.toCharArray();
//        int length = ch.length;
//        for (int i = ch.length; i > 0; i--) {
//            System.out.print(ch[length - 1]);
//            length--;

//        }
//    }