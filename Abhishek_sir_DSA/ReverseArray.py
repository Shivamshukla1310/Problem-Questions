# We can simply use reverse or we can directly reverse the array to or use slicing but this are 2 methods where we swap the digits with one another

'''
10, 20, 30, 40, 50
50, 20, 30, 40, 10
50, 40, 30, 20, 10
'''
def reverse_array(nums:list[int])->None:
  n = len(nums)
  for i in range(n // 2):
    nums[i], nums[n - 1 - i] = nums[n - 1 - i], nums[i] 
  # i = 0
  # j = len(nums) - 1
  
  # while i < j:
  #   nums[i], nums[j] = nums[j], nums[i]
  #   i += 1
  #   j -= 1

  

n = int(input())
a = list(map(int, input().split()))
print(f"Original: {a}")

reverse_array(a)
print(f"Reversed: {a}")
