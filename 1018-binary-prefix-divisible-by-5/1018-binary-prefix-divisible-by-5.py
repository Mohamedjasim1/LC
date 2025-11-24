class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        result = list()
        res = str(nums[0])
        result.append(True) if int(res) == 0 else result.append(False)
        for j in range(1, len(nums)):
            res += str(nums[j])
            if int(res, 2) % 5 == 0:
                result.append(True)
            else:
                result.append(False)
        return result
        