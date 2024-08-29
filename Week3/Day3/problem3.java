// 3. Diameter of Binary Tree  

// Given the root of a binary tree, return the length of the diameter of the tree.

// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

// The length of a path between two nodes is represented by the number of edges between them.

//Brute Force

import java.util.Arrays;

class problem3 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        height(root);
        return diameter - 1;
        
    }
    int height(TreeNode node)
    {
        if(node == null)
        return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia,diameter);
        return Math.max(leftHeight,rightHeight)+1;
    }
}