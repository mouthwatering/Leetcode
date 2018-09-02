class Solution:
    def canVisitAllRooms(self, rooms):
        """
        :type rooms: List[List[int]]
        :rtype: bool
        """
        seen = [False] * len(rooms)
        seen[0]  = True;
        stack = [];
        stack.append(0);
        
        while (stack):
            index = stack.pop();
            for i in rooms[index]:
                if not seen[i]:
                    seen[i] = True;
                    stack.append(i)
        return all(seen)