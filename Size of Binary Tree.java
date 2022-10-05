//Given a binary tree of size N, you have to count number of nodes in it
class Tree
{
	public static int getSize(Node root)
	{
//add Code here.
if(root==null)return 0;
return getSize(root.left)+getSize(root.right)+1;
    }
}
