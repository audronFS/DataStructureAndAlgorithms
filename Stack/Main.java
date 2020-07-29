package Stack;

public class Main {
    public static void main(String[] args) {
//        Stack st = new Stack(5);
//            st.push('h');
//            st.push('e');
//            st.push('l');
//            st.push('l');
//            st.push('o');
//
//        while(!st.isEmpty()) {
//            long value = st.pop();
//            System.out.println(value);}
        System.out.println(reverseString("hello"));
         }

    public static String reverseString(String str){
        Stack st = new Stack(str.length());
        for (int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        StringBuilder result= new StringBuilder();
        while(!st.isEmpty()) {
           char ch = st.pop();
           result.append(ch);
        }

        return result.toString();
    }
}
