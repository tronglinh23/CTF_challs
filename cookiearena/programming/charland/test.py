def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def get_fibonacci_numbers(n):
    fibonacci = [1, 1]
    while len(fibonacci) < n:
        next_number = fibonacci[-1] + fibonacci[-2]
        fibonacci.append(next_number)
    return fibonacci

def charland_resident_name(n):
    primes = set()
    fibonacci_numbers = set(get_fibonacci_numbers(n))

    for i in range(1, n + 1):
        if is_prime(i) and i in fibonacci_numbers:
            primes.add(i)

    name = ''
    for i in range(1, n + 1):
        if i in primes:
            name += 'p'
        elif i in fibonacci_numbers:
            name += 'O'
        elif is_prime(i):
            name += 'P'
        else:
            name += 'o'
    
    return name

try:
  user_input = int(input()) 
  resident_name = charland_resident_name(user_input)
  print(resident_name)
except:
  print("Error")