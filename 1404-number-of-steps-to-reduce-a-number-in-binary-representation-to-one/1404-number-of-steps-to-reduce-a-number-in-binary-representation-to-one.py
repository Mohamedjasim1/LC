class Solution(object):
    def numSteps(self, s):
        c=0
        n=(int(s,2))
        while(n!=1):
            if(n%2!=0):
                n+=1
                c+=1
            else:
                n//=2
                c+=1
        return c