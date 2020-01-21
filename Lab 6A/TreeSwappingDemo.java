//Donark Patel
//CSC 236-01
//Lab 6A

public class TreeSwappingDemo
{
	public static void main (String [] args)
	{
		BinaryTree<Integer> Tree1 = new BinaryTree<Integer>(new TreeNode<Integer>(1,
							new TreeNode<Integer>(2,
							new TreeNode<Integer>(4),
							new TreeNode<Integer>(5)),
							new TreeNode<Integer>(3,
							new TreeNode<Integer>(6),null)));

		BinaryTree<Integer> Tree2 = new BinaryTree<Integer>(new TreeNode<Integer>(14,
							new TreeNode<Integer>(4,
							new TreeNode<Integer>(3),
							new TreeNode<Integer>(9,
							new TreeNode<Integer>(7,
							new TreeNode<Integer>(5),
							null),null)), new TreeNode<Integer>(15,
							null,new TreeNode<Integer>(18,
							new TreeNode<Integer>(16,
							null,new TreeNode<Integer>(17)),
							new TreeNode<Integer>(20)))));

		System.out.println("\nReading trees in preorder traversal");
		System.out.println("------------------------------------");
		System.out.println("\nTree1 = " + Tree1);
		System.out.println("\nTree2 = " + Tree2);

		Tree1.swapTrees();
		Tree2.swapTrees();

		System.out.println("\n\nAfter swapping subtrees");
		System.out.println("------------------------------------");
		System.out.println("\nTree1 = " + Tree1);
        System.out.println("\nTree2 = " + Tree2);

	}
}
