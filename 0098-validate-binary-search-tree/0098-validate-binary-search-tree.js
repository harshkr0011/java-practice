/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
const isValidBST = (r,l=-Infinity,h=Infinity)=>r? r.val>l&&r.val<h&&isValidBST(r.left,l,r.val)&&isValidBST(r.right,r.val,h) : true;