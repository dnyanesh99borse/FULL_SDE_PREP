
        //why we took base.length here even after the actual lenth of the string will be same , immutable
        //but here in recursive call we are passing the base as newbase... 
        //furthermore it is not the base string it is newbase but here that parameter name is base hence we are saying it as base
        //cause we are not passing it the actual base string it is newbase a updated one. and when it becomes = 0 then it will return.

        //here 1. recursive function will take A using for loop and using recursive loop
        //it will pair A with all the characters of the base string
        //like ABC, but we would have to remove the visiting character one by one othewise it will
        //again and again assume the same characters and all the output will store as: ABC ONLY.
        //to avoid this. each time after removing the currentchar change our BASE STRING and remove that 
        //already included character from it.


            //removing currchar from string.


            //i am giving you each character each time just make its permuation 
            //and give me.. blindly beleive on this function.
  





public class Permutations {

    public static void Permutations(String base, StringBuilder perm) {

        if(base.length() == 0) {
            System.out.println(perm);
            return;
        }

        for(int i = 0; i < base.length(); i++) {

            char currElem = base.charAt(i);

            String newBase = base.substring(0, i) + base.substring(i + 1);

            //include
            perm.append(currElem);

            Permutations(newBase, perm);

            //exclude
            perm.deleteCharAt(perm.length() - 1);
        }
    }

    public static void main(String[] args) {
        String base = "ABC";
        Permutations(base, new StringBuilder());
    }
}