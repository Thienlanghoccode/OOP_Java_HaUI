
package Chuan_hoa_xau;

import java.util.Scanner;

public class Entry {
    public static String getFormatString(String s){
        // regular exception tach cac tu truoc khoang trang
        String[] Words = s.split("\\s+"); 
        
        // ghep cac tu lai thanh 1 string
        String tmp = "";
        for(String w : Words){
            tmp = tmp + " " + w.toLowerCase();
        }
        
        //chuyen string thanh 1 mang cac ky tu, in hoa chu cai dau
        char[] ch = tmp.toCharArray();
        for(int i = 0; i < tmp.length(); i++){
            if(ch[i] == ' ' && ch[i + 1] != ' '){
                ch[i + 1] -= 32;
            }
        }
        
        //chuyen mang ky tu thanh chuoi
        String res = "";
        for(int i = 0; i < tmp.length(); i++){
            res += ch[i];
        }
        res = res.trim();
        return res;
    }
    
    public static int getNumberOfWords(String s){
        //format lai string
        s = getFormatString(s);
        
        //dem khoang trang 
        char[] tmp = s.toCharArray();
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(tmp[i] == ' '){
                res++;
            }     
        }
        res++;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot cau: ");
        String s = sc.nextLine();
        String result = getFormatString(s);
        int count = getNumberOfWords(s);
        System.out.println("Ket qua sau khi chuan hoa xau la: ");
        System.out.println(result);
        System.out.print("So tu co trong cau la: ");
        System.out.println(count);
    }
}
