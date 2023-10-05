/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree;

/* Name: Le Cong Hung
Student Code: SE161248
Purpose: Code and compile Listing 8.1 (page 406).
 */
public class Node {

    public int iData; // data item (key)
    public double dData; // data item
    public Node leftChild; // this node’s left child
    public Node rightChild; // this node’s right child

    public void displayNode() // display ourselves
    {
        System.out.print("{");
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
