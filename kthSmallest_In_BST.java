class Solution {
  public:
  int ans=-1;
  void helper(Node* root, int &k){
        if(root==NULL){
            return ;
        }
        // int cnt=0;
        helper(root->left,k);
        k--;
        if(k==0){
            ans=root->data;
            return ;
        }
        helper(root->right,k);
    }
    // Return the Kth smallest element in the given BST
    int kthSmallest(Node *root, int k) {
        // add code here.
        helper(root,k);
        return ans;
        
    }
};
