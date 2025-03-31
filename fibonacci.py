def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)

def benchmark_fibonacci(n):
    result = fibonacci(n)
    print(f"Fibonacci({n}) = {result}")

if __name__ == "__main__":
    benchmark_fibonacci(35)  # Adjust n for performance test
