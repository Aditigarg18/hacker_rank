static boolean isAnagram(String a, String b) {
        // Complete the function
       a= a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length())
            return false;
            int arr[]=new int[26];
            for(int i=0;i<a.length();i++){
                int index=a.charAt(i)-'a';
                arr[index]++;
            }
            for(int i=0;i<b.length();i++){
                int index=b.charAt(i)-'a';
                arr[index]--;
            }
            for(int i=0;i<26;i++){
                if(arr[i]!=0)return false;
            }
                return true;
            }
