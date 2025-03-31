import time
import random

# QuickSort function
def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

# Benchmark
arr = [random.randint(0, 10000) for _ in range(1000000)]  # Array of 1 million random integers
start = time.time()
sorted_arr = quicksort(arr)
end = time.time()

print("Execution Time:", end - start)