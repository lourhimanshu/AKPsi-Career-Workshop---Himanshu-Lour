/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
  public:
    TreeNode *invertTree(TreeNode *root) {
        // Base case: if the root is null, return null
        if (root == nullptr) {
            return nullptr;
        }

        // Swap the left and right children of the root node
        swap(root->left, root->right);
        // Recursively invert the left and right subtrees
        invertTree(root->left);
        invertTree(root->right);
        return root;
    }
};