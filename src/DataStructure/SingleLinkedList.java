package DataStructure;

public class SingleLinkedList {
    //给一个空的头结点
    /**
     * 头结点
     */
    private static final Node head = new Node(null, -1);


    /**
     * 直接在后面添加结点
     *
     * @param next
     */
    public void add(Node next) {
        //用一个临时结点进行代理
        Node temp = head;
        //做一个训循环一直到temp被赋值
        while (true) {
            if (temp.next == null) {
                temp.next = next;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 在结点后插入结点
     */
    public void addByOrder(Node next) {
        Node temp = head;
        boolean flag = false;
        while (true) {//只负责寻找
            if (temp.next == null) {//如果一开始就为空直接pass
                break;
            }
            if (temp.next.number > next.number) {
                flag = true;
                break;
            } else if (temp.next.number == next.number) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            next.next = temp.next;
            temp.next = next;
            System.out.println("恭喜你插入成功");
        } else {
            System.out.println("编号已存在或该链表为空");
        }
    }

    /**
     * 查找倒数第 k 个节点
     * @param k
     * @return
     */
    public static Node findNoK(int k) {
        if (head.next == null) {
            System.out.println("链表为空");
            return null;
        }
        int length = getLength();
        Node temp = head.next;
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /**
     * 更新
     *
     * @param node
     */
    public void update(Node node) {
        Node temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next==null) {
                break;
            }
            if (temp.next.number == node.number) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            node.next = temp.next.next;
            temp.next = node;
            System.out.println("插入成功");
        } else {
            System.out.println("未找到对应的编号");
        }

    }
    /**
     * 遍历结点
     */
    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = head.next;
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != null);
    }
    public static int getLength() {
        if (head.next==null) {
            return 0;
        }
        int length = 0;
        Node temp = head.next;
        while (temp!=null) {
            length++;
            temp = temp.next;
        }
        return length;
    }


    /**
     * 删除结点
     */
    public void delete(Node node) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        Node temp = head;
        do {
            if (temp.next == node) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        } while (temp != null);
    }


}

class Node {
    public Object data;
    public int number;

    public Node(Object data, int number) {
        this.data = data;
        this.number = number;
    }

    public Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }


    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}