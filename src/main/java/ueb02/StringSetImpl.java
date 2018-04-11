package ueb02;



import java.util.NoSuchElementException;
import java.lang.String;

public class StringSetImpl implements StringSet {
    private Node root;



    @Override
    public boolean add(String s) {
        Node node = new Node (s,null, null); // prüfe , ob Node leer ist
        if (root == null) {
            root = node;
            return true;
        }

            Node n = root;  // neue Node anlegen
            while (n.value != null){
                if(n.value.equals(node.value)) {
                    return false;
                } else if (node.value.compareTo(n.value)<0) {
                    if (n.left == null) {
                        n.left = node; // wenn leer einfügen
                        return false;
                    } else {
                        n = n.left;
                    }
                } else {
                    if(n.right == null){
                        n.right = node;
                        return false;

                    }
                    else{
                        n = n.right;

                    }


                }
            }





        return false;
        }
        private void addNode (Node n){
        if ( n == null){
            return;
        }
        if ( root == null){
            root = n; // wenn root leer, füge neue Element ein
            return;
        }
        Node it = root;
        while (it.value !=null){
            if (it.value.equals(n.value))
                    return;
            else if (n.value.compareTo(it.value) <0){
                if (it.left == null){
                    it.left = n;
                    return;
                }else {
                    it = it.left;
                }

            }else{
                if (it.right == null){
                    it.right = n;
                    return;
                }else{
                    it = it.right;
                }
            }
        }



        }




    @Override
    public boolean contains(String s) {
        if(root == null){
            return false;
        }


        Node n = root;
        while (n != null){
            if (s.equals(n.value))
                return true;

            else if (s.compareTo(n.value) <0){
                n = n.left;
            }
            else{
                n = n.right;
            }

        }
        // kein Node vorhandeln
        return false;
    }


    @Override
    public String remove(String s) {

        if (root == null){
            throw  new NoSuchElementException();
        }
        if (root.value.equals(s)){
            return removeRoot();
        }
        Node it = root;
        while (it != null){
            if (s.compareTo(it.value) <0){
                if ( it.left != null && it.left.value.equals(s)){
                    return removeNode(it,it.left);


                }
                it = it.left;

            }else{
                if(it.right != null && it.right.value.equals(s)){
                    return removeNode(it,it.right);

                }
                it = it.right;
            }
        }
        throw new NoSuchElementException();

    }
    private String removeNode(Node p, Node e ){
        if (p.left == e) p.left = null;
        else{
            p.right = null;
        }
        addNode(e.left);
        addNode(e.right);

        return e.value;

    }
    private String removeRoot(){
        Node n = root;
        if (n.left == null&& root.right == null){
            root = null;
        }else if (n.left == null){
            root = n.right;
        }else if (n.right == null){
            root = n.left;
        }else {
            root = n.left;
            addNode(n.right);

        }
        return n.value;

    }

    @Override
    public int size() {
        if (root == null) return 0;
        else {
            return root.size();
        }



    }
    public String toString (){
        if (root == null) return "[]";
        else return "[" + root.toString() + "]";
    }


    }
    class Node {
        String value;
        Node right;
        Node left;
        int size (){
            int s = 1;
            if (left != null) s += left.size();
            if (right != null) s += right.size();

            return s;


        }

        Node(String s, Node le, Node re) {
            value = s;
            left = le;
            right = re;



        }
        public  String toString() {
            String str = " " +value;
            if (left != null) {
                str += "," + left.toString();
            }
            if (right != null) {
                str += " , " + right.toString();
            }
            return str;


        }
}




