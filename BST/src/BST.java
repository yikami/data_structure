/**
 * @author: kaiming.yin
 * @Description:
 * @Date: Created in 10:41 2019/5/10
 * @ModifedBy:
 * @since 1.0.0
 */
public class BST<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left,right;

        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node node;
    private int size;

    public BST(){
        this.node = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
