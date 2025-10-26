package leetcode.easy;

public class Solution {

    public String palindromeMaker(String s){
        char ch[] = new char[s.length()];
        int i=0, j=s.length()-1;
        while(i<=j){
            char firstChar = Character.toLowerCase(s.charAt(i));
            char lastChar = Character.toLowerCase(s.charAt(j));

            if(firstChar != lastChar && firstChar!='?' && lastChar!='?') {
                while(isSpecialCharacter(Character.toLowerCase(s.charAt(j)))){
                    ch[j] = Character.toLowerCase(s.charAt(j--));
                }
                while(isSpecialCharacter(Character.toLowerCase(s.charAt(i)))){
                    ch[i] =  Character.toLowerCase(s.charAt(i++));
                }

                return "NO";
            }
            else if (firstChar != lastChar && firstChar == '?'){
                ch[i] = lastChar;
                ch[j] = lastChar;
            }
            else if (firstChar != lastChar && lastChar == '?'){
                ch[i] = firstChar;
                ch[j] = firstChar;
            } else if (firstChar == '?' && lastChar == '?'){
                ch[i] = 'a';
                ch[j] = 'a';
            } else if(firstChar == lastChar){
                ch[i] = firstChar;
                ch[j] = lastChar;
            }

            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    public boolean isSpecialCharacter(char ch){
        if (ch < 97 || ch > 122)
            return true;
        return false;
    }

    public static void main(String [] args) {
        Solution s1 = new Solution();
        String str = "?ab??a";
        String str1 = "bab??a";
        String str2 = "?+B?b+-a";
        System.out.println(s1.palindromeMaker(str));
        System.out.println(s1.palindromeMaker(str1));
        System.out.println(s1.palindromeMaker(str2));


    }
}

