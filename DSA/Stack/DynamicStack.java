package Stack;

public class DynamicStack extends StackImplementation{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean insertElement(int item){
        if(this.isFull()){
            int[] temp = new int[data.length + 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.insertElement(item);
    }

    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack(4);
        StackImplementation stackImplementation = new StackImplementation();
        dynamicStack.insertElement(12);
        dynamicStack.insertElement(13);
        dynamicStack.insertElement(14);
        dynamicStack.insertElement(15);
        dynamicStack.insertElement(16);
        try {
            System.out.println(dynamicStack.peek());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}