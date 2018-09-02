# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:
    def findRightInterval(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[int]
        """
        
        # dict and ????
        rst_list = []
        item_list = []
       
        key_list = {item:i for i,item in enumerate(intervals)}
        item_list = [item for item in intervals];   
   
        item_list.sort(key=operator.attrgetter('start'));

        for item in intervals:
            low = 0; high = len(intervals)-1
            if item_list[high].start < item.end:
                index = -1;
            else:
                while(low < high):
                    mid = int((low+ high)/2);
                    if item_list[mid].start == item.end:
                        index = key_list[item_list[mid]]
                        break;
                    if item_list[mid].start > item.end:
                        high = mid;
                    if item_list[mid].start < item.end:
                        low = mid + 1;
                if low >= high: index = key_list[item_list[low]]
            rst_list.append(index)
        return rst_list
        