public class linkedlist {
        // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
        private int head;
        private int tail;
    
        public Node(int data) {
            this.data = data;
        }
    
        public int getData() {
            // escreva seu código aqui
            return data;
        }
    
        // @param String data to this.data
        public void setData(int data) {
            this.data = data;
        }
    
        // @return next
        public Node getNext() {
            return next;
        }

        // @param Node next set to this.next
        public void setNext(Node next) {
            this.next = next;
        }
}
