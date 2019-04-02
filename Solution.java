/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        ArrayList<ArrayList<Integer>> sum=new ArrayList<>();
        if(A==null)
          return sum;
        ArrayList<Integer> l=new ArrayList<>();
        l.add(A.val);
        sumReturn(l,B-A.val,A,sum);
        return sum;
    }
    
    public void sumReturn(ArrayList<Integer> l, int B, TreeNode A, ArrayList<ArrayList<Integer>> sum){
        if(B==0 && A.left==null && A.right==null){
             ArrayList<Integer> temp = new ArrayList<Integer>();
             temp.addAll(l);
             sum.add(temp);
             return;
        }
        if(A.left!=null){
            l.add(A.left.val);
            sumReturn(l,B-A.left.val,A.left,sum);
            l.remove(l.size()-1);
        }
        if(A.right!=null){
            l.add(A.right.val);
            sumReturn(l,B-A.right.val,A.right,sum);
            l.remove(l.size()-1);
        }
    }
}
