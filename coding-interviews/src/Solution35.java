public class Solution35 {
	//25ms
	//9576k
    public RandomListNode Clone(RandomListNode pHead)
    {
    	if(pHead == null)
            return null;
    	
    	RandomListNode pNode = pHead;
        RandomListNode pClonedHead = null;
        RandomListNode pClonedNode = null;
        
        while(pNode != null) {
            pClonedNode = new RandomListNode(pNode.label);
            pClonedNode.next = pNode.next;
            pNode.next = pClonedNode;
            pNode = pClonedNode.next;
        }
        
        pNode = pHead;
        while(pNode != null) {
            pClonedNode = pNode.next;
            //注意判空！！！！！
            if(pNode.random == null)
                pClonedNode.random = null;
            else
                pClonedNode.random = pNode.random.next;
            pNode = pClonedNode.next;
        }
        
        pNode = pHead;
        pClonedNode = pNode.next;
        pClonedHead = pClonedNode;
        while(pNode != null) {
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
            
            if(pNode != null) {
                pClonedNode.next = pNode.next;
                pClonedNode = pClonedNode.next;
            } else {
                pClonedNode.next = null;
            }
            
        }
        
        return pClonedHead;
    }
}
