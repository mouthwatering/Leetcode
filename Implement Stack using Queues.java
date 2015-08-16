import java.util.concurrent.LinkedBlockingQueue;

class MyStack {
    LinkedBlockingQueue queue1 = new LinkedBlockingQueue();
    LinkedBlockingQueue queue2 = new LinkedBlockingQueue();
    // Push element x onto stack.
    public void push(int x) {
        try{
           queue1.put(x);
        }catch(Exception e){
            
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        while(queue1.size()>=2){
            int tmp = (int)queue1.poll();
            try{
                queue2.put(tmp);
            }
            catch(Exception e){
                }
        }
        queue1.poll();
         while(queue2.size()>=1){
            int tmp = (int)queue2.poll();
            try{
                queue1.put(tmp);
            }
            catch(Exception e){
                
            }
        }
    }

    // Get the top element.
    public int top() {
        while(queue1.size()>=2){
            int tmp =(int)queue1.poll();
            try{
                queue2.put(tmp);}
                catch(Exception e){
                    
                }
        }
         int rst = (int)queue1.peek();
         int tmp =(int) queue1.poll();
           try{
               queue2.put(tmp);
           } catch(Exception e){}
         while(queue2.size()>=1){
             tmp = (int)queue2.poll();
            try{
                queue1.put(tmp);
            }catch(Exception e){}
        }
        return rst;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(queue1.size()>0&&queue1!=null)
            return false;
        
        return true;
    }
}